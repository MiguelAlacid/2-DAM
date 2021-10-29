package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_punto = new JPanel();
		contentPane.add(panel_punto, BorderLayout.SOUTH);
		panel_punto.setBounds(100,100,100,100);
		panel_punto.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPuntos = new JLabel("Puntos");
		panel_punto.add(lblPuntos);
		
		JButton btnNewButton = new JButton("New button");
		
		panel_punto.add(btnNewButton);
		
		
		JPanel panel_juego = new JPanel();
		contentPane.add(panel_juego, BorderLayout.CENTER);
		panel_juego.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(0, 50, 599, 1);
		panel_juego.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 100, 599, 1);
		panel_juego.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(0, 150, 599, 1);
		panel_juego.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBounds(0, 200, 599, 1);
		panel_juego.add(separator_2_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setForeground(Color.BLACK);
		separator_2_1_1.setBounds(0, 250, 599, 1);
		panel_juego.add(separator_2_1_1);
		
		JSeparator separator_2_1_1_1 = new JSeparator();
		separator_2_1_1_1.setForeground(Color.BLACK);
		separator_2_1_1_1.setBounds(0, 300, 599, 1);
		panel_juego.add(separator_2_1_1_1);
		
		JSeparator separator_2_1_1_2 = new JSeparator();
		separator_2_1_1_2.setForeground(Color.BLACK);
		separator_2_1_1_2.setBounds(0, 350, 599, 1);
		panel_juego.add(separator_2_1_1_2);
		
		JSeparator separator_2_1_1_3 = new JSeparator();
		separator_2_1_1_3.setForeground(Color.BLACK);
		separator_2_1_1_3.setBounds(0, 400, 599, 1);
		panel_juego.add(separator_2_1_1_3);
		
		JSeparator separator_2_1_1_4 = new JSeparator();
		separator_2_1_1_4.setForeground(Color.BLACK);
		separator_2_1_1_4.setBounds(0, 450, 599, 1);
		panel_juego.add(separator_2_1_1_4);
		
		JSeparator separator_2_1_1_5 = new JSeparator();
		separator_2_1_1_5.setForeground(Color.BLACK);
		separator_2_1_1_5.setBounds(0, 500, 599, 1);
		panel_juego.add(separator_2_1_1_5);
		
		JSeparator separator_2_1_1_5_1 = new JSeparator();
		separator_2_1_1_5_1.setForeground(Color.BLACK);
		separator_2_1_1_5_1.setBounds(0, 550, 599, 1);
		panel_juego.add(separator_2_1_1_5_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(51, 0, 2, 600);
		panel_juego.add(separator_3);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setForeground(Color.BLACK);
		separator_3_1.setBounds(100, 0, 2, 600);
		panel_juego.add(separator_3_1);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2.setForeground(Color.BLACK);
		separator_3_2.setBounds(150, 0, 2, 600);
		panel_juego.add(separator_3_2);
		
		JSeparator separator_3_3 = new JSeparator();
		separator_3_3.setOrientation(SwingConstants.VERTICAL);
		separator_3_3.setForeground(Color.BLACK);
		separator_3_3.setBounds(200, 0, 2, 600);
		panel_juego.add(separator_3_3);
		
		JSeparator separator_3_4 = new JSeparator();
		separator_3_4.setOrientation(SwingConstants.VERTICAL);
		separator_3_4.setForeground(Color.BLACK);
		separator_3_4.setBounds(250, 0, 2, 600);
		panel_juego.add(separator_3_4);
		
		JSeparator separator_3_5 = new JSeparator();
		separator_3_5.setOrientation(SwingConstants.VERTICAL);
		separator_3_5.setForeground(Color.BLACK);
		separator_3_5.setBounds(300, 0, 2, 600);
		panel_juego.add(separator_3_5);
		
		JSeparator separator_3_6 = new JSeparator();
		separator_3_6.setOrientation(SwingConstants.VERTICAL);
		separator_3_6.setForeground(Color.BLACK);
		separator_3_6.setBounds(350, 0, 2, 600);
		panel_juego.add(separator_3_6);
		
		JSeparator separator_3_7 = new JSeparator();
		separator_3_7.setOrientation(SwingConstants.VERTICAL);
		separator_3_7.setForeground(Color.BLACK);
		separator_3_7.setBounds(400, 0, 2, 600);
		panel_juego.add(separator_3_7);
		
		JSeparator separator_3_8 = new JSeparator();
		separator_3_8.setOrientation(SwingConstants.VERTICAL);
		separator_3_8.setForeground(Color.BLACK);
		separator_3_8.setBounds(450, 0, 2, 600);
		panel_juego.add(separator_3_8);
		
		JSeparator separator_3_9 = new JSeparator();
		separator_3_9.setOrientation(SwingConstants.VERTICAL);
		separator_3_9.setForeground(Color.BLACK);
		separator_3_9.setBounds(500, 0, 2, 600);
		panel_juego.add(separator_3_9);
		
		JSeparator separator_3_10 = new JSeparator();
		separator_3_10.setOrientation(SwingConstants.VERTICAL);
		separator_3_10.setForeground(Color.BLACK);
		separator_3_10.setBounds(550, 0, 2, 600);
		panel_juego.add(separator_3_10);
	}
}
