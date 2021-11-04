package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class FrmPrincipal extends JFrame {
	public static int iPuntos;
	private JPanel contentPane;
	public static JLabel celda[];
	public static int iX = 0;
	public static int iY = 0;
	public static boolean boDracula;
	public final int iSalto = 50;
	public static JPanel panel_juego;
	public static JLabel JDracula;
	public static int iXDracula;
	public static int iYDracula;
	public static int iMurcielagosTotales;
	public static int iCalabazasTotales;
	public static boolean boRevolver;
	public static int iMurcielagos;
	public static int iCalabazas;
	public static int iPosicionDracula;
	public static int iPosicionDraculaInicial;
	public static JLabel lblPuntos;
	public static JLabel lblCalabazas;
	public static JLabel lblMurcielagosTotales;

	public static ArrayList<String> aImagenesPos = new ArrayList<>();

	public FrmPrincipal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_punto = new JPanel();
		panel_punto.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_punto, BorderLayout.SOUTH);
		panel_punto.setBounds(100, 100, 100, 100);
		panel_punto.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		lblMurcielagosTotales = new JLabel("Murcielagos totales ");
		panel_punto.add(lblMurcielagosTotales);

		JLabel lblMurcielagosObtenidos = new JLabel("");
		panel_punto.add(lblMurcielagosObtenidos);

		lblCalabazas = new JLabel("Calabazas totales");
		panel_punto.add(lblCalabazas);

		JLabel lblCalabazasObtenidas = new JLabel("");
		panel_punto.add(lblCalabazasObtenidas);

		lblPuntos = new JLabel("Puntos");
		panel_punto.add(lblPuntos);

		panel_juego = new JPanel();
		panel_juego.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_juego, BorderLayout.CENTER);
		panel_juego.setLayout(null);

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				iXDracula = JDracula.getX();
				iYDracula = JDracula.getY();
				switch (e.getKeyCode()) {
				case KeyEvent.VK_DOWN:
					if (iYDracula != 550) {
						iYDracula += iSalto;
						iPosicionDracula += 12;
						validador();

					}
					break;
				case KeyEvent.VK_UP:
					if (iYDracula != 0) {

						iYDracula -= iSalto;
						iPosicionDracula -= 12;
						validador();
					}

					break;
				case KeyEvent.VK_RIGHT:
					if (iXDracula != 550) {

						iXDracula += iSalto;
						iPosicionDracula += 1;
						validador();

					}

					break;

				case KeyEvent.VK_LEFT:
					if (iXDracula != 0) {

						iXDracula -= iSalto;
						iPosicionDracula -= 1;
						validador();

					}

					break;
				}

				JDracula.setLocation(iXDracula, iYDracula);

			}
		});

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
		separator_3.setBounds(50, 0, 2, 603);
		panel_juego.add(separator_3);

		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setForeground(Color.BLACK);
		separator_3_1.setBounds(100, 0, 2, 603);
		panel_juego.add(separator_3_1);

		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2.setForeground(Color.BLACK);
		separator_3_2.setBounds(150, 0, 2, 603);
		panel_juego.add(separator_3_2);

		JSeparator separator_3_3 = new JSeparator();
		separator_3_3.setOrientation(SwingConstants.VERTICAL);
		separator_3_3.setForeground(Color.BLACK);
		separator_3_3.setBounds(200, 0, 2, 603);
		panel_juego.add(separator_3_3);

		JSeparator separator_3_4 = new JSeparator();
		separator_3_4.setOrientation(SwingConstants.VERTICAL);
		separator_3_4.setForeground(Color.BLACK);
		separator_3_4.setBounds(250, 0, 2, 603);
		panel_juego.add(separator_3_4);

		JSeparator separator_3_5 = new JSeparator();
		separator_3_5.setOrientation(SwingConstants.VERTICAL);
		separator_3_5.setForeground(Color.BLACK);
		separator_3_5.setBounds(300, 0, 2, 603);
		panel_juego.add(separator_3_5);

		JSeparator separator_3_6 = new JSeparator();
		separator_3_6.setOrientation(SwingConstants.VERTICAL);
		separator_3_6.setForeground(Color.BLACK);
		separator_3_6.setBounds(350, 0, 2, 603);
		panel_juego.add(separator_3_6);

		JSeparator separator_3_7 = new JSeparator();
		separator_3_7.setOrientation(SwingConstants.VERTICAL);
		separator_3_7.setForeground(Color.BLACK);
		separator_3_7.setBounds(400, 0, 2, 603);
		panel_juego.add(separator_3_7);

		JSeparator separator_3_8 = new JSeparator();
		separator_3_8.setOrientation(SwingConstants.VERTICAL);
		separator_3_8.setForeground(Color.BLACK);
		separator_3_8.setBounds(450, 0, 2, 603);
		panel_juego.add(separator_3_8);

		JSeparator separator_3_9 = new JSeparator();
		separator_3_9.setOrientation(SwingConstants.VERTICAL);
		separator_3_9.setForeground(Color.BLACK);
		separator_3_9.setBounds(500, 0, 2, 603);
		panel_juego.add(separator_3_9);

		JSeparator separator_3_10 = new JSeparator();
		separator_3_10.setOrientation(SwingConstants.VERTICAL);
		separator_3_10.setForeground(Color.BLACK);
		separator_3_10.setBounds(550, 0, 2, 603);
		panel_juego.add(separator_3_10);

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_SPACE:
					for (int iContador = 0; iContador < celda.length; iContador++) {
						if (iContador != iPosicionDraculaInicial) {
							celda[iContador].setVisible(false);
						}

					}
					break;
				}

			}
		});

	
		setVisible(true);
		repaint();

	}

	public static void crearLabels() {
		celda = new JLabel[144];
		int iContadorColumna = 0;
		String sNumeroAleatorio;
		for (int iContador = 0; iContador < celda.length; iContador++) {
			sNumeroAleatorio = ctrl.ctrlPrincipal.imagenAleatoria();

			if (sNumeroAleatorio.equals("images/dracula.png") && boDracula == false) {
				boDracula = true;
				celda[iContador] = new JLabel(new ImageIcon(
						new ImageIcon(sNumeroAleatorio).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				celda[iContador].setBounds(iX, iY, 50, 50);
				JDracula = celda[iContador];
				iPosicionDracula = iContador;
				iPosicionDraculaInicial = iContador;
				aImagenesPos.add(sNumeroAleatorio);

				
			} else if(sNumeroAleatorio.equals("images/revolver.png")&& boDracula == false){
				boDracula = true;
				celda[iContador] = new JLabel(new ImageIcon(
						new ImageIcon(sNumeroAleatorio).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				celda[iContador].setBounds(iX, iY, 50, 50);
				aImagenesPos.add(sNumeroAleatorio);
			}else if(sNumeroAleatorio.equals("images/cemetery.png") && boDracula == false){
				boDracula = true;
				celda[iContador] = new JLabel(new ImageIcon(
						new ImageIcon(sNumeroAleatorio).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				celda[iContador].setBounds(iX, iY, 50, 50);
				aImagenesPos.add(sNumeroAleatorio);
				celda[iContador].setVisible(false);
				
			}else if(sNumeroAleatorio.equals("images/sun.png") && boDracula == false){
				boDracula = true;
				celda[iContador] = new JLabel(new ImageIcon(
						new ImageIcon(sNumeroAleatorio).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				celda[iContador].setBounds(iX, iY, 50, 50);
				aImagenesPos.add(sNumeroAleatorio);
			}else{
				if (sNumeroAleatorio.equals("images/bat.png")) {
					iMurcielagosTotales++;
				}
				if (sNumeroAleatorio.equals("images/pumpkin.png")) {
					iCalabazasTotales++;
				}
				celda[iContador] = new JLabel(new ImageIcon(
						new ImageIcon(sNumeroAleatorio).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				celda[iContador].setBounds(iX, iY, 50, 50);
				aImagenesPos.add(sNumeroAleatorio);

			}

			if (iContadorColumna == 11) {
				iY += 50;
				iContadorColumna = 0;
				iX = 0;
				panel_juego.add(celda[iContador]);
			} else {
				panel_juego.add(celda[iContador]);
				iX += 50;
				iContadorColumna++;
			}

		}
		lblMurcielagosTotales.setText("Murcielagos totales: " + iMurcielagos + " de " + iMurcielagosTotales);
		lblCalabazas.setText("Calabazas Totales: " + iCalabazas + " de " + iCalabazasTotales);

	}

	public static void validador() {
		String sMensaje ="";
		ImageIcon imgCalabaza = new ImageIcon("images/pumpkin.png");
		ImageIcon imgMurcielago = new ImageIcon("images/bat.png");

		System.out.println("DRAC" + iPosicionDracula);
		System.out.println("Y celda " + celda[iPosicionDracula].getY());
		System.out.println("X celda " + celda[iPosicionDracula].getX());
		System.out.println("Y drac " + iYDracula);
		System.out.println("X drac " + iXDracula);
		// System.out.println(celda[iPosicionDracula].getIcon());

		if (iYDracula == celda[iPosicionDracula].getY() && iXDracula == celda[iPosicionDracula].getX()
				&& aImagenesPos.get(iPosicionDracula).equals("images/bat.png")) {

			if (iMurcielagos != iMurcielagosTotales) {
				iPuntos += 30;
				iMurcielagos++;
				
			}
			celda[iPosicionDracula].setVisible(true);
		} else if (iYDracula == celda[iPosicionDracula].getY() && iXDracula == celda[iPosicionDracula].getX()
				&& aImagenesPos.get(iPosicionDracula).equals("images/pumpkin.png")) {

			if (iCalabazas != iCalabazasTotales) {
				iPuntos += 20;
				iCalabazas++;
				//JLabel cambio = celda[iPosicionDracula];
				//cambio.setIcon(imgCalabaza);
				
				
			}
			celda[iPosicionDracula].setVisible(true);
			mostrarObjetos();

		} else if (iYDracula == celda[iPosicionDracula].getY() && iXDracula == celda[iPosicionDracula].getX()
				&& aImagenesPos.get(iPosicionDracula).equals("images/garlic.png")) {
			iPuntos -= 50;
			celda[iPosicionDracula].setVisible(true);
			mostrarObjetos();

		} else if (iYDracula == celda[iPosicionDracula].getY() && iXDracula == celda[iPosicionDracula].getX()
				&& aImagenesPos.get(iPosicionDracula).equals("images/religion.png")) {
			iPuntos -= 100;
			celda[iPosicionDracula].setVisible(true);
			mostrarObjetos();
		}else if(iYDracula == celda[iPosicionDracula].getY() && iXDracula == celda[iPosicionDracula].getX()
				&& aImagenesPos.get(iPosicionDracula).equals("images/sun.png")){
			sMensaje = "MUERTO, EL SOL TE HA DESINTEGRADO.. INTENTALO DE NUEVO";
			finJuego(sMensaje);
			
		}else if(iYDracula == celda[iPosicionDracula].getY() && iXDracula == celda[iPosicionDracula].getX()
				&& aImagenesPos.get(iPosicionDracula).equals("images/revolver.png")) {
			sMensaje = "MUERTO, TE HAN PEGADO UN TIRO CON BALAS DE PLATA... INTENTALO DE NUEVO";
			finJuego(sMensaje);
		}

		lblMurcielagosTotales.setText("Murcielagos totales: " + iMurcielagos + " de " + iMurcielagosTotales);
		lblCalabazas.setText("Calabazas Totales: " + iCalabazas + " de " + iCalabazasTotales);
		if (aImagenesPos.get(iPosicionDracula).equals("images/dracula.png")) {

		} else {
			JLabel cambio = celda[iPosicionDracula];
			aImagenesPos.set(iPosicionDracula, "");
			

		}
		
		if(iCalabazasTotales == iCalabazas && iMurcielagosTotales == iMurcielagos) {
			sMensaje = "ENHORABUENA, GANASTE EL JUEGO CON " + iPuntos + " PUNTOS";
			finJuego(sMensaje);
		}
		lblPuntos.setText("puntos: " + iPuntos);

	}

	public static void mostrarObjetos() {
		Timer timer = new Timer();
		for (int iContador = 0; iContador < celda.length; iContador++) {
			if (iContador != iPosicionDraculaInicial) {
				if(aImagenesPos.get(iContador).equals("images/pumpkin.png") || aImagenesPos.get(iContador).equals("images/bat.png")) {
					celda[iContador].setVisible(true);
				}
				
				if(aImagenesPos.get(iContador).equals("images/religion.png") || aImagenesPos.get(iContador).equals("images/garlic.png")) {
					celda[iContador].setVisible(true);
				}
			}
			

		}
		timer.scheduleAtFixedRate(new TimerTask() {
			int i = 3;

			
			public void run() {
				i--;
				
				if (i < 0) {

					for (int iContador = 0; iContador < celda.length; iContador++) {
						if (iContador != iPosicionDraculaInicial) {
							if(aImagenesPos.get(iContador).equals("images/pumpkin.png") || aImagenesPos.get(iContador).equals("images/bat.png")) {
								celda[iContador].setVisible(false);
							}
							if(aImagenesPos.get(iContador).equals("images/religion.png") || aImagenesPos.get(iContador).equals("images/garlic.png")) {
								celda[iContador].setVisible(false);
							}
							
						} else {
							//celda[iContador].setVisible(true);
						}
					}
				}
			}
		}, 0, 2000);

	}
	
	public static void finJuego(String sMensaje) {	
		
		int resp =  JOptionPane.showConfirmDialog(null, sMensaje,
	                "¿DESEAS VOLVER A JUGAR?", JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE);
		 switch (resp) {
	        case 0:
	            break;
	        case 1:
	            System.exit(0);
	            break;
	        }
	        
	}
}




