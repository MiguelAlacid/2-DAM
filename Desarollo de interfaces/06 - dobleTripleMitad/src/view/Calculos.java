package view;

import java.awt.*;
import java.awt.event.*;

public class Calculos extends java.awt.Frame {

	private static final long serialVersionUID = 1L;
	
	public static Label lblUsuario;
	public static Label lblTexto;
	public static TextField txtUsuario;
	

	public Calculos() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				ctrl.CtrlOperaciones.finalizarApp();
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
		txtUsuario.setText("");

		txtUsuario.setBounds(95, 130, 215, 25);
		// ETIQUETAS

		lblUsuario.setBounds(30, 100, 50, 80);
		lblTexto.setBounds(70, 200, 200, 80);
		lblTexto.setAlignment(Label.CENTER);
		// BOTONES
		
		Button btnDoble = new Button("DOBLE");
		Button btnTriple = new Button ("TRIPLE");
		Button btnMitad = new Button ("MITAD");
		
		btnDoble.setBounds(70, 175, 60, 20);
		btnTriple.setBounds(150, 175,60,20);
		btnMitad.setBounds(230,175,60,20);

		// Asignamos eventos
		btnDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlOperaciones.calcularDoble();
			
			}
		});
		btnTriple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlOperaciones.calcularTriple();
			
			}
		});
		btnMitad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlOperaciones.calcularMitad();
			
			}
		});
		

		// asignamos eventos
		add(btnTriple);
		add(btnMitad);
		add(btnDoble);
		add(lblTexto);
		add(txtUsuario);
		add(lblUsuario);

	}

}
