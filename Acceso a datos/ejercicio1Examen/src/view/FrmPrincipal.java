package view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import model.Casa;

public class FrmPrincipal {

	public static String sFileNameObjeto = "archivos/Casas.dat";
	public static String sFileNameXML = "archivos/Casas";
	private static Document docXML;
	public static ArrayList<Casa> aCasas = rellenarArrayCasa();
	
	public static void main(String[] args) throws Exception {
		
		
		escribirObjeto(sFileNameObjeto, aCasas);
		crearXML(sFileNameXML);
		

	}
	

	public static void escribirObjeto(String sFilename, ArrayList<Casa>aCasas) {
		try {
			FileOutputStream fch = new FileOutputStream(sFilename);
			ObjectOutputStream buff = new ObjectOutputStream(fch);
				buff.writeObject(aCasas);
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + sFilename + " NO EXISTE");
		} catch (IOException e) {
			System.err.println("ERROR: NO SE PUEDE ESCRIBIR EN EL FICHERO");
		}
}
	
	public static ArrayList<Casa> rellenarArrayCasa(){
			ArrayList<Casa> aCasas = new ArrayList<Casa>();
		aCasas.add(new Casa(1, "Sevilla",13.4f, 2 ));
		aCasas.add(new Casa(2, "Cadiz",20.4f, 3 ));
		aCasas.add(new Casa(3, "Malaga",10.4f, 1 ));
		
		return aCasas;
	}
	private static void crearXML(String sTabla) throws Exception  {

		int iNumRegistros = 0;
		ArrayList<String> aNombreColumnas = new ArrayList<String>();

			iNumRegistros = aCasas.size();
			
			aNombreColumnas.add("ID_CASA");
			aNombreColumnas.add("POBLACION");
			aNombreColumnas.add("SUPERFICIE");
			aNombreColumnas.add("ASEOS");
			
			
			System.out.println(aNombreColumnas);

			docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().getDOMImplementation()
					.createDocument(null,   "Casas", null);

			if (aNombreColumnas != null) {
				
				for (int i = 0; i < iNumRegistros; i++) {
					Element elemento = docXML.createElement("CASA");
					ArrayList<String> aInfoRegistroTablas = new ArrayList<String>();
					
					aInfoRegistroTablas.add(String.valueOf(aCasas.get(i).getId_casa()));
					aInfoRegistroTablas.add(String.valueOf(aCasas.get(i).getsPoblacion()));
					aInfoRegistroTablas.add(String.valueOf(aCasas.get(i).getfSuperficie()));
					aInfoRegistroTablas.add(String.valueOf(aCasas.get(i).getiAseos()));
						
					Element tagName;
					Node tagValue;
					
					for (int j = 0; j < aNombreColumnas.size(); j++) {
						
						// Nombre
						tagName = docXML.createElement(aNombreColumnas.get(j));
						tagValue = docXML.createTextNode(aInfoRegistroTablas.get(j));
						tagName.appendChild(tagValue);
						elemento.appendChild(tagName);
					}

					Node nRaiz = docXML.getFirstChild();
					nRaiz.appendChild(elemento);

				}
				saveData(sTabla);
			}
	}

	public static void saveData(String sTabla) {

		try {
			Transformer tr = TransformerFactory.newInstance().newTransformer();
			tr.setOutputProperty(OutputKeys.INDENT, "yes");
//			tr.setOutputProperty(OutputKeys.METHOD, "xml");
			tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

			// enviar el DOM al fichero
			tr.transform(new DOMSource(docXML), new StreamResult(new FileOutputStream(sTabla + ".xml")));

		} catch (Exception e) {
			System.err.println("Error al guardar el " + sTabla + ".xml\n" + e.getMessage());
		}

	}
	public FrmPrincipal(String fileName) {
		try {
			docXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileName);
			docXML.getDocumentElement().normalize();

		} catch (SAXException e) {
			System.err.println("Error de sintaxis");
		} catch (ParserConfigurationException e) {
			System.err.println("Error con el parser");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");
		}
	}

}
