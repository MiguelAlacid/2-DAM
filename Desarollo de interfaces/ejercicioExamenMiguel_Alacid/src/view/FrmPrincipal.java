package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Component;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JTable tableChaleco;
	public FrmPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 435);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenuGestion = new JMenu("Gesti\u00F3n");
		menuBar.add(mnMenuGestion);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnMenuGestion.add(mnNewMenu);
		
		JMenuItem mntmDatabase = new JMenuItem("Database");
		mnNewMenu.add(mntmDatabase);
		
		mntmDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JDTest();
				
				try {
					dbms.DBOracle.openConn();
					
				} catch (Exception e1) {
				
					JOptionPane.showConfirmDialog(null, "ERROR EN LAS CREEDENCIALES, NO SE PUDO CONECTAR A LA BASE DE DATOS", "ERROR",
							JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
				}
				
				ctrl.CtrlPrincipal.mostrarCredenciales();
			}
		});
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnNewMenu.add(mntmLogin);
		mntmLogin.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new JDLogin();
			}
		});
		
		
		JSeparator separator = new JSeparator();
		mnMenuGestion.add(separator);
		
		JMenuItem mntmActualizar = new JMenuItem("Actualizar");
		mnMenuGestion.add(mntmActualizar);
		
		JMenu mnMenuChaleco = new JMenu("Chaleco");
		menuBar.add(mnMenuChaleco);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnMenuChaleco.add(mntmNuevo);
		
		JMenuItem mntmEditar = new JMenuItem("Editar");
		mnMenuChaleco.add(mntmEditar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mnMenuChaleco.add(mntmBorrar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnMenuChaleco.add(mntmConsultar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		tableChaleco = new JTable();
		tableChaleco.setBounds(10, 23, 575, 340);
		JScrollPane scrollPaneChalecos= new JScrollPane(tableChaleco);
		scrollPaneChalecos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPaneChalecos, "name_424673091681400");
		
		
		

		
		/*tablaEmpleados = new JTable();
		tablaEmpleados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ctrl.CtrlPrincipal.listenerTablaEmp();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		tablaEmpleados.setBounds(10, 23, 575, 340);*/
		
		setVisible(true);
	}

}
