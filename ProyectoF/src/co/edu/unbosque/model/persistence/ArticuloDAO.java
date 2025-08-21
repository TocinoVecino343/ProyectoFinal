package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class ArticuloDAO implements DAO<Articulo> {

	private ArrayList<Articulo> listaArticulos;

	public ArticuloDAO() {
		listaArticulos = new ArrayList<Articulo>();
	}

	@Override
	public void crear(Articulo nuevoDato) {
		listaArticulos.add(nuevoDato);

	}

	@Override
	public String mostrarDatos() {
		String contenido = "";
		for (Articulo temp : listaArticulos) {
			contenido += temp.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminarDato(int idEliminar) {
		boolean retorno = false;
		for (int i = 0; i < listaArticulos.size(); i++) {
			if (listaArticulos.get(i).getId() == idEliminar) {
				listaArticulos.remove(i);
				retorno = true;
			} else {
				retorno = false;
			}
		}
		return retorno;
	}

	@Override
	public boolean actualizar(int indice, Articulo datoActualizado) {
		if (indice < 0 || indice >= listaArticulos.size()) {
			return false;
		} else {
			listaArticulos.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public int contar() {
		return listaArticulos.size();
	}

}
