package view;

import java.util.ArrayList;


import ctrl.ctrlGestionFchXml;
import model.CcAa;

public class principal {

	public static void main(String[] args) {
		String fileName="archivos/datos.xml";
		
		ctrlGestionFchXml fchXML = new ctrlGestionFchXml(fileName);
		//ArrayList<CcAa>Ciudades=fchXML.getJugadores();
		
		//fchXML.addJugador(new Jugador(7,"Ramon","Pernia","Pelota",1750));
		//fchXML.saveData();
		fchXML.mostrarDocumento();

	}

}
