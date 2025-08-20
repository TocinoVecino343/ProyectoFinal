package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarLibroFisico extends JFrame {

	private JLabel labelIdBuscar, labelTitulo, labelAutor, labelEditorial, labelPaginas, labelClasificacion,
			labelFacultad, labelFecha, labelIdioma;
	private JTextField textoIdBuscar, textoTitulo, textoAutor, textoEditorial, textoPaginas, textoClasificacion,
			textoFacultad, textoFecha, textoIdioma;
	private JButton botonBuscar, botonActualizar;

	public VentanaActualizarLibroFisico() {
		setTitle("Actualizar Libro Físico");
		setBounds(10, 10, 600, 550);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		labelIdBuscar = new JLabel("ID Libro:");
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

		labelAutor = new JLabel("Autor:");
		labelAutor.setBounds(50, 120, 100, 30);
		add(labelAutor);

		textoAutor = new JTextField();
		textoAutor.setBounds(160, 120, 270, 30);
		add(textoAutor);

		labelEditorial = new JLabel("Editorial:");
		labelEditorial.setBounds(50, 170, 100, 30);
		add(labelEditorial);

		textoEditorial = new JTextField();
		textoEditorial.setBounds(160, 170, 270, 30);
		add(textoEditorial);

		labelPaginas = new JLabel("Páginas:");
		labelPaginas.setBounds(50, 220, 100, 30);
		add(labelPaginas);

		textoPaginas = new JTextField();
		textoPaginas.setBounds(160, 220, 270, 30);
		add(textoPaginas);

		labelClasificacion = new JLabel("Clasificación:");
		labelClasificacion.setBounds(50, 270, 100, 30);
		add(labelClasificacion);

		textoClasificacion = new JTextField();
		textoClasificacion.setBounds(160, 270, 270, 30);
		add(textoClasificacion);

		labelFacultad = new JLabel("Facultad:");
		labelFacultad.setBounds(50, 320, 100, 30);
		add(labelFacultad);

		textoFacultad = new JTextField();
		textoFacultad.setBounds(160, 320, 270, 30);
		add(textoFacultad);

		labelFecha = new JLabel("Fecha:");
		labelFecha.setBounds(50, 370, 100, 30);
		add(labelFecha);

		textoFecha = new JTextField();
		textoFecha.setBounds(160, 370, 270, 30);
		add(textoFecha);

		labelIdioma = new JLabel("Idioma:");
		labelIdioma.setBounds(50, 420, 100, 30);
		add(labelIdioma);

		textoIdioma = new JTextField();
		textoIdioma.setBounds(160, 420, 270, 30);
		add(textoIdioma);

		botonActualizar = new JButton("Actualizar");
		botonActualizar.setBounds(200, 470, 180, 40);
		add(botonActualizar);
	}

	public JLabel getLabelIdBuscar() {
		return labelIdBuscar;
	}

	public void setLabelIdBuscar(JLabel labelIdBuscar) {
		this.labelIdBuscar = labelIdBuscar;
	}

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JLabel getLabelAutor() {
		return labelAutor;
	}

	public void setLabelAutor(JLabel labelAutor) {
		this.labelAutor = labelAutor;
	}

	public JLabel getLabelEditorial() {
		return labelEditorial;
	}

	public void setLabelEditorial(JLabel labelEditorial) {
		this.labelEditorial = labelEditorial;
	}

	public JLabel getLabelPaginas() {
		return labelPaginas;
	}

	public void setLabelPaginas(JLabel labelPaginas) {
		this.labelPaginas = labelPaginas;
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

	public JTextField getTextoIdBuscar() {
		return textoIdBuscar;
	}

	public void setTextoIdBuscar(JTextField textoIdBuscar) {
		this.textoIdBuscar = textoIdBuscar;
	}

	public JTextField getTextoTitulo() {
		return textoTitulo;
	}

	public void setTextoTitulo(JTextField textoTitulo) {
		this.textoTitulo = textoTitulo;
	}

	public JTextField getTextoAutor() {
		return textoAutor;
	}

	public void setTextoAutor(JTextField textoAutor) {
		this.textoAutor = textoAutor;
	}

	public JTextField getTextoEditorial() {
		return textoEditorial;
	}

	public void setTextoEditorial(JTextField textoEditorial) {
		this.textoEditorial = textoEditorial;
	}

	public JTextField getTextoPaginas() {
		return textoPaginas;
	}

	public void setTextoPaginas(JTextField textoPaginas) {
		this.textoPaginas = textoPaginas;
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

	public JButton getBotonBuscar() {
		return botonBuscar;
	}

	public void setBotonBuscar(JButton botonBuscar) {
		this.botonBuscar = botonBuscar;
	}

	public JButton getBotonActualizar() {
		return botonActualizar;
	}

	public void setBotonActualizar(JButton botonActualizar) {
		this.botonActualizar = botonActualizar;
	}

}
