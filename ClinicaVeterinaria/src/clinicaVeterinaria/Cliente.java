package clinicaVeterinaria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente implements Serializable {
	/**
	 * Clínica Veterinaria - Clase Cliente
	 * 
	 * @author Robert G
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String DNI;
	private String direccion;
	private String eMail;
	private ArrayList<Animal> mascotas;

	public static ArrayList<Cliente> clientesclinica = new ArrayList<Cliente>();
	private static Scanner sc = new Scanner(System.in);

	public Cliente(String nombre, String dNI, String direccion, String eMail) {
		this.nombre = nombre;
		DNI = dNI;
		this.direccion = direccion;
		this.eMail = eMail;
		mascotas = new ArrayList<Animal>();
	}

	public Cliente() {
	
	}

	public static Cliente daraltacliente() {

		System.out.println("Introduce nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce DNI: ");
		String dni = sc.nextLine();
		System.out.println("Introduce dirección: ");
		String direccion = sc.nextLine();
		System.out.println("Introduce e-mail: ");
		String email = sc.nextLine();

		Cliente nuevocliente = new Cliente(nombre, dni, direccion, email);
		clientesclinica.add(nuevocliente);
		System.out.println("Cliente añadido correctamente");
		return nuevocliente;
	}

	public static void buscarCliente() {

		String dni;
		System.out.println("Diga el DNI del cliente");
		dni = sc.next();

		for (Cliente i : clientesclinica) {// Bucle for each para clientes

			if (dni.equalsIgnoreCase(i.getDNI())) {// if para pillar al cliente

				System.out.println("El cliente se llama " + i.getNombre());

				for (Animal a : i.getMascotas()) {// Bucle for each para mascotas ese cliente

					System.out.println("La mascota se llama " + a.getNombre());

					for (Vacunas v : a.getLibroVacunacion()) {// Bucle for each para vacunas de cada animal

						System.out.println("Esta vacunado de " + v.getNombre());
					}
				}
			} else {
				System.out.println("El cliente no existe");
			}
		} // for each
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public ArrayList<Animal> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Animal> mascotas) {
		this.mascotas = mascotas;
	}
}
