package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearArticulo extends JFrame{
	
	private JLabel labelAutor;
	private JLabel labelFuente;
	private JLabel labelGeograficos;
	private JLabel labelCantidadPaginas;
	
	private JTextField textoAutor;
	private JTextField textoFuente;
	private JTextField textoGeograficos;
	private JTextField textoCantidadPaginas;
	
	private JButton botonGuardarArticulo;
	
	public VentanaCrearArticulo() {
		inicializarCrearArticulo();
	}
	
	public void inicializarCrearArticulo() {
		this.setTitle("Creación artículo");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(null);
		
		labelAutor = new JLabel("Ingrese el autor:");
		labelAutor.setBounds(50, 50, 180, 30);
		this.add(labelAutor);
		
		textoAutor = new JTextField();
		textoAutor.setBounds(250, 50, 400, 30);
		this.add(textoAutor);
		
		labelFuente = new JLabel("Ingrese la fuente:");
		labelFuente.setBounds(50, 100, 180, 30);
		this.add(labelFuente);
		
		textoFuente = new JTextField();
		textoFuente.setBounds(250, 100, 400, 30);
		this.add(textoFuente);
		
		labelGeograficos = new JLabel("Ingrese datos geográficos:");
		labelGeograficos.setBounds(50, 150, 200, 30);
		this.add(labelGeograficos);
		
		textoGeograficos = new JTextField();
		textoGeograficos.setBounds(250, 150, 400, 30);
		this.add(textoGeograficos);
		
		labelCantidadPaginas = new JLabel("Ingrese la cantidad de páginas:");
		labelCantidadPaginas.setBounds(50, 200, 250, 30);
		this.add(labelCantidadPaginas);
		
		textoCantidadPaginas = new JTextField();
		textoCantidadPaginas.setBounds(300, 200, 150, 30);
		this.add(textoCantidadPaginas);
		
		botonGuardarArticulo = new JButton("Guardar artículo");
		botonGuardarArticulo.setBounds(250, 260, 180, 40);
		this.add(botonGuardarArticulo);
	}

	public JLabel getLabelAutor() {
		return labelAutor;
	}

	public void setLabelAutor(JLabel labelAutor) {
		this.labelAutor = labelAutor;
	}

	public JLabel getLabelFuente() {
		return labelFuente;
	}

	public void setLabelFuente(JLabel labelFuente) {
		this.labelFuente = labelFuente;
	}

	public JLabel getLabelGeograficos() {
		return labelGeograficos;
	}

	public void setLabelGeograficos(JLabel labelGeograficos) {
		this.labelGeograficos = labelGeograficos;
	}

	public JLabel getLabelCantidadPaginas() {
		return labelCantidadPaginas;
	}

	public void setLabelCantidadPaginas(JLabel labelCantidadPaginas) {
		this.labelCantidadPaginas = labelCantidadPaginas;
	}

	public JTextField getTextoAutor() {
		return textoAutor;
	}

	public void setTextoAutor(JTextField textoAutor) {
		this.textoAutor = textoAutor;
	}

	public JTextField getTextoFuente() {
		return textoFuente;
	}

	public void setTextoFuente(JTextField textoFuente) {
		this.textoFuente = textoFuente;
	}

	public JTextField getTextoGeograficos() {
		return textoGeograficos;
	}

	public void setTextoGeograficos(JTextField textoGeograficos) {
		this.textoGeograficos = textoGeograficos;
	}

	public JTextField getTextoCantidadPaginas() {
		return textoCantidadPaginas;
	}

	public void setTextoCantidadPaginas(JTextField textoCantidadPaginas) {
		this.textoCantidadPaginas = textoCantidadPaginas;
	}

	public JButton getBotonGuardarArticulo() {
		return botonGuardarArticulo;
	}

	public void setBotonGuardarArticulo(JButton botonGuardarArticulo) {
		this.botonGuardarArticulo = botonGuardarArticulo;
	}
	
	

}
