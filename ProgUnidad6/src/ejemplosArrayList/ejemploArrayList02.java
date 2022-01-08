package ejemplosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class ejemploArrayList02 {
	/**
	 * Practicando con ArrayList02
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();
		int num = 0;
		Scanner sc = new Scanner(System.in);

		while (num != -1) {
			System.out.println("Introduce un número");
			num = sc.nextInt();
			lista.add(num);
		}
		sc.close();
		// Metodo indexOf, util para saber la posicion de un elemento

		System.out.println("En que posición esta el número 13");
		Collections.sort(lista); // Para ordenar el ArrayList
		System.out.println("El número: " + lista.indexOf(5));
		System.out.println("La lista de números es: " + lista.toString());

		// Metodo size, indica el numero de elementos de la lista
		System.out.println("Tamaño del array: " + lista.size());
		System.out.println("¿Está vacío el ArrayList o no? " + lista.isEmpty());

		// Metodo Iterator, util para recorrer un arrayList
		System.out.println("Iterador");
		Iterator<Integer> it = lista.iterator();
		// int num;
		while (it.hasNext()) {
			num = it.next();
			System.out.println(num);
		}

		int msj = JOptionPane.showConfirmDialog(null, "¿Quieres vaciar el ArrayList?");
		if (msj == JOptionPane.YES_OPTION) {// Si la opción es SI...

			// Metodo Clear, elimina todos los elementos
			lista.clear();
			JOptionPane.showMessageDialog(null, "La lista se ha borrado");
		}
		if (msj == JOptionPane.NO_OPTION) {// Si la opción es NO...

			Icon unIcono = null;// Creo una variable de tipo icono
			int si = JOptionPane.showOptionDialog// Creo mi propia ventana de mensaje personalizado
			(null, "¿Quieres que borre todos los campos?", "Pulsa SI, NO o Cancelar", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, unIcono, new Object[] { "SI", "NO", "Cancelar" }, "SI");

			if (JOptionPane.OK_OPTION == si) {// Borro todos los campos

			} else {
				JOptionPane.showMessageDialog(null, "Esta bien no borro nada");
			}
		}
	}
}
