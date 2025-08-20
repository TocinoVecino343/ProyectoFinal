package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaActualizar extends JFrame {

	private JLabel labelIdBuscar;
	private JLabel labelPublicacion;
	private JLabel labelTituloPublicacion;
	private JLabel labelClasificacion;
	private JLabel labelFacultad;
	private JLabel labelFecha;
	private JLabel labelIdioma;

	private JTextField textoIdBuscar;
	private JTextField textoPublicacion;
	private JTextField textoTituloPublicacion;
	private JTextField textoClasificacion;
	private JTextField textoFacultad;
	private JTextField textoFecha;
	private JTextField textoIdioma;

	private JTextArea menuActualizacion;

	private JButton botonBuscar;
	private JButton botonActualizarPelicula;
	private JButton botonActualizarArticulo;
	private JButton botonActualizarRevista;
	private JButton botonActualizarJuego4Prot;
	private JButton botonActualizarLibroFisico;
	private JButton botonActualizarLibroVirtual;

	public VentanaActualizar() {
		inicializarActualizar();
	}

	public void inicializarActualizar() {
		setTitle("Menú de Actualización");
		setBounds(10, 10, 1280, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		labelIdBuscar = new JLabel("ID a Buscar:");
		labelIdBuscar.setBounds(50, 20, 150, 30);
		add(labelIdBuscar);

		textoIdBuscar = new JTextField();
		textoIdBuscar.setBounds(200, 20, 200, 30);
		add(textoIdBuscar);

		botonBuscar = new JButton("Buscar");
		botonBuscar.setBounds(420, 20, 100, 30);
		add(botonBuscar);

		labelPublicacion = new JLabel("Publicación:");
		labelPublicacion.setBounds(50, 70, 150, 30);
		add(labelPublicacion);

		textoPublicacion = new JTextField();
		textoPublicacion.setBounds(200, 70, 200, 30);
		add(textoPublicacion);

		labelTituloPublicacion = new JLabel("Título:");
		labelTituloPublicacion.setBounds(50, 120, 150, 30);
		add(labelTituloPublicacion);

		textoTituloPublicacion = new JTextField();
		textoTituloPublicacion.setBounds(200, 120, 200, 30);
		add(textoTituloPublicacion);

		labelClasificacion = new JLabel("Clasificación:");
		labelClasificacion.setBounds(50, 170, 150, 30);
		add(labelClasificacion);

		textoClasificacion = new JTextField();
		textoClasificacion.setBounds(200, 170, 200, 30);
		add(textoClasificacion);

		labelFacultad = new JLabel("Facultad:");
		labelFacultad.setBounds(50, 220, 150, 30);
		add(labelFacultad);

		textoFacultad = new JTextField();
		textoFacultad.setBounds(200, 220, 200, 30);
		add(textoFacultad);

		labelFecha = new JLabel("Fecha:");
		labelFecha.setBounds(50, 270, 150, 30);
		add(labelFecha);

		textoFecha = new JTextField();
		textoFecha.setBounds(200, 270, 200, 30);
		add(textoFecha);

		labelIdioma = new JLabel("Idioma:");
		labelIdioma.setBounds(50, 320, 150, 30);
		add(labelIdioma);

		textoIdioma = new JTextField();
		textoIdioma.setBounds(200, 320, 200, 30);
		add(textoIdioma);

		menuActualizacion = new JTextArea("1. Actualizar Película\n" + "2. Actualizar Artículo\n"
				+ "3. Actualizar Revista\n" + "4. Actualizar Juego 4 Prot\n" + "5. Actualizar Libro Físico\n"
				+ "6. Actualizar Libro Virtual\n\n" + "Busque primero por ID,\n" + "luego modifique los campos\n"
				+ "y seleccione el tipo a actualizar.");
		menuActualizacion.setBounds(500, 50, 300, 200);
		menuActualizacion.setEditable(false);
		add(menuActualizacion);

		botonActualizarPelicula = new JButton("Actualizar Película");
		botonActualizarPelicula.setBounds(500, 270, 200, 30);
		add(botonActualizarPelicula);

		botonActualizarArticulo = new JButton("Actualizar Artículo");
		botonActualizarArticulo.setBounds(500, 320, 200, 30);
		add(botonActualizarArticulo);

		botonActualizarRevista = new JButton("Actualizar Revista");
		botonActualizarRevista.setBounds(500, 370, 200, 30);
		add(botonActualizarRevista);

		botonActualizarJuego4Prot = new JButton("Actualizar Juego 4 Prot");
		botonActualizarJuego4Prot.setBounds(500, 420, 200, 30);
		add(botonActualizarJuego4Prot);

		botonActualizarLibroFisico = new JButton("Actualizar Libro Físico");
		botonActualizarLibroFisico.setBounds(500, 470, 200, 30);
		add(botonActualizarLibroFisico);

		botonActualizarLibroVirtual = new JButton("Actualizar Libro Virtual");
		botonActualizarLibroVirtual.setBounds(500, 520, 200, 30);
		add(botonActualizarLibroVirtual);
	}

	public JLabel getLabelIdBuscar() {
		return labelIdBuscar;
	}

	public void setLabelIdBuscar(JLabel labelIdBuscar) {
		this.labelIdBuscar = labelIdBuscar;
	}

	public JTextField getTextoIdBuscar() {
		return textoIdBuscar;
	}

	public void setTextoIdBuscar(JTextField textoIdBuscar) {
		this.textoIdBuscar = textoIdBuscar;
	}

	public JButton getBotonBuscar() {
		return botonBuscar;
	}

	public void setBotonBuscar(JButton botonBuscar) {
		this.botonBuscar = botonBuscar;
	}

	public JLabel getLabelPublicacion() {
		return labelPublicacion;
	}

	public void setLabelPublicacion(JLabel labelPublicacion) {
		this.labelPublicacion = labelPublicacion;
	}

	public JLabel getLabelTituloPublicacion() {
		return labelTituloPublicacion;
	}

	public void setLabelTituloPublicacion(JLabel labelTituloPublicacion) {
		this.labelTituloPublicacion = labelTituloPublicacion;
	}

	public JLabel getLabelClasificacion() {
		return labelClasificacion;
	}

	public void setLabelClasificacion(JLabel labelClasificacion) {
		this.labelClasificacion = labelClasificacion;
	}

	public JLabel getLabelFacultad() {
		return labelFacultad;
	}

	public void setLabelFacultad(JLabel labelFacultad) {
		this.labelFacultad = labelFacultad;
	}

	public JLabel getLabelFecha() {
		return labelFecha;
	}

	public void setLabelFecha(JLabel labelFecha) {
		this.labelFecha = labelFecha;
	}

	public JLabel getLabelIdioma() {
		return labelIdioma;
	}

	public void setLabelIdioma(JLabel labelIdioma) {
		this.labelIdioma = labelIdioma;
	}

	public JTextField getTextoPublicacion() {
		return textoPublicacion;
	}

	public void setTextoPublicacion(JTextField textoPublicacion) {
		this.textoPublicacion = textoPublicacion;
	}

	public JTextField getTextoTituloPublicacion() {
		return textoTituloPublicacion;
	}

	public void setTextoTituloPublicacion(JTextField textoTituloPublicacion) {
		this.textoTituloPublicacion = textoTituloPublicacion;
	}

	public JTextField getTextoClasificacion() {
		return textoClasificacion;
	}

	public void setTextoClasificacion(JTextField textoClasificacion) {
		this.textoClasificacion = textoClasificacion;
	}

	public JTextField getTextoFacultad() {
		return textoFacultad;
	}

	public void setTextoFacultad(JTextField textoFacultad) {
		this.textoFacultad = textoFacultad;
	}

	public JTextField getTextoFecha() {
		return textoFecha;
	}

	public void setTextoFecha(JTextField textoFecha) {
		this.textoFecha = textoFecha;
	}

	public JTextField getTextoIdioma() {
		return textoIdioma;
	}

	public void setTextoIdioma(JTextField textoIdioma) {
		this.textoIdioma = textoIdioma;
	}

	public JTextArea getMenuActualizacion() {
		return menuActualizacion;
	}

	public void setMenuActualizacion(JTextArea menuActualizacion) {
		this.menuActualizacion = menuActualizacion;
	}

	public JButton getBotonActualizarPelicula() {
		return botonActualizarPelicula;
	}

	public void setBotonActualizarPelicula(JButton botonActualizarPelicula) {
		this.botonActualizarPelicula = botonActualizarPelicula;
	}

	public JButton getBotonActualizarArticulo() {
		return botonActualizarArticulo;
	}

	public void setBotonActualizarArticulo(JButton botonActualizarArticulo) {
		this.botonActualizarArticulo = botonActualizarArticulo;
	}

	public JButton getBotonActualizarRevista() {
		return botonActualizarRevista;
	}

	public void setBotonActualizarRevista(JButton botonActualizarRevista) {
		this.botonActualizarRevista = botonActualizarRevista;
	}

	public JButton getBotonActualizarJuego4Prot() {
		return botonActualizarJuego4Prot;
	}

	public void setBotonActualizarJuego4Prot(JButton botonActualizarJuego4Prot) {
		this.botonActualizarJuego4Prot = botonActualizarJuego4Prot;
	}

	public JButton getBotonActualizarLibroFisico() {
		return botonActualizarLibroFisico;
	}

	public void setBotonActualizarLibroFisico(JButton botonActualizarLibroFisico) {
		this.botonActualizarLibroFisico = botonActualizarLibroFisico;
	}

	public JButton getBotonActualizarLibroVirtual() {
		return botonActualizarLibroVirtual;
	}

	public void setBotonActualizarLibroVirtual(JButton botonActualizarLibroVirtual) {
		this.botonActualizarLibroVirtual = botonActualizarLibroVirtual;
	}
	
}
