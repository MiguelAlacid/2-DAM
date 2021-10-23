package unico;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MiVentana extends java.awt.Frame {

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
		setBounds(100, 100, 300, 400);
		setLayout(null);
		// setLayout(new GridLayout(2,3));
		setBackground(CLR_BG_VENTANA);
		setVisible(true);
	}
	
	private void crearComponentes() {
		
		
		// ETIQUETAS
		
		JLabel lblNombre = new JLabel("Nombre: ");
		JLabel lblApellidos = new JLabel("Apellidos: ");
		JLabel lblCurso = new JLabel("Curso: ");
		JLabel lblTurno = new JLabel("Turno: ");
		
		// BOUNDS
		
		
		
		// TEXT AREAS
		
		JTextField txtNombre = new JTextField();
		//txtNombre.setBounds(90,40,140,25);
		JTextField txtApellidos = new JTextField();
		//txtApellidos.setBounds(90,70,140,25);
		
		// CHECKBOXES
		
		// CURSO CHECKBOX
		
		
		// PANELES
		
		JPanel panNombreApellidos = new JPanel();
		
		//	panNombreApellidos.setBackground(Color.red);
			panNombreApellidos.setLayout(null);
			panNombreApellidos.setBounds(20,40,200,100);
			
			lblNombre.setBounds(1,22,60,10);
			lblApellidos.setBounds(1,55,60,20);
			txtNombre.setBounds(62,20,100,20);
			txtApellidos.setBounds(62,55,100,20);
		
		
			//AÑADIR COMPONENTES A UN PANEL
			panNombreApellidos.add(lblNombre);
			panNombreApellidos.add(txtNombre);
			panNombreApellidos.add(lblApellidos);
			panNombreApellidos.add(txtApellidos);
			
			add(panNombreApellidos);
			
			//panCurso.add(lblCurso);
		JPanel panCurso = new JPanel();
		
			//panCurso.setBackground(Color.pink);
			panCurso.setLayout(null);
			panCurso.setBounds(20,160,80,110);
			
			lblCurso.setBounds(1,5,60,10);
			
			CheckboxGroup grpCurso = new CheckboxGroup();
			
			Checkbox opcDam = new Checkbox("DAM", true, grpCurso);
			opcDam.setBounds(10,30,100,20);
			
			Checkbox opcDaw = new Checkbox("DAW", true, grpCurso);
			opcDaw.setBounds(10,50,100,20);
			
			Checkbox opcAsir = new Checkbox("ASIR", true, grpCurso);
			opcAsir.setBounds(10,70,100,20);
			
			panCurso.add(opcDam);
			panCurso.add(opcDaw);
			panCurso.add(opcAsir);
			panCurso.add(lblCurso);
			
			add(panCurso);
			
		JPanel panTurno = new JPanel();
		
			
		
			//panTurno.setBackground(Color.blue);
			panTurno.setLayout(null);
			panTurno.setBounds(160,160,80,110);
			
			lblTurno.setBounds(1,5,60,10);
			
			CheckboxGroup grpTurno = new CheckboxGroup();
			
			Checkbox opcManiana = new Checkbox("Mañana", true, grpTurno);
			opcManiana.setBounds(10,30,100,20);
			
			Checkbox opcTarde = new Checkbox("Tarde", true, grpTurno);
			opcTarde.setBounds(10,50,100,20);
			
			panTurno.add(lblTurno);
			panTurno.add(opcManiana);
			panTurno.add(opcTarde);
		
			add(panTurno);
		
			Checkbox opcResponsable = new Checkbox("Es responsable económico", true);
			
			opcResponsable.setBounds(20,300,200,60);
			add(opcResponsable);
		
	}
}
