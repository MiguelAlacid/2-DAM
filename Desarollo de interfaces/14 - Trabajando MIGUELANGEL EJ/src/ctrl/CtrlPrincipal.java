package ctrl;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet.ColorAttribute;

public class CtrlPrincipal {

	public static int numPreg;
	public static String pregunta;
	public static String sRespuesta;

	public static void inicio() {

		model.Languages.cargarLenguajes();
		generarNumPregunta();
		new view.FrmPrincipal();
		elegirIdioma();

		view.FrmPrincipal.lblNewLabel.setText(pregunta);
	}

	public static void generarNumPregunta() {

		numPreg = (int) (Math.random() * model.Languages.PREGUNTA.size());
	}

	public static void verificar() {
		String sTexto;
		int opcSeleccionada;
		int opcSeleccionada2 = 0;
		String sRespuestaUsuario = view.FrmPrincipal.textField.getText();

		if (model.Languages.PREGUNTA.size() != 0 && model.Languages.PREGUNTA.size() != 0) {

			if (sRespuesta.toUpperCase().equals(sRespuestaUsuario.toUpperCase())) {
				model.Languages.PREGUNTA.remove(numPreg);
				model.Languages.RESPUESTA.remove(numPreg);

				sTexto = "Respuesta correcta";
				// color cColor = new Color(),

				view.FrmPrincipal.jRespuesta.setForeground(Color.green);

			} else {
				sTexto = sRespuesta;
				view.FrmPrincipal.jRespuesta.setForeground(Color.red);

			}
			view.FrmPrincipal.jRespuesta.setText(sTexto);
			if (model.Languages.PREGUNTA.size() != 0 && model.Languages.PREGUNTA.size() != 0) {
				opcSeleccionada = JOptionPane.showConfirmDialog(null, "?Desea continuar con otra palabra?", "Traductor",
						JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
				System.out.println("Ha introducido: " + opcSeleccionada);

				if (opcSeleccionada == JOptionPane.YES_OPTION) {
					generarNumPregunta();
					generarPalabra();
					cleanText();
				} else {
					salir();
				}
			}
		}

		if (model.Languages.PREGUNTA.size() == 0 && model.Languages.PREGUNTA.size() == 0) {
			opcSeleccionada2 = JOptionPane.showConfirmDialog(null, "?Quieres empezar de nuevo?", "FIN",
					JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
			System.out.println("Ha introducido: " + opcSeleccionada2);
			if (opcSeleccionada2 == JOptionPane.YES_OPTION) {
				model.Languages.cargarLenguajes();
				generarNumPregunta();
				elegirIdioma();
				generarPalabra();	
				cleanText();

			} else {
				salir();
			}
		}

	}

	public static void salir() {
		int resp = JOptionPane.showConfirmDialog(null, "?Desea salir de la aplicacion?", "Salir",
				JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
		if (resp == JOptionPane.YES_OPTION) {
			view.FrmPrincipal.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			System.exit(0);
		} else {
			view.FrmPrincipal.ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}

	public static void elegirIdioma() {

		if (view.frmConfig.rdbtnNewRadioButton.isSelected()) {
			model.Languages.ESP_ENG();
			generarPalabra();
		} else if (view.frmConfig.rdbtnNewRadioButton_1.isSelected()) {
			model.Languages.ING_ESP();
			generarPalabra();
		} else {
			model.Languages.indiferente();
			generarPalabra();
		}
	}

	public static void generarPalabra() {
		pregunta = model.Languages.PREGUNTA.get(numPreg);
		sRespuesta = model.Languages.RESPUESTA.get(numPreg);
	}

	public static void cleanText() {
		view.FrmPrincipal.lblNewLabel.setText(pregunta);
		view.FrmPrincipal.textField.setText(null);
		view.FrmPrincipal.jRespuesta.setText(null);
	}
}
