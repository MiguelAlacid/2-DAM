package unico;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {
		File fch = new File("Ejemplo.txt");
		File fch2 = new File("ejercicio.txt");
		

		ArrayList<Persona> aPersona = new ArrayList<Persona>();
		
		/*nombreArrayList.add("HOLA");
		nombreArrayList.add("PERRO");
		nombreArrayList.add("CERDO");*/
		aPersona = leerFchArray(fch);
		escribirPersonas(fch2, aPersona);
		aPersona.forEach (s -> System.out.println(s));
		
		/*
		 * String sTexto = "1231231212313131314151241231234123123"; escribirArchivo(fch,
		 * nombreArrayList); ArrayList<String> frases = leerFichero(fch);
		 * 
		 * frases.forEach(s -> System.out.println(s));
		 */
	}

	private static void escribirPersonas(File fch2, ArrayList<Persona> aPersona) {
		
			try {
				// ABRIR EL FICHERO

				FileWriter fichero = new FileWriter(fch2);
				// CREA UN BUFFER PARA ESCRIBIR DATOS Y QUE SE ENVIEN AL FICHERO

				BufferedWriter bufEscritura = new BufferedWriter(fichero);
				// VOLCAMOS EL TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER
				// Y ESTE BUFFER LO ESCRIBE EN EL FICHERO
				String sLinea = "";
				String separador = "#";
				for(int i = 0; i < aPersona.size(); i++) {
					sLinea = aPersona.get(i).getsNombre() + separador
							+ aPersona.get(i).getsApellidos() + separador
							+ aPersona.get(i).getbEdad();
					bufEscritura.write(sLinea);
					if(i < aPersona.size()-1) {
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
		
	private static ArrayList<Persona> leerFchArray(File nombreFichero) {
		ArrayList<Persona> contenido = new ArrayList<Persona>();

		try {
			FileReader fichero = new FileReader(nombreFichero);
			BufferedReader bufLectura = new BufferedReader(fichero);

			String lineaLeida;
			lineaLeida = bufLectura.readLine();
			//
			while (lineaLeida != null) {
				StringTokenizer st = new StringTokenizer(lineaLeida, "#");
				String nombre = st.nextToken();
				String apellidos = st.nextToken();
				String edad = st.nextToken();
				
				
				contenido.add(new Persona (nombre, apellidos, Byte.parseByte(edad)));
				// A CONTINUACION PROCESO LA LINEA LEIDA..
				

				lineaLeida = bufLectura.readLine();
			}
			fichero.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error accediendo al fichero.");
		}catch (Exception e){
			System.out.println("Se ha producido un error");
		}
		return contenido;
	}

	private static ArrayList<String> leerFichero(File fch) {
		ArrayList<String> contenido = new ArrayList<String>();

		try {
			FileReader fichero = new FileReader(fch);
			BufferedReader bufLectura = new BufferedReader(fichero);

			String lineaLeida;
			lineaLeida = bufLectura.readLine();
			while (lineaLeida != null) {
				// A CONTINUACION PROCESO LA LINEA LEIDA..
				contenido.add(lineaLeida);

				lineaLeida = bufLectura.readLine();
			}

			bufLectura.close();
			fichero.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + fch + " no existe");
		} catch (IOException e) {
			System.out.println("El fichero " + fch + " no existe");
		}
		return contenido;
	}

	private static void escribirArchivo(File fch2, ArrayList<String> nombreArrayList) {
		try {
			// ABRIR EL FICHERO
			FileWriter fichero = new FileWriter(fch2);
			// CREA UN BUFFER PARA ESCRIBIR DATOS Y QUE SE ENVIEN AL FICHERO

			BufferedWriter bufEscritura = new BufferedWriter(fichero);
			// VOLCAMOS EL TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER
			// Y ESTE BUFFER LO ESCRIBE EN EL FICHERO
			for (int iContador = 0; iContador < nombreArrayList.size(); iContador++) {
				bufEscritura.write(nombreArrayList.get(iContador));
				if (nombreArrayList.size() - 1 > iContador) {
					bufEscritura.newLine();
				}

			}
			// VACIAMOS EL BUFFER DE DATOS QUE QUEDEN PENDIENTES POR ESCRIBIR
			bufEscritura.flush();
			// CERRAMOS LA COMUNICACION CON EL BUFFER
			bufEscritura.close();
			// CERRAMOS EL FICHERO
			fichero.close();
		} catch (IOException ioe) {
			System.out.println("error accediendo al archivo");
		}
	}

	private static void escribirFchV2(File fch, String txt) {
		try {

			BufferedWriter fichero = new BufferedWriter(new FileWriter(fch));
			fichero.write(txt);
			fichero.flush();
			fichero.close();
			fichero.close();
		} catch (IOException ioe) {
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
			// Y ESTE BUFFER LO ESCRIBE EN EL FICHERO

			bufEscritura.write(txt);
			// VACIAMOS EL BUFFER DE DATOS QUE QUEDEN PENDIENTES POR ESCRIBIR
			bufEscritura.flush();
			// CERRAMOS LA COMUNICACION CON EL BUFFER
			bufEscritura.close();
			// CERRAMOS EL FICHERO
			fichero.close();
		} catch (IOException ioe) {
			System.out.println("error accediendo al archivo");
		}
	}

}
