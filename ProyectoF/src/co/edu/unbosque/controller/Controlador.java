package co.edu.unbosque.controller;

import java.util.ArrayList;
import co.edu.unbosque.model.*;

public class Controlador {

	// hola

	private LibroFisico objf;
	private LibroVirtual objLv;
	private Steam objS;
	private Revista objR;
	private Pelicula objP;
	private Articulo objA;

	private ArrayList<LibroFisico> listaLibrosFisicos;
	private ArrayList<LibroVirtual> listaLibroVirtuales;
	private ArrayList<Steam> listaSteam;
	private ArrayList<Revista> listaRevistas;
	private ArrayList<Pelicula> listaPeliculas;
	private ArrayList<Articulo> listaArticulos;

	public void run() {

	}

	public Controlador() {
		objf = new LibroFisico();
		objLv = new LibroVirtual();
		objS = new Steam();
		objR = new Revista();
		objP = new Pelicula();
		objA = new Articulo();
		
		listaLibrosFisicos = new ArrayList<>();
		listaLibroVirtuales = new ArrayList<>();
		listaSteam = new ArrayList<>();
		listaRevistas = new ArrayList<>();
		listaPeliculas = new ArrayList<>();
		listaArticulos = new ArrayList<>();

	}

	public LibroFisico getObjf() {
		return objf;
	}

	public void setObjf(LibroFisico objf) {
		this.objf = objf;
	}

	public LibroVirtual getObjLv() {
		return objLv;
	}

	public void setObjLv(LibroVirtual objLv) {
		this.objLv = objLv;
	}

	public Revista getObjR() {
		return objR;
	}

	public void setObjR(Revista objR) {
		this.objR = objR;
	}

	public Pelicula getObjP() {
		return objP;
	}

	public void setObjP(Pelicula objP) {
		this.objP = objP;
	}

	public ArrayList<LibroFisico> getListaLibrosFisicos() {
		return listaLibrosFisicos;
	}

	public void setListaLibrosFisicos(ArrayList<LibroFisico> listaLibrosFisicos) {
		this.listaLibrosFisicos = listaLibrosFisicos;
	}

	public ArrayList<LibroVirtual> getListaLibroVirtuales() {
		return listaLibroVirtuales;
	}

	public void setListaLibroVirtuales(ArrayList<LibroVirtual> listaLibroVirtuales) {
		this.listaLibroVirtuales = listaLibroVirtuales;
	}

	public ArrayList<Revista> getListaRevistas() {
		return listaRevistas;
	}

	public void setListaRevistas(ArrayList<Revista> listaRevistas) {
		this.listaRevistas = listaRevistas;
	}

	public ArrayList<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

}
