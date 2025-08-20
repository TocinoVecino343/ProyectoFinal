package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class VentanaEliminar extends JFrame {

	private JLabel titulo;
	private JButton eliminarArticulo;
	private JButton eliminarJuego;
	private JButton eliminarRevista;
	private JButton eliminarPelicula;
	private JButton eliminarLibroFisico;
	private JButton eliminarLibroDigital;
	private JButton cancelar;

	public VentanaEliminar() {
		setTitle("Eliminar Publicación");
		setSize(400, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

		titulo = new JLabel("ELIMINAR PUBLICACIÓN");
		titulo.setFont(new Font("Arial", Font.BOLD, 18));
		titulo.setBounds(90, 10, 250, 30);
		add(titulo);

		eliminarArticulo = new JButton("Artículo");
		eliminarArticulo.setBounds(50, 60, 130, 40);
		add(eliminarArticulo);

		eliminarJuego = new JButton("Juego");
		eliminarJuego.setBounds(220, 60, 130, 40);
		add(eliminarJuego);

		eliminarRevista = new JButton("Revista");
		eliminarRevista.setBounds(50, 120, 130, 40);
		add(eliminarRevista);

		eliminarPelicula = new JButton("Película");
		eliminarPelicula.setBounds(220, 120, 130, 40);
		add(eliminarPelicula);

		eliminarLibroFisico = new JButton("Libro Físico");
		eliminarLibroFisico.setBounds(50, 180, 130, 40);
		add(eliminarLibroFisico);

		eliminarLibroDigital = new JButton("Libro Digital");
		eliminarLibroDigital.setBounds(220, 180, 130, 40);
		add(eliminarLibroDigital);

		cancelar = new JButton("Cancelar");
		cancelar.setBounds(135, 250, 130, 30);
		add(cancelar);

		setVisible(true);
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getEliminarArticulo() {
		return eliminarArticulo;
	}

	public void setEliminarArticulo(JButton eliminarArticulo) {
		this.eliminarArticulo = eliminarArticulo;
	}

	public JButton getEliminarJuego() {
		return eliminarJuego;
	}

	public void setEliminarJuego(JButton eliminarJuego) {
		this.eliminarJuego = eliminarJuego;
	}

	public JButton getEliminarRevista() {
		return eliminarRevista;
	}

	public void setEliminarRevista(JButton eliminarRevista) {
		this.eliminarRevista = eliminarRevista;
	}

	public JButton getEliminarPelicula() {
		return eliminarPelicula;
	}

	public void setEliminarPelicula(JButton eliminarPelicula) {
		this.eliminarPelicula = eliminarPelicula;
	}

	public JButton getEliminarLibroFisico() {
		return eliminarLibroFisico;
	}

	public void setEliminarLibroFisico(JButton eliminarLibroFisico) {
		this.eliminarLibroFisico = eliminarLibroFisico;
	}

	public JButton getEliminarLibroDigital() {
		return eliminarLibroDigital;
	}

	public void setEliminarLibroDigital(JButton eliminarLibroDigital) {
		this.eliminarLibroDigital = eliminarLibroDigital;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

}
