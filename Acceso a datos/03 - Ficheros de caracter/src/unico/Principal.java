package unico;

import java.io.*;

public class Principal {

	public static void main(String[] args) {
		
		int iClave = 5;
		//File nombreFichero = new File("notas.txt");
		//File nombreFichero = new File("ficheroEncriptado.txt");
		File nombreFchEncripted = new File ("encriptado.txt");
		File nombreFchSource = new File("nota.txt");
		File nombreFchTarget = new File("desencriptado.txt");

		//escribirFch(nombreFichero);
		// leerFch(nombreFichero);
		//escribirFchEncriptado(nombreFchEncripted);
		//copiarFch(nombreFchSource, nombreFchTarget);
		//encriptarFichero(nombreFchSource, nombreFchEncripted, iClave);
		desencriptarFch(nombreFchTarget, nombreFchEncripted, iClave);

	}
	
	private static void encriptarFichero (File nombreFchSource, File nombreFchEncripted, int iClave) {
		String sTexto;
		try {
			
					// Apertura de los dos ficheros
					FileReader fchSource = new FileReader(nombreFchSource);
					FileWriter fchTarget = new FileWriter(nombreFchEncripted);

					// Proceso de copia
					int ascii;
					int iContador = 0;
					ascii = fchSource.read();
					while (ascii != -1) {
						iContador++;
						fchTarget.write(ascii - (iClave + 4));
						ascii = fchSource.read();
					}

					// Cierre de los 2 ficheros

					fchSource.close();
					fchTarget.close();

					// Informacion resultado del proceso
					System.out.println("Se han copiado " + iContador + " caracteres");
				} catch (FileNotFoundException e) {
					System.err.println("Fichero no encontrado");
				} catch (IOException e) {
					System.err.println("Error accediendo al fichero");
				}
			
	}

	private static void desencriptarFch (File nombreFchSource, File nombreFchEncripted, int iClave) {
		String sTexto;
		try {
			
					// Apertura de los dos ficheros
					FileReader fchSource = new FileReader(nombreFchEncripted);
					FileWriter fchTarget = new FileWriter(nombreFchSource);

					// Proceso de copia
					int ascii;
					int iContador = 0;
					ascii = fchSource.read();
					while (ascii != -1) {
						iContador++;
						fchTarget.write(ascii + (iClave + 4));
						ascii = fchSource.read();
					}

					// Cierre de los 2 ficheros

					fchSource.close();
					fchTarget.close();

					// Informacion resultado del proceso
					System.out.println("Se han copiado " + iContador + " caracteres");
				} catch (FileNotFoundException e) {
					System.err.println("Fichero no encontrado");
				} catch (IOException e) {
					System.err.println("Error accediendo al fichero");
				}
			
	}
	
	private static void escribirFchEncriptado(File nombreFichero) {
		String sTexto = "Hola";
		int iClave = 2;
		try {
			FileWriter fch = new FileWriter(nombreFichero);

			for (int iContador = 0; iContador < sTexto.length(); iContador++) {
				char letra = sTexto.charAt(iContador);
				int ascii = letra;
				System.out.println(letra + " " + ascii + " " + (letra + 1) + " " + (char) (letra + 1));
				fch.write(letra + iClave);
			}

			do {
				sTexto = (String) leer("introduce texto cuando quieras parar pulse intro", (long) 0, (long) 1000,
						(double) 0, (double) 0, (byte) 6);
				if (sTexto.length() != 0) {
					fch.write(sTexto + "\n");
				}

			} while (sTexto.length() != 0);
			fch.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error accediendo al fichero.");
		}

	}

	private static void escribirFch(File nombreFichero) {
		String sTexto;

		try {
			FileWriter fch = new FileWriter(nombreFichero);

			do {
				sTexto = (String) leer("introduce texto cuando quieras parar pulse intro", (long) 0, (long) 1000,
						(double) 0, (double) 0, (byte) 6);
				if (sTexto.length() != 0) {
					fch.write(sTexto + "\n");
				}

			} while (sTexto.length() != 0);
			fch.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error accediendo al fichero.");
		}

	}

	private static void copiarFch(File NombreFchSource, File NombreFchTarget) {
		try {
			// Apertura de los dos ficheros
			FileReader fchSource = new FileReader(NombreFchSource);
			FileWriter fchTarget = new FileWriter(NombreFchTarget);

			// Proceso de copia
			int ascii;
			int iContador = 0;
			ascii = fchSource.read();
			while (ascii != -1) {
				iContador++;
				fchTarget.write(ascii);
				ascii = fchSource.read();
			}

			// Cierre de los 2 ficheros

			fchSource.close();
			fchTarget.close();

			// Informacion resultado del proceso
			System.out.println("Se han copiado " + iContador + " caracteres");
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");
		}

	}

	private static void leerFchyContarVocalesyConsonantes(File nombreFichero) {
		int iConsonantes = 0;
		int iVocales = 0;

		try {
			FileReader fch = new FileReader(nombreFichero);
			int iAscii;

			iAscii = fch.read();
			while (iAscii != -1) {
				if (Character.isLetter(iAscii)) {
					if (iAscii == 97 || iAscii == 101 || iAscii == 105 || iAscii == 111) {
						iVocales++;
					} else {
						iConsonantes++;
					}
				}
				System.out.print((char) iAscii);
				iAscii = fch.read();
			}

			fch.close();

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error accediendo al fichero.");
		}
		System.out.println("hay " + iConsonantes + " consonantes y " + iVocales + " Vocales");
	}

	private static Object leer(String sMensaje, long lMinimo, long lMaximo, double dMinimo, double dMaximo,
			byte bEstado) {
		Object oNumero;
		switch (bEstado) {
		case 1:
			oNumero = pideNumeroByte(sMensaje, lMinimo, lMaximo);
			break;
		case 2:
			oNumero = pideNumeroShort(sMensaje, lMinimo, lMaximo);
			break;
		case 3:
			oNumero = pideNumeroInt(sMensaje, lMinimo, lMaximo);
			break;
		case 4:
			oNumero = pideNumeroLong(sMensaje, lMinimo, lMaximo);
			break;
		case 5:
			oNumero = pideNumeroFloat(sMensaje, dMinimo, dMaximo);
			break;
		case 6:
			oNumero = pideString(sMensaje, lMinimo, lMaximo);
			break;
		default:
			oNumero = -1;
		}
		return oNumero;
	}

	private static byte pideNumeroByte(String sMensaje, long lMinimo, long lMaximo) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		byte bNumero = 0;
		boolean bFallo;

		do {
			System.out.print(sMensaje + "(" + lMinimo + " - " + lMaximo + "): ");
			try {
				bNumero = Byte.parseByte(teclado.readLine());
				bFallo = false;
			} catch (Exception e) {
				bFallo = true;
			}
		} while (bFallo || (bNumero < lMinimo || bNumero > lMaximo));

		return bNumero;
	}

	private static short pideNumeroShort(String sMensaje, long lMinimo, long lMaximo) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		short sNumero = 0;
		boolean bFallo;

		do {
			System.out.print(sMensaje + "(" + lMinimo + " - " + lMaximo + "): ");
			try {
				sNumero = Short.parseShort(teclado.readLine());
				bFallo = false;
			} catch (Exception e) {
				bFallo = true;
			}
		} while (bFallo || (sNumero < lMinimo || sNumero > lMaximo));

		return sNumero;
	}

	private static int pideNumeroInt(String sMensaje, long lMinimo, long lMaximo) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int iNumero = 0;
		boolean bFallo;

		do {
			System.out.print(sMensaje + "(" + lMinimo + " - " + lMaximo + "): ");
			try {
				iNumero = Integer.parseInt(teclado.readLine());
				bFallo = false;
			} catch (Exception e) {
				bFallo = true;
			}
		} while (bFallo || (iNumero < lMinimo || iNumero > lMaximo));

		return iNumero;
	}

	private static long pideNumeroLong(String sMensaje, long lMinimo, long lMaximo) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		long lNumero = 0;
		boolean bFallo;

		do {
			System.out.print(sMensaje + "(" + lMinimo + " - " + lMaximo + "): ");
			try {
				lNumero = Long.parseLong(teclado.readLine());
				bFallo = false;
			} catch (Exception e) {
				bFallo = true;
			}
		} while (bFallo || (lNumero < lMinimo || lNumero > lMaximo));

		return lNumero;
	}

	private static float pideNumeroFloat(String sMensaje, double dMinimo, double dMaximo) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		float fNumero = 0;
		boolean bFallo;

		do {
			System.out.print(sMensaje + "(" + dMinimo + " - " + dMaximo + "): ");
			try {
				fNumero = Float.parseFloat(teclado.readLine());
				bFallo = false;
			} catch (Exception e) {
				bFallo = true;
			}
		} while (bFallo || (fNumero < dMinimo || fNumero > dMaximo));

		return fNumero;
	}

	private static String pideString(String sMensaje, long lMinimo, long lMaximo) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String sFrase = "";
		boolean boFallo;

		do {
			System.out.println(sMensaje + ": ");
			try {
				sFrase = teclado.readLine();
				boFallo = false;
			} catch (Exception e) {
				boFallo = true;
			}
		} while (boFallo || (sFrase.length() < lMinimo || sFrase.length() > lMaximo));
		return sFrase.toLowerCase();
	}

}
