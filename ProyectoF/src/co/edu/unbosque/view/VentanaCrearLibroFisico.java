package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearLibroFisico extends JFrame {

	private JLabel labelCantidadCopias;
	private JLabel labelTiempoPrestamo;

	private JTextField textoCantidadCopias;
	private JTextField textoTiempoPrestamo;

	private JButton botonGuardarLibroFisico;
	private JButton cancelar;

	public VentanaCrearLibroFisico() {
		inicializarCrearLibroFisico();
	}

	public void inicializarCrearLibroFisico() {
		this.setTitle("Creación libro");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);

		labelCantidadCopias = new JLabel("Ingrese la cantidad de copias del libro (NUMEROS):");
		labelCantidadCopias.setBounds(50, 50, 300, 30);
		this.add(labelCantidadCopias);

		textoCantidadCopias = new JTextField();
		textoCantidadCopias.setBounds(350, 50, 150, 30);
		this.add(textoCantidadCopias);

		labelTiempoPrestamo = new JLabel("Ingrese el tiempo de préstamo (DIAS)(NUMEROS):");
		labelTiempoPrestamo.setBounds(50, 100, 300, 30);
		this.add(labelTiempoPrestamo);

		textoTiempoPrestamo = new JTextField();
		textoTiempoPrestamo.setBounds(350, 100, 150, 30);
		this.add(textoTiempoPrestamo);

		botonGuardarLibroFisico = new JButton("Guardar libro");
		botonGuardarLibroFisico.setBackground(Color.decode("#E8F5E9"));
		botonGuardarLibroFisico.setBounds(250, 160, 180, 40);
		this.add(botonGuardarLibroFisico);
		
		cancelar = new JButton("Cancelar");
		cancelar.setBackground(Color.decode("#E8F5E9"));
		cancelar.setBounds(450, 160, 180, 40);
		this.add(cancelar);
	}

	public JLabel getLabelCantidadCopias() {
		return labelCantidadCopias;
	}

	public void setLabelCantidadCopias(JLabel labelCantidadCopias) {
		this.labelCantidadCopias = labelCantidadCopias;
	}

	public JLabel getLabelTiempoPrestamo() {
		return labelTiempoPrestamo;
	}

	public void setLabelTiempoPrestamo(JLabel labelTiempoPrestamo) {
		this.labelTiempoPrestamo = labelTiempoPrestamo;
	}

	public JTextField getTextoCantidadCopias() {
		return textoCantidadCopias;
	}

	public void setTextoCantidadCopias(JTextField textoCantidadCopias) {
		this.textoCantidadCopias = textoCantidadCopias;
	}

	public JTextField getTextoTiempoPrestamo() {
		return textoTiempoPrestamo;
	}

	public void setTextoTiempoPrestamo(JTextField textoTiempoPrestamo) {
		this.textoTiempoPrestamo = textoTiempoPrestamo;
	}

	public JButton getBotonGuardarLibroFisico() {
		return botonGuardarLibroFisico;
	}

	public void setBotonGuardarLibroFisico(JButton botonGuardarLibroFisico) {
		this.botonGuardarLibroFisico = botonGuardarLibroFisico;
	}

	public JButton getBotonCancelar() {
		return cancelar;
	}

	public void setBotonCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

	

}
