package ejercicioMoverImagen;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;
	private ImageIcon imagen;
	public static int x = 15;
	public static int y = 15;
	public static int iSalto = 50;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblimagen = new JLabel();
		lblimagen.setIcon((new ImageIcon("imagen/mosca.gif")));
		lblimagen.setBounds(x, y, 253, 178);
		
		
		this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
          
                switch (e.getKeyCode()) {
                case KeyEvent.VK_SPACE:
                    y += iSalto;
                    System.out.println("abajo");
                    break;
                case KeyEvent.VK_UP:
                	System.out.println("abajo");
                    y -= iSalto;
                    break;
                case KeyEvent.VK_RIGHT:
                	System.out.println("abajo");
                    x += iSalto;
                    break;
                case KeyEvent.VK_LEFT:
                	System.out.println("abajo");
                    x -= iSalto;
                    break;
                }
                lblimagen.setLocation(x, y);
            }
        });

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					lblimagen.setBounds(x, y += 15, 414, 222);
					contentPane.setBackground(Color.red);
				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					lblimagen.setBounds(x, y -= 11, 414, 222);
					contentPane.setBackground(Color.blue);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					lblimagen.setBounds(x -= 11, y, 414, 222);
					contentPane.setBackground(Color.green);
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					lblimagen.setBounds(x += 11, y, 414, 222);
					contentPane.setBackground(Color.magenta);
				}
			}
		});

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_R) {
					contentPane.setBackground(Color.red);
				}
				if (e.getKeyCode() == KeyEvent.VK_B) {
					contentPane.setBackground(Color.blue);
				}
				if (e.getKeyCode() == KeyEvent.VK_G) {
					contentPane.setBackground(Color.green);
				}
			}
		});
		
		/*this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
			try {
				Clip sonido = AudioSystem.getClip();
				sonido.open(AudioSystem.getAudioInputStream(new File("")));
				sonido.loop(0);
				sonido.start();
			}
			}
		});*/
		
		
		contentPane.add(lblimagen);

	}
}
