package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class ArticuloDAO implements DAO<Articulo> {

	private ArrayList<Articulo> listaArticulos;

	public ArticuloDAO() {
		listaArticulos = new ArrayList<Articulo>();
	}

	public ArrayList<Articulo> listaArticulos() {
	    return listaArticulos;
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

	@Override
	public String filtrar(char datoABuscar) {
		String contenido = "";
		for (Articulo articulo : listaArticulos) {
			char charArticulo = articulo.getTitulo().charAt(0);

			if (charArticulo == datoABuscar) {
				contenido += articulo.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarFecha(int fechaABuscar) {
		String contenido = "";
		for (Articulo articulo : listaArticulos) {
			if (articulo.getFechaDePublicacion() == fechaABuscar) {
				contenido += articulo.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarTitulo(String tituloABuscar) {
		String contenido = "";
		for (Articulo articulo : listaArticulos) {
			if (articulo.getTitulo() == tituloABuscar) {
				contenido += articulo.toString();
			}
		}
		return contenido;

	}

	@Override
	public String filtrarFacultad(String facultadABuscar) {
		String contenido = "";
		for (Articulo articulo : listaArticulos) {
			if (articulo.getFacultad() == facultadABuscar) {
				contenido += articulo.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarIdioma(String idiomaABuscar) {
		String contenido = "";
		for (Articulo articulo : listaArticulos) {
			if (articulo.getIdioma() == idiomaABuscar) {
				contenido += articulo.toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarId(int idABuscar) {
		String contenido = "";
		for (int i = 0; i < listaArticulos.size(); i++) {
			if (listaArticulos.get(i).getId() == idABuscar) {
				contenido = listaArticulos.get(i).toString();
			}
		}
		return contenido;
	}

	@Override
	public String filtrarClasificacion(String clasificacionABuscar) {
		String contenido = "";
		for (Articulo articulo : listaArticulos) {
			if (articulo.getClasificacion() == clasificacionABuscar) {
				contenido += articulo.toString();
			}
		}
		return contenido;
	}

	@Override
	public int filtrarActualizar(int id) {
		int indice = -1;
		for (int i = 0; i < listaArticulos.size(); i++) {
			if (listaArticulos.get(i).getId() == id) {
				indice = i;
			}
		}
		return indice;
	}

	public ArrayList<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	
}
