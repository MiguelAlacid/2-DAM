package unico;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// Mi app apunta a un fichero...
		// String sFichero ="ficheros\\ciudades.txt";
		String sFichero = "C:\\Users\\Usuario\\Documents\\prueba";
		File fichero = new File(sFichero);
		int iContadorGlobalDir = 0;
		int iContadorGlobalFch = 0;
		
		if (fichero.exists()) {

			if (fichero.isDirectory()) {
				//NombresTodasLasCarpetas(fichero, iContadorGlobalDir, iContadorGlobalFch);
				System.out.println(contarCarpetasFicherosTotal(fichero));
				// contenidoEspecifico(fichero); // verSubCarpetas(fichero);
				// contadorItems(fichero);
				// infoDir(fichero);
			} else {
				infoFile(fichero);
			}
			// System.out.println("SI EXISTE");
		} else {
			System.err.println("NO EXISTE");
		}
	}

	public static int contarTotalCarpetas(File fichero) {
		
		File[] contenido = fichero.listFiles();
		int c = contenido.length;
		for(int i = 0; i < contenido.length; i++) {
			if(contenido[i].isDirectory()) {
				c += contarCarpetasFicherosTotal(contenido[i]);
			}
		}
		return c;
	}
	
	public static int contarCarpetasFicherosTotal(File fichero) {
		File[] contenido = fichero.listFiles();
		int c = 0;
		for(int i = 0; i < contenido.length; i++) {
			if(contenido[i].isDirectory()) {
				c++;
				c += contarCarpetasFicherosTotal(contenido[i]);
			}
		}
		return c;
	}
	
	private static void NombresTodasLasCarpetas(File fichero, int iContadorGlobalDir, int iContadorGlobalFch) {
		File[] dirContenido = fichero.listFiles();
		File[] subCarpeta = null;

		int iContadorDir = 0;
		int iContadorFch = 0;
		
		for (int iContador = 0; iContador < dirContenido.length; iContador++) {
			if (dirContenido[iContador].isDirectory()) {
				iContadorDir++;
				subCarpeta = dirContenido[iContador].listFiles();
			}else {
				iContadorFch++;
			}
			for (int iContador2 = 0; iContador2 < subCarpeta.length; iContador2++) {
				if (subCarpeta[iContador2].isDirectory()) {
					iContadorDir++;
					NombresTodasLasCarpetas(subCarpeta[iContador2], iContadorGlobalDir, iContadorGlobalFch);
				}else {
					iContadorFch++;
				}
			}
		}
		
		iContadorGlobalDir = iContadorDir;
		iContadorGlobalFch = iContadorFch;
		System.out.println(iContadorGlobalDir + " " + iContadorGlobalFch);
	}

	private static void contadorItems(File fichero) {
		File[] dirContenido = fichero.listFiles();

		int iContadorDir = 0;
		int iContadorFch = 0;
		for (File f : dirContenido) {
			if (f.isDirectory()) {
				iContadorDir++;
			} else {
				iContadorFch++;
			}
		}
		System.out.println("Hay " + iContadorDir + " carpetas y " + iContadorFch + " Ficheros en total");
	}

	private static void contenidoEspecifico(File fichero) {
		File[] dirContenido = fichero.listFiles();
		ArrayList<String> nombres = new ArrayList<String>();
		String sInfo;
		for (File f : dirContenido) {
			sInfo = f.isDirectory() ? "DIR" : "FCH";
			nombres.add(sInfo + " " + f.getName());
			/*
			 * if(f.isDirectory()) { sInfo = "DIR"; sInfo = (sInfo + " " + f.getName());
			 * nombres.add(sInfo); }else { sInfo = "FCH"; sInfo = (sInfo + " " +
			 * f.getName()); nombres.add(sInfo); }
			 */

			/*
			 * for(String nombre : nombres) { System.out.println(nombre); }
			 */
		}
		Collections.sort(nombres);
		nombres.forEach((nombre) -> System.out.println(nombre));

	}

	private static void verSubCarpetas(File fichero) {

		File[] dirContenido = fichero.listFiles();

		String sInfo = "";
		for (File f : dirContenido) {
			if (f.isDirectory())
				sInfo = f.getName();
			System.out.println(sInfo);
		}
	}

	private static void infoDir(File fichero) {
		System.out.println("Esto es un directorio");
		long dirEspacioLibreBytes = fichero.getFreeSpace();
		long dirEspacioLibreMB = fichero.getFreeSpace() / 1024 / 1024;
		long dirEspacioLibreGB = dirEspacioLibreMB / 1024;

		File[] dirContenido = fichero.listFiles();

		String sInfo;
		for (File f : dirContenido) {
			sInfo = f.getName();
			System.out.println(sInfo);
		}

		System.out.println("Espacio libre = " + dirEspacioLibreBytes + " Bytes");
		System.out.println("              = " + dirEspacioLibreMB + " MB");
		System.out.println("              = " + dirEspacioLibreGB + " GB");
	}

	private static void infoFile(File fichero) {
		String fchNombreArchivo = fichero.getName();
		String fchCarpetaPadre = fichero.getParent();
		String fchRutaAbsoluta = fichero.getAbsolutePath();
		long fchBytes = fichero.length();

		boolean fchPuedeLeer = fichero.canRead();
		boolean fchPuedeEscribir = fichero.canWrite();
		boolean fchPuedeEjecutar = fichero.canExecute();

		System.out.println("Nombre archivo: " + fchNombreArchivo);
		System.out.println("Carpeta padre: " + fchCarpetaPadre);
		System.out.println("Ruta absoluta: " + fchRutaAbsoluta);
		System.out.println("Tamaño en bytes: " + fchBytes);
		System.out.println("Se puede leer: " + SiNo(fchPuedeLeer));
		System.out.println("Se puede escribir: " + SiNo(fchPuedeEscribir));
		System.out.println("Se puede ejecutar: " + SiNo(fchPuedeEjecutar));
	}

	private static String SiNo(boolean exp) {
		return exp ? "si" : "No";
	}

}
