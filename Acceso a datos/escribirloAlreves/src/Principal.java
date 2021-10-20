
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {

		File fch = new File("conexion.cfg");
		File fch1 = new File("f1.txt");
		File fch2 = new File("f2.txt");
		//File fch3 = new File("f3.txt");
		// Conexion oConexion = leerConfiguracion(fch);
		// System.out.println(oConexion);
		// diffFch(fch1, fch2, fch3);
		
		invertirFichero(fch1, fch2);
		/*
		 * String sTexto = "1231231212313131314151241231234123123"; escribirArchivo(fch,
		 * nombreArrayList); ArrayList<String> frases = leerFichero(fch);
		 * 
		 * frases.forEach(s -> System.out.println(s));
		 */
	}

	private static void invertirFichero(File fch01, File fchResultado) {

        int iNumLineas = contadorLineas(fch01);
        String sLineaLeida = "";
        boolean booPrimera = true;

        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(fchResultado));
            for (int i = iNumLineas; i > 0; i--) {
                BufferedReader buffReader = new BufferedReader(new FileReader(fch01));
                for (int j = i; j > 0; j--) {
                    sLineaLeida = buffReader.readLine();
                }
                if (!booPrimera) {
                    buffWrite.newLine();

                } else {
                    booPrimera = false;
                }

                buffWrite.write(sLineaLeida);
                buffReader.close();
            }
            buffWrite.flush();
            buffWrite.close();

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException i){
            System.out.println("Se ha producido un error al acceder al fichero");
        } catch (Exception o) {
            System.out.println("Se ha producido un error no tipificado");
        }

    }
	
	public static int contadorLineas(File fch01) {
		String sLineaLeida = "";
		int iContador = 0;
		 try {
			BufferedReader buffReader = new BufferedReader(new FileReader(fch01));
			
			
			sLineaLeida = buffReader.readLine();
			
			while(sLineaLeida != null) {
				iContador++;
				sLineaLeida = buffReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return iContador;
	}

	private static void diffFch(File fch1, File fch2, File fch3) {
		boolean boEncontrado = false;

		try {
			FileReader fichero = new FileReader(fch1);
			FileReader fichero2 = new FileReader(fch2);
			FileWriter fichero3 = new FileWriter(fch3);

			BufferedReader bufLectura = new BufferedReader(fichero);
			BufferedWriter bufEscribir = new BufferedWriter(fichero3);

			String sLineaLeida = "";
			String sLineaLeida2 = "";

			sLineaLeida = bufLectura.readLine();

			while (sLineaLeida != null) {
				BufferedReader bufLectura2 = new BufferedReader(new FileReader(fch2));
				sLineaLeida2 = bufLectura2.readLine();
				while (sLineaLeida2 != null) {
					if (sLineaLeida.equals(sLineaLeida2)) {
						bufEscribir.write(sLineaLeida);
						bufEscribir.newLine();
					}
					sLineaLeida2 = bufLectura2.readLine();
				}
				sLineaLeida = bufLectura.readLine();
				bufLectura2.close();
			}

			bufEscribir.close();

			/*
			 * oConexion.setsHost(bufLectura.readLine().split(SEPARADOR)[1]);
			 * oConexion.setsPort(bufLectura.readLine().split(SEPARADOR)[1]);
			 * oConexion.setsDBName(bufLectura.readLine().split(SEPARADOR)[1]);
			 * oConexion.setsUserName(bufLectura.readLine().split(SEPARADOR)[1]);
			 * oConexion.setsUserPass(bufLectura.readLine().split(SEPARADOR)[1]);
			 */

			// A CONTINUACION PROCESO LA LINEA LEIDA..
			bufLectura.close();
			fichero.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error accediendo al fichero.");
		} catch (Exception e) {
			System.out.println("Se ha producido un error");
		}

	}

	private static Conexion leerConfiguracion(File fch) {
		Conexion oConexion = new Conexion();
		final String SEPARADOR = ":";
		HashMap<String, String> mapa = new HashMap<String, String>();
		try {
			FileReader fichero = new FileReader(fch);
			BufferedReader bufLectura = new BufferedReader(fichero);

			String sLineaLeida = "";
			String[] sCampos;

			sLineaLeida = bufLectura.readLine();
			while (sLineaLeida != null) {
				sCampos = sLineaLeida.split(SEPARADOR);
				mapa.put(sCampos[0].trim().toUpperCase(), sCampos[1].trim().toUpperCase());
				sLineaLeida = bufLectura.readLine();
			}

			/*
			 * oConexion.setsHost(bufLectura.readLine().split(SEPARADOR)[1]);
			 * oConexion.setsPort(bufLectura.readLine().split(SEPARADOR)[1]);
			 * oConexion.setsDBName(bufLectura.readLine().split(SEPARADOR)[1]);
			 * oConexion.setsUserName(bufLectura.readLine().split(SEPARADOR)[1]);
			 * oConexion.setsUserPass(bufLectura.readLine().split(SEPARADOR)[1]);
			 */

			// A CONTINUACION PROCESO LA LINEA LEIDA..
			bufLectura.close();
			fichero.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error accediendo al fichero.");
		} catch (Exception e) {
			System.out.println("Se ha producido un error");
		}

		// CREAMOS EL OBJETO QUE VAMOS A DEVOLVER A PARTIR DE LA INFORMACION GUARDADA EN
		// EL MAPA
		oConexion.setsHost(mapa.get("HOST"));
		oConexion.setsPort(mapa.get("PORT"));
		oConexion.setsDBName(mapa.get("DBNAME"));
		oConexion.setsUserName(mapa.get("USERNAME"));
		oConexion.setsUserPass(mapa.get("USERPASS"));
		return oConexion;
	}

	/*
	 * private static void escribirPersonas(File fch2, ArrayList<Persona> aPersona)
	 * {
	 * 
	 * try { // ABRIR EL FICHERO
	 * 
	 * FileWriter fichero = new FileWriter(fch2); // CREA UN BUFFER PARA ESCRIBIR
	 * DATOS Y QUE SE ENVIEN AL FICHERO
	 * 
	 * BufferedWriter bufEscritura = new BufferedWriter(fichero); // VOLCAMOS EL
	 * TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER // Y ESTE BUFFER LO ESCRIBE EN EL
	 * FICHERO String sLinea = ""; String separador = "#"; for(int i = 0; i <
	 * aPersona.size(); i++) { sLinea = aPersona.get(i).getsNombre() + separador +
	 * aPersona.get(i).getsApellidos() + separador + aPersona.get(i).getbEdad();
	 * bufEscritura.write(sLinea); if(i < aPersona.size()-1) {
	 * bufEscritura.newLine(); } }
	 * 
	 * bufEscritura.flush(); bufEscritura.close(); fichero.close(); } catch
	 * (IOException ioe) { System.out.println("error accediendo al archivo"); } }
	 * 
	 * private static ArrayList<Persona> leerFchArray(File nombreFichero) {
	 * ArrayList<Persona> contenido = new ArrayList<Persona>();
	 * 
	 * try { FileReader fichero = new FileReader(nombreFichero); BufferedReader
	 * bufLectura = new BufferedReader(fichero);
	 * 
	 * String lineaLeida; lineaLeida = bufLectura.readLine(); // while (lineaLeida
	 * != null) { StringTokenizer st = new StringTokenizer(lineaLeida, "#"); String
	 * nombre = st.nextToken(); String apellidos = st.nextToken(); String edad =
	 * st.nextToken();
	 * 
	 * 
	 * contenido.add(new Persona (nombre, apellidos, Byte.parseByte(edad))); // A
	 * CONTINUACION PROCESO LA LINEA LEIDA..
	 * 
	 * 
	 * lineaLeida = bufLectura.readLine(); } fichero.close(); } catch
	 * (FileNotFoundException e) { System.out.println("Fichero no encontrado."); }
	 * catch (IOException e) { System.out.println("Error accediendo al fichero.");
	 * }catch (Exception e){ System.out.println("Se ha producido un error"); }
	 * return contenido; }
	 * 
	 * private static ArrayList<String> leerFichero(File fch) { ArrayList<String>
	 * contenido = new ArrayList<String>();
	 * 
	 * try { FileReader fichero = new FileReader(fch); BufferedReader bufLectura =
	 * new BufferedReader(fichero);
	 * 
	 * String lineaLeida; lineaLeida = bufLectura.readLine(); while (lineaLeida !=
	 * null) { // A CONTINUACION PROCESO LA LINEA LEIDA.. contenido.add(lineaLeida);
	 * 
	 * lineaLeida = bufLectura.readLine(); }
	 * 
	 * bufLectura.close(); fichero.close(); } catch (FileNotFoundException e) {
	 * System.out.println("El fichero " + fch + " no existe"); } catch (IOException
	 * e) { System.out.println("El fichero " + fch + " no existe"); } return
	 * contenido; }
	 * 
	 * private static void escribirArchivo(File fch2, ArrayList<String>
	 * nombreArrayList) { try { // ABRIR EL FICHERO FileWriter fichero = new
	 * FileWriter(fch2); // CREA UN BUFFER PARA ESCRIBIR DATOS Y QUE SE ENVIEN AL
	 * FICHERO
	 * 
	 * BufferedWriter bufEscritura = new BufferedWriter(fichero); // VOLCAMOS EL
	 * TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER // Y ESTE BUFFER LO ESCRIBE EN EL
	 * FICHERO for (int iContador = 0; iContador < nombreArrayList.size();
	 * iContador++) { bufEscritura.write(nombreArrayList.get(iContador)); if
	 * (nombreArrayList.size() - 1 > iContador) { bufEscritura.newLine(); }
	 * 
	 * } // VACIAMOS EL BUFFER DE DATOS QUE QUEDEN PENDIENTES POR ESCRIBIR
	 * bufEscritura.flush(); // CERRAMOS LA COMUNICACION CON EL BUFFER
	 * bufEscritura.close(); // CERRAMOS EL FICHERO fichero.close(); } catch
	 * (IOException ioe) { System.out.println("error accediendo al archivo"); } }
	 * 
	 * private static void escribirFchV2(File fch, String txt) { try {
	 * 
	 * BufferedWriter fichero = new BufferedWriter(new FileWriter(fch));
	 * fichero.write(txt); fichero.flush(); fichero.close(); fichero.close(); }
	 * catch (IOException ioe) { System.out.println("error accediendo al archivo");
	 * } }
	 * 
	 * private static void escribirFch(File fch, String txt) { try { // ABRIR EL
	 * FICHERO
	 * 
	 * FileWriter fichero = new FileWriter(fch); // CREA UN BUFFER PARA ESCRIBIR
	 * DATOS Y QUE SE ENVIEN AL FICHERO
	 * 
	 * BufferedWriter bufEscritura = new BufferedWriter(fichero); // VOLCAMOS EL
	 * TEXTO QUE QUEREMOS GUARDAR SOBRE EL BUFFER // Y ESTE BUFFER LO ESCRIBE EN EL
	 * FICHERO
	 * 
	 * bufEscritura.write(txt); // VACIAMOS EL BUFFER DE DATOS QUE QUEDEN PENDIENTES
	 * POR ESCRIBIR bufEscritura.flush(); // CERRAMOS LA COMUNICACION CON EL BUFFER
	 * bufEscritura.close(); // CERRAMOS EL FICHERO fichero.close(); } catch
	 * (IOException ioe) { System.out.println("error accediendo al archivo"); } }
	 * 
	 */
}
