package ctrl;

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
}
