package co.edu.unbosque.model;

public class Articulo extends Publicacion {

	// listo respecto a UML

	private String autor;
	private String fuente;
	private String terminosGeograficos;
	private int cantidadDePaginas;

	public Articulo() {
		super();
	}

	public Articulo(String autor, String fuente, String terminosGeograficos, int cantidadDePaginas) {
		super();
		this.autor = autor;
		this.fuente = fuente;
		this.terminosGeograficos = terminosGeograficos;
		this.cantidadDePaginas = cantidadDePaginas;
	}

	public Articulo(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma,
			String autor, String fuente, String terminosGeograficos, int cantidadDePaginas) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.autor = autor;
		this.fuente = fuente;
		this.terminosGeograficos = terminosGeograficos;
		this.cantidadDePaginas = cantidadDePaginas;
	}

	public Articulo(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		// TODO Auto-generated constructor stub
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getTerminosGeograficos() {
		return terminosGeograficos;
	}

	public void setTerminosGeograficos(String terminosGeograficos) {
		this.terminosGeograficos = terminosGeograficos;
	}

	public int getCantidadDePaginas() {
		return cantidadDePaginas;
	}

	public void setCantidadDePaginas(int cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}

	@Override
	public String toString() {
		return super.toString() + " \n-----Artículo------" + "\nAutor: " + autor + "\nFuente:" + fuente
				+ "Términos Geograficos: " + terminosGeograficos + "\nCantidad de Páginas: " + cantidadDePaginas;
	}

}
