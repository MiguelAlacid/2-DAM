package Unico;

import java.awt.Frame;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	private static void test1() {
		crearVentana("primera", 100, 50);
		crearVentana("segunda", 200, 100);
		crearVentana("tercera", 400, 200);
	}
	
	private static void test2() {
		MiVentana v = new MiVentana();
		}
	
	private static void crearVentana(String sTitulo, int iAncho, int iAlto) {
		Frame ventana = new Frame("Titulo de la ventana");
		ventana.setTitle(sTitulo);
		ventana.setSize(iAncho, iAlto);
		ventana.setLocation(0, 0);
		
		//ventana.setBounds(150, 50, 600, 400); // tamaño y posición en una linea.
		
		//ventana.setTitle("Titulo de la ventana");
		
		ventana.setVisible(true);
	}

}
