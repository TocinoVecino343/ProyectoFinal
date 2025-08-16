package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.*;

public class Controlador {

	private LibroFisicoDAO objLf;
	private LibroVirtualDAO objLv;
	private SteamDAO objS;
	private RevistaDAO objR;
	private PeliculaDAO objP;
	private ArticuloDAO objA;
	private Consola con;

	public Controlador() {
		objLf = new LibroFisicoDAO();
		objLv = new LibroVirtualDAO();
		objS = new SteamDAO();
		objR = new RevistaDAO();
		objP = new PeliculaDAO();
		objA = new ArticuloDAO();
		con = new Consola();
	}

	public void run() {
		int opcion = 0;
		do {
			con.escribirConSalto("Bienvenido a la biblioteca de la UEB");

			con.escribirConSalto("Seleccione la opcion que desea realizar");
			con.escribirConSalto("1. Crear Publicacion" + "\n2. Mostrar Publicacion" + "\n3. Eliminar Publicacion"
					+ "\n4. Actualizar Publicacion ");
			opcion = con.leerInt();
			switch (opcion) {

			case 1:
				int opcionCrear = 0;
				con.escribirConSalto("Seleccione la accion que desea realizar");
				con.escribirConSalto("Crear un/a: " + "\n1. Pelicula" + "\n2. Articulo" + "\n3. Revista"
						+ "\n4. Juego de 4Prot" + "\n5. Libro Fisico" + "\n6. Libro Virtual");
				opcionCrear = con.leerInt();

				con.escribirConSalto("Ingrese el id de la publicacion");
				int id = con.leerInt();

				con.quemarLinea();

				con.escribirConSalto("Ingrese el titulo de la publicacion");
				String titulo = con.leerLineaCompleta();
				con.escribirConSalto("Ingrese la clasificacion de la publicacion");
				String clasificacion = con.leerPalabra();
				con.escribirConSalto("Ingrese la facultad a la que pertenece la publicacion");
				String facultad = con.leerPalabra();
				con.escribirConSalto("Ingrese la fecha de publicacion");
				int fechaDePublicacion = con.leerInt();
				con.escribirConSalto("Ingrese el idioma de la publicacion");
				String idioma = con.leerPalabra();

				con.quemarLinea();

				switch (opcionCrear) {
				case 1:

					con.escribirConSalto("Ingrese la productora");
					String productora = con.leerPalabra();
					con.escribirConSalto("Ingrese el pais de la pelicula");
					String pais = con.leerPalabra();
					con.escribirConSalto("Ingrese el productor");
					String director = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese el nombre del guionista");
					String guion = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese el nombre del encargado de la fotografia");
					String fotografia = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese el nombre del encargado de la musica");
					String musica = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese el reparto de la pelicula 'En una sola linea' ");
					String reparto = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese la duracion de la pelicula");
					String duracion = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese los idiomas disponibles para la pelicula");
					String idiomasDisponibles = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese los idiomas en los cuales estan disponibles lo subtitulos");
					String subtitulos = con.leerLineaCompleta();

					Pelicula tempP = new Pelicula(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma,
							productora, pais, director, guion, fotografia, musica, reparto, duracion,
							idiomasDisponibles, subtitulos);
					objP.crear(tempP);

					break;
				case 2:

					con.escribirConSalto("Ingrese el autor");
					String autorA = con.leerPalabra();
					con.escribirConSalto("Ingrese la fuente del articulo");
					String fuenteA = con.leerPalabra();
					con.escribirConSalto("Ingrese los terminos geograficos");
					String terminosGeograficosA = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese la cantidad de paginas");
					int cantidadDePaginasA = con.leerInt();

					Articulo tempA = new Articulo(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma,
							autorA, fuenteA, terminosGeograficosA, cantidadDePaginasA);
					objA.crear(tempA);

					break;
				case 3:

					con.escribirConSalto("Ingrese el autor");
					String autorR = con.leerPalabra();
					con.escribirConSalto("Ingrese la fuente de la revista");
					String fuenteR = con.leerPalabra();
					con.escribirConSalto("Ingrese los terminos geograficos");
					String terminosGeograficosR = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese la descripcion fisica de la revista");
					String descripcionFisica = con.leerLineaCompleta();

					Revista tempR = new Revista(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma, autorR,
							fuenteR, terminosGeograficosR, descripcionFisica);
					objR.crear(tempR);

					break;

				case 4:

					con.escribirConSalto("Ingrese la desarrollador");
					String desarrrolladora = con.leerPalabra();
					con.escribirConSalto("Ingrese el editor");
					String editor = con.leerPalabra();
					con.escribirConSalto("Ingrese el genero");
					String genero = con.leerPalabra();

					Steam tempS = new Steam(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma,
							desarrrolladora, editor, genero);
					objS.crear(tempS);

					break;
				case 5:

					con.escribirConSalto("Ingrese la cantidad de copias del libro");
					int cantidadDeCopias = con.leerInt();
					con.escribirConSalto("Ingrese el tiempo de prestamo");
					int tiempoDePrestamo = con.leerInt();

					LibroFisico tempLf = new LibroFisico(id, titulo, clasificacion, facultad, fechaDePublicacion,
							idioma, cantidadDeCopias, tiempoDePrestamo);
					objLf.crear(tempLf);

					break;
				case 6:

					con.escribirConSalto("Ingrese el tipo de archivo");
					String tipoDeArchivo = con.leerPalabra();
					con.escribirConSalto("Es audio libro, escriba Si para afirmar, de lo contrario escriba No");
					boolean esAudioLibro = con.leerBoolean();

					LibroVirtual tempLv = new LibroVirtual(id, titulo, clasificacion, facultad, fechaDePublicacion,
							idioma, tipoDeArchivo, esAudioLibro);
					objLv.crear(tempLv);

					break;
				default:
					break;
				}

				break;
			case 2:

				con.escribirConSalto(
						"¿Desea mostrar todas las publicaciones?, Escriba Si para confirmar de lo contrario escriba No");
				boolean mostrarTodo = con.leerBoolean();
				int opcionMostrarTodo = 0;
				if (mostrarTodo == true) {
					opcionMostrarTodo = 1;
				} else {
					opcionMostrarTodo = 2;
				}
				
				switch (opcionMostrarTodo) {
				case 1:
					break;
				case 2:
					con.escribirConSalto("Ingrese la publicacion que desea mostrar");
					con.escribirConSalto("Mostrar: " + "\n1. Pelicula" + "\n2. Articulo" + "\n3. Revista"
							+ "\n4. Juego de 4Prot" + "\n5. Libro Fisico" + "\n6. Libro Virtual");
					int seleccionMostrar = con.leerInt();
					
					switch(seleccionMostrar) {
					case 1:
						
					}
					
					break;
				default:
					break;
				}
				
				break;
			case 3:
				break;
			default:
				break;
			}
		} while (opcion != 8);
	}
}
