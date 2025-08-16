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
			
			con.escribirConSalto("1. Crear Publicacion"
					+ "\n2. Mostrar Publicacion"
					+ "\n3. Eliminar Publicacion"
					+ "\n4. Actualizar Publicacion ");
		} while (opcion != 8);
	}
}
