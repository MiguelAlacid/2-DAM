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
		setLayout(new BorderLayout());
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
		Button btn2 = new Button("BOTON 2");
		Button btn3 = new Button("BOTON 3");
		Button btn4 = new Button("BOTON 4");
		Button btn5 = new Button("BOTON 5");
		Button btn6 = new Button("BOTON 6");
		Button btn7 = new Button("BOTON 7");
		Label lbl1 = new Label("LABEL 1");
		// Agregar componentes al frame
		
		Panel panOperaciones = new Panel();
		Panel panOperaciones2 = new Panel();
		panOperaciones.setLayout(new FlowLayout());
		panOperaciones2.setLayout(new GridLayout(2,3));
		
	
		panOperaciones2.add(btn3);
		panOperaciones2.add(btn4);
		panOperaciones2.add(btn5);
		panOperaciones2.add(btn6);
		
		panOperaciones.add(btn1);
		panOperaciones.add(btn2);
		
		//Agregar componentes al FRAME
		add(panOperaciones2, BorderLayout.CENTER);
		add(panOperaciones, BorderLayout.SOUTH);
		
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
