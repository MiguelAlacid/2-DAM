package view;

import java.util.ArrayList;

import model.Coche;
import model.Persona;

public class Principal {

	public static void main(String[] args) {

		String sFileName = "archivos/Datos.dat";

		escritura(sFileName);
		ctrl.ctrlPrincipal.readArrayObject(sFileName);

	}

	//private static void lectura(String sFileName) {
		// Coche oCocheLeido = ctrl.GestionFch.readData(sFileName);
		// System.out.println(oCocheLeido);

		//ArrayList<Coche> lst = ctrl.ctrlPrincipal.readArrayObject(sFileName);
		//ArrayList<Persona> lstPersona = ctrl.ctrlPrincipal.readArrayObject(sFileName);

//		for (Coche c : lst) {
			//System.out.println(c);
	//	}
		

//	}

	private static void escritura(String sFileName) {
		// Coche c1 = new Coche("Citroen", "C5", 1500);
		// ctrl.GestionFch.writeData(sFileName, c1);
		ArrayList<Persona> lstPersona = new ArrayList<>();
		ArrayList<Coche> lst = new ArrayList<>();
		lst.add(new Coche("Citroen", "C5", 1500));
		lst.add(new Coche("Renault", "clio", 1500));
		lst.add(new Coche("Audi a4", "A4", 2000));
		lst.add(new Coche("Mustang", "GT", 3550));
		lst.add(new Coche("Peugeot", "litra", 2800));
		
		lstPersona.add(new Persona("Paco",20,65.5f));
		lstPersona.add(new Persona("Pepe",25,70.0f));
		lstPersona.add(new Persona("Roberta",22,73.40f));
		lstPersona.add(new Persona("Antonio",24,80.9f));

		ctrl.ctrlPrincipal.writeData(sFileName, lst, lstPersona);
		System.out.println("se ha terminado correctamente");

	}
}
