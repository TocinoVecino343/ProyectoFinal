package co.edu.unbosque.model;

public class Revista extends Publicacion {

	private String autor;
	private String fuente;
	private String terminosGeograficos;
	private String descipcionFisica;

	public Revista() {
		super();
	}

	public Revista(String autor, String fuente, String terminosGeograficos, String descipcionFisica) {
		super();
		this.autor = autor;
		this.fuente = fuente;
		this.terminosGeograficos = terminosGeograficos;
		this.descipcionFisica = descipcionFisica;
	}

	public Revista(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma,
			String autor, String fuente, String terminosGeograficos, String descipcionFisica) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.autor = autor;
		this.fuente = fuente;
		this.terminosGeograficos = terminosGeograficos;
		this.descipcionFisica = descipcionFisica;
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

	public String getDescipcionFisica() {
		return descipcionFisica;
	}

	public void setDescipcionFisica(String descipcionFisica) {
		this.descipcionFisica = descipcionFisica;
	}

	@Override
	public String toString() {
		return super.toString() + " Revista [autor=" + autor + ", fuente=" + fuente + ", terminosGeograficos="
				+ terminosGeograficos + ", descipcionFisica=" + descipcionFisica + "]";
	}

}
