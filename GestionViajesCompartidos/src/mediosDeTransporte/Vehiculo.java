package mediosDeTransporte;

import java.util.Scanner;
import recorridos.Informe;
import usuarios.Propietario;

public abstract class Vehiculo implements Informe {
	/**
	 * Paquete mediosDeTransporte: Clase Vehiculo
	 * 
	 * @author Robert G
	 */
	protected String matricula;
	protected double kmsRecorridos;
	public Propietario titular;
	protected static Scanner sc = new Scanner(System.in);

	public Vehiculo(String matricula, double kmsRecorridos, Propietario titular) {
		this.matricula = matricula;
		this.titular = titular;
		setKmsRecorridos(0);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getKmsRecorridos() {
		return kmsRecorridos;
	}

	public void setKmsRecorridos(double kmsRecorridos) {
		this.kmsRecorridos = kmsRecorridos;
	}

	public Propietario getTitular() {
		return titular;
	}
	
	public void setTitular(Propietario titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {// mostrarVehiculo()
		return "Vehiculo [matricula=" + matricula + ", kmsRecorridos=" + kmsRecorridos + ", Titular=" + titular + "]";
	}

	public double incrementarkms(double cantidad) {
		return kmsRecorridos += cantidad;
	}

	public double disminuirkms(double cantidad) {
		return kmsRecorridos -= cantidad;
	}

	// Con esta variable abstracta implemento el método en Furgoneta y Coche, que en
	// realidad con el método toString() también funciona sin necesidad de declarar esta
	// variable
	public abstract String mostrarVehiculo();

	// Método dar de alta vehiculos
	public static Vehiculo darAlta(int opcion) {
		Vehiculo vehiculo;
		Propietario propietario = new Propietario();
		String matricula = "";
		System.out.println("\nDatos del vehículo:\n*******************");
		do {
			System.out.println("Introduce matricula (Formato 1111-AAA):");
			matricula = sc.next();
		} while (!valido2(matricula));

		String kilometros = "";
		do {
			System.out.println("Introduce kilómetros recorridos:");
			kilometros = sc.next();
		} while (!valido1(kilometros));
		double kcorrectos = Double.parseDouble(kilometros);

		System.out.println("\nDatos del Propietario\n*********************");
		System.out.println("Introduce nombre:");
		sc.nextLine();
		propietario.setNombre(sc.next());
		System.out.println("Introduce localidad:");
		sc.nextLine();
		propietario.setLocalidad(sc.next());
		System.out.println("Introduce teléfono:");
		sc.nextLine();
		propietario.setTelefono(sc.next());
		System.out.println("Introduce experiencia de conducción:");
		sc.nextLine();
		propietario.setExperienciaConduccion(sc.next());
		propietario.setGasto(2.0);
		propietario.setIngreso(3.0);
		if (opcion == 1) {
			System.out.println("Introduce marca:");
			String marca = sc.next();
			System.out.println("Introduce modelo:");
			String modelo = sc.next();
			vehiculo = new Coche(matricula, kcorrectos, propietario, marca, modelo);// Cargamos en el objeto vehiculo
																					// los datos de coche
		} else {
			System.out.println("Introduce capacidad de cargar:");
			String cc = sc.nextLine();
			vehiculo = new Furgoneta(matricula, kcorrectos, propietario, cc);// Cargamos en el objeto vehiculo los datos
																				// de furgoneta
		}
		return vehiculo;
	}

	// Método para impedir la entrada de datos String en int a traves de interface
	// informe
	public static int entero = 0;

	public static boolean valido1(String valido) {
		boolean error = true;
		try {
			entero = Integer.parseInt(valido);
		} catch (NumberFormatException e1) {
			error = false;
			System.out.println("Error en el formato del número, intentelo de nuevo");
		} catch (Exception e1) {
			error = false;
			System.out.println("Error en el formato del número, intentelo de nuevo");
		}
		return error;
	}// Fin de método valido

	// Método para comprobar matricula a traves de interface informe
	public static boolean valido2(String matricula) {

		if (matricula.matches("^[0-9]{4}-[A-Z]{3}$")) {// Expresiones regulares
			System.out.println("La matrícula es válida");
			return true;
		} else {
			System.out.println("La matrícula no es válida");
			return false;
		}
	}
}
