package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarRevista extends JFrame {

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

	private JLabel labelDescripcionFisica;
	private JTextField textoDescripcionFisica;

	private JButton botonActualizar;
	private JButton botonCancelar;

	public VentanaActualizarRevista() {
		setTitle("Actualizar Revista");
		setBounds(10, 10, 600, 550);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);

		labelTitulo = new JLabel("Título:");
		labelTitulo.setBounds(50, 20, 120, 30);
		this.add(labelTitulo);

		textoTitulo = new JTextField();
		textoTitulo.setBounds(180, 20, 200, 30);
		this.add(textoTitulo);

		labelClasificacion = new JLabel("Clasificación:");
		labelClasificacion.setBounds(50, 60, 120, 30);
		this.add(labelClasificacion);

		textoClasificacion = new JTextField();
		textoClasificacion.setBounds(180, 60, 200, 30);
		this.add(textoClasificacion);

		labelFacultad = new JLabel("Facultad:");
		labelFacultad.setBounds(50, 100, 120, 30);
		this.add(labelFacultad);

		textoFacultad = new JTextField();
		textoFacultad.setBounds(180, 100, 200, 30);
		this.add(textoFacultad);

		labelFechaDePublicacion = new JLabel("Fecha de Publicación:");
		labelFechaDePublicacion.setBounds(50, 140, 150, 30);
		this.add(labelFechaDePublicacion);

		textoFechaDePublicacion = new JTextField();
		textoFechaDePublicacion.setBounds(200, 140, 200, 30);
		this.add(textoFechaDePublicacion);

		labelIdioma = new JLabel("Idioma:");
		labelIdioma.setBounds(50, 180, 120, 30);
		this.add(labelIdioma);

		textoIdioma = new JTextField();
		textoIdioma.setBounds(180, 180, 200, 30);
		this.add(textoIdioma);

		labelAutor = new JLabel("Autor:");
		labelAutor.setBounds(50, 220, 120, 30);
		this.add(labelAutor);

		textoAutor = new JTextField();
		textoAutor.setBounds(180, 220, 200, 30);
		this.add(textoAutor);

		labelFuente = new JLabel("Fuente:");
		labelFuente.setBounds(50, 260, 120, 30);
		this.add(labelFuente);

		textoFuente = new JTextField();
		textoFuente.setBounds(180, 260, 200, 30);
		this.add(textoFuente);

		labelTerminosGeograficos = new JLabel("Términos Geográficos:");
		labelTerminosGeograficos.setBounds(50, 300, 150, 30);
		this.add(labelTerminosGeograficos);

		textoTerminosGeograficos = new JTextField();
		textoTerminosGeograficos.setBounds(200, 300, 200, 30);
		this.add(textoTerminosGeograficos);

		labelDescripcionFisica = new JLabel("Descripción Física:");
		labelDescripcionFisica.setBounds(50, 340, 150, 30);
		this.add(labelDescripcionFisica);

		textoDescripcionFisica = new JTextField();
		textoDescripcionFisica.setBounds(200, 340, 200, 30);
		this.add(textoDescripcionFisica);

		botonActualizar = new JButton("Actualizar");
		botonActualizar.setBounds(200, 470, 180, 40);
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

	public JLabel getLabelDescripcionFisica() {
		return labelDescripcionFisica;
	}

	public void setLabelDescripcionFisica(JLabel labelDescripcionFisica) {
		this.labelDescripcionFisica = labelDescripcionFisica;
	}

	public JTextField getTextoDescripcionFisica() {
		return textoDescripcionFisica;
	}

	public void setTextoDescripcionFisica(JTextField textoDescripcionFisica) {
		this.textoDescripcionFisica = textoDescripcionFisica;
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
