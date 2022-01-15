package clinicaVeterinaria;

import java.util.Scanner;

public class Gato extends Animal {
	/**
	 * Clínica Veterinaria - Clase Conejo
	 * 
	 * @author Robert G
	 */
	private static final long serialVersionUID = 1L;
	private boolean obesidad;
	private static Scanner sc = new Scanner(System.in);

	public Gato() {
		super();
		this.obesidad = false;
	}

	public Gato(int edad, double peso, String raza, String sexo, String nombre, boolean obesidad) {
		super(edad, peso, raza, sexo, nombre);
		this.obesidad = obesidad;
	}

	public Gato darAlta() {

		System.out.println("Introduce Edad");
		int edad = sc.nextInt();
		System.out.println("Introduce Peso");
		double peso = sc.nextDouble();
		System.out.println("Introduce Raza");
		String raza = sc.next();
		System.out.println("Introduce Sexo");
		String sexo = sc.next();
		System.out.println("Introduce Nombre");
		String nombre = sc.next();
		System.out.println("¿Tiene Obesidad? S/N");
		boolean obesidad;
		if (sc.next().equalsIgnoreCase("S")) {
			obesidad = true;
		} else {
			obesidad = false;
		}
		Gato cat = new Gato(edad, peso, raza, sexo, nombre, obesidad);
		return cat;
	}

	public boolean isObesidad() {
		return obesidad;
	}

	public void setObesidad(boolean obesidad) {
		this.obesidad = obesidad;
	}

	@Override
	public String toString() {
		return "\t Gato: nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "," + " sexo=" + sexo + ", raza="
				+ raza + ", obesidad=" + obesidad + "\n\t\t Libro de vacunación=" + libroVacunacion;
	}
}
