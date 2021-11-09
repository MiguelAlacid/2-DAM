package ctrl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import model.Dept;

public class CtrlDept {

	public static void mostrarListado() {
		
		ArrayList<Dept> aListado;
		try {
			aListado = logic.LogDept.getListado();
			for(Dept d: aListado) {
				System.out.println(d);
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un error obteniendo el listado de departamentos");
			e.printStackTrace();
		}
		
	
	}
	
	public static void nuevaLoc(String sLocalidad, int numDept) {
		try {
			logic.LogDept.cambiarLocalidad(sLocalidad, numDept);
			System.out.println("se ha cambiado correctamente");
		} catch (Exception e) {
			System.out.println("ha habido un error al actualizar la localidad");
			e.printStackTrace();
		}
	}
}
