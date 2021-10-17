package Unico;

public class Window extends java.awt.Frame{

	public static void main(String[] args) {
		Window miApp = new Window();
		miApp.inicializarComponentes();
		System.out.println("todo ok");
	}
	private void inicializarComponentes() {
		setBounds(100, 100, 600, 400);
		setVisible(true);
	}

}
