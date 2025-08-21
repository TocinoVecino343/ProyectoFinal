package co.edu.unbosque.model.persistence;

public interface DAO<E> {

	public void crear(E nuevoDato);

	public String mostrarDatos();

	public boolean eliminarDato(int idELiminar);

	public boolean actualizar(int indice, E datoActualizado);

	public String filtrar(char datoABuscar);

	public String filtrarFecha(int fechaABuscar);

	public String filtrarTitulo(String tituloABuscar);

	public String filtrarFacultad(String facultadABuscar);

	public String filtrarIdioma(String idiomaABuscar);

	public String filtrarId(int idABuscar);

	public String filtrarClasificacion(String clasificacionABuscar);

	public int filtrarActualizar(int id);

	public int contar();
}
