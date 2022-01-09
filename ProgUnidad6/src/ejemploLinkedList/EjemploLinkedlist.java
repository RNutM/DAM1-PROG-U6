package ejemploLinkedList;

import java.util.LinkedList;

public class EjemploLinkedlist {
	/**
	 * Practicando con LinkedList
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList<String>();

		// Añadir elementos en la lista
		linkedlist.add("item1");
		linkedlist.add("item2");
		linkedlist.add("item3");
		linkedlist.add("item4");
		linkedlist.add("item5");

		// Imprimir
		System.out.println(linkedlist);

		// Añadir en primera posición y en última
		linkedlist.addFirst("Primero");
		linkedlist.addLast("Último");

		// Uso de get y set
		String primero1 = linkedlist.get(0);
		System.out.println("El primero1 es: " + primero1);

		linkedlist.set(0, "Primero cambiado");

		// Borrar en primero, último y posición concreta
		linkedlist.removeFirst();
		linkedlist.removeLast();
		linkedlist.remove();

		// Añadir primera y última
		linkedlist.addFirst("Primero");
		linkedlist.addLast("Último");

		System.out.println("Contenido de la lista " + linkedlist);

		// Uso de get y set
		String primero2=linkedlist.get(0);//.getFirst()
		System.out.println("El primero2 es: " + primero2);
		linkedlist.set(0, "Primero cambiado");
		System.out.println("Contenido de la lista " + linkedlist);

		// borrar primero y ultimo
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("Contenido de la lista " + linkedlist);

		// Borrar en una posición concreta
		linkedlist.remove(2);
		System.out.println("Contenido de la lista " + linkedlist);
	}
}
