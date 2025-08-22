package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaMostrarLibroVirtual extends JFrame {

	private JTextArea textoMostrarLibroVirtual;
	private JScrollPane scrollMostrarLibroVirtual;
	private JButton botonCancelar;

	public VentanaMostrarLibroVirtual() {
		inicializarVentanaMostrarLibroVirtual();
	}

	public void inicializarVentanaMostrarLibroVirtual() {
		this.setTitle("Mostrar libros virtuales");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		textoMostrarLibroVirtual = new JTextArea();
		textoMostrarLibroVirtual.setEditable(false);
		
		scrollMostrarLibroVirtual = new JScrollPane(textoMostrarLibroVirtual);
		scrollMostrarLibroVirtual.setBounds(50, 50, 1150, 650);
		this.add(scrollMostrarLibroVirtual);
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBackground(Color.decode("#E8F5E9"));
		botonCancelar.setBounds(575, 720, 130, 30);
		this.add(botonCancelar);
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
	
	public JButton getBotonCancelar() {
	    return botonCancelar;
	}
	public void setBotonCancelar(JButton botonCancelar) {
	    this.botonCancelar = botonCancelar;
	}

}