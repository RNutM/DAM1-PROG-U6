package app;

import java.util.ArrayList;
import java.util.Scanner;

import mediosDeTransporte.Vehiculo;
import recorridos.InformePersona;
import recorridos.InformeVehiculo;
import recorridos.Viaje;
import usuarios.Persona;
import usuarios.Propietario;
import usuarios.Viajero;

public class Gesvehicom {
	/**
	 * Paquete app: Gesvehicom aplicación
	 * 
	 * @author Robert G
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<Persona>();
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		ArrayList<Viaje> viajes = new ArrayList<Viaje>();

		int switch1 = 0, switch2 = 0;

		do {
			System.out.println("\nElige una opción:\n1. Añadir viajero\n2. Añadir vehículo\n3. Añadir propietario\n"
					+ "4. Añadir viaje\n5. Informe personas\n6. Informe vehículos\n7. Salir del programa\n");
			switch1 = sc.nextInt();

			switch (switch1) {
			case 1:// Añadir viajero
				personas.add(Viajero.darAlta());
				System.out.println("Viajero añadido");
				System.out.println(personas);
				break;
			case 2:// Añadir vehículo
				do {
					System.out.println("\nElige una opción:\n1. Añadir coche\n2. Añadir furgoneta\n3. Volver\n");
					switch2 = sc.nextInt();

					switch (switch2) {
					case 1:// Añadir Coche
						vehiculos.add(Vehiculo.darAlta(1));
						System.out.println("Coche añadido");
						System.out.println(vehiculos);
						break;
					case 2:// Añadir Furgoneta
						vehiculos.add(Vehiculo.darAlta(2));
						System.out.println("Furgoneta añadido");
						System.out.println(vehiculos);
						break;
					case 3:// Opción para salir del menú
						break;
					default:
						System.out.println("No ha pulsado un número del 1 al 3\n**********************************");
						break;
					}
				} while (switch2 != 3);
				System.out.println("Furgoneta añadida");
				System.out.println(vehiculos);
				break;
			case 3:// Añadir Propietario
				personas.add(Propietario.darAlta());
				System.out.println("Propietario añadido");
				System.out.println(personas);
				break;
			case 4:// Añadir Viaje
				viajes.add(Viaje.darAlta());
				System.out.println("Viaje añadido");
				System.out.println(viajes);
				break;
			case 5:// Informe Personas
				System.out.println("\nMostrar informes de personas\n****************************");
				InformePersona iPersona = new InformePersona(personas);
				iPersona.mostrarInforme();
				break;
			case 6:// Informe Vehículos
				System.out.println("\nMostrar informes de vehículos\n*****************************");
				InformeVehiculo iVehiculos = new InformeVehiculo(vehiculos);
				iVehiculos.mostrarInforme();
				break;
			case 7:
				break;// Salir y mostrará el sysout que hay después del do while
			default:// El cliente no ha introducido un número del 1 al 6
				System.out.println("No ha pulsado un número del 1 al 6");
				System.out.println("******************************************");
				break;
			}// Fin del switch opciones
		} while (switch1 != 7);// Mientras no pulsamos 7 seguimos dentro del programa
		System.out.println("Ha salido del programa - Hasta pronto");
	}
}
