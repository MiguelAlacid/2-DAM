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

	private void crearComponentes() {
		TextArea txtArea = new TextArea();
		add(txtArea, BorderLayout.CENTER);
		
		MenuBar bar = new MenuBar();
		Menu mnuArchivo = new Menu("Archivo");
		Menu mnuEditar = new Menu("Editar");
		Menu mnuExportar = new Menu ("Exportar");
		Menu mnuAyuda = new Menu ("Ayuda");
		Menu mnuConvertir = new Menu ("Convertir");
		Menu mnuImagen = new Menu ("Imagen");
		Menu mnuBD = new Menu ("BD");
		
		// ARCHIVO
		MenuItem mniAbrir = new MenuItem("Abrir");
		MenuItem mniGuardar = new MenuItem("Guardar");
		MenuItem mniGuardarComo = new MenuItem("Guardar como");
		MenuItem mniSalir = new MenuItem("Salir");
		
		MenuItem mniWord = new MenuItem("WORD");
		MenuItem mniPdf = new MenuItem("PDF");
		MenuItem mniTexto = new MenuItem("Texto");
		
		// EDITAR
		
		MenuItem mniCopiar = new MenuItem("Copiar");
		MenuItem mniCortar = new MenuItem("Cortar");
		MenuItem mniPegar = new MenuItem("Pegar");
		MenuItem mniSeleccionarTodo = new MenuItem("Seleccionar todo");
		
	
		//AYUDA
		MenuItem mniManual = new MenuItem("Manual");
		MenuItem mniAcercaDe = new MenuItem("Acerca de");
		
		// CONVERTIR
		
		MenuItem mniJPG = new MenuItem("JPG");
		MenuItem mniPNG = new MenuItem("PNG");
		MenuItem mniBMP = new MenuItem("BMP");
		
		MenuItem mniOracle = new MenuItem("Oracle");
		MenuItem mniMySql = new MenuItem("MySql");
		MenuItem mniAccess = new MenuItem("Access");
		
		// ARCHIVO
		
		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(mniGuardarComo);
		mnuArchivo.add(mnuExportar);
		mnuArchivo.addSeparator();
		mnuArchivo.add(mniSalir);
		
		mnuExportar.add(mniWord);
		mnuExportar.add(mniPdf);
		mnuExportar.add(mniTexto);
		
		// EDITAR
		
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniCortar);
		mnuEditar.add(mniPegar);
		mnuEditar.addSeparator();
		mnuEditar.add(mniSeleccionarTodo);
		
		// AYUDA
		
		mnuAyuda.add(mniManual);
		mnuAyuda.add(mniAcercaDe);
		
		// CONVERTIR
		
		mnuConvertir.add(mnuImagen);
		mnuConvertir.add(mnuBD);
		mnuImagen.add(mniJPG);
		mnuImagen.add(mniPNG);
		mnuImagen.add(mniBMP);
		
		mnuBD.add(mniOracle);
		mnuBD.add(mniMySql);
		mnuBD.add(mniAccess);
		
		// BARRAS
		bar.add(mnuArchivo);
		bar.add(mnuEditar);
		bar.add(mnuAyuda);
		bar.add(mnuConvertir);
		
		setMenuBar(bar);
		
	// ASIGNAMOS EVENTOS
	
	mniAbrir.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ctrl.ctrlMiVentana.abrir();
		}
	});
	
	mniGuardar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ctrl.ctrlMiVentana.guardar();
		}
	});
	
	mniGuardarComo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ctrl.ctrlMiVentana.guardarComo();
		}
	});
	
	mniSalir.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ctrl.ctrlMiVentana.salir();
		}
	});
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
		setLayout(new BorderLayout());
		// setLayout(new GridLayout(2,3));
		setBackground(CLR_BG_VENTANA);
		setVisible(true);
	}
}
