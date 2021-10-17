package unico;

import java.awt.*;
import java.awt.event.*;
import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.*;

public class MiVentana extends java.awt.Frame {

	
	private static String[] ColorNombre = {"Rojo", "Verde", "Azul", "Amarillo", "Blanco", "Negro"};
	private static Color[] ColorValor = {Color.red, Color.green, Color.blue, Color.yellow, Color.white, Color.black};
	
	final Color CLR_BG_VENTANA = Color.gray;
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
	}

	private void iniciarComponentes() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				int opcSeleccionada = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la aplicación?", "UTILIDADES DE MADRE", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
				System.out.println("Ha introducido: " + opcSeleccionada);
				if(opcSeleccionada == 0) {
					ctrl.ctrlMiVentana.salir();
				}
				
			}
		});
		// ICONO DE LA APP
		setIconImage(Toolkit.getDefaultToolkit().createImage("descarga.png"));

		// VENTANA
		setTitle("Creando componentes");
		setBounds(100, 100, 300, 400);
		setLayout(null);
		// setLayout(new GridLayout(2,3));
		setBackground(CLR_BG_VENTANA);
		crearComponentes();
		setVisible(true);
	}
	/*private void crearComponentesv3() {
		List lstColorFondo = new List();
		for(int i = 0; i < ColorNombre.length; i++) {
			lstColorFondo.add(ColorNombre[i]);
		}
		lstColorFondo.setBounds(40,100,80,100);
		
		lstColorFondo.addItemListener(e -> {
			setBackground(ColorValor[lstColorFondo.getSelectedIndex()]);
		});
		
		List lstColorFuente = new List();
		for(int i = 0; i < ColorNombre.length; i++) {
			lstColorFuente.add(ColorNombre[i]);
		}
		
		lstColorFuente.setBounds(150,100,80,100);
		
		lstColorFondo.addItemListener(e -> {
			if(lstColorFondo.getSelectedIndex() != -1) {
				lblMensaje.setBackground(ColorValor[lstColorFondo.getSelectedItem()]);
			}
			setBackground(ColorValor[lstColorFondo.getSelectedIndex()]);
		});
	}*/
	
	private void crearComponentes() {
		
		// ETIQUETAS

		/*Label lblFondo = new Label("FONDO");

		lblFondo.setBounds(60, 125, 50, 10);
		add(lblFondo);
		// LISTAS

		List lstColores = new List();

		lstColores.add("Rojo");
		lstColores.add("Verde");
		lstColores.add("Azul");
		lstColores.add("Amarillo");
		lstColores.add("Naranja");
		lstColores.add("Rosa");
		lstColores.add("Blanco");

		lstColores.setBounds(50, 150, 80, 100);
		add(lstColores);

		List lstColoresFuente = new List();

		lstColoresFuente.add("Blanco");
		lstColoresFuente.add("Verde");
		lstColoresFuente.add("Rojo");
		lstColoresFuente.add("Azul");
		lstColoresFuente.add("Amarillo");
		lstColoresFuente.add("Rosa");
		lstColoresFuente.add("Naranja");

		lstColoresFuente.setBounds(200, 150, 80, 100);
		add(lstColoresFuente);

		/*
		 * lstCiudades.addItemListener(new ItemListener() { public void
		 * itemStateChanged(ItemEvent e) {
		 * System.out.println(lstCiudades.getSelectedItem()); } });
		 */

		// FUNCION LAMBDA

		/*lstColores.addItemListener(e -> {
			System.out.println(lstColores.getSelectedItem());

			if (lstColores.getSelectedItem() != lstColoresFuente.getSelectedItem()) {
				switch (lstColores.getSelectedItem()) {
				case "Verde":
					setBackground(Color.green);
					break;
				case "Rojo":
					setBackground(Color.red);
					break;
				case "Amarillo":
					setBackground(Color.yellow);
					break;
				case "Rosa":
					setBackground(Color.pink);
					break;
				case "Blanco":
					setBackground(Color.white);
					break;
				case "Naranja":
					setBackground(Color.orange);
					break;
				case "Azul":
					setBackground(Color.blue);
					break;
				default:
					break;
				}
			}

		});

		lstColoresFuente.addItemListener(e -> {
			System.out.println(lstColoresFuente.getSelectedItem());

			if (lstColores.getSelectedItem() != lstColoresFuente.getSelectedItem()) {
				switch (lstColoresFuente.getSelectedItem()) {
				case "Blanco":
					lblFondo.setForeground(Color.white);
					break;
				case "Verde":
					lblFondo.setForeground(Color.green);
					break;
				case "Rojo":
					lblFondo.setForeground(Color.red);
					break;
				case "Azul":
					lblFondo.setForeground(Color.blue);
					break;
				case "Amarillo":
					lblFondo.setForeground(Color.yellow);
					break;
				case "Rosa":
					lblFondo.setForeground(Color.pink);
					break;
				case "Naranja":
					lblFondo.setForeground(Color.orange);
				default:
					break;
				}
			}

		}); */

		String[] misColores = {"Rojo", "Verde", "Azul"};
		JComboBox lstColores2 = new JComboBox(misColores);
		lstColores2.setBounds(120,100,80,20);
		lstColores2.setEditable(true);
		lstColores2.addActionListener(e -> {
			System.out.println(lstColores2.getSelectedItem());
			System.out.println(lstColores2.getSelectedIndex());
		});
		
		
		JButton btnMensaje = new JButton("Mensaje");
		btnMensaje.setBounds(20,150,80,20);
		btnMensaje.addActionListener(e -> {
			for(int i = 0; i < 5; i++) {
				JOptionPane.showMessageDialog(null, "El producto ha sido añadido correctamente", "Gestion de productos", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "No se ha podido añadir el producto", "Gestion de productos", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "el precio del producto es demasiado bajo", "Gestion de productos", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "El producto ha sido añadido correctamente", "Gestion de productos", JOptionPane.PLAIN_MESSAGE);
				
			}
			
		});
		
		
		JButton btnEntrada = new JButton("ENTRADA");
		btnEntrada.setBounds(20,200,80,20);
		btnEntrada.addActionListener(e -> {
				String sValorIntroducido = JOptionPane.showInputDialog(null, "Introduzca el nuevo precio", "100");
				System.out.println("Ha introducido: " + sValorIntroducido);
			
		});
		
		
		
		JButton btnConfirmacion = new JButton("CONFIRMACION");
		btnConfirmacion.setBounds(20,250,100,20);
		btnConfirmacion.addActionListener(e -> {
				int opcSeleccionada = JOptionPane.showConfirmDialog(null, "¿Desea formatear a la madre del miguel rey?", "UTILIDADES DE MADRE", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
				System.out.println("Ha introducido: " + opcSeleccionada);
			
		});
		
		JButton btnVentana = new JButton("VENTANA");
		btnVentana.setBounds(20,300,100,20);
		btnVentana.addActionListener(e -> {
				new FrmProductos();
			/*Dialog frmProducto = new Dialog(this, "Gestion de productos", true);
			frmProducto.setBounds(100, 100, 400, 200);
			frmProducto.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					frmProducto.dispose();
				}
			});
			frmProducto.setVisible(true);*/
		});
		
		add(btnConfirmacion);
		add(btnEntrada);
		add(btnMensaje);
		add(lstColores2);
		add(btnVentana);
		
		
		
		// JOPTION PANEL
		/* MENSAJE
		 * ENTRADA
		 * CONFIRMACION
		 */
	}
}
