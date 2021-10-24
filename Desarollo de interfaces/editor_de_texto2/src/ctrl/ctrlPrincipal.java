package ctrl;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ctrlPrincipal {
	public static File miFichero = new File("misNotas.txt");
	public static File fileName;
	public static File fileFont = new File("Fuentes.dat");
	public static File fileColor = new File("colores.dat");

	public static void abrirFicheroTexto() {
		JFileChooser selectorFch = new JFileChooser();

		selectorFch.setFileSelectionMode(JFileChooser.FILES_ONLY);

		FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Formato texto", "txt");
		selectorFch.setFileFilter(imgFilter);
		int iBtnFch = selectorFch.showOpenDialog(null);
		if (iBtnFch != JFileChooser.CANCEL_OPTION) {
			fileName = selectorFch.getSelectedFile();
			if (fileName != null && !fileName.getName().equals("")) {
				String sTexto = leerFichero(fileName);
				view.FrmPrincipal.txtAreaEscritura.setText(sTexto);

			}
		}

	}

	public static void leerFuente() {

	}

	public static void guardarFicheroTexto() {
		JFileChooser selectorFch = new JFileChooser();

		selectorFch.setFileSelectionMode(JFileChooser.FILES_ONLY);

		FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Formato texto", "txt");
		selectorFch.setFileFilter(imgFilter);
		int iBtnFch = selectorFch.showSaveDialog(null);
		if (iBtnFch != JFileChooser.CANCEL_OPTION) {
			fileName = selectorFch.getSelectedFile();
			if (fileName != null && !fileName.getName().equals("")) {
				escribirFichero(fileName);
			}
		}

	}

	public static String leerFichero(File fch) {
		String sTexto = "";
		try {
			RandomAccessFile fichero = new RandomAccessFile(fch, "r");

			byte[] byteLeidos = new byte[(int) fichero.length()];
			fichero.read(byteLeidos);
			sTexto = new String(byteLeidos);
			fichero.close();
		} catch (Exception e) {
		}

		return sTexto;
	}

	public static void escribirFichero(File fch) {
		try {
			FileWriter fichero = new FileWriter(fch);
			BufferedWriter bufEscritura = new BufferedWriter(fichero);

			String sTexto = view.FrmPrincipal.txtAreaEscritura.getText();

			bufEscritura.write(sTexto);
			bufEscritura.close();
			fichero.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void salir() {
		int resp = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicacion?", "Salir",
				JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
		if (resp == JOptionPane.YES_OPTION) {
			view.FrmPrincipal.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			System.exit(0);
		} else {
			view.FrmPrincipal.ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}

	}

	public static void cambiarEstilo() {

		if (view.fuenteDialog.rdnCursiva.isSelected()) {

			view.fuenteDialog.lblTextoPrueba.setFont(new Font(view.fuenteDialog.sSelectedFuente, Font.ITALIC, Integer.parseInt(view.fuenteDialog.sSelectedTamannio)));

		} else if (view.fuenteDialog.rdnNegrito.isSelected()) {

			view.fuenteDialog.lblTextoPrueba.setFont(new Font(view.fuenteDialog.sSelectedFuente, Font.BOLD, Integer.parseInt(view.fuenteDialog.sSelectedTamannio)));

		} else {

			view.fuenteDialog.lblTextoPrueba.setFont(new Font(view.fuenteDialog.sSelectedFuente, Font.PLAIN, Integer.parseInt(view.fuenteDialog.sSelectedTamannio)));
		}

	}
	
	public static void writeFont() {
		try {
			ObjectOutputStream buff = new ObjectOutputStream(new FileOutputStream(fileFont));
			/*for(Coche c: listado) {
				buff.writeObject(c);
			}*/
			
			buff.writeObject(view.fuenteDialog.fDefault);
			
			buff.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + fileFont + " NO EXISTE");
		} catch (IOException e) {
			System.err.println("ERROR: NO SE PUEDE ESCRIBIR EN EL FICHERO");
		}
	}
	
	public static Font readFont() {
		
		Font oFont = null;
		try {
			FileInputStream fch = new FileInputStream(fileFont);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			oFont = (Font) buff.readObject();
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + fileFont + " NO EXISTE");
		} catch (IOException e) {
			System.err.println("ERROR: NO SE PUEDE LEER EN EL FICHERO");
		} catch (ClassNotFoundException e) {
			System.err.println("EL FICHERO NO CONTIENE UN COCHE.");
		}
		
		return oFont;
	}
	
	public static void writeColor() {
		try {
			ObjectOutputStream buff = new ObjectOutputStream(new FileOutputStream(fileColor));
			/*for(Coche c: listado) {
				buff.writeObject(c);
			}*/
			
			buff.writeObject(view.coloresDialog.cBackgroundDefault);
			buff.writeObject(view.coloresDialog.cForegroundDefault);
			
			buff.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + fileFont + " NO EXISTE");
		} catch (IOException e) {
			System.err.println("ERROR: NO SE PUEDE ESCRIBIR EN EL FICHERO");
		}
	}
	
	public static void readColor() {
		
		try {
			FileInputStream fch = new FileInputStream(fileColor);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			view.coloresDialog.cBackgroundDefault = (Color) buff.readObject();
			view.coloresDialog.cForegroundDefault = (Color) buff.readObject();
		
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + fileFont + " NO EXISTE");
		} catch (IOException e) {
			System.err.println("ERROR: NO SE PUEDE LEER EN EL FICHERO");
		} catch (ClassNotFoundException e) {
			System.err.println("EL FICHERO NO CONTIENE UN COCHE.");
		}
		
		
	}
	
	public static void defaultConfig() {
		
		view.FrmPrincipal.txtAreaEscritura.setFont(ctrl.ctrlPrincipal.readFont());
		readColor();
		view.FrmPrincipal.txtAreaEscritura.setBackground(view.coloresDialog.cBackgroundDefault);
		view.FrmPrincipal.txtAreaEscritura.setForeground(view.coloresDialog.cForegroundDefault);
	}

}




