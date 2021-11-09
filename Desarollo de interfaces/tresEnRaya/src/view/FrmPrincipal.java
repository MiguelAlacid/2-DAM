package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmPrincipal extends JFrame {
	private static int iNumero;
	private static int iContadorMovimientos = 0;
	private static JLabel labelOrigen;
	private JPanel contentPane;

	public FrmPrincipal() {
		ctrl.CtrlPrincipal.elegirJugador();
		setIconImage(Toolkit.getDefaultToolkit().createImage("Imagenes/tictactoe.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setBounds(0, 127, 469, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 255, 469, 2);
		contentPane.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(147, 0, 2, 386);
		contentPane.add(separator_1_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setForeground(Color.BLACK);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(310, 0, 2, 385);
		contentPane.add(separator_2);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(0, 385, 469, 46);
		contentPane.add(panel);

		JLabel lblImagen0 = new JLabel("");
		lblImagen0.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ctrl.CtrlPrincipal.contadorFichas() != 6) {
					ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(0, 0))
							.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
					lblImagen0.setIcon(imgThisImg);
				}else {
					
					if(iContadorMovimientos == 0) {
						iNumero = ctrl.CtrlPrincipal.moverFicha(0, 0);
						labelOrigen = lblImagen0;
						iContadorMovimientos++;
					}else {
						ctrl.CtrlPrincipal.setearFicha(0, 0, iNumero, labelOrigen, lblImagen0);
						iContadorMovimientos = 0;
					}
				}
				
				
				
			}
		});
		lblImagen0.setBounds(0, 0, 147, 128);

		contentPane.add(lblImagen0);

		JLabel lblImagen6 = new JLabel("");
		lblImagen6.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ctrl.CtrlPrincipal.contadorFichas() != 6) {
					ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(2, 0))
							.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
					lblImagen6.setIcon(imgThisImg);
				}
				
				
			}
		});
		lblImagen6.setBounds(0, 255, 147, 132);
		contentPane.add(lblImagen6);

		JLabel lblImagen3 = new JLabel("");
		lblImagen3.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ctrl.CtrlPrincipal.contadorFichas() != 6) {
				ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(1, 0)).getImage()
						.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
				lblImagen3.setIcon(imgThisImg);
				}else {

					if(iContadorMovimientos == 0) {
						iNumero = ctrl.CtrlPrincipal.moverFicha(1, 0);
						labelOrigen = lblImagen3;
						iContadorMovimientos++;
					}else {
						ctrl.CtrlPrincipal.setearFicha(1, 0, iNumero, labelOrigen, lblImagen3);
						iContadorMovimientos = 0;
					}
				}
				

			}
		});
		lblImagen3.setBounds(0, 130, 147, 126);
		contentPane.add(lblImagen3);

		JLabel lblImagen1 = new JLabel("");
		lblImagen1.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ctrl.CtrlPrincipal.contadorFichas() != 6) {
				ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(0, 1)).getImage()
						.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
				lblImagen1.setIcon(imgThisImg);
				}

			}
		});
		lblImagen1.setBounds(149, 0, 161, 126);
		contentPane.add(lblImagen1);

		JLabel lblImagen2 = new JLabel("");
		lblImagen2.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ctrl.CtrlPrincipal.contadorFichas() != 6) {
				ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(0, 2)).getImage()
						.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
				lblImagen2.setIcon(imgThisImg);
				}
			}
		});
		lblImagen2.setBounds(311, 0, 158, 126);
		contentPane.add(lblImagen2);

		JLabel lblImagen4 = new JLabel("");
		lblImagen4.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ctrl.CtrlPrincipal.contadorFichas() != 6) {
				ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(1, 1)).getImage()
						.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
				lblImagen4.setIcon(imgThisImg);
				}
			}
		});
		lblImagen4.setBounds(149, 130, 161, 126);
		contentPane.add(lblImagen4);

		JLabel lblImagen5 = new JLabel("");
		lblImagen5.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ctrl.CtrlPrincipal.contadorFichas() != 6) {
				ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(1, 2)).getImage()
						.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
				lblImagen5.setIcon(imgThisImg);
				}
			}
		});
		lblImagen5.setBounds(311, 128, 158, 128);
		contentPane.add(lblImagen5);

		JLabel lblImagen7 = new JLabel("");
		lblImagen7.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ctrl.CtrlPrincipal.contadorFichas() != 6) {
				ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(2, 1)).getImage()
						.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
				lblImagen7.setIcon(imgThisImg);
				}
			}
		});
		lblImagen7.setBounds(149, 256, 161, 128);
		contentPane.add(lblImagen7);

		JLabel lblImagen8 = new JLabel("");
		lblImagen8.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ctrl.CtrlPrincipal.contadorFichas() != 6) {
				ImageIcon imgThisImg = new ImageIcon(new ImageIcon(ctrl.CtrlPrincipal.colocarFichas(2, 2)).getImage()
						.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
				lblImagen8.setIcon(imgThisImg);
				}
			}
		});
		lblImagen8.setBounds(311, 257, 158, 128);
		contentPane.add(lblImagen8);
		setVisible(true);
	}
}
