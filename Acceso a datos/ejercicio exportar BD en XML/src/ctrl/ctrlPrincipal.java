package ctrl;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class ctrlPrincipal {

	public static Document documento;
	public static ArrayList<String> aNombreTablas = new ArrayList<String>();
	public static int iNumero = 0;

	public static void crearXml() throws Exception {
		crearArraysTablas();
		logic.LogTables.getTablas();

		for (int iContador = 0; iContador < logic.LogTables.aListado.size(); iContador++) {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = factory.newDocumentBuilder();

			DOMImplementation implementation = builder.getDOMImplementation();

			documento = implementation.createDocument(null, logic.LogTables.aListado.get(iContador), null);
			documento.setXmlVersion("1.0");
			logic.LogTables.getResultados(iContador);
			rellenarXML();

			Source source = new DOMSource(documento);
			// Creo el Result, indicado que fichero se va a crear
			Result result = new StreamResult(new File("" + logic.LogTables.aListado.get(iContador) + ".xml"));

			// Creo un transformer, se crea el fichero XML
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
		}

	}

	public static void crearArraysTablas() {
		
		
		aNombreTablas.add("DEPARTAMENTOS");
		aNombreTablas.add("EMPLEADOS");
		aNombreTablas.add("COCHES");
		aNombreTablas.add("CASAS");
	}

	private static void rellenarXML() {

		for (int iContador = 0; iContador < logic.LogTables.aListado.size(); iContador++) {

			Element nombreTabla = documento.createElement(logic.LogTables.aListado.get(iContador));
			System.out.println(nombreTabla);
			
			Element nombreGenerico = documento.createElement(aNombreTablas.get(iNumero));
			
			System.out.println(nombreGenerico);

			for (int iContador1 = 0; iContador1 < logic.LogTables.aNombreCampo.size(); iContador1++) {
				Element nombreCampo = documento.createElement(logic.LogTables.aNombreCampo.get(iContador1));
				for (int iContador2 = 0; iContador2 < logic.LogTables.aResultados.size(); iContador2++) {
					Text txtResultado = documento.createTextNode(logic.LogTables.aResultados.get(iContador2));
					nombreCampo.appendChild(txtResultado);
					nombreGenerico.appendChild(nombreCampo);
					
				}
				
			}
			documento.getDocumentElement().appendChild(nombreGenerico);

		}
		iNumero++;
	}
}
