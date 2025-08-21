package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class VentanaEliminar extends JFrame {

	private JLabel titulo;
	private JButton botonEliminarArticulo;
	private JButton botonEliminarJuego;
	private JButton botonEliminarRevista;
	private JButton botonEliminarPelicula;
	private JButton botonEliminarLibroFisico;
	private JButton botonEliminarLibroDigital;
	private JButton botonCancelar;

	public VentanaEliminar() {
		this.setTitle("Eliminar Publicación");
		this.setSize(400, 350);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);

		titulo = new JLabel("ELIMINAR PUBLICACIÓN");
		titulo.setFont(new Font("Arial", Font.BOLD, 18));
		titulo.setBounds(90, 10, 250, 30);
		this.add(titulo);

		botonEliminarArticulo = new JButton("Artículo");
		botonEliminarArticulo.setBounds(50, 60, 130, 40);
		this.add(botonEliminarArticulo);

		botonEliminarJuego = new JButton("Juego");
		botonEliminarJuego.setBounds(220, 60, 130, 40);
		this.add(botonEliminarJuego);

		botonEliminarRevista = new JButton("Revista");
		botonEliminarRevista.setBounds(50, 120, 130, 40);
		this.add(botonEliminarRevista);

		botonEliminarPelicula = new JButton("Película");
		botonEliminarPelicula.setBounds(220, 120, 130, 40);
		this.add(botonEliminarPelicula);

		botonEliminarLibroFisico = new JButton("Libro Físico");
		botonEliminarLibroFisico.setBounds(50, 180, 130, 40);
		this.add(botonEliminarLibroFisico);

		botonEliminarLibroDigital = new JButton("Libro Digital");
		botonEliminarLibroDigital.setBounds(220, 180, 130, 40);
		this.add(botonEliminarLibroDigital);

		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(135, 250, 130, 30);
		this.add(botonCancelar);

	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getBotonEliminarArticulo() {
		return botonEliminarArticulo;
	}

	public void setBotonEliminarArticulo(JButton botonEliminarArticulo) {
		this.botonEliminarArticulo = botonEliminarArticulo;
	}

	public JButton getBotonEliminarJuego() {
		return botonEliminarJuego;
	}

	public void setBotonEliminarJuego(JButton botonEliminarJuego) {
		this.botonEliminarJuego = botonEliminarJuego;
	}

	public JButton getBotonEliminarRevista() {
		return botonEliminarRevista;
	}

	public void setBotonEliminarRevista(JButton botonEliminarRevista) {
		this.botonEliminarRevista = botonEliminarRevista;
	}

	public JButton getBotonEliminarPelicula() {
		return botonEliminarPelicula;
	}

	public void setBotonEliminarPelicula(JButton botonEliminarPelicula) {
		this.botonEliminarPelicula = botonEliminarPelicula;
	}

	public JButton getBotonEliminarLibroFisico() {
		return botonEliminarLibroFisico;
	}

	public void setBotonEliminarLibroFisico(JButton botonEliminarLibroFisico) {
		this.botonEliminarLibroFisico = botonEliminarLibroFisico;
	}

	public JButton getBotonEliminarLibroDigital() {
		return botonEliminarLibroDigital;
	}

	public void setBotonEliminarLibroDigital(JButton botonEliminarLibroDigital) {
		this.botonEliminarLibroDigital = botonEliminarLibroDigital;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

}
