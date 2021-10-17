package unico;

import java.io.*;
public class Principal {

	public static void main(String[] args) {
		// Mi app apunta a un fichero...
		String sFichero ="ficheros\\ciudades.txt";
		File fichero = new File(sFichero);
		
		if(fichero.exists()) {
			//System.out.println("SI EXISTE");
			String fchNombreArchivo = fichero.getName();
			String fchCarpetaPadre = fichero.getParent();
			String fchRutaAbsoluta = fichero.getAbsolutePath();
			long fchBytes = fichero.length();
			
			boolean fchPuedeLeer = fichero.canRead();
			boolean fchPuedeEscribir = fichero.canWrite();
			boolean fchPuedeEjecutar = fichero.canExecute();
			
			System.out.println("Nombre archivo: "+ fchNombreArchivo);
			System.out.println("Carpeta padre: " + fchCarpetaPadre);
			System.out.println("Ruta absoluta: " + fchRutaAbsoluta);	
			System.out.println("Tamaño en bytes: "+ fchBytes);
			System.out.println("Se puede leer: " + SiNo(fchPuedeLeer));
			System.out.println("Se puede escribir: " + SiNo(fchPuedeEscribir));
			System.out.println("Se puede ejecutar: " + SiNo(fchPuedeEjecutar));
		}else{
			System.err.println("NO EXISTE");
		}
	}
	private static String SiNo(boolean exp) {
		return exp ? "si" : "No";
	}

	//el signo de interrogacion es para separar las partes de los valores que pueden ser posibles.
	
}
