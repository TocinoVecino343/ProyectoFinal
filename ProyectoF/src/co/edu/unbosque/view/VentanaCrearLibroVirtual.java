package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearLibroVirtual extends JFrame {

	private JLabel labelTipoArchivo;
	private JLabel labelEsAudioLibro;

	private JTextField textoTipoArchivo;
	private JTextField textoEsAudioLibro;

	private JButton botonGuardarLibroVirtual;

	public VentanaCrearLibroVirtual() {
		inicializarCrearLibroVirtual();
	}

	public void inicializarCrearLibroVirtual() {
		this.setTitle("Creación archivo digital");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(null);

		labelTipoArchivo = new JLabel("Ingrese el tipo de archivo:");
		labelTipoArchivo.setBounds(50, 50, 200, 30);
		this.add(labelTipoArchivo);

		textoTipoArchivo = new JTextField();
		textoTipoArchivo.setBounds(300, 50, 400, 30);
		this.add(textoTipoArchivo);

		labelEsAudioLibro = new JLabel("¿Es audiolibro? (Si / No):");
		labelEsAudioLibro.setBounds(50, 100, 250, 30);
		this.add(labelEsAudioLibro);

		textoEsAudioLibro = new JTextField();
		textoEsAudioLibro.setBounds(300, 100, 150, 30);
		this.add(textoEsAudioLibro);

		botonGuardarLibroVirtual = new JButton("Guardar archivo digital");
		botonGuardarLibroVirtual.setBounds(250, 160, 220, 40);
		this.add(botonGuardarLibroVirtual);
	}

	public JLabel getLabelTipoArchivo() {
		return labelTipoArchivo;
	}

	public void setLabelTipoArchivo(JLabel labelTipoArchivo) {
		this.labelTipoArchivo = labelTipoArchivo;
	}

	public JLabel getLabelEsAudioLibro() {
		return labelEsAudioLibro;
	}

	public void setLabelEsAudioLibro(JLabel labelEsAudioLibro) {
		this.labelEsAudioLibro = labelEsAudioLibro;
	}

	public JTextField getTextoTipoArchivo() {
		return textoTipoArchivo;
	}

	public void setTextoTipoArchivo(JTextField textoTipoArchivo) {
		this.textoTipoArchivo = textoTipoArchivo;
	}

	public JTextField getTextoEsAudioLibro() {
		return textoEsAudioLibro;
	}

	public void setTextoEsAudioLibro(JTextField textoEsAudioLibro) {
		this.textoEsAudioLibro = textoEsAudioLibro;
	}

	public JButton getBotonGuardarLibroVirtual() {
		return botonGuardarLibroVirtual;
	}

	public void setBotonGuardarLibroVirtual(JButton botonGuardarLibroVirtual) {
		this.botonGuardarLibroVirtual = botonGuardarLibroVirtual;
	}

}