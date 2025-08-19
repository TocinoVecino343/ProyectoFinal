package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaMostrarLibroFisico extends JFrame {

    private JTextArea textoMostrarLibroFisico;
    private JScrollPane scrollMostrarLibroFisico;

    public VentanaMostrarLibroFisico() {
        inicializarVentanaMostrarLibroFisico();
    }

    public void inicializarVentanaMostrarLibroFisico() {
        this.setTitle("Mostrar libros físicos");
        this.setBounds(50, 50, 1280, 800);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLayout(null);

        textoMostrarLibroFisico = new JTextArea();

        scrollMostrarLibroFisico = new JScrollPane(textoMostrarLibroFisico);
        scrollMostrarLibroFisico.setBounds(50, 50, 1150, 650);
        this.add(scrollMostrarLibroFisico);
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

    
}
