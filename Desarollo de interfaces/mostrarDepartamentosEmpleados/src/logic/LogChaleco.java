package logic;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

import model.Chaleco;

public class LogChaleco {

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
				aFila[0] = resultado.getString("ID_CHALECO");
				aFila[1] = resultado.getString("MODELO");
				aFila[2] = String.valueOf(resultado.getInt("COLOR"));
				aFila[3] = String.valueOf(resultado.getInt("TALLA"));
				aFila[4] = String.valueOf(resultado.getFloat("PRECIO"));
				aFila[5] = String.valueOf(resultado.getInt("STOCK"));
				
			}
				if(aFila[2].equals("1")) {
					aFila[2] = "Rojo";
				}else if(aFila[2].equals("2")) {
					aFila[2] = "verde";
					
				}else if(aFila[2].equals("3")) {
					aFila[2] = "Azul";
				}else {
					aFila[2] = "Amarillo";
				}
				
				if(aFila[3].equals("1")) {
					aFila[3] = "S";
				}else if(aFila[3].equals("2")) {
					aFila[3] = "M";
				
				}else if(aFila[3].equals("3")) {
					aFila[3] = "L";
				}else {
					aFila[3] = "XL";
				}
				
				modelo.addRow(aFila);
		}
		
		dbms.DBOracle.desconectar();

		return modelo;
	}
	
	/*public static void borrarChaleco() {
		
		dbms.DBOracle.openConn();
		Statement miOrden = dbms.DBOracle.getConn().createStatement();
		miOrden.executeUpdate("DELETE FROM CHALECO WHERE ID_CHALECO = '" + )
		
	}*/
	
	public static void insertarChalecos() throws Exception {
		
		dbms.DBOracle.openConn();

		Statement miOrden = dbms.DBOracle.getConn().createStatement();
		
        miOrden.executeUpdate("INSERT INTO CHALECO " + "VALUES ('"+6+"','" + view.JDChalecos.txtModelo.getText() + "','" + view.JDChalecos.JComboBoxTalla.getSelectedIndex() + "','" + view.JDChalecos.iColor + "', '" + view.JDChalecos.txtPrecio.getText()
                + "', '" + view.JDChalecos.txtStock.getText() + "' )");
		//statement.executeUpdate("INSERT INTO CHALECOS " + "VALUES ('"+view.JDChalecos.txtModelo +  , "'Mr.'", 'Springfield', 2001)");
		
		
	}
}
