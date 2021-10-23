package model;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class FuenteTamannio {

	public static ArrayList<String> FUENTE = new ArrayList<String>();
	public static ArrayList<String> TAMANNIO = new ArrayList<String>();
	
	public static void cargarFuenteTamannio() {
		
		
		FUENTE.add("Arial");
		FUENTE.add("Times New Roman");
		FUENTE.add("Verdana");
		FUENTE.add("Trebuchet MS");
		FUENTE.add("Webding");
		FUENTE.add("Sylfaen");
		FUENTE.add("Wingdings");
		FUENTE.add("Corbel");
		FUENTE.add("Ebrima");
		FUENTE.add("Impact");
		FUENTE.add("Georgia");
		
		TAMANNIO.add("8");
		TAMANNIO.add("12");
		TAMANNIO.add("15");
		TAMANNIO.add("19");
		TAMANNIO.add("24");
		TAMANNIO.add("26");
		TAMANNIO.add("30");
		TAMANNIO.add("34");
		
	}
	
	public static DefaultListModel<String> oModelo(ArrayList <String> estilo) {
		String sNombres="";
		DefaultListModel<String> modeloFuente = new DefaultListModel<String>();
		for(int iContador = 0; iContador < estilo.size(); iContador++) {
			sNombres = estilo.get(iContador);
			modeloFuente.addElement(sNombres);
		}
		
			
		return modeloFuente;
	}
}
