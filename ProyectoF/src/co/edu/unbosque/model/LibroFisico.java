package co.edu.unbosque.model;

public final class LibroFisico extends Libro {

	private int cantidadDeCopias;
	private int tiempoDePrestamo;

	// listo respecto a UML

	public LibroFisico() {
		super();
	}

	public LibroFisico(int cantidadDeCopias, int tiempoDePrestamo) {
		super();
		this.cantidadDeCopias = cantidadDeCopias;
		this.tiempoDePrestamo = tiempoDePrestamo;
	}

	public LibroFisico(int cantidadDePaginas, String autor, String editorial, int cantidadDeCopias,
			int tiempoDePrestamo) {
		super(cantidadDePaginas, autor, editorial);
		this.cantidadDeCopias = cantidadDeCopias;
		this.tiempoDePrestamo = tiempoDePrestamo;
	}

	public LibroFisico(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma, int cantidadDePaginas, String autor, String editorial, int cantidadDeCopias,
			int tiempoDePrestamo) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma, cantidadDePaginas, autor, editorial);
		this.cantidadDeCopias = cantidadDeCopias;
		this.tiempoDePrestamo = tiempoDePrestamo;
	}

	public LibroFisico(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma, int cantidadDeCopias, int tiempoDePrestamo) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.cantidadDeCopias = cantidadDeCopias;
		this.tiempoDePrestamo = tiempoDePrestamo;
	}

	public LibroFisico(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma, int cantidadDePaginas, String autor, String editorial) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma, cantidadDePaginas, autor, editorial);
		// TODO Auto-generated constructor stub
	}

	public LibroFisico(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		// TODO Auto-generated constructor stub
	}

	public LibroFisico(int cantidadDePaginas, String autor, String editorial) {
		super(cantidadDePaginas, autor, editorial);
		// TODO Auto-generated constructor stub
	}

	// getters y setters

	public int getCantidadDeCopias() {
		return cantidadDeCopias;
	}

	public void setCantidadDeCopias(int cantidadDeCopias) {
		this.cantidadDeCopias = cantidadDeCopias;
	}

	public int getTiempoDePrestamo() {
		return tiempoDePrestamo;
	}

	public void setTiempoDePrestamo(int tiempoDePrestamo) {
		this.tiempoDePrestamo = tiempoDePrestamo;
	}

	@Override
	public String toString() {
		return super.toString() + " -----Libro Físico-----" + "Cantidad de Copias: " + cantidadDeCopias
				+ "Tiempo de Prestamo: " + tiempoDePrestamo;
	}

}
