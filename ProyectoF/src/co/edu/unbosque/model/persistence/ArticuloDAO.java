package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class ArticuloDAO implements DAO<Articulo> {

	private ArrayList<Articulo> listaArticulos;

	public ArticuloDAO() {
		listaArticulos = new ArrayList<Articulo>();
	}

	public ArrayList<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
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
	public boolean eliminarDato(int indice) {
		if (indice < 0 || indice >= listaArticulos.size()) {
			return false;
		} else {
			listaArticulos.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminarDato(Articulo objetoEliminar) {
		return listaArticulos.remove(objetoEliminar);
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
