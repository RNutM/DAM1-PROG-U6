package mediosDeTransporte;

import usuarios.Propietario;

public class Coche extends Vehiculo {
	/**
	 * Paquete mediosDeTransporte: Clase Coche
	 * 
	 * @author Robert G
	 */
	private String marca;
	private String modelo;

	public Coche(String matricula, double kmsRecorridos, Propietario titular, String marca, String modelo) {
		super(matricula, kmsRecorridos, titular);
		this.marca = marca;
		this.modelo = modelo;
	}

	public Coche(String matricula, double kmsRecorridos, String marca, String modelo, Propietario conductor) {
		super(matricula, kmsRecorridos, conductor);
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String mostrarVehiculo() {
		return titular.getNombre() + " es el dueño del coche con matrícula " + getMatricula() + ", marca " + marca
				+ " y modelo " + modelo + "\nTotal de kms recorridos: " + getKmsRecorridos();
	}

	@Override
	public void mostrarInforme() {
	}
}
