package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame {

	private JButton botonCrearPublicacion;
	private JButton botonMostrarPublicacion;
	private JButton botonEliminarPublicacion;
	private JButton botonActualizarPublicacion;
	private JButton botonSalir;
	private JLabel mensajeBienvenida;

	public VentanaPrincipal() {
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		// Configuración de la ventana
		this.setTitle("Biblioteca UEB");
		this.setBounds(10, 10, 800, 600); // posición y tamaño de la VENTANA
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Finaliza el programa completamente.
		this.setLayout(null);

		// Mensaje de Bienvenida
		mensajeBienvenida = new JLabel("Bienvenido a la Biblioteca de la UEB", SwingConstants.CENTER);
		mensajeBienvenida.setBounds(200, 20, 400, 30);
		mensajeBienvenida.setForeground(Color.BLACK);
		mensajeBienvenida.setFont(new Font("Arial", Font.BOLD, 20)); // Tipo de letra, negrilla y tamaño
		this.add(mensajeBienvenida);

		// Botones menú principal
		botonCrearPublicacion = new JButton("Crear publicación"); // Texto del botón
		botonCrearPublicacion.setBounds(120, 100, 200, 60); // Posición y tamaño del botón
		botonCrearPublicacion.setBackground(Color.CYAN);// Color del FONDO del botón
		botonCrearPublicacion.setFocusPainted(false); // Quita el marco del texto del botón
		this.add(botonCrearPublicacion);
		this.setLayout(null);
		//
		botonMostrarPublicacion = new JButton("Mostrar publicación");
		botonMostrarPublicacion.setBounds(120, 300, 200, 60);
		botonMostrarPublicacion.setBackground(Color.YELLOW);
		botonMostrarPublicacion.setFocusPainted(false);
		this.add(botonMostrarPublicacion);
		this.setLayout(null);
		//
		botonEliminarPublicacion = new JButton("Eliminar publicación");
		botonEliminarPublicacion.setBounds(450, 100, 200, 60);
		botonEliminarPublicacion.setBackground(Color.RED);
		botonEliminarPublicacion.setFocusPainted(false);
		this.add(botonEliminarPublicacion);
		this.setLayout(null);
		//
		botonActualizarPublicacion = new JButton("Actualizar publicación");
		botonActualizarPublicacion.setBounds(450, 300, 200, 60);
		botonActualizarPublicacion.setBackground(Color.GREEN);
		botonActualizarPublicacion.setFocusPainted(false);
		this.add(botonActualizarPublicacion);
		this.setLayout(null);
		//
		botonSalir = new JButton("Salir");
		botonSalir.setBounds(290, 500, 200, 30);
		botonSalir.setBackground(Color.RED);
		botonSalir.setForeground(Color.WHITE);
		botonSalir.setFocusPainted(false);
		this.add(botonSalir);
		this.setLayout(null);

	}

	// Getters y setters de los botones
	public JButton getBotonCrearPublicacion() {
		return botonCrearPublicacion;
	}

	public void setBotonCrearPublicacion(JButton botonCrearPublicacion) {
		this.botonCrearPublicacion = botonCrearPublicacion;
	}

	public JButton getBotonMostrarPublicacion() {
		return botonMostrarPublicacion;
	}

	public void setBotonMostrarPublicacion(JButton botonMostrarPublicacion) {
		this.botonMostrarPublicacion = botonMostrarPublicacion;
	}

	public JButton getBotonEliminarPublicacion() {
		return botonEliminarPublicacion;
	}

	public void setBotonEliminarPublicacion(JButton botonEliminarPublicacion) {
		this.botonEliminarPublicacion = botonEliminarPublicacion;
	}

	public JButton getBotonActualizarPublicacion() {
		return botonActualizarPublicacion;
	}

	public void setBotonActualizarPublicacion(JButton botonActualizarPublicacion) {
		this.botonActualizarPublicacion = botonActualizarPublicacion;
	}

	public JButton getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
	}

	public JLabel getMensajeBienvenida() {
		return mensajeBienvenida;
	}

	public void setMensajeBienvenida(JLabel mensajeBienvenida) {
		this.mensajeBienvenida = mensajeBienvenida;
	}

}
