package ctrl;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class ctrlPrincipal {

	
	public static void inicio() {
		
		new view.frmPrincipal();
		model.Categorias.cargarCategorias();
		
	}
	
	
}
