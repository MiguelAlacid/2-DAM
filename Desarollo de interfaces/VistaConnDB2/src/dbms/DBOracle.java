package dbms;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.Login;

public class DBOracle {

	private static Connection conn;
	private static File fchConn = new File("DBConn.cfg");
	
	public static Connection getConn() {
		return conn;
	}
	
	public static void desconectar() throws SQLException {
		conn.close();
	}

	public static void openConn() throws Exception {

		ctrl.CtrlPrincipal.loginCredenciales = readConfig();


        System.out.println(ctrl.CtrlPrincipal.loginCredenciales.toString());

        String dbURL = "jdbc:oracle:thin:@" + ctrl.CtrlPrincipal.loginCredenciales.getsDbHOST()+ ":" + ctrl.CtrlPrincipal.loginCredenciales.getsDbPORT()+ ":" + ctrl.CtrlPrincipal.loginCredenciales.getsDbNAME();

        // Carga el DRIVER en memoria

        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();

        // Establecemos la conexión

        conn = DriverManager.getConnection(dbURL, ctrl.CtrlPrincipal.loginCredenciales.getsDbUSER(), ctrl.CtrlPrincipal.loginCredenciales.getsDbPASS());
    }
	
	//public static boolean testConexion() {
		//boolean boExito = false;
		//try {
			//dbms.DBOracle.conectar();
			//dbms.DBOracle.desconectar();
			//boExito = true;
		
		/*} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block0
			e.printStackTrace();
		}*/
		
		//return boExito;
//	}
	
		public static Login readConfig() {
	        String sSeparador = ":";
	        Login dbLogin = new Login();

	        try {
	            BufferedReader buff = new BufferedReader(new FileReader(fchConn));

	            dbLogin.setsDbHOST(buff.readLine().split(sSeparador)[1]);
	            dbLogin.setsDbPORT(buff.readLine().split(sSeparador)[1]);
	            dbLogin.setsDbNAME(buff.readLine().split(sSeparador)[1]);
	            dbLogin.setsDbUSER(buff.readLine().split(sSeparador)[1]);
	            dbLogin.setsDbPASS(buff.readLine().split(sSeparador)[1]);

	            buff.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return dbLogin;
	    }
		
		public static void escribirFchConfig() {
			

		        try {
		            BufferedWriter buff = new BufferedWriter(new FileWriter(fchConn));

		           buff.write("HOST:"+ctrl.CtrlPrincipal.loginCredenciales.getsDbHOST());
		           buff.newLine();
		           buff.write("PORT:"+ctrl.CtrlPrincipal.loginCredenciales.getsDbPORT());
		           buff.newLine();
		           buff.write("DBNAME:"+ctrl.CtrlPrincipal.loginCredenciales.getsDbNAME());
		           buff.newLine();
		           buff.write("USERNAME:"+ctrl.CtrlPrincipal.loginCredenciales.getsDbUSER());
		           buff.newLine();
		           buff.write("USERPASS:"+ctrl.CtrlPrincipal.loginCredenciales.getsDbPASS());

		           buff.close();

		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		}
}




