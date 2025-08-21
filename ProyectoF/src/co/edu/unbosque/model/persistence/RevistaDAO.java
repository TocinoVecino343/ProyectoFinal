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
	public boolean eliminarDato(int idEliminar) {
		boolean retorno = false;
		for (int i = 0; i < listaRevistas.size(); i++) {
			if (listaRevistas.get(i).getId() == idEliminar) {
				listaRevistas.remove(i);
				retorno = true;
			} else {
				retorno = false;
			}
		}
		return retorno;
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

	@Override
	public String filtrar(char datoABuscar) {
		String contenido = "";
		for (Revista revista : listaRevistas) {
			char charRevista = revista.getTitulo().charAt(0);

			if (charRevista == datoABuscar) {
				contenido += revista.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarFecha(int fechaABuscar) {
		String contenido = "";
		for (Revista revista : listaRevistas) {
			if (revista.getFechaDePublicacion() == fechaABuscar) {
				contenido += revista.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarTitulo(String tituloABuscar) {
		String contenido = "";
		for (Revista revista : listaRevistas) {
			if (revista.getTitulo() == tituloABuscar) {
				contenido += revista.toString();
			}
		}
		return contenido;

	}

	@Override
	public String filtrarFacultad(String facultadABuscar) {
		String contenido = "";
		for (Revista revista : listaRevistas) {
			if (revista.getFacultad() == facultadABuscar) {
				contenido += revista.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarIdioma(String idiomaABuscar) {
		String contenido = "";
		for (Revista revista : listaRevistas) {
			if (revista.getIdioma() == idiomaABuscar) {
				contenido += revista.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarId(int idABuscar) {
		String contenido = "";
		for (int i = 0; i < listaRevistas.size(); i++) {
			if (listaRevistas.get(i).getId() == idABuscar) {
				contenido = listaRevistas.get(i).toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarClasificacion(String clasificacionABuscar) {
		String contenido = "";
		for (Revista revista : listaRevistas) {
			if (revista.getClasificacion() == clasificacionABuscar) {
				contenido += revista.toString();
			}
		}
		return contenido;
	}

	@Override
	public int filtrarActualizar(int id) {
		int indice = -1;
		for (int i = 0; i < listaRevistas.size(); i++) {
			if (listaRevistas.get(i).getId() == id) {
				indice = i;
			}
		}
		return indice;
	}
}
