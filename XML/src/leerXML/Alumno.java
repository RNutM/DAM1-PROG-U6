package leerXML;

public class Alumno {
	/**
	 * Clase Alumno
	 * 
	 * @author Robert G
	 * @version 1.0
	 */
	private String nombre;
	private int edad;
	private String email;
	private String genero;

	public Alumno(String nombre, int edad, String email, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.genero = genero;
	}

	public Alumno() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.email = "";
		this.genero = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "alumno [nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", genero=" + genero + "]";
	}
}
