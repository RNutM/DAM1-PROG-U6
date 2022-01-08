package ejerciciosArrays_01_Temperatura;

import java.util.Scanner;

public class temperaturas {
	/**
	 * Practicando con Arrays Temperaturas
	 * 
	 * @author Robert G
	 */
	float[] temperatura = new float[10];
	String[] dia = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
	String numero = "";
	float total = 0;
	Scanner sc = new Scanner(System.in);

	// Metodo pedir temperatura
	public void pedir() {

		for (int i = 0; i < 10; i++) {
			do {
				System.out.print("Introduce la temperatura del día " + dia[i] + ": ");
				numero = sc.next();
			} while (valida(numero));
			temperatura[i] = Float.parseFloat(numero);
			total = temperatura[i];
		}
	}

	// Método hayar la media
	public float media() {

		float media = 0;
		float suma = 0;

		for (int i = 0; i < temperatura.length; i++) {
			suma = suma + temperatura[i];
		}
		media = suma / temperatura.length;

		return media;
	}

	// Método hayar la máxima
	public float maxima() {

		float maxima = 0;

		for (int i = 0; i < temperatura.length; i++) {
			// System.out.println("La temperatura en posición "+i+" son "+temperatura[i]+"
			// grados");
			if (temperatura[i] > maxima)
				maxima = temperatura[i];
		}
		return maxima;
	}

	// Método hayar la minima
	public float minima() {

		float minima = temperatura[0];

		for (int i = 0; i < temperatura.length; i++) {
			// System.out.println("La temperatura en posición "+i+" son "+temperatura[i]+"
			// grados");
			if (temperatura[i] < minima)
				minima = temperatura[i];
		}
		return minima;
	}

	// Hayar dias por encima de la media
	public int encimamedia() {

		float media = 0;
		float suma = 0;
		int cont = 0;
		for (int i = 0; i < temperatura.length; i++) {
			suma = suma + temperatura[i];
		}
		media = suma / temperatura.length;

		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] > media) {
				System.out.println("La temperatura: " + temperatura[i] + " está por encima de la media");
				cont++;
			}
		}
		return cont;
	}

	@SuppressWarnings("unused")
	public static boolean valida(String numero) {

		float entero = 0.0f;
		boolean error = false;
		try {
			entero = Float.parseFloat(numero);
		} catch (NumberFormatException e1) {
			error = true;
			System.out.println("Error en el formato del número, intentelo de nuevo");
		} catch (Exception e1) {
			error = true;
			System.out.println("Error en el formato del número, intentelo de nuevo");
		}
		return error;
	}
}
