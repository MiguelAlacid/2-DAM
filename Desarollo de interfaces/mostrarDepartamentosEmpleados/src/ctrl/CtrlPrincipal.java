package ctrl;

import javax.swing.table.DefaultTableModel;

import model.Login;

public class CtrlPrincipal {
	public static Login loginCredenciales = new Login();
	public static int iContador;
	public static String sSql = "SELECT DEPTNO,DNAME AS NOMBRE,LOC AS LOCALIDAD FROM DEPT";
	public static void inicio() throws Exception {
		new view.FrmPrincipal();
		rellenarTabla(logic.LogDept.getListado(sSql));
	}
	
	public static void loginCredenciales() {
		String sUser ="";
		String sPass ="";
		
		 sUser = view.JDLogin.txtUser.getText();
		 sPass = view.JDLogin.txtPass.getText();
		
		loginCredenciales.setsDbUSER(sUser);
		loginCredenciales.setsDbPASS(sPass);
	}
	
	public static void datosBD() {
		
		String sHOST = view.JDTest.txtHost.getText();
		String sPORT = view.JDTest.txtPort.getText();
		String sName = view.JDTest.txtName.getText();
		
		loginCredenciales.setsDbHOST(sHOST);
		loginCredenciales.setsDbPORT(sPORT);
		loginCredenciales.setsDbNAME(sName);;
	}
	
	public static void mostrarCredenciales() {
		view.JDTest.txtHost.setText(loginCredenciales.getsDbHOST());
		view.JDTest.txtPort.setText(loginCredenciales.getsDbPORT());
		view.JDTest.txtName.setText(loginCredenciales.getsDbNAME());
	}
	
	/*public static void listenerEjecutar() {
		try {
			rellenarTabla(logic.LogDept.getListado(view.FrmPrincipal..getText()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	/*public static void rellenarLista() throws Exception {
        view.FrmPrincipal.lstTablas.setModel(logic.LogDept.getListadoTablas());
    }*/
	
	public static void rellenarTabla(DefaultTableModel modelo) {
		view.FrmPrincipal.tablaDepartamentos.setModel(modelo);
		view.FrmPrincipal.tablaDepartamentos.getColumnModel().getColumn(0).setMaxWidth(0);
		view.FrmPrincipal.tablaDepartamentos.getColumnModel().getColumn(0).setMinWidth(0);
		view.FrmPrincipal.tablaDepartamentos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
		view.FrmPrincipal.tablaDepartamentos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
		//view.FrmPrincipal.tablaDepartamentos.getColumnModel().getColumn(0).setResizable(false);
	}
	
	public static void listenerTablaDept() throws Exception {
		
		view.FrmPrincipal.tablaEmpleados.setModel(logic.LogDept.getListadoTablas(numeroDeptno()));
		
		
	}
	
	public static String numeroDeptno() {
        int iNumFila = view.FrmPrincipal.tablaDepartamentos.getSelectedRow();

        String sValor = view.FrmPrincipal.tablaDepartamentos.getValueAt(iNumFila, 0).toString();

        return sValor;
    }

	/*public static void listenerJlist() throws Exception {
		
		if(view.FrmPrincipal.lstTablas.getSelectedValue().toString().equals("DEPT")) {
			 sSql = "SELECT * FROM DEPT";
        } else {
            sSql = "SELECT * FROM EMP";
        }
		
		rellenarTabla(logic.LogDept.getListado(sSql));
		
	}*/
	
}








