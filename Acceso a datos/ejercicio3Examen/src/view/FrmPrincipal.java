package view;

import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Casa;

public class FrmPrincipal {

	private static Document docXML;
	public static ArrayList<Casa> aListado = new ArrayList<Casa>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
		
		SessionFactory conf = new Configuration().configure().buildSessionFactory();		
		
		
		Session session = conf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		aListado = getCasas();
		
		for(Casa c: aListado) {
			session.save(c);
		}
		
	}


	public static ArrayList<Casa> getCasas() {
        ArrayList<Casa> aCasas = new ArrayList<>();

        XPath xPath = XPathFactory.newInstance().newXPath();

        String sExpression = "/Casas/CASAS";

        try {
            NodeList nodeList = (NodeList) xPath.compile(sExpression).evaluate(docXML, XPathConstants.NODESET);

            for (int iContador = 0; iContador < nodeList.getLength(); iContador++) {
                Node nNode = nodeList.item(iContador);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    String sPoblacion;
                    Integer id_casa, iAseos;
                    float fSuperficie;

                    id_casa = Integer.parseInt(eElement.getAttribute("ID_CASA"));
                    iAseos = Integer.parseInt(eElement.getElementsByTagName("ASEOS").item(0).getTextContent());
                    sPoblacion = eElement.getElementsByTagName("POBLACION").item(0).getTextContent();
                    fSuperficie = Float.valueOf(eElement.getElementsByTagName("SUPERFICIE").item(0).getTextContent());

                    aCasas.add(new Casa(id_casa, sPoblacion, fSuperficie, iAseos));

                }
            }

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return aCasas;
    }

}
