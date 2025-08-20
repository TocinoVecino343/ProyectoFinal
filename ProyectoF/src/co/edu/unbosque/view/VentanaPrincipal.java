package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.HexFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;

import org.w3c.dom.css.RGBColor;

public class VentanaPrincipal extends JFrame {

	private JButton botonCrearPublicacion;
	private JButton botonMostrarPublicacion;
	private JButton botonEliminarPublicacion;
	private JButton botonActualizarPublicacion;
	private JLabel mensajeBienvenida;

	public VentanaPrincipal() {
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		// Configuración de la ventana
		this.setTitle("Biblioteca UEB");
		this.setBounds(10, 10, 1280, 720); // posición y tamaño de la VENTANA
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Finaliza el programa completamente.
		this.setResizable(false);
		this.setLayout(null);

		// Mensaje de Bienvenida
		mensajeBienvenida = new JLabel("Bienvenido a la Biblioteca de la UEB", SwingConstants.CENTER);
		mensajeBienvenida.setBounds(300, 20, 400, 30);
		mensajeBienvenida.setForeground(Color.decode("#144031"));
		mensajeBienvenida.setFont(new Font("Times New Roman", Font.BOLD, 20)); // Tipo de letra, negrilla y tamaño
		this.add(mensajeBienvenida);

		// Botones menú principal
		botonCrearPublicacion = new JButton("Crear publicación"); // Texto del botón
		botonCrearPublicacion.setBounds(80, 100, 200, 60); // Posición y tamaño del botón
		botonCrearPublicacion.setBackground(Color.decode("#f5f5dc"));// Color del FONDO del botón
		botonCrearPublicacion.setForeground(Color.decode("#144031"));
		botonCrearPublicacion.setFocusPainted(false); // Quita el marco del texto del botón
		this.add(botonCrearPublicacion);
		this.setLayout(null);
		//
		botonMostrarPublicacion = new JButton("Mostrar publicación");
		botonMostrarPublicacion.setBounds(80, 200, 200, 60);
		botonMostrarPublicacion.setBackground(Color.decode("#f5f5dc"));
		botonMostrarPublicacion.setForeground(Color.decode("#144031"));
		botonMostrarPublicacion.setFocusPainted(false);
		this.add(botonMostrarPublicacion);
		this.setLayout(null);
		//
		botonEliminarPublicacion = new JButton("Eliminar publicación");
		botonEliminarPublicacion.setBounds(80, 300, 200, 60);
		botonEliminarPublicacion.setBackground(Color.decode("#f5f5dc"));
		botonEliminarPublicacion.setForeground(Color.decode("#144031"));
		botonEliminarPublicacion.setFocusPainted(false);
		this.add(botonEliminarPublicacion);
		this.setLayout(null);
		//
		botonActualizarPublicacion = new JButton("Actualizar publicación");
		botonActualizarPublicacion.setBounds(80, 400, 200, 60);
		botonActualizarPublicacion.setBackground(Color.decode("#f5f5dc"));
		botonActualizarPublicacion.setForeground(Color.decode("#144031"));
		botonActualizarPublicacion.setFocusPainted(false);
		this.add(botonActualizarPublicacion);
		this.setLayout(null);
		//
		

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

	public JLabel getMensajeBienvenida() {
		return mensajeBienvenida;
	}

	public void setMensajeBienvenida(JLabel mensajeBienvenida) {
		this.mensajeBienvenida = mensajeBienvenida;
	}

}
