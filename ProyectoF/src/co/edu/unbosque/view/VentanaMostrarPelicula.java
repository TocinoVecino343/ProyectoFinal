package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaMostrarPelicula extends JFrame {

	private JTextArea textoMostrarPelicula;
	private JScrollPane scrollMostrarPelicula;
	private JButton botonCancelar;

	public VentanaMostrarPelicula() {
		inicializarVentanaMostrarPelicula();

	}

	public void inicializarVentanaMostrarPelicula() {
		this.setTitle("Mostrar películas");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		textoMostrarPelicula = new JTextArea();
		textoMostrarPelicula.setEditable(false);

		scrollMostrarPelicula = new JScrollPane(textoMostrarPelicula);
		scrollMostrarPelicula.setBounds(50, 50, 1150, 650);
		this.add(scrollMostrarPelicula);
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBackground(Color.decode("#E8F5E9"));
		botonCancelar.setBounds(575, 720, 130, 30);
		this.add(botonCancelar);
	}

	public JTextArea getTextoMostrarPelicula() {
		return textoMostrarPelicula;
	}

	public void setTextoMostrarPelicula(JTextArea textoMostrarPelicula) {
		this.textoMostrarPelicula = textoMostrarPelicula;
	}

	public JScrollPane getScrollMostrarPelicula() {
		return scrollMostrarPelicula;
	}

	public void setScrollMostrarPelicula(JScrollPane scrollMostrarPelicula) {
		this.scrollMostrarPelicula = scrollMostrarPelicula;
	}
	
	public JButton getBotonCancelar() {
	    return botonCancelar;
	}
	public void setBotonCancelar(JButton botonCancelar) {
	    this.botonCancelar = botonCancelar;
	}

}
