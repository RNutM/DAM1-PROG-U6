package EjerciciosArrays00;

public class Coche {
	/**
	 * Practicando con ArrayList
	 * 
	 * @author Robert G
	 */
	private String matricula;
	private String marca;
	private String modelo;

	public Coche() {
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
	}

	public Coche(String matricula, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
