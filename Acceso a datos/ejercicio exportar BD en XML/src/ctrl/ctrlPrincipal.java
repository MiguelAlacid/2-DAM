package ctrl;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class ctrlPrincipal {

	public static Document documento;
	public static ArrayList<String> aNombreTablas = new ArrayList<String>();

	public static void crearXml() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();

		DOMImplementation implementation = builder.getDOMImplementation();

		Document documento = implementation.createDocument(null, "Tablas", null);
		documento.setXmlVersion("1.0");

		rellenarXML();

	}

	public static void crearArraysTablas() {

		aNombreTablas.add("CASA");
		aNombreTablas.add("DOCHE");
		aNombreTablas.add("DEPT");
		aNombreTablas.add("EMP");
	}

	private static void rellenarXML() {

		for (int iContador = 0; iContador < logic.LogTables.aListado.size(); iContador++) {

			Element nombreTabla = documento.createElement(logic.LogTables.aListado.get(iContador));
			Element nombreGenerico = documento.createElement(aNombreTablas.get(iContador));

			for (int iContador1 = 0; iContador1 < logic.LogTables.aNombreCampo.size(); iContador1++) {
				Element nombreCampo = documento.createElement(logic.LogTables.aNombreCampo.get(iContador1));
				for (int iContador2 = 0; iContador2 < logic.LogTables.aListado.size(); iContador2++) {
					Text txtResultado = documento.createTextNode(logic.LogTables.aResultados.get(iContador2));
					nombreCampo.appendChild(txtResultado);
					nombreGenerico.appendChild(nombreCampo);

				}
			}

			nombreTabla.appendChild(nombreGenerico);

		}

	}
}
