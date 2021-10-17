package ctrl;

import java.awt.Color;
public class CtrlOperaciones {

	public static void finalizarApp() {
		System.exit(0);
	}
	
	public static void calcularDoble() {
		try {
			if (view.Calculos.txtUsuario.getText().isEmpty()) {
				view.Calculos.lblTexto.setText("No has introducido ningun numero");
				view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_ERROR);
			} else {
				String iNumero = view.Calculos.txtUsuario.getText();
				int iResultado = Integer.parseInt(iNumero) * 2;
				view.Calculos.lblTexto.setText("" + iResultado);
				view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_CORRECTO);
			}

		} catch (Exception e2) {
			view.Calculos.lblTexto.setText("ERROR");
			view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_ERROR);
		}

	}
	
	public static void calcularTriple() {
		try {
			if (view.Calculos.txtUsuario.getText().isEmpty()) {
				view.Calculos.lblTexto.setText("No has introducido ningun numero");
				view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_ERROR);
			} else {
				String iNumero = view.Calculos.txtUsuario.getText();
				int iResultado = Integer.parseInt(iNumero) * 3;
				view.Calculos.lblTexto.setText("" + iResultado);
				view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_CORRECTO);
			}

		} catch (Exception e2) {
			view.Calculos.lblTexto.setText("ERROR");
			view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_ERROR);
		}

	}
	
	public static void calcularMitad() {
		try {
			if (view.Calculos.txtUsuario.getText().isEmpty()) {
				view.Calculos.lblTexto.setText("No has introducido ningun numero");
				view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_ERROR);
			} else {
				String iNumero = view.Calculos.txtUsuario.getText();
				double iResultado = Double.parseDouble(iNumero) / 2;
				view.Calculos.lblTexto.setText("" + iResultado);
				view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_CORRECTO);
			}

		} catch (Exception e2) {
			view.Calculos.lblTexto.setText("ERROR");
			view.Calculos.lblTexto.setForeground(view.Theme.CLR_BG_ERROR);
		}

	}
}
