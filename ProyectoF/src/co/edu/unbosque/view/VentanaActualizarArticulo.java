package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarArticulo extends JFrame {

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

	private JLabel labelAutor;
	private JTextField textoAutor;

	private JLabel labelFuente;
	private JTextField textoFuente;

	private JLabel labelTerminosGeograficos;
	private JTextField textoTerminosGeograficos;

	private JLabel labelCantidadDePaginas;
	private JTextField textoCantidadDePaginas;

	private JButton botonActualizar;
	private JButton botonCancelar;

	public VentanaActualizarArticulo() {
		setTitle("Actualizar Artículo");
		setBounds(10, 10, 600, 500);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);

		labelTitulo = new JLabel("Título:");
		labelTitulo.setBounds(50, 20, 150, 30);
		this.add(labelTitulo);

		textoTitulo = new JTextField();
		textoTitulo.setBounds(200, 20, 200, 30);
		this.add(textoTitulo);

		labelClasificacion = new JLabel("Clasificación:");
		labelClasificacion.setBounds(50, 60, 150, 30);
		this.add(labelClasificacion);

		textoClasificacion = new JTextField();
		textoClasificacion.setBounds(200, 60, 200, 30);
		this.add(textoClasificacion);

		labelFacultad = new JLabel("Facultad:");
		labelFacultad.setBounds(50, 100, 150, 30);
		this.add(labelFacultad);

		textoFacultad = new JTextField();
		textoFacultad.setBounds(200, 100, 200, 30);
		this.add(textoFacultad);

		labelFechaDePublicacion = new JLabel("Fecha de Publicación:");
		labelFechaDePublicacion.setBounds(50, 140, 150, 30);
		this.add(labelFechaDePublicacion);

		textoFechaDePublicacion = new JTextField();
		textoFechaDePublicacion.setBounds(200, 140, 200, 30);
		this.add(textoFechaDePublicacion);

		labelIdioma = new JLabel("Idioma:");
		labelIdioma.setBounds(50, 180, 150, 30);
		this.add(labelIdioma);

		textoIdioma = new JTextField();
		textoIdioma.setBounds(200, 180, 200, 30);
		this.add(textoIdioma);

		labelAutor = new JLabel("Autor:");
		labelAutor.setBounds(50, 220, 150, 30);
		this.add(labelAutor);

		textoAutor = new JTextField();
		textoAutor.setBounds(200, 220, 200, 30);
		this.add(textoAutor);

		labelFuente = new JLabel("Fuente:");
		labelFuente.setBounds(50, 260, 150, 30);
		this.add(labelFuente);

		textoFuente = new JTextField();
		textoFuente.setBounds(200, 260, 200, 30);
		this.add(textoFuente);

		labelTerminosGeograficos = new JLabel("Términos Geográficos:");
		labelTerminosGeograficos.setBounds(50, 300, 150, 30);
		this.add(labelTerminosGeograficos);

		textoTerminosGeograficos = new JTextField();
		textoTerminosGeograficos.setBounds(200, 300, 200, 30);
		this.add(textoTerminosGeograficos);

		labelCantidadDePaginas = new JLabel("Cantidad de Páginas:");
		labelCantidadDePaginas.setBounds(50, 340, 150, 30);
		this.add(labelCantidadDePaginas);

		textoCantidadDePaginas = new JTextField();
		textoCantidadDePaginas.setBounds(200, 340, 200, 30);
		this.add(textoCantidadDePaginas);

		botonActualizar = new JButton("Actualizar");
		botonActualizar.setBounds(200, 420, 180, 40);
		add(botonActualizar);
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(180, 110, 100, 30);
		this.add(botonCancelar);

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

	public JLabel getLabelFuente() {
		return labelFuente;
	}

	public void setLabelFuente(JLabel labelFuente) {
		this.labelFuente = labelFuente;
	}

	public JTextField getTextoFuente() {
		return textoFuente;
	}

	public void setTextoFuente(JTextField textoFuente) {
		this.textoFuente = textoFuente;
	}

	public JLabel getLabelTerminosGeograficos() {
		return labelTerminosGeograficos;
	}

	public void setLabelTerminosGeograficos(JLabel labelTerminosGeograficos) {
		this.labelTerminosGeograficos = labelTerminosGeograficos;
	}

	public JTextField getTextoTerminosGeograficos() {
		return textoTerminosGeograficos;
	}

	public void setTextoTerminosGeograficos(JTextField textoTerminosGeograficos) {
		this.textoTerminosGeograficos = textoTerminosGeograficos;
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

	public JButton getBotonActualizar() {
		return botonActualizar;
	}

	public void setBotonActualizar(JButton botonActualizar) {
		this.botonActualizar = botonActualizar;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
	}
	
	

}
