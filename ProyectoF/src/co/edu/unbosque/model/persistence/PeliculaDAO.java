package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class PeliculaDAO implements DAO<Pelicula> {

	private ArrayList<Pelicula> listaPeliculas;

	public PeliculaDAO() {
		listaPeliculas = new ArrayList<Pelicula>();
	}

	@Override
	public void crear(Pelicula nuevoDato) {
		listaPeliculas.add(nuevoDato);

	}

	@Override
	public String mostrarDatos() {
		String contenido = "";
		for (Pelicula temp : listaPeliculas) {
			contenido += temp.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminarDato(int indice) {
		if (indice < 0 || indice >= listaPeliculas.size()) {
			return false;
		} else {
			listaPeliculas.remove(indice);
			return true;
		}
	}

	@Override
	public boolean actualizar(int indice, Pelicula datoActualizado) {
		if (indice < 0 || indice >= listaPeliculas.size()) {
			return false;
		} else {
			listaPeliculas.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public int contar() {
		return listaPeliculas.size();
	}

}
