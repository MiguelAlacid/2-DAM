package ctrl;

import java.awt.Color;
import java.awt.TextField;
import java.io.File;
import java.io.*;
import java.util.*;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import model.Persona;

public class CtrlPrincipal {

	public static ArrayList<Persona> aPersonas;
	public static File fileName;

	public static void inicio() {

		new view.frmPrincipal();

	}

	public static ArrayList<Persona> leerFichero(File fch) {
		ArrayList<Persona> aPersonas = new ArrayList<Persona>();
		try {
			FileReader fichero = new FileReader(fch);
			BufferedReader bufLectura = new BufferedReader(fichero);

			String lineaLeida;
			lineaLeida = bufLectura.readLine();
			while (lineaLeida != null) {
				// A CONTINUACION PROCESO LA LINEA LEIDA..
				StringTokenizer sToken = new StringTokenizer(lineaLeida, "#");
				String sNombre = sToken.nextToken();
				String sTelefono = sToken.nextToken();

				aPersonas.add(new Persona(sNombre, sTelefono));

				lineaLeida = bufLectura.readLine();
			}

			bufLectura.close();
			fichero.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + fch + " no existe");
		} catch (IOException e) {
			System.out.println("El fichero " + fch + " no existe");
		}
		return aPersonas;
	}

	public static void abrirFichero() {
		JFileChooser selectorFch = new JFileChooser();

		selectorFch.setFileSelectionMode(JFileChooser.FILES_ONLY);

		FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Formato texto", "txt");
		selectorFch.setFileFilter(imgFilter);
		int iBtnFch = selectorFch.showOpenDialog(null);
		if (iBtnFch != JFileChooser.CANCEL_OPTION) {
			fileName = selectorFch.getSelectedFile();
			if (fileName != null && !fileName.getName().equals("")) {
				aPersonas = leerFichero(fileName);
				volcarContactos();

			}
		}
	}

	public static void volcarContactos() {
		String sNombre = "";
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		for (int iContador = 0; iContador < aPersonas.size(); iContador++) {
			sNombre = aPersonas.get(iContador).getsNombre();
			modelo.addElement(sNombre);
		}
		view.frmPrincipal.lstNombres.setModel(modelo);
	}

	public static void guardarFichero() {
		JFileChooser selectorFch = new JFileChooser();

		selectorFch.setFileSelectionMode(JFileChooser.FILES_ONLY);

		FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Formato de texto", "txt");
		selectorFch.setFileFilter(imgFilter);
		int iBtnFch = selectorFch.showSaveDialog(null);
		if (iBtnFch != JFileChooser.CANCEL_OPTION) {
			fileName = selectorFch.getSelectedFile();
			if (fileName != null && !fileName.getName().equals("")) {
				view.frmPrincipal.txtNombre.getText();
				view.frmPrincipal.txtTelefono.getText();

			}
		}
	}

	public static void escribirPersonas(ArrayList<Persona> aPersona) {
		try {
			// ABRIR EL FICHERO

			FileWriter fichero = new FileWriter(fileName);
			// CREA UN BUFFER PARA ESCRIBIR DATOS Y QUE SE ENVIEN AL FICHERO

			BufferedWriter bufEscritura = new BufferedWriter(fichero);
			// VOLCAMOS EL TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER
			// Y ESTE BUFFER LO ESCRIBE EN EL FICHERO
			String sLinea = "";
			String separador = "#";
			for (int i = 0; i < aPersona.size(); i++) {
				sLinea =  aPersona.get(i).getsNombre() + separador
						+ aPersona.get(i).getsTelefono();
				bufEscritura.write(sLinea);
				if (i < aPersona.size() - 1) {
					bufEscritura.newLine();
				}
			}

			bufEscritura.flush();
			bufEscritura.close();
			fichero.close();
		} catch (IOException ioe) {
			System.out.println("error accediendo al archivo");
		}
	}
	/*
	 * try { // ABRIR EL FICHERO FileWriter fichero = new FileWriter(fileName);
	 * BufferedWriter bufEscritura = new BufferedWriter(fichero); // VOLCAMOS EL
	 * TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER // Y ESTE BUFFER LO ESCRIBE EN EL
	 * FICHERO String sLineaLeida, sNombre;
	 * 
	 * 
	 * 
	 * // VACIAMOS EL BUFFER DE DATOS QUE QUEDEN PENDIENTES POR ESCRIBIR
	 * bufEscritura.flush(); // CERRAMOS LA COMUNICACION CON EL BUFFER
	 * bufEscritura.close(); // CERRAMOS EL FICHERO fichero.close(); } catch
	 * (IOException ioe) { System.out.println("error accediendo al archivo"); }
	 */
}
