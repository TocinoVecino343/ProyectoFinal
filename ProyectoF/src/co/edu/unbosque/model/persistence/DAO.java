package co.edu.unbosque.model.persistence;

public interface DAO<E> {

	public void crear(E nuevoDato);

	public String mostrarDatos();

	public boolean eliminarDato(int indice);

	public boolean eliminarDato(E objetoEliminar);

	public boolean actualizar(int indice, E datoActualizado);

	public int contar();
}
