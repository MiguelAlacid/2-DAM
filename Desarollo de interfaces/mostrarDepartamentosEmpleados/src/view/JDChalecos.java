package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDChalecos extends JDialog {

	private JPanel contentPane;
    public static JTextField txtPrecio;
    public static JTextField txtStock;
    public static JTextField txtModelo;
    public static JComboBox JComboBoxTalla;
    public static JButton btnRojo;
    public static JButton btnVerde;
    public static JButton btnAzul;
    public static JButton btnAmarillo;
    public static Integer iColor;
    

    public JDChalecos() {
    	
        setBounds(100, 100, 520, 331);
        setTitle("Editar chaleco");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        
        JLabel lblColor = new JLabel("Color:");
        lblColor.setBounds(33, 100, 46, 14);
        contentPane.add(lblColor);
        
        
        
        JComboBoxTalla = new JComboBox();
        JComboBoxTalla.setBounds(105, 156, 57, 22);
        JComboBoxTalla.addItem("S");
        JComboBoxTalla.addItem("M");
        JComboBoxTalla.addItem("L");
        JComboBoxTalla.addItem("XL");
        contentPane.add(JComboBoxTalla);
        
        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(33, 40, 46, 14);
        contentPane.add(lblModelo);
        
        
        
        JButton btnGuardar = new JButton("GUARDAR");
        btnGuardar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					logic.LogChaleco.insertarChalecos();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnGuardar.setBounds(139, 241, 103, 23);
        contentPane.add(btnGuardar);
        
        JButton btnCancelar = new JButton("CANCELAR");
        btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnCancelar.setBounds(293, 241, 103, 23);
        contentPane.add(btnCancelar);
        
        JLabel lblColorQueSeleccionas = new JLabel("");
        lblColorQueSeleccionas.setBounds(392, 100, 71, 15);
        contentPane.add(lblColorQueSeleccionas);
        
        JLabel lblTalla = new JLabel("Talla:");
        lblTalla.setBounds(33, 160, 46, 14);
        contentPane.add(lblTalla);
      
        
        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(228, 160, 33, 14);
        contentPane.add(lblPrecio);
        
        JLabel lblStock = new JLabel("Stock:");
        lblStock.setBounds(352, 160, 30, 14);
        contentPane.add(lblStock);
        
        txtPrecio = new JTextField();
        txtPrecio.setBounds(271, 157, 57, 20);
        contentPane.add(txtPrecio);
        txtPrecio.setColumns(10);
        
        txtStock = new JTextField();
        txtStock.setColumns(10);
        txtStock.setBounds(392, 157, 57, 20);
        contentPane.add(txtStock);
        
        txtModelo = new JTextField();
        txtModelo.setColumns(10);
        txtModelo.setBounds(105, 37, 358, 20);
        contentPane.add(txtModelo);
        
        
        
        btnRojo = new JButton("");
        btnRojo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		iColor = 1;
        	}
        });
        btnRojo.setBackground(Color.RED);
        btnRojo.setBounds(116, 96, 46, 31);
        contentPane.add(btnRojo);
        
        btnVerde = new JButton("");
        btnVerde.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		iColor = 2;
        	}
        });
        btnVerde.setBackground(Color.GREEN);
        btnVerde.setBounds(182, 96, 46, 31);
        contentPane.add(btnVerde);
        
        btnAzul = new JButton("");
        btnAzul.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		iColor = 3;
        	}
        });
        btnAzul.setBackground(Color.BLUE);
        btnAzul.setBounds(249, 96, 46, 31);
        contentPane.add(btnAzul);
        
        btnAmarillo = new JButton("");
        btnAmarillo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		iColor = 4;
        	}
        });
        btnAmarillo.setBackground(Color.YELLOW);
        btnAmarillo.setBounds(322, 96, 46, 31);
        contentPane.add(btnAmarillo);
        setVisible(true);
    }
}
