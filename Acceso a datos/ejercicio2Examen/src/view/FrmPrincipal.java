package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Statement;
import java.util.ArrayList;

import model.Casa;



public class FrmPrincipal {

	private static String sFileName = "archivos/Casas.dat";
	public static void main(String[] args) throws Exception {
		
		
		ArrayList<Casa> aListado = leerObjeto();
		guardarBD(aListado);
		
	}
	
	private static void guardarBD(ArrayList<Casa> aListado) throws Exception {
		
		   	dbms.DBoracle.openConn();
	        Statement stmt = dbms.DBoracle.getConn().createStatement();

	        for (Casa oCasa : aListado) {
	            stmt.executeUpdate("INSERT INTO CASA " + "VALUES (" + oCasa.getId_casa() + ",'" + oCasa.getsPoblacion()
	                    + "'," + oCasa.getfSuperficie() + "," + oCasa.getiAseos() + " )");
	        }

	        dbms.DBoracle.desconectar();
	    }
	

	@SuppressWarnings("unchecked")
	public static ArrayList<Casa> leerObjeto(){
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
			e.printStackTrace();
			System.err.println("ERROR: NO SE PUEDE LEER EN EL FICHERO");
		} catch (ClassNotFoundException e) {
			System.err.println("EL FICHERO NO CONTIENE UN COCHE.");
		}
		
		return aCasas;
	}

}
