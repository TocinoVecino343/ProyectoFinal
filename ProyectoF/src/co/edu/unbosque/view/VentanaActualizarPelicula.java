package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarPelicula extends JFrame {

	//Basicos
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

	//Especificos
		private JLabel labelProductora;
		private JTextField textoProductora;

		private JLabel labelPais;
		private JTextField textoPais;

		private JLabel labelDirector;
		private JTextField textoDirector;

		private JLabel labelGuion;
		private JTextField textoGuion;

		private JLabel labelFotografia;
		private JTextField textoFotografia;

		private JLabel labelMusica;
		private JTextField textoMusica;

		private JLabel labelReparto;
		private JTextField textoReparto;

		private JLabel labelDuracion;
		private JTextField textoDuracion;

		private JLabel labelIdiomasDisponibles;
		private JTextField textoIdiomasDisponibles;

		private JLabel labelSubtitulos;
		private JTextField textoSubtitulos;

		private JButton botonActualizar;
		private JButton botonCancelar;

		public VentanaActualizarPelicula() {
			this.setTitle("Actualizar Película");
			this.setBounds(10, 10, 1080, 720);
			this.setResizable(false);
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			this.setLayout(null);

			// Primera columna
		    labelTitulo = new JLabel("Título:");
		    labelTitulo.setBounds(50, 20, 120, 30);
		    this.add(labelTitulo);

		    textoTitulo = new JTextField();
		    textoTitulo.setBounds(180, 20, 250, 30);
		    this.add(textoTitulo);

		    labelClasificacion = new JLabel("Clasificación:");
		    labelClasificacion.setBounds(50, 60, 120, 30);
		    this.add(labelClasificacion);

		    textoClasificacion = new JTextField();
		    textoClasificacion.setBounds(180, 60, 250, 30);
		    this.add(textoClasificacion);

		    labelPais = new JLabel("País:");
		    labelPais.setBounds(50, 100, 120, 30);
		    this.add(labelPais);

		    textoPais = new JTextField();
		    textoPais.setBounds(180, 100, 250, 30);
		    this.add(textoPais);

		    labelDirector = new JLabel("Director:");
		    labelDirector.setBounds(50, 140, 120, 30);
		    this.add(labelDirector);

		    textoDirector = new JTextField();
		    textoDirector.setBounds(180, 140, 250, 30);
		    this.add(textoDirector);

		    labelGuion = new JLabel("Guion:");
		    labelGuion.setBounds(50, 180, 120, 30);
		    this.add(labelGuion);

		    textoGuion = new JTextField();
		    textoGuion.setBounds(180, 180, 250, 30);
		    this.add(textoGuion);

		    labelFotografia = new JLabel("Fotografía:");
		    labelFotografia.setBounds(50, 220, 120, 30);
		    this.add(labelFotografia);

		    textoFotografia = new JTextField();
		    textoFotografia.setBounds(180, 220, 250, 30);
		    this.add(textoFotografia);

		    labelMusica = new JLabel("Música:");
		    labelMusica.setBounds(50, 260, 120, 30);
		    this.add(labelMusica);

		    textoMusica = new JTextField();
		    textoMusica.setBounds(180, 260, 250, 30);
		    this.add(textoMusica);

		    labelReparto = new JLabel("Reparto:");
		    labelReparto.setBounds(50, 300, 120, 30);
		    this.add(labelReparto);

		    textoReparto = new JTextField();
		    textoReparto.setBounds(180, 300, 250, 30);
		    this.add(textoReparto);

		    labelDuracion = new JLabel("Duración:");
		    labelDuracion.setBounds(50, 340, 120, 30);
		    this.add(labelDuracion);

		    textoDuracion = new JTextField();
		    textoDuracion.setBounds(180, 340, 250, 30);
		    this.add(textoDuracion);

		    // Segunda columna
		    labelIdiomasDisponibles = new JLabel("Idiomas Disponibles:");
		    labelIdiomasDisponibles.setBounds(500, 20, 150, 30);
		    this.add(labelIdiomasDisponibles);

		    textoIdiomasDisponibles = new JTextField();
		    textoIdiomasDisponibles.setBounds(660, 20, 250, 30);
		    this.add(textoIdiomasDisponibles);

		    labelSubtitulos = new JLabel("Subtítulos:");
		    labelSubtitulos.setBounds(500, 60, 120, 30);
		    this.add(labelSubtitulos);

		    textoSubtitulos = new JTextField();
		    textoSubtitulos.setBounds(660, 60, 250, 30);
		    this.add(textoSubtitulos);

		    labelFacultad = new JLabel("Facultad:");
		    labelFacultad.setBounds(500, 100, 120, 30);
		    this.add(labelFacultad);

		    textoFacultad = new JTextField();
		    textoFacultad.setBounds(660, 100, 250, 30);
		    this.add(textoFacultad);

		    labelFechaDePublicacion = new JLabel("Fecha de publicación:");
		    labelFechaDePublicacion.setBounds(500, 140, 150, 30);
		    this.add(labelFechaDePublicacion);

		    textoFechaDePublicacion = new JTextField();
		    textoFechaDePublicacion.setBounds(660, 140, 250, 30);
		    this.add(textoFechaDePublicacion);

		    labelIdioma = new JLabel("Idioma:");
		    labelIdioma.setBounds(500, 180, 120, 30);
		    this.add(labelIdioma);

		    textoIdioma = new JTextField();
		    textoIdioma.setBounds(660, 180, 250, 30);
		    this.add(textoIdioma);

		    labelProductora = new JLabel("Productora:");
		    labelProductora.setBounds(500, 220, 120, 30);
		    this.add(labelProductora);

		    textoProductora = new JTextField();
		    textoProductora.setBounds(660, 220, 250, 30);
		    this.add(textoProductora);

		    // Botón
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

	public JLabel getLabelProductora() {
		return labelProductora;
	}

	public void setLabelProductora(JLabel labelProductora) {
		this.labelProductora = labelProductora;
	}

	public JTextField getTextoProductora() {
		return textoProductora;
	}

	public void setTextoProductora(JTextField textoProductora) {
		this.textoProductora = textoProductora;
	}

	public JLabel getLabelPais() {
		return labelPais;
	}

	public void setLabelPais(JLabel labelPais) {
		this.labelPais = labelPais;
	}

	public JTextField getTextoPais() {
		return textoPais;
	}

	public void setTextoPais(JTextField textoPais) {
		this.textoPais = textoPais;
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

	public JLabel getLabelGion() {
		return labelGuion;
	}

	public void setLabelGion(JLabel labelGuion) {
		this.labelGuion = labelGuion;
	}

	public JTextField getTextoGuion() {
		return textoGuion;
	}

	public void setTextoGuion(JTextField textoGuion) {
		this.textoGuion = textoGuion;
	}

	public JLabel getLabelFotografia() {
		return labelFotografia;
	}

	public void setLabelFotografia(JLabel labelFotografia) {
		this.labelFotografia = labelFotografia;
	}

	public JTextField getTextoFotografia() {
		return textoFotografia;
	}

	public void setTextoFotografia(JTextField textoFotografia) {
		this.textoFotografia = textoFotografia;
	}

	public JLabel getLabelMusica() {
		return labelMusica;
	}

	public void setLabelMusica(JLabel labelMusica) {
		this.labelMusica = labelMusica;
	}

	public JTextField getTextoMusica() {
		return textoMusica;
	}

	public void setTextoMusica(JTextField textoMusica) {
		this.textoMusica = textoMusica;
	}

	public JLabel getLabelReparto() {
		return labelReparto;
	}

	public void setLabelReparto(JLabel labelReparto) {
		this.labelReparto = labelReparto;
	}

	public JTextField getTextoReparto() {
		return textoReparto;
	}

	public void setTextoReparto(JTextField textoReparto) {
		this.textoReparto = textoReparto;
	}

	public JLabel getLabelDuracion() {
		return labelDuracion;
	}

	public void setLabelDuracion(JLabel labelDuracion) {
		this.labelDuracion = labelDuracion;
	}

	public JTextField getTextoDuracion() {
		return textoDuracion;
	}

	public void setTextoDuracion(JTextField textoDuracion) {
		this.textoDuracion = textoDuracion;
	}

	public JLabel getLabelIdiomasDisponibles() {
		return labelIdiomasDisponibles;
	}

	public void setLabelIdiomasDisponibles(JLabel labelIdiomasDisponibles) {
		this.labelIdiomasDisponibles = labelIdiomasDisponibles;
	}

	public JTextField getTextoIdiomasDisponibles() {
		return textoIdiomasDisponibles;
	}

	public void setTextoIdiomasDisponibles(JTextField textoIdiomasDisponibles) {
		this.textoIdiomasDisponibles = textoIdiomasDisponibles;
	}

	public JLabel getLabelSubtitulos() {
		return labelSubtitulos;
	}

	public void setLabelSubtitulos(JLabel labelSubtitulos) {
		this.labelSubtitulos = labelSubtitulos;
	}

	public JTextField getTextoSubtitulos() {
		return textoSubtitulos;
	}

	public void setTextoSubtitulos(JTextField textoSubtitulos) {
		this.textoSubtitulos = textoSubtitulos;
	}

	public JButton getBotonActualizar() {
		return botonActualizar;
	}

	public void setBotonActualizar(JButton botonActualizar) {
		this.botonActualizar = botonActualizar;
	}

	public JLabel getLabelGuion() {
		return labelGuion;
	}

	public void setLabelGuion(JLabel labelGuion) {
		this.labelGuion = labelGuion;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
	}
	
	

}
