package co.edu.unbosque.model;

public class LibroVirtual extends Libro {

	private String tipoDeArchivo;
	private boolean esAudioLibro;
	
	// Constructores (8)
	
	public LibroVirtual() {
		// TODO Auto-generated constructor stub
	}
	
	public LibroVirtual(String tipoDeArchivo, boolean esAudioLibro) {
		super();
		this.tipoDeArchivo = tipoDeArchivo;
		this.esAudioLibro = esAudioLibro;
	}

	public LibroVirtual(int cantidadDePaginas, String autor, String editorial, String tipoDeArchivo,
			boolean esAudioLibro) {
		super(cantidadDePaginas, autor, editorial);
		this.tipoDeArchivo = tipoDeArchivo;
		this.esAudioLibro = esAudioLibro;
	}
	
	public LibroVirtual(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma, int cantidadDePaginas, String autor, String editorial, String tipoDeArchivo,
			boolean esAudioLibro) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma, cantidadDePaginas, autor, editorial);
		this.tipoDeArchivo = tipoDeArchivo;
		this.esAudioLibro = esAudioLibro;
	}
	
	public LibroVirtual(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma, String tipoDeArchivo, boolean esAudioLibro) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		this.tipoDeArchivo = tipoDeArchivo;
		this.esAudioLibro = esAudioLibro;
	}

	public LibroVirtual(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma, int cantidadDePaginas, String autor, String editorial) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma, cantidadDePaginas, autor, editorial);
		// TODO Auto-generated constructor stub
	}

	public LibroVirtual(int id, String titulo, String clasificacion, String facultad, int fechaDePublicacion,
			String idioma) {
		super(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma);
		// TODO Auto-generated constructor stub
	}

	public LibroVirtual(int cantidadDePaginas, String autor, String editorial) {
		super(cantidadDePaginas, autor, editorial);
		// TODO Auto-generated constructor stub
	}

	// getters y setters
	
	public String getTipoDeArchivo() {
		return tipoDeArchivo;
	}
	
	public void setTipoDeArchivo(String tipoDeArchivo) {
		this.tipoDeArchivo = tipoDeArchivo;
	}
	
	public boolean isEsAudioLibro() {
		return esAudioLibro;
	}
	
	public void setEsAudioLibro(boolean esAudioLibro) {
		this.esAudioLibro = esAudioLibro;
	}
	
	@Override
	public String toString() {
		return super.toString()+" LibroVirtual [tipoDeArchivo=" + tipoDeArchivo + ", esAudioLibro=" + esAudioLibro + "]";
	}
	
	
	
	
	
	
}
