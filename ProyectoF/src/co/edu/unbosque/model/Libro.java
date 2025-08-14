package co.edu.unbosque.model;

public abstract class Libro extends Publicacion{

	private int cantidadDePaginas;
	private String autor;
	private String editorial;
	
	public Libro() {
		super();
	}
	public Libro(int cantidadDePaginas, String autor, String editorial) {
		super();
		this.cantidadDePaginas = cantidadDePaginas;
		this.autor = autor;
		this.editorial = editorial;
	}
	public Libro(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma,
			int cantidadDePaginas, String autor, String editorial) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.cantidadDePaginas = cantidadDePaginas;
		this.autor = autor;
		this.editorial = editorial;
	}
	public Libro(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		// TODO Auto-generated constructor stub
	}
	public int getCantidadDePaginas() {
		return cantidadDePaginas;
	}
	public void setCantidadDePaginas(int cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return super.toString()+" Libro [cantidadDePaginas=" + cantidadDePaginas + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
	
	
}
