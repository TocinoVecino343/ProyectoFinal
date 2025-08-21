package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarPelicula extends JFrame {
	

	private JLabel labelTitulo;
	private JTextField textoTitulo;

	private JLabel labelDirector;
	private JTextField textoDirector;

	private JLabel labelGenero;
	private JTextField textoGenero;

	private JLabel labelClasificacion;
	private JTextField textoClasificacion;

	private JLabel labelFacultad;
	private JTextField textoFacultad;

	private JLabel labelFecha;
	private JTextField textoFecha;

	private JLabel labelIdioma;
	private JTextField textoIdioma;

	private JButton botonActualizar;

	public VentanaActualizarPelicula() {
		setTitle("Actualizar Película");
		setBounds(10, 10, 600, 500);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		
		labelTitulo = new JLabel("Título:");
		labelTitulo.setBounds(50, 70, 100, 30);
		add(labelTitulo);

		textoTitulo = new JTextField();
		textoTitulo.setBounds(160, 70, 270, 30);
		add(textoTitulo);

		labelDirector = new JLabel("Director:");
		labelDirector.setBounds(50, 120, 100, 30);
		add(labelDirector);

		textoDirector = new JTextField();
		textoDirector.setBounds(160, 120, 270, 30);
		add(textoDirector);

		labelGenero = new JLabel("Género:");
		labelGenero.setBounds(50, 170, 100, 30);
		add(labelGenero);

		textoGenero = new JTextField();
		textoGenero.setBounds(160, 170, 270, 30);
		add(textoGenero);

		labelClasificacion = new JLabel("Clasificación:");
		labelClasificacion.setBounds(50, 220, 100, 30);
		add(labelClasificacion);

		textoClasificacion = new JTextField();
		textoClasificacion.setBounds(160, 220, 270, 30);
		add(textoClasificacion);

		labelFacultad = new JLabel("Facultad:");
		labelFacultad.setBounds(50, 270, 100, 30);
		add(labelFacultad);

		textoFacultad = new JTextField();
		textoFacultad.setBounds(160, 270, 270, 30);
		add(textoFacultad);

		labelFecha = new JLabel("Fecha:");
		labelFecha.setBounds(50, 320, 100, 30);
		add(labelFecha);

		textoFecha = new JTextField();
		textoFecha.setBounds(160, 320, 270, 30);
		add(textoFecha);

		labelIdioma = new JLabel("Idioma:");
		labelIdioma.setBounds(50, 370, 100, 30);
		add(labelIdioma);

		textoIdioma = new JTextField();
		textoIdioma.setBounds(160, 370, 270, 30);
		add(textoIdioma);

		botonActualizar = new JButton("Actualizar Película");
		botonActualizar.setBounds(200, 420, 180, 40);
		add(botonActualizar);
		
		
	}

	