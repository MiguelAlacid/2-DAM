package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CcAa;
import model.Ciudad;
import model.Provincia;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static CcAa CCAA;
	public static Provincia oProvincia;
	public static String sIdComunidad;
	public static ArrayList<CcAa> aComunidades;
	public static ArrayList<Provincia> aProvincia;
	public static ArrayList<Ciudad> aCiudades;
	public static JComboBox lstComunidad;
	public static JComboBox lstProvincia;
	public static JComboBox lstCiudad;
	public static String sNombreComunidad;
	public static String sNombreProvincia;

	public FrmPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblComunidad = new JLabel("Comunidad:");
		lblComunidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblComunidad.setBounds(61, 56, 74, 14);
		contentPane.add(lblComunidad);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProvincia.setBounds(61, 135, 74, 14);
		contentPane.add(lblProvincia);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCiudad.setBounds(61, 213, 56, 14);
		contentPane.add(lblCiudad);
		
		JLabel lblTemperatura = new JLabel("15");
		lblTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 57));
		lblTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura.setBounds(80, 256, 173, 84);
		contentPane.add(lblTemperatura);
		
		JCheckBox chckbxGuardar = new JCheckBox("Guardar datos en favoritos");
		chckbxGuardar.setSelected(true);
		chckbxGuardar.setBounds(49, 360, 183, 23);
		contentPane.add(chckbxGuardar);
		lstProvincia = new JComboBox();
		lstProvincia.setBounds(145, 131, 138, 24);
		contentPane.add(lstProvincia);
		lstComunidad = new JComboBox();
		aComunidades = ctrl.ctrlGestionFchXml.getInfo();
		lstComunidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sNombreComunidad = lstComunidad.getSelectedItem().toString();
				
			
				for(int iContador = 0; iContador < aComunidades.size(); iContador++) {
					if(aComunidades.get(iContador).getsNombre().equals(sNombreComunidad)) {
						CCAA = aComunidades.get(iContador);
						System.out.println(CCAA);
					}
				}
				aProvincia = ctrl.ctrlGestionFchXml.getProvincias(CCAA.getsId());
				ctrl.CtrlPrincipal.rellenarProv(CCAA);
				lstProvincia.setSelectedIndex(0);
			}
		});
		lstComunidad.setBounds(145, 52, 138, 24);
		contentPane.add(lstComunidad);
		
		
		lstProvincia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					sNombreProvincia = lstProvincia.getSelectedItem().toString();		
				
				for(int iContador = 0; iContador < aProvincia.size(); iContador++) {
					
					if(aProvincia.get(iContador).getsNombre().equals(sNombreProvincia)) {
						oProvincia = aProvincia.get(iContador);
						System.out.println(oProvincia);
					}
				}
				ctrl.CtrlPrincipal.rellenarCiudades(oProvincia);
			}
		});
	
		
		lstCiudad = new JComboBox();
		lstCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		lstCiudad.setBounds(145, 209, 138, 24);
		contentPane.add(lstCiudad);
		
		ctrl.CtrlPrincipal.rellenarCcAa();
		
		setVisible(true);
	}
}
