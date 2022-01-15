package clinicaVeterinaria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Animal implements Serializable {
	/**
	 * Clínica Veterinaria - Clase Animal
	 * 
	 * @author Robert G
	 */
	private static final long serialVersionUID = 1L;
	protected int edad;
	protected double peso;
	protected String raza;
	protected String sexo;
	protected String nombre;
	ArrayList<Vacunas> libroVacunacion;
	private static Scanner sc = new Scanner(System.in);
	
	public Animal(int edad, double peso, String raza, String sexo, String nombre) {
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		libroVacunacion = new ArrayList<Vacunas>();
	}

	public Animal() {
		this.edad = 0;
		this.peso = 0.0;
		this.raza = "";
		this.sexo = "";
		this.nombre = "";
		libroVacunacion = new ArrayList<Vacunas>();
	}

	public static void daraltaMascota() {
		
		String dni;
		System.out.println("Diga el DNI del cliente");
		dni = sc.next();

		for (Cliente i : Cliente.clientesclinica) {// Bucle for each para clientes

			if (dni.equalsIgnoreCase(i.getDNI())) {// if para pillar al cliente

				System.out.println("El cliente se llama " + i.getNombre());

				int cont = 0;
				for (Animal j : i.getMascotas()) {
					System.out.println(cont + ")" + j);
					cont++;
				}

				System.out.println("Para dar de alta pulsa A y para dar de baja pulsa B");
				String op = sc.next();

				if (op.equalsIgnoreCase("A")) {
					System.out.println("Dar de alta");
					System.out.println("¿Qué desea dar de alta? Pulse P para perro, G para Gato o C para conejo");
					op = sc.next();
					switch (op.toLowerCase()) {
					case "p":
						Perro dog = new Perro();
						System.out.println("Perro");
						i.getMascotas().add(dog.darAlta());
						break;
					case "g":
						Gato cat = new Gato();
						System.out.println("Gato");
						i.getMascotas().add(cat.darAlta());
						break;
					case "c":
						Conejo rab = new Conejo();
						System.out.println("Conejo");
						i.getMascotas().add(rab.darAlta());
						break;
					}
					System.out.println("Las mascotas son: ");
					cont = 0;
					for (Animal j : i.getMascotas()) {
						System.out.println(cont + ")" + j);
						cont++;
					}
				} else {
					if (op.equalsIgnoreCase("B")) {
						System.out.println("Dar de baja ");
						System.out.println("¿Qué mascota quiere dar de baja?");
						cont = 0;
						for (Animal j : i.getMascotas()) {
							System.out.println(cont + ")" + j);
							cont++;
						}

						int opcion = sc.nextInt();
						if (opcion <= cont) {
							i.getMascotas().remove(opcion);
							System.out.println("Mascota borrada");
						}
						cont = 0;
						for (Animal j : i.getMascotas()) {
							System.out.println(cont + ")" + j);
							cont++;
						}
					}
				}
			}
		}
	}

	// Método libro de vacunas
	public void nuevasvacunas(Vacunas v) {
		libroVacunacion.add(v);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Vacunas> getLibroVacunacion() {
		return libroVacunacion;
	}

	public void setLibroVacunacion(ArrayList<Vacunas> libroVacunacion) {
		this.libroVacunacion = libroVacunacion;
	}
}
