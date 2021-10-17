package unico;

import java.awt.*;
import java.awt.event.*;

public class MiVentana extends java.awt.Frame {

	final Color CLR_BG_VENTANA = Color.green;
	final Color CLR_BG_USUARIO = Color.yellow;
	final Color CLR_BG_PASSWORD = Color.white;
	final Color CLR_BG_PASSWORDFONDO = Color.red;
	final Color CLR_BG_USUARIOFONDO = Color.blue;

	// FUENTES
	final Font FNT_LBL_TITULO = new Font("Arial", Font.PLAIN, 20);
	final Font FNT_LBL_NORMAL = new Font("Arial", Font.PLAIN, 12);
	final Font FNT_LBL_RESALTADO = new Font("Arial", Font.BOLD, 15);

	public static void main(String[] args) {
		MiVentana miApp = new MiVentana();
		miApp.iniciarComponentes();
		miApp.crearComponentes();
	}

	private void iniciarComponentes() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				ctrl.ctrlMiVentana.salir();
			}
		});
		// ICONO DE LA APP
		setIconImage(Toolkit.getDefaultToolkit().createImage("descarga.png"));
		
		// VENTANA
		setTitle("Creando componentes");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		// setLayout(new GridLayout(2,3));
		setBackground(CLR_BG_VENTANA);
		setVisible(true);
	}
	
	private void crearComponentes() {
		TextArea txtComentarios = new TextArea();
		txtComentarios.setBounds(20,50,80,68);
		
		Label lblPago = new Label ("Metodo de pago");
		lblPago.setBounds(140,50,100,100);
		/*Checkbox opcReembolso = new Checkbox();
		
		opcReembolso.setLabel("Reembolso");
		opcReembolso.setState(true);
		opcReembolso.setBounds(140,50,100,20);
		*/
		
		CheckboxGroup grpFormaPago = new CheckboxGroup();
		
		Checkbox opcReembolso = new Checkbox("Reembolso", true, grpFormaPago);
		opcReembolso.setBounds(140,100,100,20);
		
		Checkbox opcEfectivo = new Checkbox("Efectivo", true, grpFormaPago);
		opcEfectivo.setBounds(140,120,100,20);
		
		Checkbox opcTarjeta = new Checkbox("Tarjeta", true, grpFormaPago);
		opcTarjeta.setBounds(140,140,100,20);
		
		Checkbox opcBizum = new Checkbox("Bizum", true, grpFormaPago);
		opcBizum.setBounds(140,160,100,20);
		
		add(lblPago);
		add(opcReembolso);
		add(opcEfectivo);
		add(opcTarjeta);
		add(opcBizum);
		add(txtComentarios);
		
		
		
	}
}
