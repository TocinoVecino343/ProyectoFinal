package co.edu.unbosque.model;

public class Pelicula extends Publicacion{

	private String productora;
	private String pais;
	private String director;
	private String guion;
	private String fotografia;
	private String musica;
	private String reparto;
	private String duracion;
	private String idiomaDisponible;
	private String subtitulo;
	
	public Pelicula() {
		super();
	}

	public Pelicula(String productora, String pais, String director, String guion, String fotografia, String musica,
			String reparto, String duracion, String idiomaDisponible, String subtitulo) {
		super();
		this.productora = productora;
		this.pais = pais;
		this.director = director;
		this.guion = guion;
		this.fotografia = fotografia;
		this.musica = musica;
		this.reparto = reparto;
		this.duracion = duracion;
		this.idiomaDisponible = idiomaDisponible;
		this.subtitulo = subtitulo;
	}

	public Pelicula(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion, String idioma,
			String productora, String pais, String director, String guion, String fotografia, String musica,
			String reparto, String duracion, String idiomaDisponible, String subtitulo) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.productora = productora;
		this.pais = pais;
		this.director = director;
		this.guion = guion;
		this.fotografia = fotografia;
		this.musica = musica;
		this.reparto = reparto;
		this.duracion = duracion;
		this.idiomaDisponible = idiomaDisponible;
		this.subtitulo = subtitulo;
	}

	public Pelicula(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		// TODO Auto-generated constructor stub
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGuion() {
		return guion;
	}

	public void setGuion(String guion) {
		this.guion = guion;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getIdiomaDisponible() {
		return idiomaDisponible;
	}

	public void setIdiomaDisponible(String idiomaDisponible) {
		this.idiomaDisponible = idiomaDisponible;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	@Override
	public String toString() {
		return super.toString()+" \n-----Pelicula-----" + "\nProductora: " + productora + "\nPaís: " + pais + "\nDirector: " + director + "\nGuión: " + guion
				+ "\nFotogría: " + fotografia + "\nMúsica: " + musica + "\nReparto: " + reparto + "\nDuración: "
				+ duracion + "\nIdiomasDisponibles: " + idiomaDisponible + "\nSubtitulos: " + subtitulo;
	}
}
