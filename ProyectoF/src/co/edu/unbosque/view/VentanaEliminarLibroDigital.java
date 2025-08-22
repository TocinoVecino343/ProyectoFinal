package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class VentanaEliminarLibroDigital extends JFrame {

	private JLabel titulo;
	private JLabel idLabel;
	private JTextField idField;
	private JButton eliminar;
	private JButton cancelar;

	public VentanaEliminarLibroDigital() {
		setTitle("Eliminar Libro Digital");
		setSize(350, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

		titulo = new JLabel("ELIMINAR LIBRO DIGITAL");
		titulo.setFont(new Font("Arial", Font.BOLD, 18));
		titulo.setBounds(70, 10, 220, 30);
		add(titulo);

		idLabel = new JLabel("ID:");
		idLabel.setBounds(30, 60, 100, 25);
		add(idLabel);

		idField = new JTextField();
		idField.setBounds(110, 60, 180, 25);
		add(idField);

		eliminar = new JButton("Eliminar");
		eliminar.setBackground(Color.decode("#E8F5E9"));
		eliminar.setBounds(50, 110, 100, 30);
		add(eliminar);

		cancelar = new JButton("Cancelar");
		cancelar.setBackground(Color.decode("#E8F5E9"));
		cancelar.setBounds(180, 110, 100, 30);
		add(cancelar);

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

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getBotonCancelar() {
		return cancelar;
	}

	public void setBotonCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

}
