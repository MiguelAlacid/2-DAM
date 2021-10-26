package model;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Categorias {

	public static ArrayList<String> CATEGORIAS = new ArrayList<String>();
	
	public static void cargarCategorias() {
		
		
		CATEGORIAS.add("COMIDA");
		CATEGORIAS.add("COCHES");
		CATEGORIAS.add("MOVILES");
		
		view.frmPrincipal.lstCategorias.setModel(cargarModelo(CATEGORIAS));
		
	}
	
	public static DefaultListModel<String> cargarModelo(ArrayList<String> aCategorias) {
		
		String sNombres="";
		DefaultListModel<String> modeloFuente = new DefaultListModel<String>();
		for(int iContador = 0; iContador < aCategorias.size(); iContador++) {
			sNombres = aCategorias.get(iContador);
			modeloFuente.addElement(sNombres);
		}
		return modeloFuente;
			
	}
}
