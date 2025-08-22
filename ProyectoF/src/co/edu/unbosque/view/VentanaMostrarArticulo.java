package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaMostrarArticulo extends JFrame {

	private JTextArea textoMostrarArticulo;
	private JScrollPane scrollMostrarArticulo;
	private JButton botonCancelar;

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
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBackground(Color.decode("#E8F5E9"));
		botonCancelar.setBounds(575, 720, 130, 30);
		this.add(botonCancelar);
		
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
	
	public JButton getBotonCancelar() {
	    return botonCancelar;
	}
	public void setBotonCancelar(JButton botonCancelar) {
	    this.botonCancelar = botonCancelar;
	}

}
