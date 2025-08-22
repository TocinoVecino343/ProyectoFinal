package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarLibroVirtual extends JFrame {

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

	private JLabel labelTipoDeArchivo;
	private JTextField textoTipoDeArchivo;

	private JLabel labelEsAudioLibro;
	private JTextField textoEsAudioLibro;

	private JButton botonActualizar;
	private JButton botonCancelar;


	public VentanaActualizarLibroVirtual() {
		this.setTitle("Actualizar Libro Virtual");
		this.setBounds(10, 10, 600, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		// --- ORDEN CORRECTO DESDE ARRIBA HACIA ABAJO ---
		labelTipoDeArchivo = new JLabel("Tipo de Archivo:");
		labelTipoDeArchivo.setBounds(50, 20, 150, 30);
		this.add(labelTipoDeArchivo);

		textoTipoDeArchivo = new JTextField();
		textoTipoDeArchivo.setBounds(200, 20, 200, 30);
		this.add(textoTipoDeArchivo);

		labelEsAudioLibro = new JLabel("Es AudioLibro:");
		labelEsAudioLibro.setBounds(50, 60, 150, 30);
		this.add(labelEsAudioLibro);

		textoEsAudioLibro = new JTextField();
		textoEsAudioLibro.setBounds(200, 60, 200, 30);
		this.add(textoEsAudioLibro);

		labelTitulo = new JLabel("Título:");
		labelTitulo.setBounds(50, 100, 100, 30);
		this.add(labelTitulo);

		textoTitulo = new JTextField();
		textoTitulo.setBounds(200, 100, 200, 30);
		this.add(textoTitulo);

		labelClasificacion = new JLabel("Clasificación:");
		labelClasificacion.setBounds(50, 140, 100, 30);
		this.add(labelClasificacion);

		textoClasificacion = new JTextField();
		textoClasificacion.setBounds(200, 140, 200, 30);
		this.add(textoClasificacion);

		labelFacultad = new JLabel("Facultad:");
		labelFacultad.setBounds(50, 180, 100, 30);
		this.add(labelFacultad);

		textoFacultad = new JTextField();
		textoFacultad.setBounds(200, 180, 200, 30);
		this.add(textoFacultad);

		labelFechaDePublicacion = new JLabel("Fecha de Publicación:");
		labelFechaDePublicacion.setBounds(50, 220, 150, 30);
		this.add(labelFechaDePublicacion);

		textoFechaDePublicacion = new JTextField();
		textoFechaDePublicacion.setBounds(200, 220, 200, 30);
		this.add(textoFechaDePublicacion);

		labelIdioma = new JLabel("Idioma:");
		labelIdioma.setBounds(50, 260, 100, 30);
		this.add(labelIdioma);

		textoIdioma = new JTextField();
		textoIdioma.setBounds(200, 260, 200, 30);
		this.add(textoIdioma);

		labelCantidadDePaginas = new JLabel("Cantidad de Páginas:");
		labelCantidadDePaginas.setBounds(50, 300, 150, 30);
		this.add(labelCantidadDePaginas);

		textoCantidadDePaginas = new JTextField();
		textoCantidadDePaginas.setBounds(200, 300, 200, 30);
		this.add(textoCantidadDePaginas);

		labelAutor = new JLabel("Autor:");
		labelAutor.setBounds(50, 340, 100, 30);
		this.add(labelAutor);

		textoAutor = new JTextField();
		textoAutor.setBounds(200, 340, 200, 30);
		this.add(textoAutor);

		labelEditorial = new JLabel("Editorial:");
		labelEditorial.setBounds(50, 380, 100, 30);
		this.add(labelEditorial);

		textoEditorial = new JTextField();
		textoEditorial.setBounds(200, 380, 200, 30);
		this.add(textoEditorial);

		
		botonActualizar = new JButton("Actualizar");
		botonActualizar.setBounds(100, 400, 100, 40);
		this.add(botonActualizar);
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(250, 400, 100, 40);
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

	public JLabel getLabelTipoDeArchivo() {
		return labelTipoDeArchivo;
	}

	public void setLabelTipoDeArchivo(JLabel labelTipoDeArchivo) {
		this.labelTipoDeArchivo = labelTipoDeArchivo;
	}

	public JTextField getTextoTipoDeArchivo() {
		return textoTipoDeArchivo;
	}

	public void setTextoTipoDeArchivo(JTextField textoTipoDeArchivo) {
		this.textoTipoDeArchivo = textoTipoDeArchivo;
	}

	public JLabel getLabelEsAudioLibro() {
		return labelEsAudioLibro;
	}

	public void setLabelEsAudioLibro(JLabel labelEsAudioLibro) {
		this.labelEsAudioLibro = labelEsAudioLibro;
	}

	public JTextField getTextoEsAudioLibro() {
		return textoEsAudioLibro;
	}

	public void setTextoEsAudioLibro(JTextField textoEsAudioLibro) {
		this.textoEsAudioLibro = textoEsAudioLibro;
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
