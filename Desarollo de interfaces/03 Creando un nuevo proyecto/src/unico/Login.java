package unico;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends java.awt.Frame {

	public static void main(String[] args) {
		Login primerLogin = new Login();
		primerLogin.iniciarVentana();
	}

	private void iniciarVentana() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setTitle("LOGIN");
		setBounds(100,100,325,300);
		setLayout(null);
		crearComponentesLogin();
		setVisible(true);
	}
	
	private void crearComponentesLogin() {
		Label lblUsuario = new Label("Usuario: ");
		Label lblPassword = new Label("Password: ");
		
		TextField txtUsuario = new TextField("Escriba el nombre de usuario");
		TextField txtPassword = new TextField("Escriba su contraseña");
		
		txtPassword.setBounds(115,180,160,25);
		txtUsuario.setBounds(100, 130 , 175, 25);
		// ETIQUETAS
		lblUsuario.setBounds(50, 100, 50, 80);
		lblPassword.setBounds(50,150, 60, 80);
		
		Button btnAceptar = new Button("Aceptar");
		btnAceptar.setBounds(85, 230, 150, 40);
		
		add(btnAceptar);
		add(txtPassword);
		add(txtUsuario);
		add(lblUsuario);
		add(lblPassword);
		
	}
}




