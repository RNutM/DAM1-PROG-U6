package ejerciciosArrays4_Matriculas;

public class Alumno {
	/**
	 * Practicando con Arrays Matrículas
	 * 
	 * @author Robert G
	 */
	public String clave;
	public String dni;
	public String email;
	public String nombre;

	public Alumno(String clave, String dni, String email, String nombre) {
		super();
		this.clave = clave;
		this.dni = dni;
		this.email = email;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [clave=" + clave + ", dni=" + dni + ", email=" + email + ", nombre=" + nombre + "]";
	}

	public Alumno() {
		super();
		this.clave = "";
		this.dni = "";
		this.email = "";
		this.nombre = "";
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int hashCode(Alumno al) {
		return al.getDni().hashCode();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
}
