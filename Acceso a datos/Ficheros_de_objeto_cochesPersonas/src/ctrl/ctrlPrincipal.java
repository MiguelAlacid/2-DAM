package ctrl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Coche;
import model.Persona;

public class ctrlPrincipal {

	
	public static void writeData(String sFileName, Coche oCoche, Persona oPersona) {
		try {
			FileOutputStream fch = new FileOutputStream(sFileName);
			ObjectOutputStream buff = new ObjectOutputStream(fch);
			
			buff.writeObject(oCoche);
			buff.writeObject(oPersona);
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + sFileName + " NO EXISTE");
		} catch (IOException e) {
			System.err.println("ERROR: NO SE PUEDE ESCRIBIR EN EL FICHERO");
		}
	}
	
	public static void writeData(String sFileName, ArrayList<Coche> listadoCoche, ArrayList<Persona> listadoPersona) {
		try {
			FileOutputStream fch = new FileOutputStream(sFileName);
			ObjectOutputStream buff = new ObjectOutputStream(fch);
			/*for(Coche c: listado) {
				buff.writeObject(c);
			}*/
			
			buff.writeObject(listadoCoche);
			buff.writeObject(listadoPersona);
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + sFileName + " NO EXISTE");
		} catch (IOException e) {
			System.err.println("ERROR: NO SE PUEDE ESCRIBIR EN EL FICHERO");
		}
	}

	public static Coche readData(String sFileName) {
		
		Coche oCoche = null;
		try {
			FileInputStream fch = new FileInputStream(sFileName);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			oCoche = (Coche) buff.readObject();
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + sFileName + " NO EXISTE");
		} catch (IOException e) {
			System.err.println("ERROR: NO SE PUEDE LEER EN EL FICHERO");
		} catch (ClassNotFoundException e) {
			System.err.println("EL FICHERO NO CONTIENE UN COCHE.");
		}
		
		return oCoche;
	}

	@SuppressWarnings("unchecked")
	public static void readArrayObject(String sFileName) {
		ArrayList<Coche> listCoches = new ArrayList<Coche>();
		ArrayList<Persona> listPersona = new ArrayList<Persona>();
		
		try {
			FileInputStream fch = new FileInputStream(sFileName);
			ObjectInputStream buff = new ObjectInputStream(fch);
			//Object obj = buff.readObject();
			
			/*while(obj != null) {
				if(obj instanceof Coche) {
					listCoches.add((Coche) obj);
				}
				obj = buff.readObject();
			}*/
			listCoches = (ArrayList<Coche>) buff.readObject();
			listPersona = (ArrayList<Persona>) buff.readObject();
			

			for (Coche c : listCoches) {
				System.out.println(c);
			}
			for (Persona p: listPersona) {
				System.out.println(p);
			}
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + sFileName + " NO EXISTE");
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			System.err.println("EL FICHERO NO CONTIENE UN COCHE.");
		}
		
		
		
	}
}
