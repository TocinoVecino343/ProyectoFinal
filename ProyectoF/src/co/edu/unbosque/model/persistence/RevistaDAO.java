package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class RevistaDAO implements DAO<Revista> {

	private ArrayList<Revista> listaRevistas;

	public RevistaDAO() {
		listaRevistas = new ArrayList<Revista>();
	}

	public ArrayList<Revista> getListaRevistas() {
		return listaRevistas;
	}

	public void setListaRevistas(ArrayList<Revista> listaRevistas) {
		this.listaRevistas = listaRevistas;
	}

	@Override
	public void crear(Revista nuevoDato) {
		listaRevistas.add(nuevoDato);

	}

	@Override
	public String mostrarDatos() {
		String contenido = "";
		for (Revista temp : listaRevistas) {
			contenido += temp.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminarDato(int indice) {
		if (indice < 0 || indice >= listaRevistas.size()) {
			return false;
		} else {
			listaRevistas.remove(indice);
			return true;
		}
	}

	@Override
	public boolean actualizar(int indice, Revista datoActualizado) {
		if (indice < 0 || indice >= listaRevistas.size()) {
			return false;
		} else {
			listaRevistas.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public int contar() {
		return listaRevistas.size();
	}

}
