package unico;

import java.awt.*;
import java.awt.event.*;

public class Doble extends java.awt.Frame {

	public static void main(String[] args) {
		Doble Doble = new Doble();
		Doble.iniciarVentana();
	}

	private void iniciarVentana() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		setTitle("DOBLE");
		setBounds(100, 100, 330, 300);
		setLayout(null);
		crearComponentesLogin();
		setVisible(true);
	}

	private void crearComponentesLogin() {
		Label lblUsuario = new Label("Numero: ");
		Label lblTexto = new Label("Escribe un numero y pulsa el boton");

		TextField txtUsuario = new TextField();
		txtUsuario.setText("Hola");

		txtUsuario.setBounds(95, 130, 215, 25);
		// ETIQUETAS

		lblUsuario.setBounds(30, 100, 50, 80);
		lblTexto.setBounds(70, 200, 200, 80);
		lblTexto.setAlignment(Label.CENTER);

		Button btnDoble = new Button("Calcular el doble");
		btnDoble.setBounds(85, 175, 150, 40);

		// Asignamos eventos
		btnDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (txtUsuario.getText().isEmpty()) {
						lblTexto.setText("No has introducido ningun numero");
						lblTexto.setForeground(Color.red);
					} else {
						String iNumero = txtUsuario.getText();
						int iResultado = Integer.parseInt(iNumero) * 2;
						lblTexto.setText("" + iResultado);
					}

				} catch (Exception e2) {
					lblTexto.setText("ERROR");
					lblTexto.setForeground(Color.red);
				}

			}
		});

		// asignamos eventos
		add(btnDoble);
		add(lblTexto);
		add(txtUsuario);
		add(lblUsuario);

	}

}
