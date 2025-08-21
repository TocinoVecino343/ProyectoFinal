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
	public boolean eliminarDato(int idEliminar) {
		boolean retorno = false;
		for (int i = 0; i < listaPeliculas.size(); i++) {
			if (listaPeliculas.get(i).getId() == idEliminar) {
				listaPeliculas.remove(i);
				retorno = true;
			} else {
				retorno = false;
			}
		}
		return retorno;
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

	@Override
	public String filtrar(char datoABuscar) {
		String contenido = "";
		for (Pelicula pelicula : listaPeliculas) {
			char charPelicula = pelicula.getTitulo().charAt(0);

			if (charPelicula == datoABuscar) {
				contenido += pelicula.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarFecha(int fechaABuscar) {
		String contenido = "";
		for (Pelicula pelicula : listaPeliculas) {
			if (pelicula.getFechaDePublicacion() == fechaABuscar) {
				contenido += pelicula.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarTitulo(String tituloABuscar) {
		String contenido = "";
		for (Pelicula pelicula : listaPeliculas) {
			if (pelicula.getTitulo() == tituloABuscar) {
				contenido += pelicula.toString();
			}
		}
		return contenido;

	}

	@Override
	public String filtrarFacultad(String facultadABuscar) {
		String contenido = "";
		for (Pelicula pelicula : listaPeliculas) {
			if (pelicula.getFacultad() == facultadABuscar) {
				contenido += pelicula.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarIdioma(String idiomaABuscar) {
		String contenido = "";
		for (Pelicula pelicula : listaPeliculas) {
			if (pelicula.getIdioma() == idiomaABuscar) {
				contenido += pelicula.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarId(int idABuscar) {
		String contenido = "";
		for (int i = 0; i < listaPeliculas.size(); i++) {
			if (listaPeliculas.get(i).getId() == idABuscar) {
				contenido = listaPeliculas.get(i).toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarClasificacion(String clasificacionABuscar) {
		String contenido = "";
		for (Pelicula pelicula : listaPeliculas) {
			if (pelicula.getClasificacion() == clasificacionABuscar) {
				contenido += pelicula.toString();
			}
		}
		return contenido;
	}

	@Override
	public int filtrarActualizar(int id) {
		int indice = -1;
		for (int i = 0; i < listaPeliculas.size(); i++) {
			if (listaPeliculas.get(i).getId() == id) {
				indice = i;
			}
		}
		return indice;
	}
}
