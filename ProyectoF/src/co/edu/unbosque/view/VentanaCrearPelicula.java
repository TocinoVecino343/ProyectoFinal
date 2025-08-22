package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearPelicula extends JFrame{
	
	private JTextField textoProductora;
    private JTextField textoPais;
    private JTextField textoDirector;
    private JTextField textoGuion;
    private JTextField textoFotografia;
    private JTextField textoMusica;
    private JTextField textoReparto;
    private JTextField textoDuracion;
    private JTextField textoIdiomasDisponibles;
    private JTextField textoSubtitulos;
	private JButton botonCancelar;
    private JLabel labelProductora;
    private JLabel labelPais;
    private JLabel labelDirector;
    private JLabel labelGuion;
    private JLabel labelFotografia;
    private JLabel labelMusica;
    private JLabel labelReparto;
    private JLabel labelDuracion;
    private JLabel labelIdiomasDisponibles;
    private JLabel labelSubtitulos;
    
    

    private JButton botonGuardarPelicula;
    
    public VentanaCrearPelicula() {
    	incializarCrearPelicula();
    }
    public void incializarCrearPelicula() {
    	this.setTitle("Creación película");
    	this.setBounds(50, 50, 1280, 800);
    	this.setResizable(false);
    	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	this.setLayout(null);
    	
    	
    	labelProductora = new JLabel("Ingrese la productora:");
        labelProductora.setBounds(50, 50, 180, 30);
        this.add(labelProductora);

        textoProductora = new JTextField();
        textoProductora.setBounds(250, 50, 400, 30);
        this.add(textoProductora);
    	
        labelPais = new JLabel("Ingrese el país de la película:");
        labelPais.setBounds(50, 100, 200, 30);
        this.add(labelPais);

        textoPais = new JTextField();
        textoPais.setBounds(250, 100, 400, 30);
        this.add(textoPais);
    
        labelDirector = new JLabel("Ingrese el productor:");
        labelDirector.setBounds(50, 150, 200, 30);
        this.add(labelDirector);

        textoDirector = new JTextField();
        textoDirector.setBounds(250, 150, 400, 30);
        this.add(textoDirector);
    	
        labelGuion = new JLabel("Ingrese el nombre del guionista:");
        labelGuion.setBounds(50, 200, 250, 30);
        this.add(labelGuion);

        textoGuion = new JTextField();
        textoGuion.setBounds(300, 200, 400, 30);
        this.add(textoGuion);
    	
        labelFotografia = new JLabel("Ingrese el encargado de la fotografía:");
        labelFotografia.setBounds(50, 250, 300, 30);
        this.add(labelFotografia);

        textoFotografia = new JTextField();
        textoFotografia.setBounds(350, 250, 400, 30);
        this.add(textoFotografia);
    	
        labelMusica = new JLabel("Ingrese el encargado de la música:");
        labelMusica.setBounds(50, 300, 250, 30);
        this.add(labelMusica);

        textoMusica = new JTextField();
        textoMusica.setBounds(300, 300, 400, 30);
        this.add(textoMusica);
    	
        labelReparto = new JLabel("Ingrese el reparto de la película:");
        labelReparto.setBounds(50, 350, 250, 30);
        this.add(labelReparto);

        textoReparto = new JTextField();
        textoReparto.setBounds(300, 350, 400, 30);
        this.add(textoReparto);
    	
        labelDuracion = new JLabel("Ingrese la duración de la película:");
        labelDuracion.setBounds(50, 400, 250, 30);
        this.add(labelDuracion);

        textoDuracion = new JTextField();
        textoDuracion.setBounds(300, 400, 400, 30);
        this.add(textoDuracion);
    	
        labelIdiomasDisponibles = new JLabel("Ingrese los idiomas disponibles:");
        labelIdiomasDisponibles.setBounds(50, 450, 250, 30);
        this.add(labelIdiomasDisponibles);

        textoIdiomasDisponibles = new JTextField();
        textoIdiomasDisponibles.setBounds(300, 450, 400, 30);
        this.add(textoIdiomasDisponibles);
    	 
        labelSubtitulos = new JLabel("Ingrese los idiomas de subtítulos:");
        labelSubtitulos.setBounds(50, 500, 250, 30);
        this.add(labelSubtitulos);

        textoSubtitulos = new JTextField();
        textoSubtitulos.setBounds(300, 500, 400, 30);
        this.add(textoSubtitulos);
        
        botonGuardarPelicula = new JButton("Guardar pelicula");
        botonGuardarPelicula.setBackground(Color.decode("#E8F5E9"));
        botonGuardarPelicula.setBounds(300, 560, 150, 40);
        this.add(botonGuardarPelicula);  	
        
        botonCancelar = new JButton("Cancelar");
		botonCancelar.setBackground(Color.decode("#E8F5E9"));
		botonCancelar.setBounds(100, 520, 200, 30);
		this.add(botonCancelar);
    }

	public JTextField getTextoProductora() {
		return textoProductora;
	}

	public void setTextoProductora(JTextField textoProductora) {
		this.textoProductora = textoProductora;
	}

	public JTextField getTextoPais() {
		return textoPais;
	}

	public void setTextoPais(JTextField textoPais) {
		this.textoPais = textoPais;
	}

	public JTextField getTextoDirector() {
		return textoDirector;
	}

	public void setTextoDirector(JTextField textoDirector) {
		this.textoDirector = textoDirector;
	}

	public JTextField getTextoGuion() {
		return textoGuion;
	}

	public void setTextoGuion(JTextField textoGuion) {
		this.textoGuion = textoGuion;
	}

	public JTextField getTextoFotografia() {
		return textoFotografia;
	}

	public void setTextoFotografia(JTextField textoFotografia) {
		this.textoFotografia = textoFotografia;
	}

	public JTextField getTextoMusica() {
		return textoMusica;
	}

	public void setTextoMusica(JTextField textoMusica) {
		this.textoMusica = textoMusica;
	}

	public JTextField getTextoReparto() {
		return textoReparto;
	}

	public void setTextoReparto(JTextField textoReparto) {
		this.textoReparto = textoReparto;
	}

	public JTextField getTextoDuracion() {
		return textoDuracion;
	}

	public void setTextoDuracion(JTextField textoDuracion) {
		this.textoDuracion = textoDuracion;
	}

	public JTextField getTextoIdiomasDisponibles() {
		return textoIdiomasDisponibles;
	}

	public void setTextoIdiomasDisponibles(JTextField textoIdiomasDisponibles) {
		this.textoIdiomasDisponibles = textoIdiomasDisponibles;
	}

	public JTextField getTextoSubtitulos() {
		return textoSubtitulos;
	}

	public void setTextoSubtitulos(JTextField textoSubtitulos) {
		this.textoSubtitulos = textoSubtitulos;
	}

	public JLabel getLabelProductora() {
		return labelProductora;
	}

	public void setLabelProductora(JLabel labelProductora) {
		this.labelProductora = labelProductora;
	}

	public JLabel getLabelPais() {
		return labelPais;
	}

	public void setLabelPais(JLabel labelPais) {
		this.labelPais = labelPais;
	}

	public JLabel getLabelDirector() {
		return labelDirector;
	}

	public void setLabelDirector(JLabel labelDirector) {
		this.labelDirector = labelDirector;
	}

	public JLabel getLabelGuion() {
		return labelGuion;
	}

	public void setLabelGuion(JLabel labelGuion) {
		this.labelGuion = labelGuion;
	}

	public JLabel getLabelFotografia() {
		return labelFotografia;
	}

	public void setLabelFotografia(JLabel labelFotografia) {
		this.labelFotografia = labelFotografia;
	}

	public JLabel getLabelMusica() {
		return labelMusica;
	}

	public void setLabelMusica(JLabel labelMusica) {
		this.labelMusica = labelMusica;
	}

	public JLabel getLabelReparto() {
		return labelReparto;
	}

	public void setLabelReparto(JLabel labelReparto) {
		this.labelReparto = labelReparto;
	}

	public JLabel getLabelDuracion() {
		return labelDuracion;
	}

	public void setLabelDuracion(JLabel labelDuracion) {
		this.labelDuracion = labelDuracion;
	}

	public JLabel getLabelIdiomasDisponibles() {
		return labelIdiomasDisponibles;
	}

	public void setLabelIdiomasDisponibles(JLabel labelIdiomasDisponibles) {
		this.labelIdiomasDisponibles = labelIdiomasDisponibles;
	}

	public JLabel getLabelSubtitulos() {
		return labelSubtitulos;
	}

	public void setLabelSubtitulos(JLabel labelSubtitulos) {
		this.labelSubtitulos = labelSubtitulos;
	}

	public JButton getBotonGuardarPelicula() {
		return botonGuardarPelicula;
	}

	public void setBotonGuardarPelicula(JButton botonGuardarPelicula) {
		this.botonGuardarPelicula = botonGuardarPelicula;
	}
    
    
    

}
