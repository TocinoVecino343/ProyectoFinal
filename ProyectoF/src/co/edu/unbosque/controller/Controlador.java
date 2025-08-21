package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.*;

public class Controlador implements ActionListener {

	private LibroFisicoDAO objLf;
	private LibroVirtualDAO objLv;
	private SteamDAO objS;
	private RevistaDAO objR;
	private PeliculaDAO objP;
	private ArticuloDAO objA;
	private Consola con;

	private VentanaPrincipal vp; // Clases interfaz gráfica
	private VentanaCrear vc;
	private VentanaMostrar vm;
	private VentanaActualizar va;
	private VentanaEliminar ve;

	private VentanaCrearPelicula vcp; // Ventana crear
	private VentanaCrearArticulo vca;
	private VentanaCrearRevista vcr;
	private VentanaCrearLibroFisico vclf;
	private VentanaCrearLibroVirtual vclv;

	private VentanaMostrarPelicula vmp; // Ventanas mostrar
	private VentanaMostrarArticulo vma;
	private VentanaMostrarRevista vmr;
	private VentanaMostrarLibroFisico vmlf;
	private VentanaMostrarLibroVirtual vmlv;

	private VentanaEliminarPelicula vep; // Ventanas eliminar
	private VentanaEliminarArticulo vea;
	private VentanaEliminarRevista ver;
	private VentanaEliminarLibroFisico velf;
	private VentanaEliminarLibroDigital velv;

	public Controlador() {
		objLf = new LibroFisicoDAO();
		objLv = new LibroVirtualDAO();
		objS = new SteamDAO();
		objR = new RevistaDAO();
		objP = new PeliculaDAO();
		objA = new ArticuloDAO();
		con = new Consola();

		vp = new VentanaPrincipal();
		vc = new VentanaCrear();
		vm = new VentanaMostrar();
		va = new VentanaActualizar();
		ve = new VentanaEliminar();

		vcp = new VentanaCrearPelicula();
		vca = new VentanaCrearArticulo();
		vcr = new VentanaCrearRevista();
		vclf = new VentanaCrearLibroFisico();
		vclv = new VentanaCrearLibroVirtual();

		vmp = new VentanaMostrarPelicula();
		vma = new VentanaMostrarArticulo();
		vmr = new VentanaMostrarRevista();
		vmlf = new VentanaMostrarLibroFisico();
		vmlv = new VentanaMostrarLibroVirtual();

		vep = new VentanaEliminarPelicula();
		vea = new VentanaEliminarArticulo();
		ver = new VentanaEliminarRevista();
		velf = new VentanaEliminarLibroFisico();
		velv = new VentanaEliminarLibroDigital();

		asignarOyentes();
	}

	public void asignarOyentes() {// Aqui se agregan los lectores a los componentes
		// Oyentes Ventana Principal
		vp.getBotonCrearPublicacion().addActionListener(this);
		vp.getBotonCrearPublicacion().setActionCommand("boton1_crear_publicacion");
		vp.getBotonMostrarPublicacion().addActionListener(this);
		vp.getBotonMostrarPublicacion().setActionCommand("boton2_mostrar_publicacion");
		vp.getBotonEliminarPublicacion().addActionListener(this);
		vp.getBotonEliminarPublicacion().setActionCommand("boton3_eliminar_publicacion");
		vp.getBotonActualizarPublicacion().addActionListener(this);
		vp.getBotonActualizarPublicacion().setActionCommand("boton4_actualizar_publicacion");

		// Oyentes Ventana Crear
		vc.getBotonCrearPelicula().addActionListener(this);
		vc.getBotonCrearPelicula().setActionCommand("boton_crear_pelicula");
		vc.getBotonCrearArticulo().addActionListener(this);
		vc.getBotonCrearArticulo().setActionCommand("boton_crear_articulo");
		vc.getBotonCrearRevista().addActionListener(this);
		vc.getBotonCrearRevista().setActionCommand("boton_crear_revista");
		vc.getBotonCrearLibroFisico().addActionListener(this);
		vc.getBotonCrearLibroFisico().setActionCommand("boton_crear_libro_fisico");
		vc.getBotonCrearLibroVirtual().addActionListener(this);
		vc.getBotonCrearLibroVirtual().setActionCommand("boton_crear_libro_virtual");

		// Oyentes guardar objeto
		vcp.getBotonGuardarPelicula().addActionListener(this);
		vcp.getBotonGuardarPelicula().setActionCommand("boton_guardar_pelicula");
		vca.getBotonGuardarArticulo().addActionListener(this);
		vca.getBotonGuardarArticulo().setActionCommand("boton_guardar_articulo");
		vcr.getBotonGuardarRevista().addActionListener(this);
		vcr.getBotonGuardarRevista().setActionCommand("boton_guardar_revista");
		vclf.getBotonGuardarLibroFisico().addActionListener(this);
		vclf.getBotonGuardarLibroFisico().setActionCommand("boton_guardar_libro_fisico");
		vclv.getBotonGuardarLibroVirtual().addActionListener(this);
		vclv.getBotonGuardarLibroVirtual().setActionCommand("boton_guardar_libro_virtual");

		// Oyentes mostrar
		vm.getBotonMostrarTodo().addActionListener(this);
		vm.getBotonMostrarTodo().setActionCommand("boton_mostrar_todo");
		vm.getBotonMostrarPelicula().addActionListener(this);
		vm.getBotonMostrarPelicula().setActionCommand("boton_mostrar_pelicula");
		vm.getBotonMostrarArticulo().addActionListener(this);
		vm.getBotonMostrarArticulo().setActionCommand("boton_mostrar_articulo");
		vm.getBotonMostrarRevista().addActionListener(this);
		vm.getBotonMostrarRevista().setActionCommand("boton_mostrar_revista");
		vm.getBotonMostrarLibroFisico().addActionListener(this);
		vm.getBotonMostrarLibroFisico().setActionCommand("boton_mostrar_libro_fisico");
		vm.getBotonMostrarLibroVirtual().addActionListener(this);
		vm.getBotonMostrarLibroVirtual().setActionCommand("boton_mostrar_libro_virtual");

		// OyentesEliminar
		ve.getBotonEliminarPelicula().addActionListener(this);
		ve.getBotonEliminarPelicula().setActionCommand("boton_eliminar_pelicula");
		ve.getBotonEliminarArticulo().addActionListener(this);
		ve.getBotonEliminarArticulo().setActionCommand("boton_eliminar_articulo");
		ve.getBotonEliminarRevista().addActionListener(this);
		ve.getBotonEliminarRevista().setActionCommand("boton_eliminar_revista");
		ve.getBotonEliminarLibroFisico().addActionListener(this);
		ve.getBotonEliminarLibroFisico().setActionCommand("boton_eliminar_libro_fisico");
		ve.getBotonEliminarLibroDigital().addActionListener(this);
		ve.getBotonEliminarLibroDigital().setActionCommand("boton_eliminar_libro_virtual");
		ve.getBotonCancelar().addActionListener(this);
		ve.getBotonCancelar().setActionCommand("boton_cancelar");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		System.out.println(e); // Quitar este syso una vez terminado todo

		switch (alias) {

		// Botones CRUD
		case "boton1_crear_publicacion": {
			vc.setVisible(true);
			vp.setVisible(false);
			break;
		}
		case "boton2_mostrar_publicacion": {
			vp.setVisible(false);
			vm.setVisible(true);
			break;
		}
		case "boton3_eliminar_publicacion": {
			vp.setVisible(false);
			ve.setVisible(true);
			break;
		}
		case "boton4_actualizar_publicacion": {
			vp.setVisible(false);
			va.setVisible(true);
			break;
		}
		// Botones crear
		case "boton_crear_pelicula": {
			vcp.setVisible(true);
			vc.setVisible(false);
			break;
		}
		case "boton_crear_articulo": {
			vca.setVisible(true);
			vc.setVisible(false);
			break;
		}
		case "boton_crear_revista": {
			vcr.setVisible(true);
			vc.setVisible(false);
			break;
		}
		case "boton_crear_libro_fisico": {
			vclf.setVisible(true);
			vc.setVisible(false);
			break;
		}
		case "boton_crear_libro_virtual": {
			vclv.setVisible(true);
			vc.setVisible(false);
			break;
		}
		// Botones guardar
		case "boton_guardar_pelicula": {
			int id = Integer.parseInt("" + vc.getTextoPublicacion().getText());
			String titulo = "" + vc.getTextoTituloPublicacion().getText();
			String clasificacion = "" + vc.getTextoClasificacion().getText();
			String facultad = "" + vc.getTextoFacultad().getText();
			int fechaDePublicacion = Integer.parseInt("" + vc.getTextoFecha().getText());
			String idioma = "" + vc.getTextoIdioma().getText();

			String productora = "" + vcp.getTextoProductora().getText();
			String pais = "" + vcp.getTextoPais().getText();
			String director = "" + vcp.getTextoDirector().getText();
			String guion = "" + vcp.getTextoGuion().getText();
			String fotografia = "" + vcp.getTextoFotografia().getText();
			String musica = "" + vcp.getTextoMusica().getText();
			String reparto = "" + vcp.getTextoReparto().getText();
			String duracion = "" + vcp.getTextoDuracion().getText();
			String idiomasDisponibles = "" + vcp.getTextoIdiomasDisponibles().getText();
			String subtitulos = "" + vcp.getTextoSubtitulos().getText();

			Pelicula tempP = new Pelicula(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma, productora,
					pais, director, guion, fotografia, musica, reparto, duracion, idiomasDisponibles, subtitulos);
			objP.crear(tempP);
			vcp.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "boton_guardar_articulo": {
			int id1 = Integer.parseInt("" + vc.getTextoPublicacion().getText());
			String titulo1 = "" + vc.getTextoTituloPublicacion().getText();
			String clasificacion1 = "" + vc.getTextoClasificacion().getText();
			String facultad1 = "" + vc.getTextoFacultad().getText();
			int fechaDePublicacion1 = Integer.parseInt("" + vc.getTextoFecha().getText());
			String idioma1 = "" + vc.getTextoIdioma().getText();

			String autor = "" + vca.getTextoAutor().getText();
			String fuente = "" + vca.getTextoFuente().getText();
			String terminosGeograficos = "" + vca.getTextoGeograficos().getText();
			int cantidadDePaginas = Integer.parseInt("" + vca.getTextoCantidadPaginas().getText());

			Articulo tempA = new Articulo(id1, titulo1, clasificacion1, facultad1, fechaDePublicacion1, idioma1, autor,
					fuente, terminosGeograficos, cantidadDePaginas);
			objA.crear(tempA);
			vca.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "boton_guardar_revista": {
			int id2 = Integer.parseInt("" + vc.getTextoPublicacion().getText());
			String titulo2 = "" + vc.getTextoTituloPublicacion().getText();
			String clasificacion2 = "" + vc.getTextoClasificacion().getText();
			String facultad2 = "" + vc.getTextoFacultad().getText();
			int fechaDePublicacion2 = Integer.parseInt("" + vc.getTextoFecha().getText());
			String idioma2 = "" + vc.getTextoIdioma().getText();

			String autor1 = "" + vcr.getTextoAutor().getText();
			String fuente1 = "" + vcr.getTextoFuente().getText();
			String terminosGeograficos1 = "" + vcr.getTextoGeograficos().getText();
			String descripcionFisica = "" + vcr.getTextoDescripcionFisica().getText();

			Revista tempR = new Revista(id2, titulo2, clasificacion2, facultad2, fechaDePublicacion2, idioma2, autor1,
					fuente1, terminosGeograficos1, descripcionFisica);
			objR.crear(tempR);
			;
			vcr.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "boton_guardar_libro_fisico": {
			int id3 = Integer.parseInt("" + vc.getTextoPublicacion().getText());
			String titulo3 = "" + vc.getTextoTituloPublicacion().getText();
			String clasificacion3 = "" + vc.getTextoClasificacion().getText();
			String facultad3 = "" + vc.getTextoFacultad().getText();
			int fechaDePublicacion3 = Integer.parseInt("" + vc.getTextoFecha().getText());
			String idioma3 = "" + vc.getTextoIdioma().getText();

			int cantidadDeCopias = Integer.parseInt("" + vclf.getTextoCantidadCopias().getText());
			int tiempoDePrestamo = Integer.parseInt("" + vclf.getTextoTiempoPrestamo().getText());

			LibroFisico tempLf = new LibroFisico(id3, titulo3, clasificacion3, facultad3, fechaDePublicacion3, idioma3,
					cantidadDeCopias, facultad3, idioma3, cantidadDeCopias, tiempoDePrestamo);
			objLf.crear(tempLf);
			;
			vclf.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "boton_guardar_libro_virtual": {
			int id4 = Integer.parseInt("" + vc.getTextoPublicacion().getText());
			String titulo4 = "" + vc.getTextoTituloPublicacion().getText();
			String clasificacion4 = "" + vc.getTextoClasificacion().getText();
			String facultad4 = "" + vc.getTextoFacultad().getText();
			int fechaDePublicacion4 = Integer.parseInt("" + vc.getTextoFecha().getText());
			String idioma4 = "" + vc.getTextoIdioma().getText();

			String tipoDeArchivo = "" + vclv.getTextoTipoArchivo().getText();
			String respuestaAudioLibro = vclv.getTextoEsAudioLibro().getText();
			boolean esAudioLibro = respuestaAudioLibro.equalsIgnoreCase("Sí");
			
			LibroVirtual tempLv = new LibroVirtual(id4, titulo4, clasificacion4, facultad4, fechaDePublicacion4,
					idioma4, id4, facultad4, idioma4, tipoDeArchivo, esAudioLibro);
			objLv.crear(tempLv);
			;
			vclv.setVisible(false);
			vp.setVisible(true);
			break;
		}
		// Botones Mostrar
		case "boton_mostrar_todo": {
			vm.setVisible(false); // FALTA CLASE MOSTRAR TODO
			break;
		}
		case "boton_mostrar_pelicula": {
			vm.setVisible(false);
			vmp.setVisible(true);
			vmp.getTextoMostrarPelicula().setText(objP.mostrarDatos());
			break;
		}
		case "boton_mostrar_articulo": {
			vm.setVisible(false);
			vma.setVisible(true);
			vma.getTextoMostrarArticulo().setText(objA.mostrarDatos());
			break;
		}
		case "boton_mostrar_revista": {
			vm.setVisible(false);
			vmr.setVisible(true);
			vmr.getTextoMostrarRevista().setText(objR.mostrarDatos());
			break;
		}
		case "boton_mostrar_libro_fisico": {
			vm.setVisible(false);
			vmlf.setVisible(true);
			vmlf.getTextoMostrarLibroFisico().setText(objLf.mostrarDatos());
			break;
		}
		case "boton_mostrar_libro_virtual": {
			vm.setVisible(false);
			vmlv.setVisible(true);
			vmlv.getTextoMostrarLibroVirtual().setText(objLv.mostrarDatos());
			break;
		}
		// Botones eliminar
		case "boton_eliminar_pelicula": {
			ve.setVisible(false);
			vep.setVisible(true);
			break;
		}
		case "boton_eliminar_articulo": {
			ve.setVisible(false);
			vea.setVisible(true);
			break;
		}
		case "boton_eliminar_revista": {
			ve.setVisible(false);
			ver.setVisible(true);
			break;
		}
		case "boton_eliminar_libro_fisico": {
			ve.setVisible(false);
			velf.setVisible(true);
			break;
		}
		case "boton_eliminar_libro_virtual": {
			ve.setVisible(false);
			velv.setVisible(true);
			break;
		}
		case "boton_cancelar": {
			ve.setVisible(false);
			vp.setVisible(true);
			break;
		}

		// Botones eliminar especifico

		case "eliminar_pelicula": {
			int idEliminarPelicula = Integer.parseInt(vep.getIdField().getText());
			boolean retorno = objP.eliminarDato(idEliminarPelicula);
			if (retorno == false) {
				JOptionPane.showMessageDialog(null, "ERROR-No se ha hallado una pelicula con aquel id",
						"MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
			vep.setVisible(false);
			vp.setVisible(true);
		}
			break;
		case "eliminar_articulo": {
			int idEliminarArticulo = Integer.parseInt(vea.getIdField().getText());
			boolean retorno = objA.eliminarDato(idEliminarArticulo);
			if (retorno == false) {
				JOptionPane.showMessageDialog(null, "ERROR-No se ha hallado un articulo con aquel id",
						"MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
			vea.setVisible(false);
			vp.setVisible(true);
		}
			break;
		case "eliminar_revista": {
			int idEliminarRevista = Integer.parseInt(ver.getIdField().getText());
			boolean retorno = objR.eliminarDato(idEliminarRevista);
			if (retorno == false) {
				JOptionPane.showMessageDialog(null, "ERROR-No se ha hallado una revista con aquel id",
						"MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
			ver.setVisible(false);
			vp.setVisible(true);
		}
			break;
		case "eliminar_libro_fisico": {
			int idEliminarLibroFisico = Integer.parseInt(velf.getIdField().getText());
			boolean retorno = objLf.eliminarDato(idEliminarLibroFisico);
			if (retorno == false) {
				JOptionPane.showMessageDialog(null, "ERROR-No se ha hallado un libro fisico con aquel id",
						"MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
			velf.setVisible(false);
			vp.setVisible(true);
		}
			break;
		case "eliminar_libro_virtual": {
			int idEliminarLibroVirtual = Integer.parseInt(velv.getIdField().getText());
			boolean retorno = objLv.eliminarDato(idEliminarLibroVirtual);
			if (retorno == false) {
				JOptionPane.showMessageDialog(null, "ERROR-No se ha hallado un libro virtual con aquel id",
						"MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
			velv.setVisible(false);
			vp.setVisible(true);
		}
			break;
		}
	}

	public void runGUI() { // Run de la ventana
		vp.setVisible(true);
	}

	public void run() {
		int opcion = 0;
		do {
			con.escribirConSalto("Bienvenido a la biblioteca de la UEB");

			con.escribirConSalto("Seleccione la opcion que desea realizar");
			con.escribirConSalto("1. Crear Publicacion" + "\n2. Mostrar Publicacion" + "\n3. Eliminar Publicacion"
					+ "\n4. Actualizar Publicacion " + "\n5. SALIR");
			opcion = con.leerInt();
			switch (opcion) {

			case 1: {
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

				con.escribirConSalto("Ingrese el idioma de la publicacion");
				String idioma = con.leerPalabra();

				con.quemarLinea();

				switch (opcionCrear) {
				case 1: {

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

					break;
				}
				case 2: {

					con.escribirConSalto("Ingrese el autor");
					String autorA = con.leerPalabra();
					con.escribirConSalto("Ingrese la fuente del artículo");
					String fuenteA = con.leerPalabra();
					con.escribirConSalto("Ingrese los terminos geográficos del artículo");
					String terminosGeograficosA = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese la cantidad de páginas del artículo");
					int cantidadDePaginasA = con.leerInt();

					Articulo tempA = new Articulo(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma,
							autorA, fuenteA, terminosGeograficosA, cantidadDePaginasA);
					objA.crear(tempA);

					break;
				}
				case 3: {

					con.escribirConSalto("Ingrese el autor");
					String autorR = con.leerPalabra();
					con.escribirConSalto("Ingrese la fuente de la revista");
					String fuenteR = con.leerPalabra();
					con.escribirConSalto("Ingrese los terminos geograficos de la revista");
					String terminosGeograficosR = con.leerLineaCompleta();
					con.escribirConSalto("Ingrese la descripcion fisica de la revista");
					String descripcionFisica = con.leerLineaCompleta();

					Revista tempR = new Revista(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma, autorR,
							fuenteR, terminosGeograficosR, descripcionFisica);
					objR.crear(tempR);

					break;
				}
				case 4: {

					con.escribirConSalto("Ingrese la desarrolladora del juego");
					String desarrrolladora = con.leerPalabra();
					con.escribirConSalto("Ingrese el editor del juego");
					String editor = con.leerPalabra();
					con.escribirConSalto("Ingrese el género del juego");
					String genero = con.leerPalabra();

					Steam tempS = new Steam(id, titulo, clasificacion, facultad, fechaDePublicacion, idioma,
							desarrrolladora, editor, genero);
					objS.crear(tempS);

					break;
				}
				case 5: {

					con.escribirConSalto("Ingrese la cantidad de copias del libro");
					int cantidadDeCopias = con.leerInt();
					con.escribirConSalto("Ingrese el tiempo de prestamo (días)");
					int tiempoDePrestamo = con.leerInt();

					LibroFisico tempLf = new LibroFisico(id, titulo, clasificacion, facultad, fechaDePublicacion,
							idioma, cantidadDeCopias, tiempoDePrestamo);
					objLf.crear(tempLf);

					break;
				}
				case 6: {

					con.escribirConSalto("Ingrese el tipo de archivo en el que esta disponible el libro");
					String tipoDeArchivo = con.leerPalabra();
					con.escribirConSalto("Es audio libro, escriba Si para afirmar, de lo contrario escriba No");
					boolean esAudioLibro = con.leerBoolean();

					LibroVirtual tempLv = new LibroVirtual(id, titulo, clasificacion, facultad, fechaDePublicacion,
							idioma, tipoDeArchivo, esAudioLibro);
					objLv.crear(tempLv);

					break;
				}
				default: {
					break;
				}
				}

				break;
			}
			case 2: {

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
				case 1: {

					objP.mostrarDatos();
					objA.mostrarDatos();
					objR.mostrarDatos();
					objS.mostrarDatos();
					objLf.mostrarDatos();
					objLv.mostrarDatos();

					break;
				}
				case 2: {
					con.escribirConSalto("Ingrese la publicacion que desea mostrar");
					con.escribirConSalto("Mostrar: " + "\n1. Pelicula" + "\n2. Articulo" + "\n3. Revista"
							+ "\n4. Juego de 4Prot" + "\n5. Libro Fisico" + "\n6. Libro Virtual");
					int seleccionMostrar = con.leerInt();

					switch (seleccionMostrar) {
					case 1: {
						objP.mostrarDatos();
						break;
					}
					case 2: {
						objA.mostrarDatos();
						break;
					}
					case 3: {
						objR.mostrarDatos();
						break;
					}
					case 4: {
						objS.mostrarDatos();
						break;
					}
					case 5: {
						objLf.mostrarDatos();
						break;
					}
					case 6: {
						objLv.mostrarDatos();
						break;
					}
					default: {
						break;
					}
					}

					break;
				}

				case 3: {

					int opcionEliminar = 0;
					con.escribirConSalto("Eliminación de una publicación por índice:");

					int opcionTipoAEliminar = 0;

					con.escribirConSalto("Ingrese el tipo de publicación que desea eliminar:");
					con.escribirConSalto("\n1. Pelicula" + "\n2. Articulo" + "\n3. Revista" + "\n4. Juego de 4Prot"
							+ "\n5. Libro Fisico" + "\n6. Libro Virtual");
					opcionTipoAEliminar = con.leerInt();

					con.quemarLinea();

					switch (opcionTipoAEliminar) {
					case 1: {
						objP.mostrarDatos();
						int indiceP = 0;

						con.escribirConSalto("Ingrese el índice de la película que desea eliminar");
						indiceP = con.leerInt();

						objP.eliminarDato(indiceP);
						break;
					}
					case 2: {

						objA.mostrarDatos();
						int indiceA = 0;

						con.escribirConSalto("Ingrese el índice del artículo que desea eliminar");
						indiceA = con.leerInt();

						objA.eliminarDato(indiceA);

						break;
					}
					case 3: {

						objR.mostrarDatos();
						int indiceR = 0;

						con.escribirConSalto("Ingrese el índice de la revista que desea eliminar");
						indiceR = con.leerInt();

						objR.eliminarDato(indiceR);

						break;
					}
					case 4: {

						objS.mostrarDatos();
						int indiceS = 0;

						con.escribirConSalto("Ingrese el índice del juego que desea eliminar");
						indiceS = con.leerInt();

						objS.eliminarDato(indiceS);

						break;
					}
					case 5: {

						objLf.mostrarDatos();
						int indiceLf = 0;

						con.escribirConSalto("Ingrese el índice del libro físico que desea eliminar");
						indiceLf = con.leerInt();

						objLf.eliminarDato(indiceLf);

						break;
					}
					case 6: {

						objLv.mostrarDatos();
						int indiceLv = 0;

						con.escribirConSalto("Ingrese el índice del libro virtual que desea eliminar");
						indiceLv = con.leerInt();

						objLv.eliminarDato(indiceLv);

						break;
					}
					default: {
						break;
					}
					}

					break;
				}

				case 4: {
					// Por revisar
					con.escribirConSalto("Ingrese la publicacion que desea actualizar");
					con.escribirConSalto("Actualizar: " + "\n1. Pelicula" + "\n2. Articulo" + "\n3. Revista"
							+ "\n4. Juego de 4Prot" + "\n5. Libro Fisico" + "\n6. Libro Virtual");
					int seleccionActualizar = con.leerInt();

					con.quemarLinea();

					switch (seleccionActualizar) {
					case 1: {

						objP.mostrarDatos();
						int indiceP = 0;

						con.escribirConSalto("Ingrese el índice de la película que desea actualizar");
						indiceP = con.leerInt();

						objP.actualizar(indiceP, null);
						break;
					}
					case 2: {

						objA.mostrarDatos();
						int indiceA = 0;

						con.escribirConSalto("Ingrese el índice del artículo que desea actualizar");
						indiceA = con.leerInt();

						objA.actualizar(indiceA, null);

						break;
					}
					case 3: {

						objR.mostrarDatos();
						int indiceR = 0;

						con.escribirConSalto("Ingrese el índice de la revista que desea actualizar");
						indiceR = con.leerInt();

						objR.actualizar(indiceR, null);

						break;
					}
					case 4: {

						objS.mostrarDatos();
						int indiceS = 0;

						con.escribirConSalto("Ingrese el índice del juego que desea actualizar");
						indiceS = con.leerInt();

						objS.actualizar(indiceS, null);

						break;
					}
					case 5: {

						objLf.mostrarDatos();
						int indiceLf = 0;

						con.escribirConSalto("Ingrese el índice del libro físico que desea actualizar");
						indiceLf = con.leerInt();

						objLf.actualizar(indiceLf, null);

						break;
					}
					case 6: {

						objLv.mostrarDatos();
						int indiceLv = 0;

						con.escribirConSalto("Ingrese el índice del libro virtual que desea actualizar");
						indiceLv = con.leerInt();

						objLv.actualizar(indiceLv, null);

						break;
					}
					default: {
						break;
					}
					}
				}
				case 5: {
					break;
				}
				}
			}
			}
		} while (opcion != 5);
	}
}