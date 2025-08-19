package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarPelicula extends JFrame {

	private JLabel labelIdBuscar;
	private JTextField textoIdBuscar;
	private JButton botonBuscar;

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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		labelIdBuscar = new JLabel("ID Película:");
		labelIdBuscar.setBounds(50, 20, 100, 30);
		add(labelIdBuscar);

		textoIdBuscar = new JTextField();
		textoIdBuscar.setBounds(160, 20, 150, 30);
		add(textoIdBuscar);

		botonBuscar = new JButton("Buscar");
		botonBuscar.setBounds(330, 20, 100, 30);
		add(botonBuscar);

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

	public JLabel getLabelIdBuscar() {
		return labelIdBuscar;
	}

	public void setLabelIdBuscar(JLabel labelIdBuscar) {
		this.labelIdBuscar = labelIdBuscar;
	}

	public JTextField getTextoIdBuscar() {
		return textoIdBuscar;
	}

	public void setTextoIdBuscar(JTextField textoIdBuscar) {
		this.textoIdBuscar = textoIdBuscar;
	}

	public JButton getBotonBuscar() {
		return botonBuscar;
	}

	public void setBotonBuscar(JButton botonBuscar) {
		this.botonBuscar = botonBuscar;
	}

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JTextField getTextoTitulo() {
		return textoTitulo;
	}

	public void setTextoTitulo(JTextField textoTitulo) {
		this.textoTitulo = textoTitulo;
	}

	public JLabel getLabelDirector() {
		return labelDirector;
	}

	public void setLabelDirector(JLabel labelDirector) {
		this.labelDirector = labelDirector;
	}

	public JTextField getTextoDirector() {
		return textoDirector;
	}

	public void setTextoDirector(JTextField textoDirector) {
		this.textoDirector = textoDirector;
	}

	public JLabel getLabelGenero() {
		return labelGenero;
	}

	public void setLabelGenero(JLabel labelGenero) {
		this.labelGenero = labelGenero;
	}

	public JTextField getTextoGenero() {
		return textoGenero;
	}

	public void setTextoGenero(JTextField textoGenero) {
		this.textoGenero = textoGenero;
	}

	public JLabel getLabelClasificacion() {
		return labelClasificacion;
	}

	public void setLabelClasificacion(JLabel labelClasificacion) {
		this.labelClasificacion = labelClasificacion;
	}

	public JTextField getTextoClasificacion() {
		return textoClasificacion;
	}

	public void setTextoClasificacion(JTextField textoClasificacion) {
		this.textoClasificacion = textoClasificacion;
	}

	public JLabel getLabelFacultad() {
		return labelFacultad;
	}

	public void setLabelFacultad(JLabel labelFacultad) {
		this.labelFacultad = labelFacultad;
	}

	public JTextField getTextoFacultad() {
		return textoFacultad;
	}

	public void setTextoFacultad(JTextField textoFacultad) {
		this.textoFacultad = textoFacultad;
	}

	public JLabel getLabelFecha() {
		return labelFecha;
	}

	public void setLabelFecha(JLabel labelFecha) {
		this.labelFecha = labelFecha;
	}

	public JTextField getTextoFecha() {
		return textoFecha;
	}

	public void setTextoFecha(JTextField textoFecha) {
		this.textoFecha = textoFecha;
	}

	public JLabel getLabelIdioma() {
		return labelIdioma;
	}

	public void setLabelIdioma(JLabel labelIdioma) {
		this.labelIdioma = labelIdioma;
	}

	public JTextField getTextoIdioma() {
		return textoIdioma;
	}

	public void setTextoIdioma(JTextField textoIdioma) {
		this.textoIdioma = textoIdioma;
	}

	public JButton getBotonActualizar() {
		return botonActualizar;
	}

	public void setBotonActualizar(JButton botonActualizar) {
		this.botonActualizar = botonActualizar;
	}

}
