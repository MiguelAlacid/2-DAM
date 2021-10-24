package view;

import java.util.ArrayList;

import model.Coche;

public class Principal {

	public static void main(String[] args) {
		String sFileName = "archivos/coches.dat";
		
		escritura(sFileName);
		lectura(sFileName);

	}

	private static void lectura(String sFileName) {
		//Coche oCocheLeido = ctrl.GestionFch.readData(sFileName);
		//System.out.println(oCocheLeido);
		
		ArrayList<Coche> lst = ctrl.GestionFch.readArrayObject(sFileName);
		
		for(Coche c: lst) {
			System.out.println(c);
		}
		
	}

	private static void escritura(String sFileName) {
		//Coche c1 = new Coche("Citroen", "C5", 1500);
		//ctrl.GestionFch.writeData(sFileName, c1);
	
		ArrayList<Coche> lst = new ArrayList<>();
		lst.add(new Coche("Citroen", "C5", 1500));
		lst.add(new Coche("Renault", "clio", 1500));
		lst.add(new Coche("Audi a4", "A4", 2000));
		lst.add(new Coche("Mustang", "GT", 3550));
		lst.add(new Coche("Peugeot", "litra", 2800));
		
		ctrl.GestionFch.writeData(sFileName, lst);
		System.out.println("se ha terminado correctamente");
		
	}

}
