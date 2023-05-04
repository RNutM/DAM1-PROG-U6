package ejerciciosArrays_03_Cine;

import java.util.Scanner;

public class Pelicula {
	/**
	 * Practicando con ArrayList Pel�culas
	 * 
	 * @author Robert G
	 */
	private int anyo;
	private String director;
	private String genero;
	private String nombre;

	public Pelicula(int anyo, String director, String genero, String nombre) {
		super();
		this.anyo = anyo;
		this.director = director;
		this.genero = genero;
		this.nombre = nombre;
	}

	public Pelicula() {
		super();
		this.anyo = 0;
		this.director = "";
		this.genero = "";
		this.nombre = "";
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
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
		return "pelicula [año=" + anyo + ", director=" + director + ", genero=" + genero + ", nombre=" + nombre + "]";
	}

	public String mostrarPelicula() {
		return "El nombre de la película es " + nombre + " , del año " + anyo + ", del genero " + genero
				+ " y del director " + director;
	}

	@SuppressWarnings("resource")
	public static Pelicula altaPelicula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de la pelicula");
		String n = sc.nextLine().toUpperCase();
		System.out.println("Introduce el g�nero de la pel�cula");
		String g = sc.nextLine().toUpperCase();
		System.out.println("Introduce el director de la pel�cula");
		String d = sc.nextLine().toUpperCase();

		int anyo = 0;

		boolean correcto = true;
		while (correcto) {

			try {
				System.out.println("Introduce el a�o de la pelicula");
				anyo = sc.nextInt();
				correcto = false;
			} catch (Exception e) {
				System.out.println("El a�o debe ser un n�mero");
			}
		}
		// System.out.println("película "+n+" género "+g+" año "+anyo+" director"+d);
		Pelicula p = new Pelicula(anyo, d, g, n); // Creamos el objeto p

		return p;
	}
}
