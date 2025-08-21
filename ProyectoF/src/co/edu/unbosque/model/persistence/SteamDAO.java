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

	@Override
	public String filtrar(char datoABuscar) {
		String contenido = "";
		for (Steam steam : listaSteam) {
			char charSteam = steam.getTitulo().charAt(0);

			if (charSteam == datoABuscar) {
				contenido += steam.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarFecha(int fechaABuscar) {
		String contenido = "";
		for (Steam steam : listaSteam) {
			if (steam.getFechaDePublicacion() == fechaABuscar) {
				contenido += steam.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarTitulo(String tituloABuscar) {
		String contenido = "";
		for (Steam steam : listaSteam) {
			if (steam.getTitulo() == tituloABuscar) {
				contenido += steam.toString();
			}
		}
		return contenido;

	}

	@Override
	public String filtrarFacultad(String facultadABuscar) {
		String contenido = "";
		for (Steam steam : listaSteam) {
			if (steam.getFacultad() == facultadABuscar) {
				contenido += steam.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarIdioma(String idiomaABuscar) {
		String contenido = "";
		for (Steam steam : listaSteam) {
			if (steam.getIdioma() == idiomaABuscar) {
				contenido += steam.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarId(int idABuscar) {
		String contenido = "";
		for (int i = 0; i < listaSteam.size(); i++) {
			if (listaSteam.get(i).getId() == idABuscar) {
				contenido = listaSteam.get(i).toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarClasificacion(String clasificacionABuscar) {
		String contenido = "";
		for (Steam steam : listaSteam) {
			if (steam.getClasificacion() == clasificacionABuscar) {
				contenido += steam.toString();
			}
		}
		return contenido;
	}

}
