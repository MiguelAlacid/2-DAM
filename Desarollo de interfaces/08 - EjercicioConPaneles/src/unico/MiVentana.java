package unico;

import java.awt.*;
import java.awt.event.*;
public class MiVentana extends java.awt.Frame{

	final Color CLR_BG_VENTANA = Color.green;
	final Color CLR_BG_USUARIO = Color.yellow;
	final Color CLR_BG_PASSWORD = Color.white;
	final Color CLR_BG_PASSWORDFONDO = Color.red;
	final Color CLR_BG_USUARIOFONDO = Color.blue;
	
	//FUENTES
	final Font FNT_LBL_TITULO = new Font ("Arial", Font.PLAIN, 20);
	final Font FNT_LBL_NORMAL = new Font ("Arial", Font.PLAIN, 12);
	final Font FNT_LBL_RESALTADO = new Font ("Arial", Font.BOLD, 15);
	
	public static void main(String[] args) {
		MiVentana miApp = new MiVentana();
		miApp.iniciarComponentes();
	}
	
	
	private void iniciarComponentes() {	
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
		}
	});
		
		setTitle("Creando componentes");
		setBounds(100,100,600,400);
		setLayout(new GridLayout(2,1));
		//setLayout(new GridLayout(2,3));
		setBackground(CLR_BG_VENTANA);
		crearComponentes();
		setVisible(true);
	}

	private void crearComponentes() {
		/*
		Button btnAceptar = new Button();
		btnAceptar.setLabel("Aceptar");
		*/
		//Botones
		Button btn1 = new Button("BOTON 1");
		Label lblUsuario = new Label("Usuario: ");
		Label lblContrasennia = new Label("Contraseña: ");
		TextField txtUsuario = new TextField();
		TextField txtContrasennia = new TextField();
		// Agregar componentes al frame
		
		Panel panUsuarioContrasennia = new Panel();
		Panel panAceptar = new Panel();
		panAceptar.setLayout(new FlowLayout());
		panUsuarioContrasennia.setBackground(Color.blue);
		panUsuarioContrasennia.setLayout(new GridLayout(2,2));
		
		panAceptar.add(btn1);
		panUsuarioContrasennia.add(lblUsuario);
		panUsuarioContrasennia.add(lblContrasennia);
		
		//Agregar componentes al FRAME
		add(panUsuarioContrasennia, BorderLayout.CENTER);
		add(panAceptar, BorderLayout.CENTER);
		
		//añadir
		/*add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.EAST);
		add(btn4, BorderLayout.WEST);
		add(btn5, BorderLayout.CENTER);*/
		
	}
	
	private void crearComponentes2() {
		/*
		Button btnAceptar = new Button();
		btnAceptar.setLabel("Aceptar");
		*/
		
		Button btnSevilla = new Button("Sevilla");
		Button btnNo = new Button("No");
		Button btnAndalucia = new Button ("Andalucia");
		Button btnSi = new Button ("Si");
		// x y ancho alto
		btnSevilla.setBounds(50, 100, 80, 40);
		btnNo.setBounds(135, 100, 40, 40);
		btnAndalucia.setBounds(95, 145, 80,40);
		btnSi.setBounds(50, 145, 40,40);
		// Agregar componentes al frame
		add(btnSevilla);
		add(btnNo);
		add(btnAndalucia);
		add(btnSi);
	}
}
