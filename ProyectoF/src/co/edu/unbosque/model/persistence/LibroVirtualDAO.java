package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class LibroVirtualDAO implements DAO<LibroVirtual> {

	private ArrayList<LibroVirtual> listaLibrosVirtuales;

	public LibroVirtualDAO() {
		listaLibrosVirtuales = new ArrayList<LibroVirtual>();
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
	public boolean eliminarDato(int idEliminar) {
		boolean retorno = false;
		for (int i = 0; i < listaLibrosVirtuales.size(); i++) {
			if (listaLibrosVirtuales.get(i).getId() == idEliminar) {
				listaLibrosVirtuales.remove(i);
				retorno = true;
			} else {
				retorno = false;
			}
		}
		return retorno;
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
