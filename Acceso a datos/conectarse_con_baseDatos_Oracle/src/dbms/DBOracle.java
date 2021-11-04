package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBOracle {
	
	private static Connection conn;
	
	public static Connection getConn() {
		return conn;
	}
	
	public static void desconectar() throws SQLException {
		conn.close();
	}

	/*public static void conectar() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		String sDbHOST = "10.192.120.60";
		String sDbPORT = "1521";
		String sDbNAME = "ORCL";
		String sDbUSER = "ALACID";
		String sDbPASS = "medac21";
		
		String sDbURL = "jdbc:oracle:thin:@"+sDbHOST+":"+sDbPORT+":"+sDbNAME;
		
		// CARGAR EL DRIVER EN MEMORIA
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		
		// ESTABLECEMOS LA CONEXION
		
		conn = DriverManager.getConnection(sDbURL,sDbUSER,sDbPASS);
		
	}*/
	
	//public static boolean testConexion() {
		boolean boExito = false;
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
	
	public static void readConfig(String sFicheroConfig) {
		
		
	}
}
