package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner sc;

	public Consola() {
		sc = new Scanner(System.in);
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int leerInt() {
		return sc.nextInt();
	}

	public boolean leerBoolean() {
		String entrada = leerLineaCompleta();
		if (entrada.toLowerCase().contains("si")) {
			return true;
		} else {
			return false;
		}
	}

	public float leerFloat() {
		return sc.nextFloat();
	}

	public double leerDouble() {
		return sc.nextDouble();
	}

	public long leerLong() {
		return sc.nextLong();
	}

	public String leerLineaCompleta() {
		return sc.nextLine();
	}

	public String leerPalabra() {
		return sc.next();
	}

	public char leerChar() {
		return sc.next().charAt(0);
	}

	public void escribirConSalto(String texto) {
		System.out.println(texto);
	}

	public void escribirSinSalto(String texto) {
		System.out.print(texto);
	}

	public void quemarLinea() {
		sc.nextLine();
	}

}
