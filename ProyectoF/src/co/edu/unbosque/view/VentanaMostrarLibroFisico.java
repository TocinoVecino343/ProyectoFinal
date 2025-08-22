package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaMostrarLibroFisico extends JFrame {

    private JTextArea textoMostrarLibroFisico;
    private JScrollPane scrollMostrarLibroFisico;
    private JButton botonCancelar;

    public VentanaMostrarLibroFisico() {
        inicializarVentanaMostrarLibroFisico();
    }

    public void inicializarVentanaMostrarLibroFisico() {
        this.setTitle("Mostrar libros físicos");
        this.setBounds(50, 50, 1280, 800);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);

        textoMostrarLibroFisico = new JTextArea();
        textoMostrarLibroFisico.setEditable(false);
        	
        scrollMostrarLibroFisico = new JScrollPane(textoMostrarLibroFisico);
        scrollMostrarLibroFisico.setBounds(50, 50, 1150, 650);
        this.add(scrollMostrarLibroFisico);
        
        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBackground(Color.decode("#E8F5E9"));
        botonCancelar.setBounds(575, 720, 130, 30);
        this.add(botonCancelar);
    }

	public JTextArea getTextoMostrarLibroFisico() {
		return textoMostrarLibroFisico;
	}

	public void setTextoMostrarLibroFisico(JTextArea textoMostrarLibroFisico) {
		this.textoMostrarLibroFisico = textoMostrarLibroFisico;
	}

	public JScrollPane getScrollMostrarLibroFisico() {
		return scrollMostrarLibroFisico;
	}

	public void setScrollMostrarLibroFisico(JScrollPane scrollMostrarLibroFisico) {
		this.scrollMostrarLibroFisico = scrollMostrarLibroFisico;
	}

	public JButton getBotonCancelar() {
	    return botonCancelar;
	}
	public void setBotonCancelar(JButton botonCancelar) {
	    this.botonCancelar = botonCancelar;
	}
    
}
