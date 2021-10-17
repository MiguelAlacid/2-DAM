package unico;

import ctrl.gestionFch;
import model.Persona;

public class Principal {

	public static void main(String[] args) {
		gestionFch gestFch = new gestionFch("datos.db");
		
		/*gestFch.escribirRegistro(1, new Persona("Pepe", 45 , 1.68));
		gestFch.escribirRegistro(2, new Persona("Juan", 27 , 1.5));*/
		
		Persona p2 = gestFch.leerRegistro(2);
		System.out.println(p2);
		gestFch.cerrarFichero();
		System.out.println("fin programa");
	}

}
