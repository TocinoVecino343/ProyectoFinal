package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaMostrarLibroVirtual extends JFrame {

	private JTextArea textoMostrarLibroVirtual;
	private JScrollPane scrollMostrarLibroVirtual;

	public VentanaMostrarLibroVirtual() {
		inicializarVentanaMostrarLibroVirtual();
	}

	public void inicializarVentanaMostrarLibroVirtual() {
		this.setTitle("Mostrar libros virtuales");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(null);

		textoMostrarLibroVirtual = new JTextArea();

		scrollMostrarLibroVirtual = new JScrollPane(textoMostrarLibroVirtual);
		scrollMostrarLibroVirtual.setBounds(50, 50, 1150, 650);
		this.add(scrollMostrarLibroVirtual);
	}

	public JTextArea getTextoMostrarLibroVirtual() {
		return textoMostrarLibroVirtual;
	}

	public void setTextoMostrarLibroVirtual(JTextArea textoMostrarLibroVirtual) {
		this.textoMostrarLibroVirtual = textoMostrarLibroVirtual;
	}

	public JScrollPane getScrollMostrarLibroVirtual() {
		return scrollMostrarLibroVirtual;
	}

	public void setScrollMostrarLibroVirtual(JScrollPane scrollMostrarLibroVirtual) {
		this.scrollMostrarLibroVirtual = scrollMostrarLibroVirtual;
	}

}