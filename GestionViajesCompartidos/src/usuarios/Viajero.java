package usuarios;

import java.util.Scanner;

public class Viajero extends Persona {
	/**
	 * Paquete Usuarios: Clase Viajero
	 * 
	 * @author Robert G
	 */
	private String puntoRecogidaPreferido;
	private static Scanner sc = new Scanner(System.in);

	public Viajero(String nombre, String localidad, String telefono, double gasto, double ingreso,
			String puntoRecogidaPreferido) {
		super(nombre, localidad, telefono, gasto, ingreso);
		this.puntoRecogidaPreferido = puntoRecogidaPreferido;
	}

	public Viajero() {
		super();
		this.gasto = 0.0;
	}

	public String getPuntoRecogidaPreferido() {
		return puntoRecogidaPreferido;
	}

	public void setPuntoRecogidaPreferido(String puntoRecogidaPreferido) {
		this.puntoRecogidaPreferido = puntoRecogidaPreferido;
	}

	@Override
	public String toString() {// mostrarPersona()
		return "Viajero [puntoRecogidaPreferido=" + puntoRecogidaPreferido + ", nombre=" + nombre + ", localidad="
				+ localidad + ", telefono=" + telefono + ", gasto=" + gasto + ", ingreso=" + ingreso + "]";
	}

	public static Viajero darAlta() {

		String gasto = "";
		String ingreso = "";
		System.out.println("\nDatos del viajero\n*****************");
		System.out.println("Introduce nombre:");
		String nombre = sc.nextLine();

		System.out.println("Introduce localidad:");
		String localidad = sc.nextLine();

		System.out.println("Introduce teléfono:");
		String telefono = sc.nextLine();

		do {
			System.out.println("Introduce gasto:");
			gasto = sc.next();
		} while (!valido(gasto));
		float gastocorrecto = Float.parseFloat(gasto);

		do {
			System.out.println("Introduce ingreso:");
			ingreso = sc.next();
		} while (!valido(ingreso));
		float ingresocorrecto = Float.parseFloat(ingreso);

		System.out.println("Introduce punto de recogida:");
		sc.nextLine();
		String puntoRecogida = sc.nextLine();

		Viajero viajero = new Viajero(nombre, localidad, telefono, gastocorrecto, ingresocorrecto, puntoRecogida);
		return viajero;
	}
}
