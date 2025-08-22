package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaMostrarTodo extends JFrame {

	private JTextArea textoMostrarTodo;
	private JScrollPane scrollMostrarTodo;
	private JButton botonCancelar;

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
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBackground(Color.decode("#E8F5E9"));
		botonCancelar.setBounds(575, 720, 130, 30);
		this.add(botonCancelar);
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

	public JButton getBotonCancelar() {
	    return botonCancelar;
	}
	public void setBotonCancelar(JButton botonCancelar) {
	    this.botonCancelar = botonCancelar;
	}
}
