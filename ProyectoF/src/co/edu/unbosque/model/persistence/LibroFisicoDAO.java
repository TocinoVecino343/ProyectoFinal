package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class LibroFisicoDAO implements DAO<LibroFisico> {

	private ArrayList<LibroFisico> listaLibrosFisicos;

	public LibroFisicoDAO() {
		listaLibrosFisicos = new ArrayList<LibroFisico>();
	}

	@Override
	public void crear(LibroFisico nuevoDato) {
		listaLibrosFisicos.add(nuevoDato);

	}

	@Override
	public String mostrarDatos() {
		String contenido = "";
		for (LibroFisico temp : listaLibrosFisicos) {
			contenido += temp.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminarDato(int indice) {
		if (indice < 0 || indice >= listaLibrosFisicos.size()) {
			return false;
		} else {
			listaLibrosFisicos.remove(indice);
			return true;
		}
	}

	@Override
	public boolean actualizar(int indice, LibroFisico datoActualizado) {
		if (indice < 0 || indice >= listaLibrosFisicos.size()) {
			return false;
		} else {
			listaLibrosFisicos.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public int contar() {
		return listaLibrosFisicos.size();
	}

}
