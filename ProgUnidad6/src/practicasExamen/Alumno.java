package practicasExamen;

public class Alumno extends Persona {
	/**
	 * Practicando para exámen
	 * 
	 * @author Robert G
	 */
	private int nota;

	public Alumno(String dNI, String nombre, String apellidos, String direccion, String email, int nota) {
		super(dNI, nombre, apellidos, direccion, email);
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "alumno [nota=" + nota + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + ", email=" + email + "]";
	}

	@Override
	public boolean valido(String cadena) {
		// comprobar que el dni es correcto
		return false;
	}
}
