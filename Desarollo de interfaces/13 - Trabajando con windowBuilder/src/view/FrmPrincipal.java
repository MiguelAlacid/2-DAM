package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		setTitle("IDIOMAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Play");
		
		btnNewButton.setBounds(292, 122, 65, 20);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(77, 122, 203, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 61));
		lblNewLabel.setBounds(62, 27, 345, 72);
		contentPane.add(lblNewLabel);
		//matchPalabras(lblNewLabel, textField, btnNewButton);
		
	}
	
	/*public static void matchPalabras(JLabel lblNewLabel, JButton btnNewButton) {
		ArrayList<String> ENG;
		ArrayList<String> ESP;
		int iNumeroRandom;
		String sEspanniol;
		ENG = palabrasIng();
		ESP = palabrasEsp();
		
		iNumeroRandom = (int) (Math.random() * ENG.size());
		
		lblNewLabel.setText(ENG.get(iNumeroRandom));
		
				sEspanniol = textField.getText();
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ESP.get(iNumeroRandom).equals(sEspanniol)) {
					System.out.println("Correcto");
				}
			}
		});
		
	}*/
}
