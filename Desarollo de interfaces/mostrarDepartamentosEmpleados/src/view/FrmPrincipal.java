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
	public static JTable tableChaleco;

	public FrmPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 435);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenuGestion = new JMenu("Gesti\u00F3n");
		menuBar.add(mnMenuGestion);
		
		JMenu mnNewMenu = new JMenu("Conexi\u00F3n");
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
		
		JMenuItem mntmActualizar = new JMenuItem("Actualizar");
		mntmActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ctrl.CtrlPrincipal.rellenarTabla(logic.LogChaleco.getListado(ctrl.CtrlPrincipal.sSql));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnMenuGestion.add(mntmActualizar);
		
		JSeparator separator = new JSeparator();
		mnMenuGestion.add(separator);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnMenuGestion.add(mntmNewMenuItem);
		
		JMenu mnMenuChaleco = new JMenu("Chaleco");
		menuBar.add(mnMenuChaleco);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JDChalecos();
			}
		});
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
		
		
		setVisible(true);
	}
}
