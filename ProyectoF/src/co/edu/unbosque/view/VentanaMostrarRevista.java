package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaMostrarRevista extends JFrame {

	private JTextArea textoMostrarRevista;
	private JScrollPane scrollMostrarRevista;

	public VentanaMostrarRevista() {
		inicializarVentanaMostrarRevista();
	}

	public void inicializarVentanaMostrarRevista() {
		this.setTitle("Mostrar revistas");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		textoMostrarRevista = new JTextArea();
		textoMostrarRevista.setEditable(false);

		scrollMostrarRevista = new JScrollPane(textoMostrarRevista);
		scrollMostrarRevista.setBounds(50, 50, 1150, 650);
		this.add(scrollMostrarRevista);
	}

	public JTextArea getTextoMostrarRevista() {
		return textoMostrarRevista;
	}

	public void setTextoMostrarRevista(JTextArea textoMostrarRevista) {
		this.textoMostrarRevista = textoMostrarRevista;
	}

	public JScrollPane getScrollMostrarRevista() {
		return scrollMostrarRevista;
	}

	public void setScrollMostrarRevista(JScrollPane scrollMostrarRevista) {
		this.scrollMostrarRevista = scrollMostrarRevista;
	}

}
