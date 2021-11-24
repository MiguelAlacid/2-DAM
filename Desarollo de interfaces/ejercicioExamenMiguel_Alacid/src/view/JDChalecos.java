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

public class JDChalecos extends JDialog {

	private JPanel contentPane;
    private JTextField txtPrecio;
    private JTextField txtStock;
    private JTextField txtModelo;


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
        
        
        
        JComboBox JComboBoxTalla = new JComboBox();
        JComboBoxTalla.setBounds(105, 156, 57, 22);
        contentPane.add(JComboBoxTalla);
        
        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(33, 40, 46, 14);
        contentPane.add(lblModelo);
        
        JButton btnGuardar = new JButton("GUARDAR");
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
        
        
        
        JButton btnRojo = new JButton("");
        btnRojo.setBounds(116, 96, 46, 31);
        contentPane.add(btnRojo);
        
        JButton btnVerde = new JButton("");
        btnVerde.setBounds(182, 96, 46, 31);
        contentPane.add(btnVerde);
        
        JButton btnAzul = new JButton("");
        btnAzul.setBounds(249, 96, 46, 31);
        contentPane.add(btnAzul);
        
        JButton btnAmarillo = new JButton("");
        btnAmarillo.setBounds(322, 96, 46, 31);
        contentPane.add(btnAmarillo);
    }
}
