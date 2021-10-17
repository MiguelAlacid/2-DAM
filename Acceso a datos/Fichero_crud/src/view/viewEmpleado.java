package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ctrl.CtrlPrincipal;
import model.Empleado;

public class viewEmpleado {
	public static InputStreamReader isr = new InputStreamReader(System.in);
	public static BufferedReader teclado = new BufferedReader(isr);
	public static Empleado oEmpleado = new Empleado();

	public static void crud_empleado() throws IOException {

		byte bOpcion = 1;
		String sLineaLeida = "";
		byte bPosicion;
		do {
		
			
		System.out.println("MENU\n");
		System.out.println("1.Listar todo");
		System.out.println("2.Buscar por posicion");
		System.out.println("3.Modificar");
		System.out.println("4.Añadir");
		System.out.println("0.Salir");

		try {
			sLineaLeida = teclado.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		bOpcion = Byte.parseByte(sLineaLeida);

		
			switch (bOpcion) {
			case 1:
				listarTodo();
				break;
			case 2:

				oEmpleado = ctrl.CtrlPrincipal.leerRegistro(pedirPosition());
				System.out.println(oEmpleado);
				break;
			case 3:
				listarTodo();
				ctrl.CtrlPrincipal.escribirRegistro(pedirPosition(), agregarPersonas());

				break;
			case 4:
				ctrl.CtrlPrincipal.escribirRegistro(pedirPosition(), agregarPersonas());
				
				break;
			case 0:
				System.exit(0);
				break;
			}
			ctrl.CtrlPrincipal.fch.seek(0);
		} while (bOpcion != 0);

	}

	public static Empleado agregarPersonas() {
		String sNombre = "";
		String sApellido = "";
		String sEmail = "";
		String sTelefono = "";
		String sEdad = "";
		String sSueldo = "";

		System.out.println("escribe el nombre, apellido, email, telefono, edad y sueldo");
		try {
			sNombre = teclado.readLine();
			sApellido = teclado.readLine();
			sEmail = teclado.readLine();
			sTelefono = teclado.readLine();
			sEdad = teclado.readLine();
			sSueldo = teclado.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new Empleado(sNombre, sApellido, Long.parseLong(sTelefono), sEmail, Integer.parseInt(sEdad),
				Double.parseDouble(sSueldo));

	}

	public static byte pedirPosition() {
		byte bPosicion;
		String sLineaLeida = "";

		System.out.println("dame la posicion que quieres reflejar en el archivo");
		try {
			sLineaLeida = teclado.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bPosicion = Byte.parseByte(sLineaLeida);
	}

	public static void listarTodo() throws IOException {

		for (int iContador = 0; iContador < ctrl.CtrlPrincipal.fch.length(); iContador += Empleado.iLongReg) {
			oEmpleado = ctrl.CtrlPrincipal.leerRegistro2();
			System.out.println(oEmpleado);

		}
	}
}
