package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaMostrarRevista extends JFrame {

	private JTextArea textoMostrarRevista;
	private JScrollPane scrollMostrarRevista;
	private JButton botonCancelar;

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
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBackground(Color.decode("#E8F5E9"));
		botonCancelar.setBounds(575, 720, 130, 30);
		this.add(botonCancelar);
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
	
	public JButton getBotonCancelar() {
	    return botonCancelar;
	}
	public void setBotonCancelar(JButton botonCancelar) {
	    this.botonCancelar = botonCancelar;
	}

}
