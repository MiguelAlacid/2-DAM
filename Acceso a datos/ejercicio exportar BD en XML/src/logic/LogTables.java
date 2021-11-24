package logic;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class LogTables {

	public static ArrayList<String> aListado = new ArrayList<String>();
	public static ArrayList<String> aNombreCampo = new ArrayList<String>();
	public static ArrayList<String> aResultados = new ArrayList<String>();

	public static void getTablas() throws Exception {

		String sql = "SELECT TABLE_NAME FROM USER_TABLES";
		// CONEX A LA BASE DE DATOS
		dbms.DBORACLE.openConn();

		Statement miOrden = dbms.DBORACLE.getConn().createStatement();
		miOrden.execute(sql);
		ResultSet resultado = miOrden.getResultSet();
		ResultSetMetaData info = resultado.getMetaData();
		int iCampos = info.getColumnCount();

		while (resultado.next()) {
			for (int iContador = 1; iContador <= iCampos; iContador++) {
				aListado.add(resultado.getString(iContador));
			}

		}

		// DESCONEXION BASE DE DATOS
		dbms.DBORACLE.desconectar();
	}

	public static void getResultados(int iContador) throws Exception {

		String sql = "SELECT * FROM " + aListado.get(iContador) + "";
		// CONEX A LA BASE DE DATOS
		dbms.DBORACLE.openConn();

		Statement miOrden = dbms.DBORACLE.getConn().createStatement();
		miOrden.execute(sql);
		ResultSet resultado = miOrden.getResultSet();
		ResultSetMetaData info = resultado.getMetaData();
		int iCampos = info.getColumnCount();

		for (int iContador1 = 1; iContador1 <= iCampos; iContador1++) {
			aNombreCampo.add(info.getColumnLabel(iContador1));
		}

		while(resultado.next()) {
			for (int iContador2 = 1; iContador2 <= iCampos; iContador2++) {
				aResultados.add(resultado.getString(iContador2));
			}
		}
		

		// DESCONEXION BASE DE DATOS
		dbms.DBORACLE.desconectar();

	}

}
