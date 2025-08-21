package co.edu.unbosque.model;

public class Revista extends Publicacion {

	private String autor;
	private String fuente;
	private String terminosGeograficos;
	private String descripcionFisica;

	public Revista() {
		super();
	}

	public Revista(String autor, String fuente, String terminosGeograficos, String descipcionFisica) {
		super();
		this.autor = autor;
		this.fuente = fuente;
		this.terminosGeograficos = terminosGeograficos;
		this.descripcionFisica = descipcionFisica;
	}

	public Revista(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma,
			String autor, String fuente, String terminosGeograficos, String descripcionFisica) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.autor = autor;
		this.fuente = fuente;
		this.terminosGeograficos = terminosGeograficos;
		this.descripcionFisica = descripcionFisica;
	}

	public Revista(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
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

	public String getDescripcionFisica() {
		return descripcionFisica;
	}

	public void setDescripcionFisica(String descripcionFisica) {
		this.descripcionFisica = descripcionFisica;
	}

	@Override
	public String toString() {
		return super.toString() + " -----Revista-----" + "\nAutor: " + autor + "\nFuente: " + fuente + "\nTérminosGeograficos: "
				+ terminosGeograficos + "Descripción Física: " + descripcionFisica;
	}

}
