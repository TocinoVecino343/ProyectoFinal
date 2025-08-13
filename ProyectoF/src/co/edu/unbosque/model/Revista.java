package co.edu.unbosque.model;

public class Revista extends Publicacion {

	private String autor;
	private String fuente;
	private String terminosGeograficos;
	
	public Revista() {
		super();
	}
	
	public Revista(String autor, String fuente, String terminosGeograficos) {
		super();
		this.autor = autor;
		this.fuente = fuente;
		this.terminosGeograficos = terminosGeograficos;
	}
	
	public Revista(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma,
			String autor, String fuente, String terminosGeograficos) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.autor = autor;
		this.fuente = fuente;
		this.terminosGeograficos = terminosGeograficos;
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

	@Override
	public String toString() {
		return super.toString()+" Revista [autor=" + autor + ", fuente=" + fuente + ", terminosGeograficos=" + terminosGeograficos + "]";
	}

	
	
	
}
