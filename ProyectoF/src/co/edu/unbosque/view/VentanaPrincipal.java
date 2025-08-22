package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.util.HexFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.BorderFactory;
import java.util.ArrayList;

import org.w3c.dom.css.RGBColor;

import co.edu.unbosque.controller.Controlador;
import co.edu.unbosque.model.*;

public class VentanaPrincipal extends JFrame {

	private JButton botonCrearPublicacion;
	private JButton botonMostrarPublicacion;
	private JButton botonEliminarPublicacion;
	private JButton botonActualizarPublicacion;
	private JLabel mensajeBienvenida;
	private JLabel titulo;
	private JTextField campoBusqueda;
	private JLabel etiquetaBusqueda;
	private JList<String> listaResultados;
	private DefaultListModel<String> modeloLista;
	private JScrollPane scrollResultados;
	private JButton botonBuscar;
    private JFrame desplegable;
	private Controlador controller; 
	
	public VentanaPrincipal(Controlador controller) {
	    this.controller = controller;
	    inicializarComponentes();
	    setVisible(true);
	}

	public void inicializarComponentes() {
	    // Configuración de la ventana
	    this.setTitle("Biblioteca UEB");
	    this.setBounds(10, 10, 1280, 720);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Finaliza el programa completamente
	    this.setResizable(false);
	    this.setLayout(null);

	    //Titulo
	    titulo = new JLabel("Bienvenido a la Biblioteca", SwingConstants.CENTER);
	    titulo.setBounds(200, 40, 600, 30);
	    titulo.setForeground(Color.decode("#144031"));
	    titulo.setFont(new Font("Georgia", Font.BOLD, 40)); // Tipo de letra, negrilla y tamaño
	    this.add(titulo);

	    // Botones menú principal
	    botonCrearPublicacion = new JButton("Crear publicación"); // Texto del botón
	    botonCrearPublicacion.setBounds(40, 200, 200, 60); // Posición y tamaño del botón
	    botonCrearPublicacion.setBackground(Color.decode("#E8F5E9"));// Color del FONDO del botón
	    botonCrearPublicacion.setForeground(Color.decode("#144031"));
	    botonCrearPublicacion.setFocusPainted(false); // Quita el marco del texto del botón
	    this.add(botonCrearPublicacion);
	    //
	    botonMostrarPublicacion = new JButton("Mostrar publicación");
	    botonMostrarPublicacion.setBounds(40, 300, 200, 60);
	    botonMostrarPublicacion.setBackground(Color.decode("#E8F5E9"));
	    botonMostrarPublicacion.setForeground(Color.decode("#144031"));
	    botonMostrarPublicacion.setFocusPainted(false);
	    this.add(botonMostrarPublicacion);
	    //
	    botonEliminarPublicacion = new JButton("Eliminar publicación");
	    botonEliminarPublicacion.setBounds(40, 400, 200, 60);
	    botonEliminarPublicacion.setBackground(Color.decode("#E8F5E9"));
	    botonEliminarPublicacion.setForeground(Color.decode("#144031"));
	    botonEliminarPublicacion.setFocusPainted(false);
	    this.add(botonEliminarPublicacion);
	    //
	    botonActualizarPublicacion = new JButton("Actualizar publicación");
	    botonActualizarPublicacion.setBounds(40, 500, 200, 60);
	    botonActualizarPublicacion.setBackground(Color.decode("#E8F5E9"));
	    botonActualizarPublicacion.setForeground(Color.decode("#144031"));
	    botonActualizarPublicacion.setFocusPainted(false);
	    this.add(botonActualizarPublicacion);

	    //imagen
	    ImageIcon imagen = new ImageIcon(getClass().getResource("logoUEB.jpg"));
	    JLabel labelImagen = new JLabel(imagen);
	    labelImagen.setBounds(40, 0, 200, 200);
	    add(labelImagen);

	    //imagen 2
	    ImageIcon imagen2 = new ImageIcon(getClass().getResource("tita (1).png"));
	    JLabel labelImagen2 = new JLabel(imagen2);
	    labelImagen2.setBounds(220, 5, 400, 600);
	    add(labelImagen2);

	    // Etiqueta para el campo de búsqueda.
	    etiquetaBusqueda = new JLabel("Buscar publicación:");
	    etiquetaBusqueda.setBounds(750, 120, 200, 25);
	    etiquetaBusqueda.setForeground(Color.decode("#144031"));
	    etiquetaBusqueda.setFont(new Font("Arial", Font.BOLD, 14));
	    this.add(etiquetaBusqueda);

	    // Campo de texto para la búsqueda
	    campoBusqueda = new JTextField();
	    campoBusqueda.setBounds(750, 150, 265, 35); 
	    campoBusqueda.setFont(new Font("Arial", Font.PLAIN, 14));
	    campoBusqueda.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 2));
	    campoBusqueda.addKeyListener(new KeyListener() {
	        @Override
	        public void keyTyped(KeyEvent e) {}

	        @Override
	        public void keyPressed(KeyEvent e) {}

	        @Override
	        public void keyReleased(KeyEvent e) {
	            // buscarEnTiempoReal();
	        }
	    });
	    this.add(campoBusqueda);

	    // Botón de búsqueda
	    botonBuscar = new JButton("Buscar");
	    botonBuscar.setBounds(1020, 150, 80, 35); 
	    botonBuscar.setBackground(Color.decode("#AED581"));
	    botonBuscar.setForeground(Color.decode("#144031"));
	    botonBuscar.setFocusPainted(false);
	    this.add(botonBuscar);

	    // Lista para mostrar resultados
	    modeloLista = new DefaultListModel<>();
	    listaResultados = new JList<>(modeloLista);
	    listaResultados.setFont(new Font("Arial", Font.PLAIN, 12));
	    listaResultados.setBackground(Color.decode("#E8F5E9"));

	    scrollResultados = new JScrollPane(listaResultados);
	    scrollResultados.setBounds(750, 195, 350, 300); 
	    scrollResultados.setBorder(BorderFactory.createLineBorder(Color.decode("#144031"), 1));
	    this.add(scrollResultados);
	}

	private boolean coincideBusqueda(Object publicacion, String textoBusqueda) {
	    if (publicacion instanceof LibroFisico) {
	        LibroFisico libro = (LibroFisico) publicacion;
	        return buscarEnCampos(libro.getId(), libro.getTitulo(), libro.getClasificacion(), 
	                            libro.getFacultad(), libro.getIdioma(), libro.getAutor(), textoBusqueda);
	    }
	    else if (publicacion instanceof LibroVirtual) {
	        LibroVirtual libro = (LibroVirtual) publicacion;
	        return buscarEnCampos(libro.getId(), libro.getTitulo(), libro.getClasificacion(), 
	                            libro.getFacultad(), libro.getIdioma(), libro.getAutor(), textoBusqueda);
	    }
	    else if (publicacion instanceof Articulo) {
	        Articulo articulo = (Articulo) publicacion;
	        return buscarEnCampos(articulo.getId(), articulo.getTitulo(), articulo.getClasificacion(), 
	                            articulo.getFacultad(), articulo.getIdioma(), articulo.getAutor(), textoBusqueda);
	    }
	    else if (publicacion instanceof Pelicula) {
	        Pelicula pelicula = (Pelicula) publicacion;
	        return buscarEnCampos(pelicula.getId(), pelicula.getTitulo(), pelicula.getClasificacion(), 
	                            pelicula.getFacultad(), pelicula.getIdioma(), "", textoBusqueda);
	    }
	    else if (publicacion instanceof Revista) {
	        Revista revista = (Revista) publicacion;
	        return buscarEnCampos(revista.getId(), revista.getTitulo(), revista.getClasificacion(), 
	                            revista.getFacultad(), revista.getIdioma(), revista.getAutor(), textoBusqueda);
	    }
	    else if (publicacion instanceof Steam) {
	        Steam juego = (Steam) publicacion;
	        return buscarEnCampos(juego.getId(), juego.getTitulo(), juego.getClasificacion(), 
	                            juego.getFacultad(), juego.getIdioma(), "", textoBusqueda);
	    }
	    
	    return false;
	}

	private boolean buscarEnCampos(int id, String titulo, String clasificacion, String facultad, 
	                              String idioma, String autor, String textoBusqueda) {
	    
	    // Convertir todo a minúsculas para búsqueda insensible a mayúsculas
	    String tituloLower = titulo != null ? titulo.toLowerCase() : "";
	    String clasificacionLower = clasificacion != null ? clasificacion.toLowerCase() : "";
	    String facultadLower = facultad != null ? facultad.toLowerCase() : "";
	    String idiomaLower = idioma != null ? idioma.toLowerCase() : "";
	    String autorLower = autor != null ? autor.toLowerCase() : "";
	    
	    // Buscar por ID (convertir a string)
	    if (String.valueOf(id).contains(textoBusqueda)) {
	        return true;
	    }
	    
	    // Buscar por primera letra del título
	    if (!tituloLower.isEmpty() && tituloLower.startsWith(textoBusqueda)) {
	        return true;
	    }
	    
	    // Buscar en título (contiene)   //correcion
	    if (tituloLower.contains(textoBusqueda)) {
	        return true;
	    }
	    
	    // Buscar en clasificación
	    if (clasificacionLower.contains(textoBusqueda)) {
	        return true;
	    }
	    
	    // Buscar en facultad
	    if (facultadLower.contains(textoBusqueda)) {
	        return true;
	    }
	    
	    // Buscar en idioma
	    if (idiomaLower.contains(textoBusqueda)) {
	        return true;
	    }
	    
	    // Buscar en autor (si hay)
	    if (!autorLower.isEmpty() && autorLower.contains(textoBusqueda)) {
	        return true;
	    }
	    
	    return false;
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

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}
	
	public JTextField getCampoBusqueda() {
	    return campoBusqueda;
	}

	public void setCampoBusqueda(JTextField campoBusqueda) {
	    this.campoBusqueda = campoBusqueda;
	}

	public JButton getBotonBuscar() {
	    return botonBuscar;
	}

	public void setBotonBuscar(JButton botonBuscar) {
	    this.botonBuscar = botonBuscar;
	}

	public JList<String> getListaResultados() {
	    return listaResultados;
	}

	public void setListaResultados(JList<String> listaResultados) {
	    this.listaResultados = listaResultados;
	}

	public DefaultListModel<String> getModeloLista() {
	    return modeloLista;
	}

	public void setModeloLista(DefaultListModel<String> modeloLista) {
	    this.modeloLista = modeloLista;
	}
}