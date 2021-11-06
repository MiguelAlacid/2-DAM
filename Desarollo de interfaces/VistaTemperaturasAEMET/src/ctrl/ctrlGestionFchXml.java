package ctrl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.CcAa;
import model.Ciudad;
import model.Provincia;

public class ctrlGestionFchXml {

	private static Document docXML;
	public void saveData() {
		
		try {
			
			Transformer tr = TransformerFactory.newInstance().newTransformer();
			tr.setOutputProperty(OutputKeys.INDENT, "yes");
			tr.setOutputProperty(OutputKeys.METHOD, "xml");
			tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","4");
			
			//enviar el DOM al fichero
			tr.transform(new DOMSource(docXML),new StreamResult(new FileOutputStream("nuevosdatos.xml")));
				
			
		} catch (Exception e) {		
			
		}
		
	}

	public ctrlGestionFchXml(String fileName) {
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

	public void mostrarDocumento() {

		XPath xPath = XPathFactory.newInstance().newXPath();
		String sExpression = "/ccaa/provincia";

		try {
			NodeList nodeList = (NodeList) xPath.compile(sExpression).evaluate(docXML, XPathConstants.NODESET);

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElemento = (Element) nNode;
					System.out.println("ccaa id: " + eElemento.getAttribute("id"));
					System.out.println("Nombre : " + eElemento.getElementsByTagName("nombre").item(0).getTextContent());
				
				}

			}

		} catch (XPathExpressionException e) {
			System.err.println("Error aplicando la expresión");
		}

	}
	
	public ArrayList<CcAa> getInfo(){
		return getCCAA();
	}
	
	private ArrayList<CcAa>getCCAA(){
		ArrayList<CcAa> listado = new ArrayList<CcAa>();
		
		NodeList nodos = docXML.getElementsByTagName("ccaa");
		
		for(int i = 0; i < nodos.getLength(); i++) {
		Element nodo = (Element) nodos.item(i);
		
		String id = nodo.getAttribute("id");
		String sNombre = nodo.getAttribute("nombre");
		ArrayList<Provincia> aProvincias = getProvincias(id);
		
		listado.add(new CcAa (id, sNombre, aProvincias));
		}
		return listado;
	}

	private ArrayList<Provincia> getProvincias(String id) {
		ArrayList<Provincia> listado = new ArrayList<Provincia>();
		NodeList nodos = docXML.getElementsByTagName("provincias");
		
		for(int i = 0; i < nodos.getLength(); i++) {
			Element nodo = (Element) nodos.item(i);
			
			String ccaa = nodo.getAttribute("ccaa");
			String sId = nodo.getAttribute("id");
			String sNombre = nodo.getAttribute("nombre");
			ArrayList<Ciudad> aCiudades = getCiudades(id);
			
			if(ccaa.equals(id)) {
				listado.add(new Provincia (ccaa, aCiudades, Integer.parseInt(sId),sNombre));
			}
			
			}
		
		return listado;
	}

	private ArrayList<Ciudad> getCiudades(String id) {
		ArrayList<Ciudad> listado = new ArrayList<Ciudad>();
		
		NodeList nodos = docXML.getElementsByTagName("ciudad");
		
		for(int i = 0; i < nodos.getLength(); i++) {
			Element nodo = (Element) nodos.item(i);
			
			String ccaa = nodo.getAttribute("ccaa");
			String sCodIne = nodo.getAttribute("cod_ine");
			String sNombre = nodo.getAttribute("nombre");
			int tMin = Integer.parseInt(nodo.getElementsByTagName("tmin").item(0).getTextContent());
			int tMax = Integer.parseInt(nodo.getElementsByTagName("tmax").item(0).getTextContent());
			ArrayList<Ciudad> aCiudades = getCiudades(id);
			
			if(sCodIne.substring(0,2).equals(id.substring(0,2))) {
				listado.add(new Ciudad (ccaa, Integer.parseInt(sCodIne),sNombre, tMin,tMax));
			}
			
			}
		
		return listado;
	}
	
	public static void download_AEMET(String sFecha) throws MalformedURLException, IOException {
		String sUrl ="http://www.aemet.es/es/api-eltiempo/temperaturas/" + sFecha +"/PB";
		String sNombre = "aemet.xml";
		String sFolder = "ficheros/";
		
		File file = new File(sFolder + sNombre);
		URLConnection conn = new URL(sUrl).openConnection();
		conn.connect();
		
		InputStream in = conn.getInputStream();
		OutputStream out = new FileOutputStream(file);
		int b = 0;
		while(b!= -1) {
			b = in.read();
			if(b != - 1) {
				out.write(b);
			}
			out.close();
			in.close();
		}
	}

	/*public ArrayList<Jugador> getJugadores(){
		ArrayList<Jugador> jJugadores=new ArrayList<Jugador>();
		int iNumero,iPuntos;
		String sNombre,sApellidos,sNick;
		XPath xPath = XPathFactory.newInstance().newXPath();
		String sExpression = "/game/jugador";

		try {
			NodeList nodeList = (NodeList) xPath.compile(sExpression).evaluate(docXML, XPathConstants.NODESET);

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {			
					Element eElemento = (Element) nNode;
					
					iNumero=Integer.parseInt(eElemento.getAttribute("numero"));
					sNombre=eElemento.getElementsByTagName("nombre").item(0).getTextContent();
					sApellidos=eElemento.getElementsByTagName("apellidos").item(0).getTextContent();
					sNick=eElemento.getElementsByTagName("nick").item(0).getTextContent();
					iPuntos=Integer.parseInt(eElemento.getElementsByTagName("puntos").item(0).getTextContent());
					
					jJugadores.add(new Jugador(iNumero,sNombre,sApellidos,sNick,iPuntos));
				}

			}

		} catch (XPathExpressionException e) {
			System.err.println("Error aplicando la expresión");
		}
		return jJugadores;
		
	}*/
}
