package view;

import java.sql.SQLException;

public class FrmPrincipal {

	public static void inicio()throws Exception {
		
		//ctrl.CtrlDept.mostrarListado();
		//nuevoDept();
		//dbms.DBOracle.openConn();
		totalEmp();
		listadoDepts();
	}

	private static void listadoDepts() {
		ctrl.CtrlDept.getListadoDepts
		();
		
	}

	private static void totalEmp() {
		Integer numDept = 20;
		ctrl.CtrlDept.totalEmp(numDept);
		
	}

	private static void nuevoDept() {
		String sLocalidad = "MAD";
		int iNumeroDept = 10;
		
		ctrl.CtrlDept.nuevaLoc(sLocalidad, iNumeroDept);
	}

}
