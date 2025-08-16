package co.edu.unbosque.controller;

import java.util.ArrayList;
import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.*;

public class Controlador {

	private LibroFisicoDAO objf;
	private LibroVirtualDAO objLv;
	private SteamDAO objS;
	private RevistaDAO objR;
	private PeliculaDAO objP;
	private ArticuloDAO objA;
	private Consola con;

	public Controlador() {
		objf = new LibroFisicoDAO();
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

				con.quemarLinea();
				
				switch (opcionCrear) {
				case 1:
					con.escribirConSalto("Ingrese el idioma de la pelicula");
					String idioma = con.leerPalabra();
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

					Pelicula temp = new Pelicula(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma,
							productora, pais, director, guion, fotografia, musica, reparto, duracion,
							idiomasDisponibles, subtitulos);
					objP.crear(temp);
					break;
				}
				
				
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
			}
		} while (opcion != 8);
	}
}
