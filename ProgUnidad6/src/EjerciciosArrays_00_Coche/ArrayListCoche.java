package EjerciciosArrays_00_Coche;

import java.util.ArrayList;

public class ArrayListCoche {
	/**
	 * Practicando con ArrayList
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Coche c1 = new Coche("1234-PXR", "Opel", "Corsa");
		Coche c2 = new Coche("2222-BCD", "Seat", "Altea");
		Coche c3 = new Coche("3333-JDD", "Alfa", "Romeo");
		int cont = 1;
		// Coche []c=new Coche[10]; Si hubiera sido un array normal
		ArrayList<Coche> a = new ArrayList<Coche>();// El ArrayList es una estructura dinámica

		// Añadir objetos al ArrayList
		a.add(c1);
		a.add(c2);
		a.add(c3);

		System.out.println("Con bucle for each: ");
		System.out.println("*********************");
		for (Coche i : a) {
			System.out.println(i);
		}

		System.out.println("\nCon bucle for normal: ");
		System.out.println("*********************");
		for (int i = 0; i < a.size(); i++)
			System.out.println(a.get(i));

		// Acceder al elemento de la posición 1
		System.out.println("\n1 " + a.get(1).getMarca());

		// Acceder a las marcas cambio la posición 1 por i
		for (int i = 0; i < a.size(); i++) {
			cont++;
			System.out.println(cont +" "+ a.get(i).getMarca());
		}
		// Añado un elemento en el array list en la posición 0
		Coche c4 = new Coche("4444-DDD", "Citröen", "C4");
		a.add(0, c4);
		System.out.println();
		for (Coche i : a) {
			System.out.println(i);
		}
		// Para borrar todos los elementos de un ArrayList -> clear
	}
}
