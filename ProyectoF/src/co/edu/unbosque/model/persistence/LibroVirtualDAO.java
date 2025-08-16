package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class LibroVirtualDAO implements DAO<LibroVirtual> {

	private ArrayList<LibroVirtual> listaLibrosVirtuales;

	public LibroVirtualDAO() {
		listaLibrosVirtuales = new ArrayList<LibroVirtual>();
	}

	public ArrayList<LibroVirtual> getListaLibrosVirtuales() {
		return listaLibrosVirtuales;
	}

	public void setListaLibrosVirtuales(ArrayList<LibroVirtual> listaLibrosVirtuales) {
		this.listaLibrosVirtuales = listaLibrosVirtuales;
	}

	@Override
	public void crear(LibroVirtual nuevoDato) {
		listaLibrosVirtuales.add(nuevoDato);

	}

	@Override
	public String mostrarDatos() {
		String contenido = "";
		for (LibroVirtual temp : listaLibrosVirtuales) {
			contenido += temp.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminarDato(int indice) {
		if (indice < 0 || indice >= listaLibrosVirtuales.size()) {
			return false;
		} else {
			listaLibrosVirtuales.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminarDato(LibroVirtual objetoEliminar) {
		return listaLibrosVirtuales.remove(objetoEliminar);
	}

	@Override
	public boolean actualizar(int indice, LibroVirtual datoActualizado) {
		if (indice < 0 || indice >= listaLibrosVirtuales.size()) {
			return false;
		} else {
			listaLibrosVirtuales.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public int contar() {
		return listaLibrosVirtuales.size();
	}

}
