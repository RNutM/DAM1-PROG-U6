package ejerciciosArrays_03_Cine;

import java.util.Scanner;

public class Peliculas {
	/**
	 * Practicando con Arrays Películas
	 * 
	 * @author Robert G
	 */
	private int año;
	private String director;
	private String genero;
	private String nombre;

	public Peliculas(int año, String director, String genero, String nombre) {
		super();
		this.año = año;
		this.director = director;
		this.genero = genero;
		this.nombre = nombre;
	}

	public Peliculas() {
		super();
		this.año = 0;
		this.director = "";
		this.genero = "";
		this.nombre = "";
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "pelicula [año=" + año + ", director=" + director + ", genero=" + genero + ", nombre=" + nombre + "]";
	}

	public String mostrarPelicula() {
		return "El nombre de la película es " + nombre + " , del año " + año + ", del genero " + genero
				+ " y del director " + director;
	}

	@SuppressWarnings("resource")
	public static Peliculas altaPelicula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de la pelicula");
		String n = sc.nextLine().toUpperCase();
		System.out.println("Introduce el género de la película");
		String g = sc.nextLine().toUpperCase();
		System.out.println("Introduce el director de la película");
		String d = sc.nextLine().toUpperCase();

		int año = 0;

		boolean correcto = true;
		while (correcto) {

			try {
				System.out.println("Introduce el año de la pelicula");
				año = sc.nextInt();
				correcto = false;
			} catch (Exception e) {
				System.out.println("El año debe ser un número");
			}
		}
		// System.out.println("película "+n+" género "+g+" año "+año+" director"+d);
		Peliculas p = new Peliculas(año, d, g, n); // Creamos el objeto p

		return p;
	}
}
