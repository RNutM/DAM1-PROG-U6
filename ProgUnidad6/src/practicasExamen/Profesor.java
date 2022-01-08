package practicasExamen;

public class Profesor extends Persona {
	/**
	 * Practicando para exámen
	 * 
	 * @author Robert G
	 */
	private int antiguedad;

	public Profesor(String dNI, String nombre, String apellidos, String direccion, String email, int antiguedad) {
		super(dNI, nombre, apellidos, direccion, email);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "profesor [antiguedad=" + antiguedad + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + ", email=" + email + "]";
	}

	@Override
	public boolean valido(String cadena) {
		return false;
	}
}
