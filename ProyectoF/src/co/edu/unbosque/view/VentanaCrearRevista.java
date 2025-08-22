package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearRevista extends JFrame {
	private JLabel labelAutor;
	private JLabel labelFuente;
	private JLabel labelGeograficos;
	private JLabel labelDescripcionFisica;

	private JTextField textoAutor;
	private JTextField textoFuente;
	private JTextField textoGeograficos;
	private JTextField textoDescripcionFisica;

	private JButton botonGuardarRevista;
	private JButton cancelar;

	public VentanaCrearRevista() {
		inicializarCrearRevista();
	}

	public void inicializarCrearRevista() {
		this.setTitle("Creación revista");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		labelAutor = new JLabel("Ingrese el autor:");
		labelAutor.setBounds(50, 50, 180, 30);
		this.add(labelAutor);

		textoAutor = new JTextField();
		textoAutor.setBounds(300, 50, 400, 30);
		this.add(textoAutor);

		labelFuente = new JLabel("Ingrese la fuente de la revista:");
		labelFuente.setBounds(50, 100, 220, 30);
		this.add(labelFuente);

		textoFuente = new JTextField();
		textoFuente.setBounds(300, 100, 400, 30);
		this.add(textoFuente);

		labelGeograficos = new JLabel("Ingrese los términos geográficos:");
		labelGeograficos.setBounds(50, 150, 250, 30);
		this.add(labelGeograficos);

		textoGeograficos = new JTextField();
		textoGeograficos.setBounds(300, 150, 400, 30);
		this.add(textoGeograficos);

		labelDescripcionFisica = new JLabel("Ingrese la descripción física de la revista:");
		labelDescripcionFisica.setBounds(50, 200, 300, 30);
		this.add(labelDescripcionFisica);

		textoDescripcionFisica = new JTextField();
		textoDescripcionFisica.setBounds(350, 200, 400, 30);
		this.add(textoDescripcionFisica);

		botonGuardarRevista = new JButton("Guardar revista");
		botonGuardarRevista.setBackground(Color.decode("#E8F5E9"));
		botonGuardarRevista.setBounds(300, 260, 180, 40);
		this.add(botonGuardarRevista);
		
		cancelar = new JButton("Cancelar");
		cancelar.setBackground(Color.decode("#E8F5E9"));
		cancelar.setBounds(500, 260, 180, 40);
		this.add(cancelar);
	}

	public JLabel getLabelAutor() {
		return labelAutor;
	}

	public void setLabelAutor(JLabel labelAutor) {
		this.labelAutor = labelAutor;
	}

	public JLabel getLabelFuente() {
		return labelFuente;
	}

	public void setLabelFuente(JLabel labelFuente) {
		this.labelFuente = labelFuente;
	}

	public JLabel getLabelGeograficos() {
		return labelGeograficos;
	}

	public void setLabelGeograficos(JLabel labelGeograficos) {
		this.labelGeograficos = labelGeograficos;
	}

	public JLabel getLabelDescripcionFisica() {
		return labelDescripcionFisica;
	}

	public void setLabelDescripcionFisica(JLabel labelDescripcionFisica) {
		this.labelDescripcionFisica = labelDescripcionFisica;
	}

	public JTextField getTextoAutor() {
		return textoAutor;
	}

	public void setTextoAutor(JTextField textoAutor) {
		this.textoAutor = textoAutor;
	}

	public JTextField getTextoFuente() {
		return textoFuente;
	}

	public void setTextoFuente(JTextField textoFuente) {
		this.textoFuente = textoFuente;
	}

	public JTextField getTextoGeograficos() {
		return textoGeograficos;
	}

	public void setTextoGeograficos(JTextField textoGeograficos) {
		this.textoGeograficos = textoGeograficos;
	}

	public JTextField getTextoDescripcionFisica() {
		return textoDescripcionFisica;
	}

	public void setTextoDescripcionFisica(JTextField textoDescripcionFisica) {
		this.textoDescripcionFisica = textoDescripcionFisica;
	}

	public JButton getBotonGuardarRevista() {
		return botonGuardarRevista;
	}

	public void setBotonGuardarRevista(JButton botonGuardarRevista) {
		this.botonGuardarRevista = botonGuardarRevista;
	}

	public JButton getBotonCancelar() {
		return cancelar;
	}

	public void setBotonCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}
	
	
	
	
}
