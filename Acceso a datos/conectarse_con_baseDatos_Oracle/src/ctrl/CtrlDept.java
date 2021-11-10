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

	public static int totalEmp(Integer numDept) {
		int iTotal = 0;
		try {
			iTotal = logic.LogDept.getTotalEmpleados(numDept);
			System.out.println("El departamento " + numDept + " tiene " + iTotal + " empleados");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("no se ha poddo obtener el total de empleados del departamento " + numDept);
		}
		return iTotal;
		
	}

	public static void getEmpsPorDept() {
		
		
	}

	public static void getListadoDepts() {
		try {
			ArrayList<Dept> listado = logic.LogDept.getDepts();
			
			for(Dept d: listado) {
				System.out.println(d);
			}
		}catch(Exception e) {
			
		}
		
	}
}
