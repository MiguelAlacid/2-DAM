package ctrl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

}
