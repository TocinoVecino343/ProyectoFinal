package co.edu.unbosque.model;

public final class LibroFisico {

	private int cantidadDeCopias;
	private int tiempoDePrestamo;
	
	
	
	//Constructores,son 8
	
	
	
	
	
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
		return super.toString()+" LibroFisico [cantidadDeCopias=" + cantidadDeCopias + ", tiempoDePrestamo=" + tiempoDePrestamo + "]";
	}
	
	
	
	
	
	
}
