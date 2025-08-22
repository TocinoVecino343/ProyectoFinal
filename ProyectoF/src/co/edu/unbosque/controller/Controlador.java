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
	private VentanaMostrarTodo vmt;
	private VentanaMostrarArticulo vma;
	private VentanaMostrarRevista vmr;
	private VentanaMostrarLibroFisico vmlf;
	private VentanaMostrarLibroVirtual vmlv;

	private VentanaEliminarPelicula vep; // Ventanas eliminar
	private VentanaEliminarArticulo vea;
	private VentanaEliminarRevista ver;
	private VentanaEliminarLibroFisico velf;
	private VentanaEliminarLibroDigital velv;

	private VentanaActualizarPelicula vap; // Ventana actualizar
	private VentanaActualizarArticulo vaa;
	private VentanaActualizarRevista var;
	private VentanaActualizarLibroFisico valf;
	private VentanaActualizarLibroVirtual valv;

	public Controlador() {
		objLf = new LibroFisicoDAO();
		objLv = new LibroVirtualDAO();
		objR = new RevistaDAO();
		objP = new PeliculaDAO();
		objA = new ArticuloDAO();
		con = new Consola();

		vp = new VentanaPrincipal(this);
		vc = new VentanaCrear();
		vm = new VentanaMostrar();
		va = new VentanaActualizar();
		ve = new VentanaEliminar();

		vcp = new VentanaCrearPelicula();
		vca = new VentanaCrearArticulo();
		vcr = new VentanaCrearRevista();
		vclf = new VentanaCrearLibroFisico();
		vclv = new VentanaCrearLibroVirtual();

		vmt = new VentanaMostrarTodo();
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

		vap = new VentanaActualizarPelicula();
		var = new VentanaActualizarRevista();
		vaa = new VentanaActualizarArticulo();
		valf = new VentanaActualizarLibroFisico();
		valv = new VentanaActualizarLibroVirtual();

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

		// Oyentes eliminar
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
		ve.getBotonCancelar().setActionCommand("boton_cancelar_eliminar");

		// Oyentes actualizar
		va.getBotonActualizar().addActionListener(this);
		va.getBotonActualizar().setActionCommand("boton_actualizar");
		va.getBotonCancelar().addActionListener(this);
		va.getBotonCancelar().setActionCommand("boton_cancelar_actualizar");

		// Oyentes actualizar especificos
		vap.getBotonActualizar().addActionListener(this);
		vap.getBotonActualizar().setActionCommand("boton_actualizar_pelicula");
		var.getBotonActualizar().addActionListener(this);
		var.getBotonActualizar().setActionCommand("boton_actualizar_revista");
		vaa.getBotonActualizar().addActionListener(this);
		vaa.getBotonActualizar().setActionCommand("boton_actualizar_articulo");
		valf.getBotonActualizar().addActionListener(this);
		valf.getBotonActualizar().setActionCommand("boton_actualizar_libro_fisico");
		valv.getBotonActualizar().addActionListener(this);
		valv.getBotonActualizar().setActionCommand("boton_actualizar_libro_virtual");

		// Oyentes buscador
		vp.getBotonBuscar().addActionListener(this);
		vp.getBotonBuscar().setActionCommand("boton_buscar");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();

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
			int id = Integer.parseInt("" + vc.getTextoId().getText());
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
			int id1 = Integer.parseInt("" + vc.getTextoId().getText());
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
			int id2 = Integer.parseInt("" + vc.getTextoId().getText());
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
			int id3 = Integer.parseInt("" + vc.getTextoId().getText());
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
			int id4 = Integer.parseInt("" + vc.getTextoId().getText());
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
			vm.setVisible(false);
			vmt.setVisible(true);
			String contenido = objP.mostrarDatos() + "\n" + objA.mostrarDatos() + "\n" + objR.mostrarDatos() + "\n"
					+ objLv.mostrarDatos() + "\n" + objLf.mostrarDatos();
			vmt.getTextoMostrarTodo().setText(contenido);
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
		case "boton_cancelar_eliminar": {
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

		case "boton_actualizar": {
			int id = Integer.parseInt(va.getIdField().getText());
			int valorA = objA.filtrarActualizar(id);
			int valorP = objP.filtrarActualizar(id);
			int valorR = objR.filtrarActualizar(id);
			int valorLf = objLf.filtrarActualizar(id);
			int valorLv = objLv.filtrarActualizar(id);

			if (valorA != -1) {

			} else if (valorP != -1) {
				va.setVisible(false);
				vap.setVisible(true);

				vap.getTextoTitulo().setText(objP.getListaPeliculas().get(valorP).getTitulo());
				vap.getTextoClasificacion().setText(objP.getListaPeliculas().get(valorP).getClasificacion());
				vap.getTextoFacultad().setText(objP.getListaPeliculas().get(valorP).getFacultad());
				vap.getTextoFechaDePublicacion()
						.setText(String.valueOf(objP.getListaPeliculas().get(valorP).getFechaDePublicacion()));
				vap.getTextoIdioma().setText(objP.getListaPeliculas().get(valorP).getIdioma());

				vap.getTextoProductora().setText(objP.getListaPeliculas().get(valorP).getProductora());
				vap.getTextoPais().setText(objP.getListaPeliculas().get(valorP).getPais());
				vap.getTextoDirector().setText(objP.getListaPeliculas().get(valorP).getDirector());
				vap.getTextoGuion().setText(objP.getListaPeliculas().get(valorP).getGuion());
				vap.getTextoFotografia().setText(objP.getListaPeliculas().get(valorP).getFotografia());
				vap.getTextoMusica().setText(objP.getListaPeliculas().get(valorP).getMusica());
				vap.getTextoReparto().setText(objP.getListaPeliculas().get(valorP).getReparto());
				vap.getTextoDuracion().setText(objP.getListaPeliculas().get(valorP).getDuracion());
				vap.getTextoIdiomasDisponibles().setText(objP.getListaPeliculas().get(valorP).getIdiomasDisponibles());
				vap.getTextoSubtitulos().setText(objP.getListaPeliculas().get(valorP).getSubtitulos());

				if (e.equals("boton_actualizar_pelicula")) {
					int idPelicula = id;
					String titulo = "" + vap.getTextoClasificacion().getText();
					String clasificacion = "" + vap.getTextoClasificacion().getText();
					String facultad = "" + vap.getTextoFacultad().getText();
					int fechaDePublicacion = Integer.parseInt("" + vap.getTextoFechaDePublicacion().getText());
					String idioma = "" + vap.getTextoIdioma().getText();

					String productora = "" + vap.getTextoProductora().getText();
					String pais = "" + vap.getTextoPais().getText();
					String director = "" + vap.getTextoDirector().getText();
					String guion = "" + vap.getTextoGuion().getText();
					String fotografia = "" + vap.getTextoFotografia().getText();
					String musica = "" + vap.getTextoMusica().getText();
					String reparto = "" + vap.getTextoReparto().getText();
					String duracion = "" + vap.getTextoDuracion().getText();
					String idiomasDisponibles = "" + vap.getTextoIdiomasDisponibles().getText();
					String subtitulos = "" + vap.getTextoSubtitulos().getText();

					Pelicula tempP = new Pelicula(idPelicula, titulo, clasificacion, facultad, fechaDePublicacion,
							idioma, productora, pais, director, guion, fotografia, musica, reparto, duracion,
							idiomasDisponibles, subtitulos);
					objP.actualizar(id, tempP);
					vap.setVisible(false);
					vp.setVisible(true);
				}
			} else if (valorR != -1) {
				va.setVisible(false);
				var.setVisible(true);

				var.getTextoTitulo().setText(objR.getListaRevistas().get(valorR).getTitulo());
				var.getTextoClasificacion().setText(objR.getListaRevistas().get(valorR).getClasificacion());
				var.getTextoFacultad().setText(objR.getListaRevistas().get(valorR).getFacultad());
				var.getTextoFechaDePublicacion()
						.setText(String.valueOf(objR.getListaRevistas().get(valorR).getFechaDePublicacion()));
				var.getTextoIdioma().setText(objR.getListaRevistas().get(valorR).getIdioma());

				var.getTextoAutor().setText(objR.getListaRevistas().get(valorR).getAutor());
				var.getTextoFuente().setText(objR.getListaRevistas().get(valorR).getFuente());
				var.getTextoTerminosGeograficos().setText(objR.getListaRevistas().get(valorR).getTerminosGeograficos());
				var.getTextoDescripcionFisica()
						.setText(String.valueOf(objR.getListaRevistas().get(valorR).getDescripcionFisica()));

				if (e.equals("boton_actualizar_revista")) {
					int idRevista = id;
					String titulo = "" + var.getTextoTitulo().getText();
					String clasificacion = "" + var.getTextoClasificacion().getText();
					String facultad = "" + var.getTextoFacultad().getText();
					int fechaDePublicacion = Integer.parseInt(var.getTextoFechaDePublicacion().getText());
					String idioma = "" + var.getTextoIdioma().getText();

					String autor = "" + var.getTextoAutor().getText();
					String fuente = var.getTextoFuente().getText();
					String terminosGeograficos = var.getTextoTerminosGeograficos().getText();
					String descripcionFisica = var.getTextoDescripcionFisica().getText();

					Revista tempR = new Revista(idRevista, titulo, clasificacion, facultad, fechaDePublicacion, idioma,
							autor, fuente, terminosGeograficos, descripcionFisica);
					objR.actualizar(idRevista, tempR);
					var.setVisible(false);
					vp.setVisible(true);
				}
			} else if (valorLf != -1) {
				va.setVisible(false);
				valf.setVisible(true);

				valf.getTextoTitulo().setText(objLf.getListaLibrosFisicos().get(valorLf).getTitulo());
				valf.getTextoClasificacion().setText(objLf.getListaLibrosFisicos().get(valorLf).getClasificacion());
				valf.getTextoFacultad().setText(objLf.getListaLibrosFisicos().get(valorLf).getFacultad());
				valf.getTextoFechaDePublicacion()
						.setText(String.valueOf(objLf.getListaLibrosFisicos().get(valorLf).getFechaDePublicacion()));
				valf.getTextoIdioma().setText(objLf.getListaLibrosFisicos().get(valorLf).getIdioma());

				valf.getTextoCantidadDePaginas()
						.setText(String.valueOf(objLf.getListaLibrosFisicos().get(valorLf).getCantidadDePaginas()));
				valf.getTextoAutor().setText(objLf.getListaLibrosFisicos().get(valorLf).getAutor());
				valf.getTextoEditorial().setText(objLf.getListaLibrosFisicos().get(valorLf).getEditorial());
				valf.getTextoCantidadDeCopias()
						.setText(String.valueOf(objLf.getListaLibrosFisicos().get(valorLf).getCantidadDeCopias()));
				valf.getTextoTiempoDePrestamo()
						.setText(String.valueOf(objLf.getListaLibrosFisicos().get(valorLf).getTiempoDePrestamo()));

				if (e.equals("boton_actualizar_libro_fisico")) {
					int idArticulo = id;
					String titulo = "" + valf.getTextoTitulo().getText();
					String clasificacion = "" + valf.getTextoClasificacion().getText();
					String facultad = "" + valf.getTextoFacultad().getText();
					int fechaDePublicacion = Integer.parseInt(valf.getTextoFechaDePublicacion().getText());
					String idioma = "" + valf.getTextoIdioma().getText();

					int cantidadDePaginas = Integer.parseInt("" + valf.getTextoAutor().getText());
					String autor = valf.getTextoAutor().getText();
					String editorial = valf.getTextoEditorial().getText();
					int cantidadDeCopias = Integer.parseInt(valf.getTextoCantidadDeCopias().getText());
					int tiempoDePrestamo = Integer.parseInt(valf.getTextoTiempoDePrestamo().getText());
					LibroFisico tempLf = new LibroFisico(idArticulo, titulo, clasificacion, facultad,
							fechaDePublicacion, idioma, cantidadDePaginas, autor, editorial, cantidadDeCopias,
							tiempoDePrestamo);
					objLf.actualizar(idArticulo, tempLf);
					valf.setVisible(false);
					vp.setVisible(true);

				} else if (valorLv != -1) {
					va.setVisible(false);
					valv.setVisible(true);

					valv.getTextoTitulo().setText(objLv.getListaLibrosVirtuales().get(valorLv).getTitulo());
					valv.getTextoClasificacion().setText(objLf.getListaLibrosFisicos().get(valorLv).getClasificacion());
					valv.getTextoFacultad().setText(objLv.getListaLibrosVirtuales().get(valorP).getFacultad());
					valv.getTextoFechaDePublicacion().setText(
							String.valueOf(objLv.getListaLibrosVirtuales().get(valorLv).getFechaDePublicacion()));
					valv.getTextoIdioma().setText(objLv.getListaLibrosVirtuales().get(valorLv).getIdioma());

					valv.getTextoCantidadDePaginas().setText(
							String.valueOf(objLv.getListaLibrosVirtuales().get(valorLv).getCantidadDePaginas()));
					valv.getTextoAutor().setText(objLv.getListaLibrosVirtuales().get(valorLv).getAutor());
					valv.getTextoEditorial().setText(objLv.getListaLibrosVirtuales().get(valorLv).getEditorial());
					valv.getTextoTipoDeArchivo()
							.setText(String.valueOf(objLv.getListaLibrosVirtuales().get(valorLv).getTipoDeArchivo()));
					String esAudioLibroMostrar;
					if (String.valueOf(objLv.listaLibrosVirtuales().get(valorLv).isEsAudioLibro()).equals("true")) {
						esAudioLibroMostrar = "si";
					} else {
						esAudioLibroMostrar = "no";
					}
					valv.getTextoEsAudioLibro().setText(esAudioLibroMostrar);

					if (e.equals("boton_actualizar_libro_virtual")) {
						int idLibroVirtual = id;
						String titulo = "" + valf.getTextoTitulo().getText();
						String clasificacion = "" + valf.getTextoClasificacion().getText();
						String facultad = "" + valf.getTextoFacultad().getText();
						int fechaDePublicacion = Integer.parseInt(valf.getTextoFechaDePublicacion().getText());
						String idioma = "" + valf.getTextoIdioma().getText();

						int cantidadDePaginas = Integer.parseInt("" + valf.getTextoAutor().getText());
						String autor = valf.getTextoAutor().getText();
						String editorial = valf.getTextoEditorial().getText();
						String tipoDeArchivo = valv.getTextoTipoDeArchivo().getText();
						String respuestaAudioLibro = valv.getTextoEsAudioLibro().getText();
						boolean esAudioLibro;
						if (respuestaAudioLibro.toLowerCase().contains("si")) {
							esAudioLibro = true;
						}
						{
							esAudioLibro = false;
						}
						LibroVirtual tempLv = new LibroVirtual(idLibroVirtual, titulo, clasificacion, facultad,
								fechaDePublicacion, idioma, cantidadDePaginas, autor, editorial, tipoDeArchivo,
								esAudioLibro);
						objLv.actualizar(idLibroVirtual, tempLv);
						valv.setVisible(false);
						vp.setVisible(true);
					} else if (valorA != -1) {
						va.setVisible(false);
						vaa.setVisible(true);

						vaa.getTextoTitulo().setText(objA.getListaArticulos().get(valorA).getTitulo());
						vaa.getTextoClasificacion().setText(objA.getListaArticulos().get(valorA).getClasificacion());
						vaa.getTextoFacultad().setText(objA.getListaArticulos().get(valorA).getFacultad());
						vaa.getTextoFechaDePublicacion()
								.setText("" + objA.getListaArticulos().get(valorA).getFechaDePublicacion());
						vaa.getTextoIdioma().setText(objA.getListaArticulos().get(valorA).getIdioma());

						vaa.getTextoAutor().setText(objA.getListaArticulos().get(valorA).getAutor());
						vaa.getTextoFuente().setText(objA.getListaArticulos().get(valorA).getFuente());
						vaa.getTextoTerminosGeograficos()
								.setText(objA.getListaArticulos().get(valorA).getTerminosGeograficos());
						vaa.getTextoCantidadDePaginas()
								.setText("" + objA.getListaArticulos().get(valorA).getCantidadDePaginas());

						if (e.equals("boton_actualizar_articulo")) {
							int idArticulo = id;
							String titulo = "" + vaa.getTextoTitulo().getText();
							String clasificacion = "" + vaa.getTextoClasificacion().getText();
							String facultad = "" + vaa.getTextoFacultad().getText();
							int fechaDePublicacion = Integer.parseInt(vaa.getTextoFechaDePublicacion().getText());
							String idioma = "" + vaa.getTextoIdioma().getText();

							String autor = "" + vaa.getTextoAutor().getText();
							String fuente = vaa.getTextoFuente().getText();
							String terminosGeograficos = vaa.getTextoTerminosGeograficos().getText();
							int cantidadDePaginas = Integer.parseInt(vaa.getTextoCantidadDePaginas().getText());

							Articulo tempA = new Articulo(idArticulo, titulo, clasificacion, facultad,
									fechaDePublicacion, idioma, autor, fuente, terminosGeograficos, cantidadDePaginas);
							objA.actualizar(idArticulo, tempA);
							vaa.setVisible(false);
							vp.setVisible(true);
						}
					} else {
						JOptionPane.showMessageDialog(null, "ERROR-No se ha hallado una publicacion con aquel id",
								"MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE, null);
					}
				}

			}
			break;
		}
		}
	}

	public void runGUI() { // Run de la ventana
		vp.setVisible(true);
	}

	public void run() {

		/*
		 * case 1: { // Por revisar
		 * con.escribirConSalto("Ingrese la publicacion que desea actualizar");
		 * con.escribirConSalto("Actualizar: " + "\n1. Pelicula" + "\n2. Articulo" +
		 * "\n3. Revista" + "\n4. Juego de 4Prot" + "\n5. Libro Fisico" +
		 * "\n6. Libro Virtual"); int seleccionActualizar = con.leerInt();
		 * 
		 * con.quemarLinea();
		 * 
		 * switch (seleccionActualizar) { case 1: {
		 * 
		 * objP.mostrarDatos(); int indiceP = 0;
		 * 
		 * con.escribirConSalto("Ingrese el índice de la película que desea actualizar"
		 * ); indiceP = con.leerInt();
		 * 
		 * objP.actualizar(indiceP, null); break; } case 2: {
		 * 
		 * objA.mostrarDatos(); int indiceA = 0;
		 * 
		 * con.escribirConSalto("Ingrese el índice del artículo que desea actualizar");
		 * indiceA = con.leerInt();
		 * 
		 * objA.actualizar(indiceA, null);
		 * 
		 * break; } case 3: {
		 * 
		 * objR.mostrarDatos(); int indiceR = 0;
		 * 
		 * con.escribirConSalto("Ingrese el índice de la revista que desea actualizar");
		 * indiceR = con.leerInt();
		 * 
		 * objR.actualizar(indiceR, null);
		 * 
		 * break; } case 4: {
		 * 
		 * objS.mostrarDatos(); int indiceS = 0;
		 * 
		 * con.escribirConSalto("Ingrese el índice del juego que desea actualizar");
		 * indiceS = con.leerInt();
		 * 
		 * objS.actualizar(indiceS, null);
		 * 
		 * break; } case 5: {
		 * 
		 * objLf.mostrarDatos(); int indiceLf = 0;
		 * 
		 * con.
		 * escribirConSalto("Ingrese el índice del libro físico que desea actualizar");
		 * indiceLf = con.leerInt();
		 * 
		 * objLf.actualizar(indiceLf, null);
		 * 
		 * break; } case 6: {
		 * 
		 * objLv.mostrarDatos(); int indiceLv = 0;
		 * 
		 * con.
		 * escribirConSalto("Ingrese el índice del libro virtual que desea actualizar");
		 * indiceLv = con.leerInt();
		 * 
		 * objLv.actualizar(indiceLv, null);
		 * 
		 * break; } default: { break; } } } case 5: { break; } } } } } while (opcion !=
		 * 5);
		 */
	}

	public LibroFisicoDAO getObjLf() {
		return objLf;
	}

	public LibroVirtualDAO getObjLv() {
		return objLv;
	}

	public ArticuloDAO getObjA() {
		return objA;
	}

	public PeliculaDAO getObjP() {
		return objP;
	}

	public RevistaDAO getObjR() {
		return objR;
	}

}