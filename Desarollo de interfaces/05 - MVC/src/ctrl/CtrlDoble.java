package ctrl;

import java.awt.Color;
public class CtrlDoble {

	public static void finalizarApp() {
		System.exit(0);
	}
	
	public static void calcularDoble() {
		try {
			if (view.Doble.txtUsuario.getText().isEmpty()) {
				view.Doble.lblTexto.setText("No has introducido ningun numero");
				view.Doble.lblTexto.setForeground(view.Theme.CLR_BG_ERROR);
			} else {
				String iNumero = view.Doble.txtUsuario.getText();
				int iResultado = Integer.parseInt(iNumero) * 2;
				view.Doble.lblTexto.setText("" + iResultado);
				view.Doble.lblTexto.setForeground(view.Theme.CLR_BG_CORRECTO);
			}

		} catch (Exception e2) {
			view.Doble.lblTexto.setText("ERROR");
			view.Doble.lblTexto.setForeground(view.Theme.CLR_BG_CORRECTO);
		}

	}
	
}
