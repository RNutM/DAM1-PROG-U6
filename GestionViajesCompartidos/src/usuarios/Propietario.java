package usuarios;

import java.util.Scanner;

public class Propietario extends Persona {
	/**
	 * Paquete Usuarios: Clase Propietario
	 * 
	 * @author Robert G
	 */
	private String experienciaConduccion;
	private static Scanner sc = new Scanner(System.in);

	public Propietario(String nombre, String localidad, String telefono, double gasto, double ingreso,
			String experienciaConduccion) {
		super(nombre, localidad, telefono, gasto, ingreso);
		this.experienciaConduccion = experienciaConduccion;
	}

	public Propietario() {
		super();
		this.gasto = 0.0;
		this.ingreso = 0.0;
	}

	@Override
	public String toString() {
		return getNombre() + " vive en " + getLocalidad() + ", su teléfono es " + getTelefono() + " y tiene "
				+ getExperienciaConduccion() + " de experiencia. " + " años\nGasto: " + getGasto() + " \tIngresos: "
				+ getIngreso();
	}

	public String getExperienciaConduccion() {
		return experienciaConduccion;
	}

	public void setExperienciaConduccion(String experienciaConduccion) {
		this.experienciaConduccion = experienciaConduccion;
	}

	public static Propietario darAlta() {
		System.out.println("\nDatos del Propietario\n*********************");
		System.out.println("Introduce nombre:");
		String nombre = sc.nextLine();

		System.out.println("Introduce localidad:");
		String localidad = sc.nextLine();

		System.out.println("Introduce teléfono:");
		String telefono = sc.nextLine();

		System.out.println("Introduce experiencia de conducción:");
		String xp = sc.nextLine();

		Propietario propietario = new Propietario(nombre, localidad, telefono, 0.0, 0.0, xp);
		return propietario;
	}
}
