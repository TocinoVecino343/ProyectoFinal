package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class LibroFisicoDAO implements DAO<LibroFisico> {

	private ArrayList<LibroFisico> listaLibrosFisicos;

	public LibroFisicoDAO() {
		listaLibrosFisicos = new ArrayList<LibroFisico>();
	}
	
	public ArrayList<LibroFisico> getListaLibrosFisicos() {
	    return listaLibrosFisicos;
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
	public boolean eliminarDato(int idEliminar) {
		boolean retorno = false;
		for (int i = 0; i < listaLibrosFisicos.size(); i++) {
			if (listaLibrosFisicos.get(i).getId() == idEliminar) {
				listaLibrosFisicos.remove(i);
				retorno = true;
			} else {
				retorno = false;
			}
		}
		return retorno;
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

	@Override
	public String filtrar(char datoABuscar) {
		String contenido = "";
		for (LibroFisico libroFisico : listaLibrosFisicos) {
			char charLibroFisico = libroFisico.getTitulo().charAt(0);

			if (charLibroFisico == datoABuscar) {
				contenido += libroFisico.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarFecha(int fechaABuscar) {
		String contenido = "";
		for (LibroFisico libroFisico : listaLibrosFisicos) {
			if (libroFisico.getFechaDePublicacion() == fechaABuscar) {
				contenido += libroFisico.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarTitulo(String tituloABuscar) {
		String contenido = "";
		for (LibroFisico libroFisico : listaLibrosFisicos) {
			if (libroFisico.getTitulo() == tituloABuscar) {
				contenido += libroFisico.toString();
			}
		}
		return contenido;

	}

	@Override
	public String filtrarFacultad(String facultadABuscar) {
		String contenido = "";
		for (LibroFisico libroFisico : listaLibrosFisicos) {
			if (libroFisico.getFacultad() == facultadABuscar) {
				contenido += libroFisico.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarIdioma(String idiomaABuscar) {
		String contenido = "";
		for (LibroFisico libroFisico : listaLibrosFisicos) {
			if (libroFisico.getIdioma() == idiomaABuscar) {
				contenido += libroFisico.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarId(int idABuscar) {
		String contenido = "";
		for (int i = 0; i < listaLibrosFisicos.size(); i++) {
			if (listaLibrosFisicos.get(i).getId() == idABuscar) {
				contenido = listaLibrosFisicos.get(i).toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarClasificacion(String clasificacionABuscar) {
		String contenido = "";
		for (LibroFisico libroFisico : listaLibrosFisicos) {
			if (libroFisico.getClasificacion() == clasificacionABuscar) {
				contenido += libroFisico.toString();
			}
		}
		return contenido;
	}

	@Override
	public int filtrarActualizar(int id) {
		int indice = -1;
		for (int i = 0; i < listaLibrosFisicos.size(); i++) {
			if (listaLibrosFisicos.get(i).getId() == id) {
				indice = i;
			}
		}
		return indice;
	}

	public void setListaLibrosFisicos(ArrayList<LibroFisico> listaLibrosFisicos) {
		this.listaLibrosFisicos = listaLibrosFisicos;
	}
	
}
