package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaCrear extends JFrame {

	
	private JLabel labelPublicacion;
	private JLabel labelTituloPublicacion;
	private JLabel labelClasificacion;
	private JLabel labelFacultad;
	private JLabel labelFecha;
	private JLabel labelIdioma;
	
	private JTextField textoPublicacion;
	private JTextField textoTituloPublicacion;
	private JTextField textoClasificacion;
	private JTextField textoFacultad;
	private JTextField textoFecha;
	private JTextField textoIdioma;
	
	private JTextArea menuCreacion;
	
	private JButton botonCrearPelicula;
	private JButton botonCrearArticulo;
	private JButton botonCrearRevista;
	private JButton botonCrearJuego4Prot;
	private JButton botonCrearLibroFisico;
	private JButton botonCrearLibroVirtual;
	
	public VentanaCrear() {
		inicializarCrear();
	}
	
	public void inicializarCrear() {
		setTitle("Menú de Creación");
	    setBounds(10, 10, 1280, 800);
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(null);

	    labelPublicacion = new JLabel("Publicación:");
	    labelPublicacion.setBounds(50, 50, 150, 30);
	    add(labelPublicacion);

	    textoPublicacion = new JTextField();
	    textoPublicacion.setBounds(200, 50, 200, 30);
	    add(textoPublicacion);

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

	    labelFecha = new JLabel("Fecha:");
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

	    menuCreacion = new JTextArea(
	        "1. Crear Película\n" +
	        "2. Crear Artículo\n" +
	        "3. Crear Revista\n" +
	        "4. Crear Juego 4 Prot\n" +
	        "5. Crear Libro Físico\n" +
	        "6. Crear Libro Virtual"
	    );
	    menuCreacion.setBounds(500, 50, 300, 150);
	    add(menuCreacion);

	    botonCrearPelicula = new JButton("Crear Película");
	    botonCrearPelicula.setBounds(500, 250, 200, 30);
	    add(botonCrearPelicula);

	    botonCrearArticulo = new JButton("Crear Artículo");
	    botonCrearArticulo.setBounds(500, 300, 200, 30);
	    add(botonCrearArticulo);

	    botonCrearRevista = new JButton("Crear Revista");
	    botonCrearRevista.setBounds(500, 350, 200, 30);
	    add(botonCrearRevista);

	    botonCrearJuego4Prot = new JButton("Crear Juego 4 Prot");
	    botonCrearJuego4Prot.setBounds(500, 400, 200, 30);
	    add(botonCrearJuego4Prot);

	    botonCrearLibroFisico = new JButton("Crear Libro Físico");
	    botonCrearLibroFisico.setBounds(500, 450, 200, 30);
	    add(botonCrearLibroFisico);

	    botonCrearLibroVirtual = new JButton("Crear Libro Virtual");
	    botonCrearLibroVirtual.setBounds(500, 500, 200, 30);
	    add(botonCrearLibroVirtual);
	}

	public JLabel getLabelPublicacion() {
		return labelPublicacion;
	}

	public void setLabelPublicacion(JLabel labelPublicacion) {
		this.labelPublicacion = labelPublicacion;
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

	public JTextField getTextoPublicacion() {
		return textoPublicacion;
	}

	public void setTextoPublicacion(JTextField textoPublicacion) {
		this.textoPublicacion = textoPublicacion;
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

	public JTextArea getMenuCreacion() {
		return menuCreacion;
	}

	public void setMenuCreacion(JTextArea menuCreacion) {
		this.menuCreacion = menuCreacion;
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

	public JButton getBotonCrearJuego4Prot() {
		return botonCrearJuego4Prot;
	}

	public void setBotonCrearJuego4Prot(JButton botonCrearJuego4Prot) {
		this.botonCrearJuego4Prot = botonCrearJuego4Prot;
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
