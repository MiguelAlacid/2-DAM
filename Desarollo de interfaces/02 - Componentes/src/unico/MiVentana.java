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
		setLayout(null);
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
		Button btnAceptar = new Button("Aceptar");
		Button btnCancelar = new Button("Cancelar");
		btnCancelar.setBounds(135, 100, 80, 40);
		btnAceptar.setBounds(50, 100, 80, 40);
		// Agregar componentes al frame
		
		/*Label lblUsuario = new Label();
		lblUsuario.setText("Usuario:");
		*/
		
		//Etiquetas
		
		Label lblUsuario = new Label ("Usuario:");
		Label lblContrasennia = new Label ("Contrasennia");
		lblContrasennia.setBounds(50,250, 80, 40);
		lblUsuario.setBounds(50, 200, 80, 40);
		lblUsuario.setBackground(CLR_BG_USUARIOFONDO);
		lblContrasennia.setBackground(CLR_BG_PASSWORDFONDO);
		lblUsuario.setForeground(CLR_BG_USUARIO);
		lblContrasennia.setForeground(CLR_BG_PASSWORD);
		lblUsuario.setFont(FNT_LBL_RESALTADO);
		
		//Cuadros de textos
		TextField txtUserName = new TextField("Medac", 10);
		
		txtUserName.setBounds(50, 230, 80, 40);
		
		//añadir
		add(txtUserName);
		add(lblContrasennia);
		add(lblUsuario);
		add(btnAceptar);
		add(btnCancelar);
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
