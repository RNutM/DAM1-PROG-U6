package ejemplosArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ejemploArrayList01 {
	/**
	 * Practicando con ArrayList01
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();

		// Metodo add. añade elementos a nuestra lista
		lista.add(1);
		lista.add(2);
		lista.add(3);

		System.out.println("ADD");
		System.out.println(lista.toString());

		// Metodo remove, elimina elementos de nuestra lista mediente indice
		lista.remove(2); // Elimino el ultimo elemento, no el elemento 2

		System.out.println("REMOVE");
		System.out.println(lista.toString());

		// Metodo size, indica el numero de elementos de la lista

		System.out.println("SIZE");
		System.out.println(lista.size());

		// Metodo get, devolvemos un elemento de un indice

		System.out.println("GET");
		System.out.println(lista.get(0)); // Primer elemento

		// Metodo Iterator, util para recorrer un arrayList

		System.out.println("ITERATOR");
		Iterator<Integer> it = lista.iterator();
		int num;
		while (it.hasNext()) {
			num = it.next();
			System.out.println(num);
		}

		// Metodo indexOf, util para saber la posicion de un elemento

		System.out.println("INDEXOF");
		System.out.println(lista.indexOf(1));

		// Metodo Clear, elimina todos los elementos
		lista.clear();

		System.out.println("CLEAR");
		System.out.println(lista.toString());

		// Metodo isEmpty, indica si un arraylist esta vacio o no

		System.out.println("isEmpty");
		System.out.println(lista.isEmpty());
	}
}
