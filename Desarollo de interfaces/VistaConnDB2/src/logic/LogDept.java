package logic;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class LogDept {

	public static String getListado() throws Exception {
		String sSqlTodo = "";

		String sql = view.FrmPrincipal.txtSql.getText();
		dbms.DBOracle.openConn();

		Statement miOrden = dbms.DBOracle.getConn().createStatement();
		miOrden.execute(sql);
		ResultSet resultado = miOrden.getResultSet();

		ResultSetMetaData info = resultado.getMetaData();

		int numCampos = info.getColumnCount();

		for (int iContador = 1; iContador <= numCampos; iContador++) {
			sSqlTodo += (info.getColumnName(iContador) + "\t");
		}

		sSqlTodo += "\n";
		while (resultado.next()) {

			for (int iContador = 1; iContador <= numCampos; iContador++) {
				sSqlTodo += (resultado.getString(iContador) + "\t");
				
			}
			sSqlTodo += "\n";
		}
		dbms.DBOracle.desconectar();
		System.out.println(sSqlTodo);

		return sSqlTodo;
	}

	/*
	 * public static ArrayList<Dept> getListado() throws Exception {
	 * 
	 * ArrayList<Dept> aListado = new ArrayList<Dept>();
	 * 
	 * String sql = "SELECT DEPTNO, DNAME, LOC FROM DEPT ORDER BY 1"; // CONEX A LA
	 * BASE DE DATOS dbms.DBOracle.openConn();
	 * 
	 * Statement miOrden = dbms.DBOracle.getConn().createStatement();
	 * miOrden.execute(sql); ResultSet resultado = miOrden.getResultSet();
	 * 
	 * while (resultado.next()) { aListado.add( new Dept(resultado.getInt("DEPTNO"),
	 * resultado.getString("DNAME"), resultado.getString("LOC"))); }
	 * 
	 * // DESCONEXION BASE DE DATOS dbms.DBOracle.desconectar(); return aListado; }
	 */
}
