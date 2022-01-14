package recorridos;

import java.util.ArrayList;

import mediosDeTransporte.Vehiculo;

public class InformeVehiculo implements Informe {
	/**
	 * Paquete recorridos: Clase InformeVehiculo
	 * 
	 * @author Robert G
	 */
	public ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public InformeVehiculo(ArrayList<Vehiculo> vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}

	public InformeVehiculo() {
		super();
		this.vehiculos = null;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public void mostrarInforme() {
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.mostrarVehiculo());
			System.out.println();
		}
	}
}
