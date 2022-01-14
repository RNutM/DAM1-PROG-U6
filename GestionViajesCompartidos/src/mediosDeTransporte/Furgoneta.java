package mediosDeTransporte;

import usuarios.Propietario;

public class Furgoneta extends Vehiculo {
	/**
	 * Paquete mediosDeTransporte: Clase Furgoneta
	 * 
	 * @author Robert G
	 */
	private String capacidadCarga;

	public Furgoneta(String matricula, double kmsRecorridos, Propietario titular, String capacidadCarga) {
		super(matricula, kmsRecorridos, titular);
		this.capacidadCarga = capacidadCarga;
	}

	public String getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(String capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public String toString() {// mostrarVehiculo()
		return "Furgoneta [capacidadCarga=" + capacidadCarga + ", matricula=" + matricula + ", kmsRecorridos="
				+ kmsRecorridos + ", Titular=" + titular + "]";
	}

	@Override
	public String mostrarVehiculo() {
		return titular.getNombre() + " es el dueño de la furgoneta con matrícula " + getMatricula()
				+ "\nTotal de kms recorridos: " + getKmsRecorridos();
	}

	@Override
	public void mostrarInforme() {
	}
}
