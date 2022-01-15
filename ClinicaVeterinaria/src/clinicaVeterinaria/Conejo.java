package clinicaVeterinaria;

import java.util.Scanner;

public class Conejo extends Animal {
	/**
	 * Clínica Veterinaria - Clase Conejo
	 * 
	 * @author Robert G
	 */
	private static final long serialVersionUID = 1L;
	private double longOrejas;
	private static Scanner sc = new Scanner(System.in);

	public Conejo() {
		super();
		this.longOrejas = 0.0;
	}

	public Conejo(int edad, double peso, String raza, String sexo, String nombre, double longOrejas) {
		super(edad, peso, raza, sexo, nombre);
		this.longOrejas = longOrejas;
	}

	public Conejo darAlta() {

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
		System.out.println("Longitud de las orejas");
		double longitud = sc.nextDouble();
		Conejo rab = new Conejo(edad, peso, raza, sexo, nombre, longitud);
		return rab;
	}

	public double getLongOrejas() {
		return longOrejas;
	}

	public void setLongOrejas(double longOrejas) {
		this.longOrejas = longOrejas;
	}

	@Override
	public String toString() {
		return "\t Conejo: nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", sexo=" + sexo + ", raza=" + raza
				+ ", longOrejas=" + longOrejas + "\n\t\t Libro de vacunación=" + libroVacunacion;
	}
}
