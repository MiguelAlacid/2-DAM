package view;

import java.awt.*;
import java.awt.event.*;

public class Doble extends java.awt.Frame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static Label lblUsuario;
	public static Label lblTexto;
	public static TextField txtUsuario;

	public Doble() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				ctrl.CtrlDoble.finalizarApp();
			}
		});

		setTitle("DOBLE");
		setBounds(100, 100, 330, 300);
		setLayout(null);
		crearComponentesLogin();
		setVisible(true);
	}

	private void crearComponentesLogin() {
		lblUsuario = new Label("Numero: ");
		lblTexto = new Label("Escribe un numero y pulsa el boton");

		txtUsuario = new TextField();
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
				ctrl.CtrlDoble.calcularDoble();
			
			}
		});

		// asignamos eventos
		add(btnDoble);
		add(lblTexto);
		add(txtUsuario);
		add(lblUsuario);

	}

}
