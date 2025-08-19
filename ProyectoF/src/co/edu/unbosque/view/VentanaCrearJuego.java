package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearJuego extends JFrame {

	private JLabel labelDesarrolladora;
	private JLabel labelEditor;
	private JLabel labelGenero;

	private JTextField textoDesarrolladora;
	private JTextField textoEditor;
	private JTextField textoGenero;

	private JButton botonGuardarVideojuego;

	public VentanaCrearJuego() {
		inicializarCrearVideojuego();
	}

	public void inicializarCrearVideojuego() {
		this.setTitle("Creación videojuego");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(null);

		labelDesarrolladora = new JLabel("Ingrese la desarrolladora:");
		labelDesarrolladora.setBounds(50, 50, 200, 30);
		this.add(labelDesarrolladora);

		textoDesarrolladora = new JTextField();
		textoDesarrolladora.setBounds(300, 50, 400, 30);
		this.add(textoDesarrolladora);

		labelEditor = new JLabel("Ingrese el editor:");
		labelEditor.setBounds(50, 100, 200, 30);
		this.add(labelEditor);

		textoEditor = new JTextField();
		textoEditor.setBounds(300, 100, 400, 30);
		this.add(textoEditor);

		labelGenero = new JLabel("Ingrese el género:");
		labelGenero.setBounds(50, 150, 200, 30);
		this.add(labelGenero);

		textoGenero = new JTextField();
		textoGenero.setBounds(300, 150, 400, 30);
		this.add(textoGenero);

		botonGuardarVideojuego = new JButton("Guardar videojuego");
		botonGuardarVideojuego.setBounds(300, 210, 200, 40);
		this.add(botonGuardarVideojuego);
	}
}