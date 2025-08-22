package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarLibroFisico extends JFrame {
	private JLabel labelTitulo;
	private JTextField textoTitulo;

	private JLabel labelClasificacion;
	private JTextField textoClasificacion;

	private JLabel labelFacultad;
	private JTextField textoFacultad;

	private JLabel labelFechaDePublicacion;
	private JTextField textoFechaDePublicacion;

	private JLabel labelIdioma;
	private JTextField textoIdioma;

	private JLabel labelCantidadDePaginas;
	private JTextField textoCantidadDePaginas;

	private JLabel labelAutor;
	private JTextField textoAutor;

	private JLabel labelEditorial;
	private JTextField textoEditorial;

	private JLabel labelCantidadDeCopias;
	private JTextField textoCantidadDeCopias;

	private JLabel labelTiempoDePrestamo;
	private JTextField textoTiempoDePrestamo;

	private JButton botonActualizar;

	public VentanaActualizarLibroFisico() {
		this.setTitle("Actualizar Libro Físico");
		this.setBounds(10, 10, 600, 550);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		labelTitulo = new JLabel("Título:");
		labelTitulo.setBounds(50, 60, 100, 30);
		this.add(labelTitulo);

		textoTitulo = new JTextField();
		textoTitulo.setBounds(160, 60, 150, 30);
		this.add(textoTitulo);

		labelClasificacion = new JLabel("Clasificación:");
		labelClasificacion.setBounds(50, 100, 100, 30);
		this.add(labelClasificacion);

		textoClasificacion = new JTextField();
		textoClasificacion.setBounds(160, 100, 150, 30);
		this.add(textoClasificacion);

		labelFacultad = new JLabel("Facultad:");
		labelFacultad.setBounds(50, 140, 100, 30);
		this.add(labelFacultad);

		textoFacultad = new JTextField();
		textoFacultad.setBounds(160, 140, 150, 30);
		this.add(textoFacultad);

		labelFechaDePublicacion = new JLabel("Fecha de Publicación:");
		labelFechaDePublicacion.setBounds(50, 180, 150, 30);
		this.add(labelFechaDePublicacion);

		textoFechaDePublicacion = new JTextField();
		textoFechaDePublicacion.setBounds(200, 180, 150, 30);
		this.add(textoFechaDePublicacion);

		labelIdioma = new JLabel("Idioma:");
		labelIdioma.setBounds(50, 220, 100, 30);
		this.add(labelIdioma);

		textoIdioma = new JTextField();
		textoIdioma.setBounds(160, 220, 150, 30);
		this.add(textoIdioma);

		labelCantidadDePaginas = new JLabel("Cantidad de Páginas:");
		labelCantidadDePaginas.setBounds(50, 260, 150, 30);
		this.add(labelCantidadDePaginas);

		textoCantidadDePaginas = new JTextField();
		textoCantidadDePaginas.setBounds(200, 260, 150, 30);
		this.add(textoCantidadDePaginas);

		labelAutor = new JLabel("Autor:");
		labelAutor.setBounds(50, 300, 100, 30);
		this.add(labelAutor);

		textoAutor = new JTextField();
		textoAutor.setBounds(160, 300, 150, 30);
		this.add(textoAutor);

		labelEditorial = new JLabel("Editorial:");
		labelEditorial.setBounds(50, 340, 100, 30);
		this.add(labelEditorial);

		textoEditorial = new JTextField();
		textoEditorial.setBounds(160, 340, 150, 30);
		this.add(textoEditorial);

		labelCantidadDeCopias = new JLabel("Cantidad de Copias:");
		labelCantidadDeCopias.setBounds(50, 380, 150, 30);
		this.add(labelCantidadDeCopias);

		textoCantidadDeCopias = new JTextField();
		textoCantidadDeCopias.setBounds(200, 380, 150, 30);
		this.add(textoCantidadDeCopias);

		labelTiempoDePrestamo = new JLabel("Tiempo de Préstamo:");
		labelTiempoDePrestamo.setBounds(50, 420, 150, 30);
		this.add(labelTiempoDePrestamo);

		textoTiempoDePrestamo = new JTextField();
		textoTiempoDePrestamo.setBounds(200, 420, 150, 30);
		this.add(textoTiempoDePrestamo);

		botonActualizar = new JButton("Actualizar");
		botonActualizar.setBounds(200, 470, 180, 40);
		add(botonActualizar);
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

	public JLabel getLabelFechaDePublicacion() {
		return labelFechaDePublicacion;
	}

	public void setLabelFechaDePublicacion(JLabel labelFechaDePublicacion) {
		this.labelFechaDePublicacion = labelFechaDePublicacion;
	}

	public JTextField getTextoFechaDePublicacion() {
		return textoFechaDePublicacion;
	}

	public void setTextoFechaDePublicacion(JTextField textoFechaDePublicacion) {
		this.textoFechaDePublicacion = textoFechaDePublicacion;
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

	public JLabel getLabelCantidadDePaginas() {
		return labelCantidadDePaginas;
	}

	public void setLabelCantidadDePaginas(JLabel labelCantidadDePaginas) {
		this.labelCantidadDePaginas = labelCantidadDePaginas;
	}

	public JTextField getTextoCantidadDePaginas() {
		return textoCantidadDePaginas;
	}

	public void setTextoCantidadDePaginas(JTextField textoCantidadDePaginas) {
		this.textoCantidadDePaginas = textoCantidadDePaginas;
	}

	public JLabel getLabelAutor() {
		return labelAutor;
	}

	public void setLabelAutor(JLabel labelAutor) {
		this.labelAutor = labelAutor;
	}

	public JTextField getTextoAutor() {
		return textoAutor;
	}

	public void setTextoAutor(JTextField textoAutor) {
		this.textoAutor = textoAutor;
	}

	public JLabel getLabelEditorial() {
		return labelEditorial;
	}

	public void setLabelEditorial(JLabel labelEditorial) {
		this.labelEditorial = labelEditorial;
	}

	public JTextField getTextoEditorial() {
		return textoEditorial;
	}

	public void setTextoEditorial(JTextField textoEditorial) {
		this.textoEditorial = textoEditorial;
	}

	public JLabel getLabelCantidadDeCopias() {
		return labelCantidadDeCopias;
	}

	public void setLabelCantidadDeCopias(JLabel labelCantidadDeCopias) {
		this.labelCantidadDeCopias = labelCantidadDeCopias;
	}

	public JTextField getTextoCantidadDeCopias() {
		return textoCantidadDeCopias;
	}

	public void setTextoCantidadDeCopias(JTextField textoCantidadDeCopias) {
		this.textoCantidadDeCopias = textoCantidadDeCopias;
	}

	public JLabel getLabelTiempoDePrestamo() {
		return labelTiempoDePrestamo;
	}

	public void setLabelTiempoDePrestamo(JLabel labelTiempoDePrestamo) {
		this.labelTiempoDePrestamo = labelTiempoDePrestamo;
	}

	public JTextField getTextoTiempoDePrestamo() {
		return textoTiempoDePrestamo;
	}

	public void setTextoTiempoDePrestamo(JTextField textoTiempoDePrestamo) {
		this.textoTiempoDePrestamo = textoTiempoDePrestamo;
	}

	public JButton getBotonActualizar() {
		return botonActualizar;
	}

	public void setBotonActualizar(JButton botonActualizar) {
		this.botonActualizar = botonActualizar;
	}

}
