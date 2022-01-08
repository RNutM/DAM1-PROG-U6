package ejerciciosArrays_03_Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/**
	 * Practicando con Arrays Películas
	 * 
	 * @author Robert G
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Este ArrayList va a almacenar todas las peliculas
		ArrayList<Peliculas> listaPel = new ArrayList<Peliculas>();

		String eleccion = "";
		boolean salir = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Añadir película");
			System.out.println("2. Borrar película");
			System.out.println("3. Mostrar películas");
			System.out.println("4. Buscar por género");
			System.out.println("5. Buscar por inicial");
			System.out.println("6. Salir");
			System.out.println("Elige una opcion: ");

			eleccion = sc.next();

			switch (eleccion) {

			case "1":// Añadir película
				Peliculas mipeli = new Peliculas();
				mipeli = Peliculas.altaPelicula();
				System.out.println(mipeli.mostrarPelicula());
				listaPel.add(mipeli);
				break;
			case "2":// Borrar película
				borrar(listaPel);
				break;
			case "3":// Mostrar películas
				for (Peliculas p : listaPel)
					System.out.println(p.mostrarPelicula());
				break;
			case "4":// Buscar por genero
				buscarG(listaPel);
				break;
			case "5":// Buscar por inicial
				buscarL(listaPel);
				break;
			case "6":// Opción para salir
				salir = false;
				System.out.println("Has salido del programa, hasta pronto");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}// switch

		} while (salir);
	}

	@SuppressWarnings("resource")
	public static void borrar(ArrayList<Peliculas> lista) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que película quieres borrar");
		String n = sc.nextLine().toUpperCase();
		int borradas = 0;
		// Para cada película del ArrayList
		for (int a = 0; a < lista.size(); a++) {
			Peliculas p = (Peliculas) lista.get(a);
			if (p.getNombre().equalsIgnoreCase(n)) {
				lista.remove(a);
				System.out.println("Película borrada");
				borradas++;
			}
		}
		if (borradas == 0)
			System.out.println("Película no encontrada");
	}

	@SuppressWarnings("resource")
	public static void buscarL(ArrayList<Peliculas> lista) {
		Scanner sc = new Scanner(System.in);
		System.out.println("La película empieza por ");
		String l = sc.nextLine().toUpperCase();
		int encontradas = 0;
		// Para cada película del ArrayList

		for (int a = 0; a < lista.size(); a++) {
			Peliculas p = (Peliculas) lista.get(a);
			if (p.getNombre().startsWith(l)) {

				System.out.println(p.mostrarPelicula());
				encontradas++;
			}
		}
		if (encontradas == 0)
			System.out.println("Película no encontrada");
	}

	@SuppressWarnings("resource")
	public static void buscarG(ArrayList<Peliculas> lista) {
		Scanner sc = new Scanner(System.in);
		System.out.println("El género es: ");
		String g = sc.nextLine().toUpperCase();

		// Para cada película del ArrayList
		for (int a = 0; a < lista.size(); a++) {
			Peliculas p = (Peliculas) lista.get(a);
			if (p.getGenero().equals(g)) {
				System.out.println(p.mostrarPelicula());
			}
		}
	}
}
