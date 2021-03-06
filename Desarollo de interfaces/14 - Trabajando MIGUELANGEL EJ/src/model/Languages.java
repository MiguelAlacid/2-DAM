package model;

import java.util.*;

public class Languages {

	public static ArrayList<String> PREGUNTA = new ArrayList<String>();
	public static ArrayList<String> RESPUESTA = new ArrayList<String>();

	public static ArrayList<String> ENG = new ArrayList<String>();
	public static ArrayList<String> ESP = new ArrayList<String>();

	public static ArrayList<String> aENGpalabras = new ArrayList<String>();
	public static ArrayList<String> aESPpalabras = new ArrayList<String>();

	public static ArrayList<String> aIndiferente = new ArrayList<String>();

	public static int numPreg;

	public static void cargarLenguajes() {
		int iCast = 0;
		String sPalabrasEsp;
		String sPalabrasIng;

		aENGpalabras.add("HELLO");
		aENGpalabras.add("PARROT");
		aENGpalabras.add("DOG");
		aENGpalabras.add("CAT");
		aENGpalabras.add("FOREVER");
		aENGpalabras.add("BUTTON");
		aENGpalabras.add("TEXT");
		aENGpalabras.add("PHONE");
		aENGpalabras.add("ARM");
		aENGpalabras.add("LEG");

		aESPpalabras.add("HOLA");
		aESPpalabras.add("LORO");
		aESPpalabras.add("PERRO");
		aESPpalabras.add("GATO");
		aESPpalabras.add("SIEMPRE");
		aESPpalabras.add("BOTON");
		aESPpalabras.add("TEXTO");
		aESPpalabras.add("TELEFONO");
		aESPpalabras.add("BRAZO");
		aESPpalabras.add("PIERNA");

		
		if (view.frmConfig.chTotalPalabras.isSelected() && view.frmConfig.txtNumeroPalabras.getText().equals(null)) {
			iCast = Integer.parseInt(view.frmConfig.txtNumeroPalabras.getText());
			
		} else {
			iCast = aENGpalabras.size();
		}

		for (int iContador = 0; iContador < iCast; iContador++) {
			sPalabrasIng = aENGpalabras.get(iContador);
			ENG.add(sPalabrasIng);

			sPalabrasEsp = aESPpalabras.get(iContador);
			ESP.add(sPalabrasEsp);

		}

	}

	public static void ING_ESP() {
		PREGUNTA.addAll(ENG);
		RESPUESTA.addAll(ESP);

	}

	public static void ESP_ENG() {
		PREGUNTA.addAll(ESP);
		RESPUESTA.addAll(ENG);
	}

	public static void indiferente() {
		PREGUNTA.addAll(ESP);
		PREGUNTA.addAll(ENG);

		RESPUESTA.addAll(ENG);
		RESPUESTA.addAll(ESP);

	}
}
