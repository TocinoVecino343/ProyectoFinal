package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaMostrar extends JFrame {
	
	private JButton botonMostrarTodo;
	private JButton botonMostrarPelicula;
	private JButton botonMostrarArticulo;
	private JButton botonMostrarRevista;
	private JButton botonMostrarJuego;
	private JButton botonMostrarLibroFisico;
	private JButton botonMostrarLibroVirtual;
	
	public VentanaMostrar() {
		inicializarVentanaMostrar();
	}
	
	public void inicializarVentanaMostrar() {
		this.setTitle("Mostrar publicaciones");
		this.setBounds(50, 50, 1280, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(null);
		
		botonMostrarTodo = new JButton("Mostrar todo");
		botonMostrarTodo.setBounds(100, 100, 200, 40);
		this.add(botonMostrarTodo);
		
		botonMostrarPelicula = new JButton("Mostrar películas");
		botonMostrarPelicula.setBounds(100, 160, 200, 40);
		this.add(botonMostrarPelicula);
		
		botonMostrarArticulo = new JButton("Mostrar artículos");
		botonMostrarArticulo.setBounds(100, 220, 200, 40);
		this.add(botonMostrarArticulo);
		
		botonMostrarRevista = new JButton("Mostrar revistas");
		botonMostrarRevista.setBounds(100, 280, 200, 40);
		this.add(botonMostrarRevista);
		
		botonMostrarJuego = new JButton("Mostrar videojuegos");
		botonMostrarJuego.setBounds(100, 340, 200, 40);
		this.add(botonMostrarJuego);
		
		botonMostrarLibroFisico = new JButton("Mostrar libros físicos");
		botonMostrarLibroFisico.setBounds(100, 400, 200, 40);
		this.add(botonMostrarLibroFisico);
		
		botonMostrarLibroVirtual = new JButton("Mostrar libros virtuales");
		botonMostrarLibroVirtual.setBounds(100, 460, 200, 40);
		this.add(botonMostrarLibroVirtual);
	}

	public JButton getBotonMostrarTodo() {
		return botonMostrarTodo;
	}

	public void setBotonMostrarTodo(JButton botonMostrarTodo) {
		this.botonMostrarTodo = botonMostrarTodo;
	}

	public JButton getBotonMostrarPelicula() {
		return botonMostrarPelicula;
	}

	public void setBotonMostrarPelicula(JButton botonMostrarPelicula) {
		this.botonMostrarPelicula = botonMostrarPelicula;
	}

	public JButton getBotonMostrarArticulo() {
		return botonMostrarArticulo;
	}

	public void setBotonMostrarArticulo(JButton botonMostrarArticulo) {
		this.botonMostrarArticulo = botonMostrarArticulo;
	}

	public JButton getBotonMostrarRevista() {
		return botonMostrarRevista;
	}

	public void setBotonMostrarRevista(JButton botonMostrarRevista) {
		this.botonMostrarRevista = botonMostrarRevista;
	}

	public JButton getBotonMostrarJuego() {
		return botonMostrarJuego;
	}

	public void setBotonMostrarJuego(JButton botonMostrarJuego) {
		this.botonMostrarJuego = botonMostrarJuego;
	}

	public JButton getBotonMostrarLibroFisico() {
		return botonMostrarLibroFisico;
	}

	public void setBotonMostrarLibroFisico(JButton botonMostrarLibroFisico) {
		this.botonMostrarLibroFisico = botonMostrarLibroFisico;
	}

	public JButton getBotonMostrarLibroVirtual() {
		return botonMostrarLibroVirtual;
	}

	public void setBotonMostrarLibroVirtual(JButton botonMostrarLibroVirtual) {
		this.botonMostrarLibroVirtual = botonMostrarLibroVirtual;
	}
	

}
