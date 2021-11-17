package logic;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

import model.emp;

public class LogDept {

	public static int iContador2 = 0;
	public static DefaultTableModel getListado(String sSql) throws Exception {
		
		dbms.DBOracle.openConn();

		Statement miOrden = dbms.DBOracle.getConn().createStatement();
		miOrden.execute(sSql);
		ResultSet resultado = miOrden.getResultSet();

		ResultSetMetaData info = resultado.getMetaData();

		int numCampos = info.getColumnCount();

		DefaultTableModel modelo = new DefaultTableModel();
		
		String[] aFila = new String[numCampos];
		
		for(int iContador = 1; iContador <= numCampos; iContador++) {
			modelo.addColumn(info.getColumnLabel(iContador));
		}
		
		while (resultado.next()) {
			
			for (int iContador = 1; iContador <= numCampos; iContador++) {
					aFila[0] = resultado.getString("DEPTNO");
					aFila[1] = resultado.getString("NOMBRE");
					aFila[2] = resultado.getString("LOCALIDAD");
				
			}
				modelo.addRow(aFila);
		}
		dbms.DBOracle.desconectar();

		return modelo;
	}
	
	public static DefaultTableModel getListadoTablas(String sDeptno) throws Exception {

        String sSQL = "SELECT ENAME AS NOMBRE, JOB AS OFICIO, SAL AS SALARIO FROM EMP WHERE DEPTNO = " + sDeptno;

        dbms.DBOracle.openConn();

        Statement miOrden = dbms.DBOracle.getConn().createStatement();
        miOrden.execute(sSQL);

        ResultSet resultado = miOrden.getResultSet();
        ResultSetMetaData info = resultado.getMetaData();
        int nCampos = info.getColumnCount();

        DefaultTableModel modelo = new DefaultTableModel();

    	
		String[] aFila = new String[nCampos];
		
		for(int iContador = 1; iContador <= nCampos; iContador++) {
			modelo.addColumn(info.getColumnLabel(iContador));
		}

        while (resultado.next()) { 
        	
            for (int i = 1; i <= nCampos; i++) {
                aFila[i-1]= resultado.getString(i);
            }
            modelo.addRow(aFila);
        }

        dbms.DBOracle.desconectar();

        return modelo;
    }
	
	public static emp getListadoEmp() throws Exception {

        String sSQL = "SELECT E2.ENAME AS JEFE,E1.EMPNO, E1.ENAME,E1.JOB,E1.SAL,E1.COMM, E1.HIREDATE FROM EMP E1, EMP E2 WHERE E1.ENAME = '" + ctrl.CtrlPrincipal.nombreEmp() + "' AND E2.ENAME = (SELECT ENAME FROM EMP WHERE EMPNO = E1.MGR)";
        emp oEmpleado = new emp();
        dbms.DBOracle.openConn();

        Statement miOrden = dbms.DBOracle.getConn().createStatement();
        miOrden.execute(sSQL);

        ResultSet resultado = miOrden.getResultSet();
        ResultSetMetaData info = resultado.getMetaData();
        int nCampos = info.getColumnCount();

        DefaultTableModel modelo = new DefaultTableModel();

    	
		//String[] aFila = new String[nCampos];

        while (resultado.next()) { 
        	
            for (int i = 1; i <= nCampos; i++) {
                oEmpleado.setsNombre(resultado.getString("ENAME"));
                oEmpleado.setsOficio(resultado.getString("JOB"));
                oEmpleado.setiComm(resultado.getInt("COMM"));
                oEmpleado.setiSalario(resultado.getInt("SAL"));
                oEmpleado.setsFechaAlta(resultado.getString("HIREDATE"));
                oEmpleado.setsNombreJefe(resultado.getString("JEFE"));
                
            }
        }
        System.out.println(oEmpleado.getsNombre());

        dbms.DBOracle.desconectar();

        return oEmpleado;
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
