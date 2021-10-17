package ctrl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import model.Empleado;
import model.infoEmpleado;

public class CtrlPrincipal {

	public static RandomAccessFile fch;

	public CtrlPrincipal(String fileName) {
		abrirFichero(fileName);
	}

	public static void abrirFichero(String fileName) {
		try {
			fch = new RandomAccessFile(fileName, "rw"); // r solo lectura //w solo escritura //rw ambos
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + fileName + "no existe");
		}

	}

	public static void cerrarFichero() {
		try {
			fch.close();
		} catch (IOException e) {
			System.err.println("el fichero no puede cerrarse.");
		}

	}

	public static void escribirRegistro(int iNumeroRegistro, Empleado empleado) {

		try {
			long posicion = getPosition(iNumeroRegistro);
			fch.seek(posicion);

			// NOMBRE
			String sNombre = empleado.getsNombre();
			char chLetra;
			for (int i = 0; i < infoEmpleado.iLongsNombre; i++) {

				chLetra = (i < sNombre.length()) ? sNombre.charAt(i) : ' ';
				fch.writeChar(chLetra);
			}

			// APELLIDOS
			String sApellidos = empleado.getsApellidos();

			for (int i = 0; i < infoEmpleado.iLongsApellido; i++) {

				chLetra = (i < sApellidos.length()) ? sApellidos.charAt(i) : ' ';
				fch.writeChar(chLetra);
			}

			// EMAIL
			String sEmail = empleado.getsEmail();
			for (int i = 0; i < infoEmpleado.iLongsEmail; i++) {

				chLetra = (i < sEmail.length()) ? sEmail.charAt(i) : ' ';
				fch.writeChar(chLetra);
			}

			// TELEFONO
			fch.writeLong(empleado.getlTelefono());
			// EDAD
			fch.writeInt(empleado.getiEdad());
			// SUELDO
			fch.writeDouble(empleado.getdSueldo());
		} catch (IOException e) {
			System.err.println("el fichero no es accesible");
		}
	}

	private static long getPosition(int iNumeroRegistro) {

		return (iNumeroRegistro - 1) * Empleado.iLongReg;
	}

	public static Empleado leerRegistro2() throws IOException {
		String sNombre = "";
		String sApellido = "";
		String sEmail = "";
		int iEdad = 0;
		long lTelefono = 0;
		double dSalario = 0.0;
			try {

				// NOMBRE
				for (int i = 0; i < Empleado.iLongsNombre; i++) {
					sNombre += fch.readChar();;
				}

				// APELLIDO

				for (int i = 0; i < Empleado.iLongsApellido; i++) {					
					sApellido += fch.readChar();;
				}

				// EMAIL

				for (int i = 0; i < Empleado.iLongsEmail; i++) {
					sEmail += fch.readChar();;
				}

				// TELEFONO

				lTelefono = fch.readLong();

				// EDAD

				iEdad = fch.readInt();

				// SALARIO

				dSalario = fch.readDouble();
			} catch (IOException e) {
				System.err.println("El fichero no es accesible");
			}		
			
		return new Empleado(sNombre, sApellido, lTelefono, sEmail, iEdad, dSalario);
	}

	public static Empleado leerRegistro(int iNumeroRegistro) {
		String sNombre = "";
		String sApellido = "";
		String sEmail = "";
		int iEdad = 0;
		long lTelefono = 0;
		double dSalario = 0.0;

		try {
			long posicion = getPosition(iNumeroRegistro);
			fch.seek(posicion);

			// NOMBRE
			for (int i = 0; i < Empleado.iLongsNombre; i++) {
				sNombre += fch.readChar();
			}

			// APELLIDO

			for (int i = 0; i < Empleado.iLongsApellido; i++) {
				sApellido += fch.readChar();
			}

			// EMAIL

			for (int i = 0; i < Empleado.iLongsEmail; i++) {
				sEmail += fch.readChar();
			}

			// TELEFONO

			lTelefono = fch.readLong();

			// EDAD

			iEdad = fch.readInt();

			// SALARIO

			dSalario = fch.readDouble();
		} catch (IOException e) {
			System.err.println("El fichero no es accesible");
		}
		
		return new Empleado(sNombre, sApellido, lTelefono, sEmail, iEdad, dSalario);
	}
}
