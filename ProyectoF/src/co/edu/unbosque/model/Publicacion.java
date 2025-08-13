package co.edu.unbosque.controller;

public class Publicacion {

	private int id;
	private String titulo;
	private String clasificacion;
	private String facultad;
	private int fechaDePublicacion;
	private String idioma;
	
	public Publicacion() {
		super();
	}
	public Publicacion(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.clasificacion = clasificacion;
		this.facultad = facultad;
		this.fechaDePublicacion = fechaDePublicacion;
		this.idioma = idioma;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public int getFechaDePublicacion() {
		return fechaDePublicacion;
	}
	public void setFechaDePublicacion(int fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", titulo=" + titulo + ", clasificacion=" + clasificacion + ", facultad="
				+ facultad + ", fechaDePublicacion=" + fechaDePublicacion + ", idioma=" + idioma + "]";
	}
	

	
}
