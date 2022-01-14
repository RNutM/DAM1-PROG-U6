package recorridos;

import java.util.ArrayList;
import java.util.Scanner;

import mediosDeTransporte.Coche;
import mediosDeTransporte.Vehiculo;
import usuarios.Persona;
import usuarios.Propietario;
import usuarios.Viajero;

public class Viaje {
	/**
	 * Paquete recorridos: Clase Viaje
	 * 
	 * @author Robert G
	 */
	private String origenViaje;
	private String destinoViaje;
	private double kmsViaje;
	private double gastoPorPasajero;
	static ArrayList<Persona> pasajeros = new ArrayList<Persona>();
	static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private Vehiculo transporte;
	private static Scanner sc = new Scanner(System.in);

	public Viaje(String origenViaje, String destinoViaje, double kmsViaje, double gastoPorPasajero,
			ArrayList<Persona> pasajeros, Vehiculo transporte) {
		super();
		this.origenViaje = origenViaje;
		this.destinoViaje = destinoViaje;
		this.kmsViaje = kmsViaje;
		this.gastoPorPasajero = gastoPorPasajero;
		Viaje.pasajeros = pasajeros;
		this.transporte = transporte;
		// Por cada pasajero incremento su gasto y se lo voy sumando al conductor
		for (Persona persona : pasajeros) {
			persona.incrementarGasto(gastoPorPasajero);
			transporte.getTitular().incrementarIngreso(gastoPorPasajero);
			this.gastoPorPasajero += gastoPorPasajero;
		}
		// Ya que el conductor no paga quito un gasto, pero si paga pues no quitamos el gasto
		this.gastoPorPasajero -= gastoPorPasajero;
		transporte.incrementarkms(kmsViaje);
	}

	public String getOrigenViaje() {
		return origenViaje;
	}

	public void setOrigenViaje(String origenViaje) {
		this.origenViaje = origenViaje;
	}

	public String getDestinoViaje() {
		return destinoViaje;
	}

	public void setDestinoViaje(String destinoViaje) {
		this.destinoViaje = destinoViaje;
	}

	public double getKmsViaje() {
		return kmsViaje;
	}

	public void setKmsViaje(double kmsViaje) {
		this.kmsViaje = kmsViaje;
	}

	public double getGastoPorPasajero() {
		return gastoPorPasajero;
	}

	public void setGastoPorPasajero(double gastoPorPasajero) {
		this.gastoPorPasajero = gastoPorPasajero;
	}

	public ArrayList<Persona> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Persona> pasajeros) {
		Viaje.pasajeros = pasajeros;
	}

	public Vehiculo getTransporte() {
		return transporte;
	}

	public void setTransporte(Vehiculo transporte) {
		this.transporte = transporte;
	}

	@Override
	public String toString() {// mostrarViaje()
		return "Viaje [origenViaje=" + origenViaje + ", destinoViaje=" + destinoViaje + ", kmsViaje=" + kmsViaje
				+ ", gastoPorPasajero=" + gastoPorPasajero + ", pasajeros=" + pasajeros + ", transporte="
				+ transporte.mostrarVehiculo() + "]";
	}

	public static Viaje darAlta() {
		System.out.println("Lugar de origen");
		String origen = sc.next();
		System.out.println("Lugar de destino");
		String destino = sc.next();
		System.out.println("Km del viaje");
		double kms = sc.nextDouble();
		System.out.println("Número de pasajeros");
		int pas = sc.nextInt();
		System.out.println("Dinero por pasajero");
		double gasto = sc.nextDouble();
		Propietario conductor = Propietario.darAlta();
		System.out.println("Matricula del coche");
		String matricula = sc.next();
		System.out.println("Marca del coche");
		String marca = sc.next();
		System.out.println("Modelo del coche");
		String modelo = sc.next();
		Coche c = new Coche(matricula, kms, marca, modelo, conductor);
		vehiculos.add(c);
		for (int i = 0; i < pas; i++) {
			Viajero pasajero = Viajero.darAlta();
			pasajeros.add(pasajero);
		}
		Viaje viaje = new Viaje(origen, destino, kms, gasto, pasajeros, c);
		return viaje;
	}
}
