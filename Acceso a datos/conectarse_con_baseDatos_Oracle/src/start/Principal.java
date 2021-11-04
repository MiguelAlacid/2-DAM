package start;

import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		
	if(dbms.DBOracle.testConexion() == true) {
		System.out.println("Conexion correcta");
	}else {
		System.out.println("Conexion rechazada");
	}

	}

}
