package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaCrear extends JFrame {

	private JLabel labelId;
	private JLabel labelTituloPublicacion;
	private JLabel labelClasificacion;
	private JLabel labelFacultad;
	private JLabel labelFecha;
	private JLabel labelIdioma;
	
	private JTextField textoId;
	private JTextField textoTituloPublicacion;
	private JTextField textoClasificacion;
	private JTextField textoFacultad;
	private JTextField textoFecha;
	private JTextField textoIdioma;
	
	private JButton botonCrearPelicula;
	private JButton botonCrearArticulo;
	private JButton botonCrearRevista;
	private JButton botonCrearLibroFisico;
	private JButton botonCrearLibroVirtual;
	
	public VentanaCrear() {
		inicializarCrear();
	}
	
	public void inicializarCrear() {
		setTitle("Menú de Creación");
	    setBounds(10, 10, 1280, 800);
	    setResizable(false);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    setLayout(null);

	    labelId = new JLabel("Id (NUMEROS):");
	    labelId.setBounds(50, 50, 150, 30);
	    add(labelId);

	    textoId = new JTextField();
	    textoId.setBounds(200, 50, 200, 30);
	    add(textoId);

	    labelTituloPublicacion = new JLabel("Título:");
	    labelTituloPublicacion.setBounds(50, 100, 150, 30);
	    add(labelTituloPublicacion);

	    textoTituloPublicacion = new JTextField();
	    textoTituloPublicacion.setBounds(200, 100, 200, 30);
	    add(textoTituloPublicacion);

	    labelClasificacion = new JLabel("Clasificación:");
	    labelClasificacion.setBounds(50, 150, 150, 30);
	    add(labelClasificacion);

	    textoClasificacion = new JTextField();
	    textoClasificacion.setBounds(200, 150, 200, 30);
	    add(textoClasificacion);

	    labelFacultad = new JLabel("Facultad:");
	    labelFacultad.setBounds(50, 200, 150, 30);
	    add(labelFacultad);

	    textoFacultad = new JTextField();
	    textoFacultad.setBounds(200, 200, 200, 30);
	    add(textoFacultad);

	    labelFecha = new JLabel("Fecha (NUMEROS):");
	    labelFecha.setBounds(50, 250, 150, 30);
	    add(labelFecha);

	    textoFecha = new JTextField();
	    textoFecha.setBounds(200, 250, 200, 30);
	    add(textoFecha);

	    labelIdioma = new JLabel("Idioma:");
	    labelIdioma.setBounds(50, 300, 150, 30);
	    add(labelIdioma);

	    textoIdioma = new JTextField();
	    textoIdioma.setBounds(200, 300, 200, 30);
	    add(textoIdioma);

	    botonCrearPelicula = new JButton("Crear Película");
	    botonCrearPelicula.setBounds(500, 250, 200, 30);
	    add(botonCrearPelicula);

	    botonCrearArticulo = new JButton("Crear Artículo");
	    botonCrearArticulo.setBounds(500, 300, 200, 30);
	    add(botonCrearArticulo);

	    botonCrearRevista = new JButton("Crear Revista");
	    botonCrearRevista.setBounds(500, 350, 200, 30);
	    add(botonCrearRevista);

	    botonCrearLibroFisico = new JButton("Crear Libro Físico");
	    botonCrearLibroFisico.setBounds(500, 450, 200, 30);
	    add(botonCrearLibroFisico);

	    botonCrearLibroVirtual = new JButton("Crear Libro Virtual");
	    botonCrearLibroVirtual.setBounds(500, 500, 200, 30);
	    add(botonCrearLibroVirtual);
	}

	public JLabel getLabelId() {
		return labelId;
	}

	public void setLabelId(JLabel labelId) {
		this.labelId = labelId;
	}

	public JLabel getLabelTituloPublicacion() {
		return labelTituloPublicacion;
	}

	public void setLabelTituloPublicacion(JLabel labelTituloPublicacion) {
		this.labelTituloPublicacion = labelTituloPublicacion;
	}

	public JLabel getLabelClasificacion() {
		return labelClasificacion;
	}

	public void setLabelClasificacion(JLabel labelClasificacion) {
		this.labelClasificacion = labelClasificacion;
	}

	public JLabel getLabelFacultad() {
		return labelFacultad;
	}

	public void setLabelFacultad(JLabel labelFacultad) {
		this.labelFacultad = labelFacultad;
	}

	public JLabel getLabelFecha() {
		return labelFecha;
	}

	public void setLabelFecha(JLabel labelFecha) {
		this.labelFecha = labelFecha;
	}

	public JLabel getLabelIdioma() {
		return labelIdioma;
	}

	public void setLabelIdioma(JLabel labelIdioma) {
		this.labelIdioma = labelIdioma;
	}

	public JTextField getTextoId() {
		return textoId;
	}

	public void setTextoId(JTextField textoId) {
		this.textoId = textoId;
	}

	public JTextField getTextoTituloPublicacion() {
		return textoTituloPublicacion;
	}

	public void setTextoTituloPublicacion(JTextField textoTituloPublicacion) {
		this.textoTituloPublicacion = textoTituloPublicacion;
	}

	public JTextField getTextoClasificacion() {
		return textoClasificacion;
	}

	public void setTextoClasificacion(JTextField textoClasificacion) {
		this.textoClasificacion = textoClasificacion;
	}

	public JTextField getTextoFacultad() {
		return textoFacultad;
	}

	public void setTextoFacultad(JTextField textoFacultad) {
		this.textoFacultad = textoFacultad;
	}

	public JTextField getTextoFecha() {
		return textoFecha;
	}

	public void setTextoFecha(JTextField textoFecha) {
		this.textoFecha = textoFecha;
	}

	public JTextField getTextoIdioma() {
		return textoIdioma;
	}

	public void setTextoIdioma(JTextField textoIdioma) {
		this.textoIdioma = textoIdioma;
	}

	public JButton getBotonCrearPelicula() {
		return botonCrearPelicula;
	}

	public void setBotonCrearPelicula(JButton botonCrearPelicula) {
		this.botonCrearPelicula = botonCrearPelicula;
	}

	public JButton getBotonCrearArticulo() {
		return botonCrearArticulo;
	}

	public void setBotonCrearArticulo(JButton botonCrearArticulo) {
		this.botonCrearArticulo = botonCrearArticulo;
	}

	public JButton getBotonCrearRevista() {
		return botonCrearRevista;
	}

	public void setBotonCrearRevista(JButton botonCrearRevista) {
		this.botonCrearRevista = botonCrearRevista;
	}

	public JButton getBotonCrearLibroFisico() {
		return botonCrearLibroFisico;
	}

	public void setBotonCrearLibroFisico(JButton botonCrearLibroFisico) {
		this.botonCrearLibroFisico = botonCrearLibroFisico;
	}

	public JButton getBotonCrearLibroVirtual() {
		return botonCrearLibroVirtual;
	}

	public void setBotonCrearLibroVirtual(JButton botonCrearLibroVirtual) {
		this.botonCrearLibroVirtual = botonCrearLibroVirtual;
	}


}
