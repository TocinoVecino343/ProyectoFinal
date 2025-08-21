package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaActualizar extends JFrame {

	private JLabel titulo;
	private JLabel idLabel;
	private JTextField idField;
	private JButton botonActualizar;
	private JButton botonCancelar;

	public VentanaActualizar() {
		inicializarActualizar();
	}

	public void inicializarActualizar() {
		this.setTitle("Menú de Actualización");
		this.setSize(350, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		titulo = new JLabel("ACTUALIZAR PUBLICACION");
		titulo.setFont(new Font("Arial", Font.BOLD, 18));
		titulo.setBounds(60, 10, 300, 30);
		this.add(titulo);

		idLabel = new JLabel("ID:");
		idLabel.setBounds(30, 60, 100, 25);
		this.add(idLabel);

		idField = new JTextField();
		idField.setBounds(110, 60, 180, 25);
		this.add(idField);

		botonActualizar = new JButton("Actualizar");
		botonActualizar.setBounds(50, 110, 100, 30);
		this.add(botonActualizar);

		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(180, 110, 100, 30);
		this.add(botonCancelar);
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getIdLabel() {
		return idLabel;
	}

	public void setIdLabel(JLabel idLabel) {
		this.idLabel = idLabel;
	}

	public JTextField getIdField() {
		return idField;
	}

	public void setIdField(JTextField idField) {
		this.idField = idField;
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