package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class LibroVirtualDAO implements DAO<LibroVirtual> {

	private ArrayList<LibroVirtual> listaLibrosVirtuales;

	public LibroVirtualDAO() {
		listaLibrosVirtuales = new ArrayList<LibroVirtual>();
	}
	
	public ArrayList<LibroVirtual> listaLibrosVirtuales() {
	    return listaLibrosVirtuales;
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

	@Override
	public String filtrar(char datoABuscar) {
		String contenido = "";
		for (LibroVirtual libroVirtual : listaLibrosVirtuales) {
			char charLibroVirtual = libroVirtual.getTitulo().charAt(0);

			if (charLibroVirtual == datoABuscar) {
				contenido += libroVirtual.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarFecha(int fechaABuscar) {
		String contenido = "";
		for (LibroVirtual libroVirtual : listaLibrosVirtuales) {
			if (libroVirtual.getFechaDePublicacion() == fechaABuscar) {
				contenido += libroVirtual.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarTitulo(String tituloABuscar) {
		String contenido = "";
		for (LibroVirtual libroVirtual : listaLibrosVirtuales) {
			if (libroVirtual.getTitulo() == tituloABuscar) {
				contenido += libroVirtual.toString();
			}
		}
		return contenido;

	}

	@Override
	public String filtrarFacultad(String facultadABuscar) {
		String contenido = "";
		for (LibroVirtual libroVirtual : listaLibrosVirtuales) {
			if (libroVirtual.getFacultad() == facultadABuscar) {
				contenido += libroVirtual.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarIdioma(String idiomaABuscar) {
		String contenido = "";
		for (LibroVirtual libroVirtual : listaLibrosVirtuales) {
			if (libroVirtual.getIdioma() == idiomaABuscar) {
				contenido += libroVirtual.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarId(int idABuscar) {
		String contenido = "";
		for (int i = 0; i < listaLibrosVirtuales.size(); i++) {
			if (listaLibrosVirtuales.get(i).getId() == idABuscar) {
				contenido = listaLibrosVirtuales.get(i).toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarClasificacion(String clasificacionABuscar) {
		String contenido = "";
		for (LibroVirtual libroVirtual : listaLibrosVirtuales) {
			if (libroVirtual.getClasificacion() == clasificacionABuscar) {
				contenido += libroVirtual.toString();
			}
		}
		return contenido;
	}

	@Override
	public int filtrarActualizar(int id) {
		int indice = -1;
		for (int i = 0; i < listaLibrosVirtuales.size(); i++) {
			if (listaLibrosVirtuales.get(i).getId() == id) {
				indice = i;
			}
		}
		return indice;
	}
}
