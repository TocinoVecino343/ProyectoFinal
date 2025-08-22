package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaMostrarTodo extends JFrame {

	private JTextArea textoMostrarTodo;
	private JScrollPane scrollMostrarTodo;

	public VentanaMostrarTodo() {
		inicializarVentanaMostrarTodo();
	}

	public void inicializarVentanaMostrarTodo() {
		this.setTitle("Mostrar todo");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		textoMostrarTodo = new JTextArea();

		scrollMostrarTodo = new JScrollPane(textoMostrarTodo);
		scrollMostrarTodo.setBounds(50, 50, 1150, 650);
		this.add(scrollMostrarTodo);
	}

	public JTextArea getTextoMostrarTodo() {
		return textoMostrarTodo;
	}

	public void setTextoMostrarTodo(JTextArea textoMostrarTodo) {
		this.textoMostrarTodo = textoMostrarTodo;
	}

	public JScrollPane getScrollMostrarTodo() {
		return scrollMostrarTodo;
	}

	public void setScrollMostrarTodo(JScrollPane scrollMostrarTodo) {
		this.scrollMostrarTodo = scrollMostrarTodo;
	}

}
