package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class VentanaActualizarJuego extends JFrame {

	private JLabel titulo;
	private JLabel idLabel;
	private JTextField idField;
	private JLabel nombreLabel;
	private JTextField nombreField;
	private JLabel generoLabel;
	private JTextField generoField;
	private JLabel desarrolladorLabel;
	private JTextField desarrolladorField;
	private JLabel precioLabel;
	private JTextField precioField;
	private JButton actualizar;
	private JButton cancelar;

	public VentanaActualizarJuego() {
		setTitle("Actualizar Juego");
		setSize(400, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

		titulo = new JLabel("ACTUALIZAR JUEGO");
		titulo.setFont(new Font("Arial", Font.BOLD, 18));
		titulo.setBounds(100, 10, 200, 30);
		add(titulo);

		idLabel = new JLabel("ID:");
		idLabel.setBounds(30, 60, 100, 25);
		add(idLabel);

		idField = new JTextField();
		idField.setBounds(150, 60, 200, 25);
		add(idField);

		nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(30, 95, 100, 25);
		add(nombreLabel);

		nombreField = new JTextField();
		nombreField.setBounds(150, 95, 200, 25);
		add(nombreField);

		generoLabel = new JLabel("Género:");
		generoLabel.setBounds(30, 130, 100, 25);
		add(generoLabel);

		generoField = new JTextField();
		generoField.setBounds(150, 130, 200, 25);
		add(generoField);

		desarrolladorLabel = new JLabel("Desarrollador:");
		desarrolladorLabel.setBounds(30, 165, 100, 25);
		add(desarrolladorLabel);

		desarrolladorField = new JTextField();
		desarrolladorField.setBounds(150, 165, 200, 25);
		add(desarrolladorField);

		precioLabel = new JLabel("Precio:");
		precioLabel.setBounds(30, 200, 100, 25);
		add(precioLabel);

		precioField = new JTextField();
		precioField.setBounds(150, 200, 200, 25);
		add(precioField);

		actualizar = new JButton("Actualizar");
		actualizar.setBounds(80, 250, 100, 30);
		add(actualizar);

		cancelar = new JButton("Cancelar");
		cancelar.setBounds(220, 250, 100, 30);
		add(cancelar);

		setVisible(true);
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

	public JLabel getNombreLabel() {
		return nombreLabel;
	}

	public void setNombreLabel(JLabel nombreLabel) {
		this.nombreLabel = nombreLabel;
	}

	public JTextField getNombreField() {
		return nombreField;
	}

	public void setNombreField(JTextField nombreField) {
		this.nombreField = nombreField;
	}

	public JLabel getGeneroLabel() {
		return generoLabel;
	}

	public void setGeneroLabel(JLabel generoLabel) {
		this.generoLabel = generoLabel;
	}

	public JTextField getGeneroField() {
		return generoField;
	}

	public void setGeneroField(JTextField generoField) {
		this.generoField = generoField;
	}

	public JLabel getDesarrolladorLabel() {
		return desarrolladorLabel;
	}

	public void setDesarrolladorLabel(JLabel desarrolladorLabel) {
		this.desarrolladorLabel = desarrolladorLabel;
	}

	public JTextField getDesarrolladorField() {
		return desarrolladorField;
	}

	public void setDesarrolladorField(JTextField desarrolladorField) {
		this.desarrolladorField = desarrolladorField;
	}

	public JLabel getPrecioLabel() {
		return precioLabel;
	}

	public void setPrecioLabel(JLabel precioLabel) {
		this.precioLabel = precioLabel;
	}

	public JTextField getPrecioField() {
		return precioField;
	}

	public void setPrecioField(JTextField precioField) {
		this.precioField = precioField;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

}
