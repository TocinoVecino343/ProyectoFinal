package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaMostrarJuego extends JFrame {

    private JTextArea textoMostrarJuego;
    private JScrollPane scrollMostrarJuego;

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
    
}