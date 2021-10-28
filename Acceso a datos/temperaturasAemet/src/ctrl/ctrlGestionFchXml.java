package ctrl;

import java.io.FileOutputStream;
import java.io.IOException;
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
