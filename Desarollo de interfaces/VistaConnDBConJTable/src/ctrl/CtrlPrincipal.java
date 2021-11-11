package ctrl;

import javax.swing.table.DefaultTableModel;

import model.Login;

public class CtrlPrincipal {
	public static Login loginCredenciales = new Login();
	
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
	
	public static void listenerEjecutar() {
		try {
			rellenarTabla(logic.LogDept.getListado(view.FrmPrincipal.txtSql.getText()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void rellenarTabla(DefaultTableModel modelo) {
		view.FrmPrincipal.table.setModel(modelo);
	}
	
	public static void fileSeleccionada() {
        int iNumCol = view.FrmPrincipal.table.getSelectedColumn();
        int iNumFila = view.FrmPrincipal.table.getSelectedRow();

        String sValor = view.FrmPrincipal.table.getValueAt(iNumCol, iNumFila).toString();

        System.out.println(sValor);
    }
	
}








