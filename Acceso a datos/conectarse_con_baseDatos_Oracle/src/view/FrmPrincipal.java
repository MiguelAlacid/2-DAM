package view;

import java.sql.SQLException;

public class FrmPrincipal {

	public static void inicio()throws Exception {
		
		ctrl.CtrlDept.mostrarListado();
		String sLocalidad = "MAD";
		int iNumeroDept = 10;
		
		ctrl.CtrlDept.nuevaLoc(sLocalidad, iNumeroDept);
	//dbms.DBOracle.openConn();

	}

}
