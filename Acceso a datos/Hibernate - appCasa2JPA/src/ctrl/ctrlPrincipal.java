package ctrl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Casa;
import view.FrmPrincipal;
public class ctrlPrincipal {
	public static ArrayList<Casa> aCasas = new ArrayList<Casa>();
	public static ArrayList<Casa> aCasaLeida = new ArrayList<Casa>();
	public static String sFileName = "archivos/casas.dat";
	
	public static void inicio() {
		
		aCasas = crearCasas();
		escribirObjeto(sFileName, aCasas);
		aCasaLeida = leerObjeto(sFileName);
	}

	
	
	public static ArrayList<Casa> crearCasas() {
		aCasas.add(new Casa("Calle Hockey",26,230.0));
		aCasas.add(new Casa("Calle eBaloncesto",5,230.0));
		aCasas.add(new Casa("Calle Tenis",7,230.0));
		aCasas.add(new Casa("Calle Hipica",20,230.0));
		
		return aCasas;
	}
	
	public static void escribirObjeto(String sFilename, ArrayList<Casa>aCasas) {
			try {
				FileOutputStream fch = new FileOutputStream(sFilename);
				ObjectOutputStream buff = new ObjectOutputStream(fch);
					buff.writeObject(aCasas);
				
				buff.close();
				fch.close();
			} catch (FileNotFoundException e) {
				System.err.println("ERROR: " + sFilename + " NO EXISTE");
			} catch (IOException e) {
				System.err.println("ERROR: NO SE PUEDE ESCRIBIR EN EL FICHERO");
			}
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Casa> leerObjeto(String sFileName){
			ArrayList<Casa> aCasas = new ArrayList<Casa>();
			
			Casa oCasa = null;
			try {
				FileInputStream fch = new FileInputStream(sFileName);
				ObjectInputStream buff = new ObjectInputStream(fch);
				
				aCasas = (ArrayList<Casa>) buff.readObject();
				
				buff.close();
				fch.close();
			} catch (FileNotFoundException e) {
				System.err.println("ERROR: " + sFileName + " NO EXISTE");
			} catch (IOException e) {
				System.err.println("ERROR: NO SE PUEDE LEER EN EL FICHERO");
			} catch (ClassNotFoundException e) {
				System.err.println("EL FICHERO NO CONTIENE UN COCHE.");
			}
			
			return aCasas;
		}

}






