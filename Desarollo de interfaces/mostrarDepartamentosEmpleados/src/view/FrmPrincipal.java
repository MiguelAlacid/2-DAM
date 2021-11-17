package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JTable tablaDepartamentos;
	public static JTable tablaEmpleados;

	public FrmPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 435);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Conex");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				new JDLogin();
			}
		});
		
		mnNewMenu.add(mntmLogin);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmTest = new JMenuItem("Test");
		mntmTest.addActionListener(new ActionListener() {
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
		mnNewMenu.add(mntmTest);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDepartamentos = new JPanel();
		panelDepartamentos.setBounds(0, 0, 288, 374);
		contentPane.add(panelDepartamentos);
		panelDepartamentos.setLayout(null);
		
		tablaDepartamentos = new JTable();
	
		tablaDepartamentos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ctrl.CtrlPrincipal.listenerTablaDept();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		tablaDepartamentos.setBounds(10, 23, 268, 340);
		
		JPanel panelEmpleados = new JPanel();
		panelEmpleados.setBounds(289, 0, 585, 374);
		contentPane.add(panelEmpleados);
		panelEmpleados.setLayout(null);
		
		tablaEmpleados = new JTable();
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
		tablaEmpleados.setBounds(10, 23, 575, 340);
		
		JScrollPane scrollPaneDepartamentos = new JScrollPane(tablaDepartamentos);
		scrollPaneDepartamentos.setSize(268, 339);
		scrollPaneDepartamentos.setLocation(10, 24);
		
		scrollPaneDepartamentos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panelDepartamentos.add(scrollPaneDepartamentos, "name_77180949036500");
		
		JScrollPane scrollPaneEmpleados = new JScrollPane(tablaEmpleados);

		scrollPaneEmpleados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneEmpleados.setBounds(10,23,565,340);
		
		scrollPaneDepartamentos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panelEmpleados.add(scrollPaneEmpleados, "name_77180949036501");
		
		setVisible(true);
	}
}
