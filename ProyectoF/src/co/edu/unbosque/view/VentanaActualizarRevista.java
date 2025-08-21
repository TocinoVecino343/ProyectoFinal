package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaActualizarRevista extends JFrame {

	private JLabel labelIdBuscar, labelTitulo, labelEditor, labelVolumen, labelNumero, labelClasificacion,
			labelFacultad, labelFecha, labelIdioma;
	private JTextField textoIdBuscar, textoTitulo, textoEditor, textoVolumen, textoNumero, textoClasificacion,
			textoFacultad, textoFecha, textoIdioma;
	private JButton botonBuscar, botonActualizar;

	public VentanaActualizarRevista() {
		setTitle("Actualizar Revista");
		setBounds(10, 10, 600, 550);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);

		labelIdBuscar = new JLabel("ID Revista:");
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

		labelEditor = new JLabel("Editor:");
		labelEditor.setBounds(50, 120, 100, 30);
		add(labelEditor);

		textoEditor = new JTextField();
		textoEditor.setBounds(160, 120, 270, 30);
		add(textoEditor);

		labelVolumen = new JLabel("Volumen:");
		labelVolumen.setBounds(50, 170, 100, 30);
		add(labelVolumen);

		textoVolumen = new JTextField();
		textoVolumen.setBounds(160, 170, 270, 30);
		add(textoVolumen);

		labelNumero = new JLabel("Número:");
		labelNumero.setBounds(50, 220, 100, 30);
		add(labelNumero);

		textoNumero = new JTextField();
		textoNumero.setBounds(160, 220, 270, 30);
		add(textoNumero);

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

	public JLabel getLabelEditor() {
		return labelEditor;
	}

	public void setLabelEditor(JLabel labelEditor) {
		this.labelEditor = labelEditor;
	}

	public JLabel getLabelVolumen() {
		return labelVolumen;
	}

	public void setLabelVolumen(JLabel labelVolumen) {
		this.labelVolumen = labelVolumen;
	}

	public JLabel getLabelNumero() {
		return labelNumero;
	}

	public void setLabelNumero(JLabel labelNumero) {
		this.labelNumero = labelNumero;
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

	public JTextField getTextoEditor() {
		return textoEditor;
	}

	public void setTextoEditor(JTextField textoEditor) {
		this.textoEditor = textoEditor;
	}

	public JTextField getTextoVolumen() {
		return textoVolumen;
	}

	public void setTextoVolumen(JTextField textoVolumen) {
		this.textoVolumen = textoVolumen;
	}

	public JTextField getTextoNumero() {
		return textoNumero;
	}

	public void setTextoNumero(JTextField textoNumero) {
		this.textoNumero = textoNumero;
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
