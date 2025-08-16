package co.edu.unbosque.controller;

import java.util.ArrayList;
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
				if(opcionCrear == 1) {
					
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
