package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaMostrarArticulo extends JFrame {

	private JTextArea textoMostrarArticulo;
	private JScrollPane scrollMostrarArticulo;

	public VentanaMostrarArticulo() {
		inicializarVentanaMostrarArticulo();
	}

	public void inicializarVentanaMostrarArticulo() {
		this.setTitle("Mostrar artículos");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		textoMostrarArticulo = new JTextArea();
		textoMostrarArticulo.setEditable(false);

		scrollMostrarArticulo = new JScrollPane(textoMostrarArticulo);
		scrollMostrarArticulo.setBounds(50, 50, 1150, 650);
		this.add(scrollMostrarArticulo);
	}

	public JTextArea getTextoMostrarArticulo() {
		return textoMostrarArticulo;
	}

	public void setTextoMostrarArticulo(JTextArea textoMostrarArticulo) {
		this.textoMostrarArticulo = textoMostrarArticulo;
	}

	public JScrollPane getScrollMostrarArticulo() {
		return scrollMostrarArticulo;
	}

	public void setScrollMostrarArticulo(JScrollPane scrollMostrarArticulo) {
		this.scrollMostrarArticulo = scrollMostrarArticulo;
	}

}
