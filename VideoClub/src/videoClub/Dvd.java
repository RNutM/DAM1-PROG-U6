package videoClub;

public class Dvd {
	/**
	 * VideoClub - Clase Dvd
	 * 
	 * @author Robert G
	 */
	private String titulo;
	private int tipo;

	public static final int NORMAL = 0;
	public static final int NOVEDAD = 1;
	public static final int INFANTIL = 2;

	public Dvd(String titulo, int tipo) {
		this.titulo = titulo;
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
