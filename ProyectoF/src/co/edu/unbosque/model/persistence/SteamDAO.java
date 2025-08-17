package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class SteamDAO implements DAO<Steam> {

	private ArrayList<Steam> listaSteam;

	public SteamDAO() {
		listaSteam = new ArrayList<Steam>();
	}

	@Override
	public void crear(Steam nuevoDato) {
		listaSteam.add(nuevoDato);

	}

	@Override
	public String mostrarDatos() {
		String contenido = "";
		for (Steam temp : listaSteam) {
			contenido += temp.toString();
		}
		return contenido;
	}

	@Override
	public boolean eliminarDato(int indice) {
		if (indice < 0 || indice >= listaSteam.size()) {
			return false;
		} else {
			listaSteam.remove(indice);
			return true;
		}
	}

	@Override
	public boolean eliminarDato(Steam objetoEliminar) {
		return listaSteam.remove(objetoEliminar);
	}

	@Override
	public boolean actualizar(int indice, Steam datoActualizado) {
		if (indice < 0 || indice >= listaSteam.size()) {
			return false;
		} else {
			listaSteam.set(indice, datoActualizado);
			return true;
		}
	}

	@Override
	public int contar() {
		return listaSteam.size();
	}

}
