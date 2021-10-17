package unico;

import java.io.*;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		File fch = new File ("Ejemplo.txt");
		File fch2 = new File ("ejercicio.txt");
		
		ArrayList<String> nombreArrayList = new ArrayList<String>();
		
		nombreArrayList.add("HOLA");
		nombreArrayList.add("PERRO");
		nombreArrayList.add("CERDO");
		
		String sTexto = "1231231212313131314151241231234123123";
		escribirArchivo(fch, nombreArrayList);
		

	}
	
	private static void escribirArchivo (File fch2, ArrayList <String> nombreArrayList) {
		try {
			// ABRIR EL FICHERO
			FileWriter fichero = new FileWriter(fch2);
			// CREA UN BUFFER PARA ESCRIBIR DATOS Y QUE SE ENVIEN AL FICHERO
			
			BufferedWriter bufEscritura = new BufferedWriter(fichero);
			// VOLCAMOS EL TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER
			//Y ESTE BUFFER LO ESCRIBE EN EL FICHERO
			for(int iContador = 0; iContador < nombreArrayList.size(); iContador++) {
				bufEscritura.write(nombreArrayList.get(iContador));
				if(nombreArrayList.size()-1 > iContador) {
					bufEscritura.newLine();
				}
				
			}
			// VACIAMOS EL BUFFER DE DATOS QUE QUEDEN PENDIENTES POR ESCRIBIR
			bufEscritura.flush();
			// CERRAMOS LA COMUNICACION CON EL BUFFER
			bufEscritura.close();
			//CERRAMOS EL FICHERO
			fichero.close();
		}catch(IOException ioe) {
			System.out.println("error accediendo al archivo");
		}
	}
	
	private static void escribirFchV2(File fch, String txt) {
		try {
			
			BufferedWriter fichero = new BufferedWriter(new FileWriter (fch));
			fichero.write(txt);
			fichero.flush();
			fichero.close();
			fichero.close();
		}catch(IOException ioe) {
			System.out.println("error accediendo al archivo");
		}
	}
	
	private static void escribirFch(File fch, String txt) {
		try {
			// ABRIR EL FICHERO
			
			FileWriter fichero = new FileWriter(fch);
			// CREA UN BUFFER PARA ESCRIBIR DATOS Y QUE SE ENVIEN AL FICHERO
			
			BufferedWriter bufEscritura = new BufferedWriter(fichero);
			// VOLCAMOS EL TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER
			//Y ESTE BUFFER LO ESCRIBE EN EL FICHERO
			
			bufEscritura.write(txt);
			// VACIAMOS EL BUFFER DE DATOS QUE QUEDEN PENDIENTES POR ESCRIBIR
			bufEscritura.flush();
			// CERRAMOS LA COMUNICACION CON EL BUFFER
			bufEscritura.close();
			//CERRAMOS EL FICHERO
			fichero.close();
		}catch(IOException ioe) {
			System.out.println("error accediendo al archivo");
		}
	}

}
