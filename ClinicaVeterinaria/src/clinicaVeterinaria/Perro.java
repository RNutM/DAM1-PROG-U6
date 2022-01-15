package clinicaVeterinaria;

import java.util.Scanner;

public class Perro extends Animal {
	/**
	 * Clínica Veterinaria - Clase Perro
	 * 
	 * @author Robert G
	 */
	private static final long serialVersionUID = 1L;
	private boolean segObligatorio;
	private boolean chipIden;
	private static Scanner sc = new Scanner(System.in);

	public Perro() {
		super();
		this.segObligatorio = false;
		this.chipIden = false;
	}

	public Perro(int edad, double peso, String raza, String sexo, String nombre, boolean segObligatorio,
			boolean chipIden) {
		super(edad, peso, raza, sexo, nombre);
		this.segObligatorio = segObligatorio;
		this.chipIden = chipIden;
	}

	public Perro darAlta() {

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
		System.out.println("¿Tiene Seguro? S/N");
		boolean seguro;
		if (sc.next().equalsIgnoreCase("S")) {
			seguro = true;
		} else {
			seguro = false;
		}
		System.out.println("¿Tiene Chip? S/N");
		boolean chip;
		if (sc.next().equalsIgnoreCase("S")) {
			chip = true;
		} else {
			chip = false;
		}
		Perro dog = new Perro(edad, peso, raza, sexo, nombre, chip, seguro);
		return dog;
	}

	public boolean isSegObligatorio() {
		return segObligatorio;
	}

	public void setSegObligatorio(boolean segObligatorio) {
		this.segObligatorio = segObligatorio;
	}

	public boolean isChipIden() {
		return chipIden;
	}

	public void setChipIden(boolean chipIden) {
		this.chipIden = chipIden;
	}

	@Override
	public String toString() {
		return "\t Perro: nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "," + " sexo=" + sexo + ", raza="
				+ raza + ", segObligatorio=" + segObligatorio + "," + " chipIden=" + chipIden
				+ "\n\t\t Libro de vacunación" + libroVacunacion;
	}
}
