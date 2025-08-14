package co.edu.unbosque.model;

public class LibroVirtual {

	//8 constructores
	
	private String tipoDeArchivo;
	private boolean esAudioLibro;
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
