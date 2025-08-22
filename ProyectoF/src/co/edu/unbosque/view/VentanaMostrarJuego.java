package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaMostrarJuego extends JFrame {

    private JTextArea textoMostrarJuego;
    private JScrollPane scrollMostrarJuego;
    private JButton botonCancelar;

    public VentanaMostrarJuego() {
        inicializarVentanaMostrarJuego();
    }

    public void inicializarVentanaMostrarJuego() {
        this.setTitle("Mostrar videojuegos");
        this.setBounds(50, 50, 1280, 800);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);

        textoMostrarJuego = new JTextArea();
        textoMostrarJuego.setEditable(false);
        
        scrollMostrarJuego = new JScrollPane(textoMostrarJuego);
        scrollMostrarJuego.setBounds(50, 50, 1150, 650);
        this.add(scrollMostrarJuego);
        
        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBackground(Color.decode("#E8F5E9"));
        botonCancelar.setBounds(575, 720, 130, 30);
        this.add(botonCancelar);
    }

	public JTextArea getTextoMostrarJuego() {
		return textoMostrarJuego;
	}

	public void setTextoMostrarJuego(JTextArea textoMostrarJuego) {
		this.textoMostrarJuego = textoMostrarJuego;
	}

	public JScrollPane getScrollMostrarJuego() {
		return scrollMostrarJuego;
	}

	public void setScrollMostrarJuego(JScrollPane scrollMostrarJuego) {
		this.scrollMostrarJuego = scrollMostrarJuego;
	}
	
	public JButton getBotonCancelar() {
	    return botonCancelar;
	}
	public void setBotonCancelar(JButton botonCancelar) {
	    this.botonCancelar = botonCancelar;
	}
    
}