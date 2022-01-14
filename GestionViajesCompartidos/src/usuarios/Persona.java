package usuarios;

public abstract class Persona {
	/**
	 * Paquete Usuarios: Clase Persona
	 * 
	 * @author Robert G
	 */
	protected String nombre;
	protected String localidad;
	protected String telefono;
	protected double gasto;
	protected double ingreso;

	public Persona(String nombre, String localidad, String telefono, double gasto, double ingreso) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.telefono = telefono;
		this.gasto = 0;
		this.ingreso = 0;
	}

	public Persona() {
		super();
		this.nombre = "";
		this.localidad = "";
		this.telefono = "";
		this.gasto = 0.0;
		this.ingreso = 0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getGasto() {
		return gasto;
	}

	public void setGasto(double gasto) {
		this.gasto = gasto;
	}

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}

	public double incrementarGasto(double cantidad) {
		return gasto += cantidad;

	}

	public double disminuirGasto(double cantidad) {
		return gasto -= cantidad;
	}

	public double incrementarIngreso(double cantidad) {
		return ingreso += cantidad;
	}

	public double disminuirIngreso(double cantidad) {
		return ingreso -= cantidad;
	}

	public String mostrarPersona() {// mostrarPersona()
		return getNombre() + " vive en " + getLocalidad() + ", su teléfono es " + getTelefono() + "\nGastos: "
				+ getGasto() + " \tIngresos: " + getIngreso();
	}

	// Método para impedir la entrada de datos String en int a traves de interface
	// informe
	@SuppressWarnings("unused")
	public static boolean valido(String va) {

		int entero = 0;
		boolean error = true;
		try {
			entero = Integer.parseInt(va);
		} catch (NumberFormatException e1) {
			error = false;
			System.out.println("Error en el formato del número, intentelo de nuevo");
		} catch (Exception e1) {
			error = false;
			System.out.println("Error en el formato del número, intentelo de nuevo");
		}
		return error;
	}
}
