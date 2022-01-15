package videoClub;

public class Alquiler {
	/**
	 * VideoClub - Clase Alquiler
	 * 
	 * @author Robert G
	 */
	private Dvd midvd;
	private int tiempo;

	public Alquiler(Dvd midvd, int tiempo) {
		this.midvd = midvd;
		this.tiempo = tiempo;
	}

	public Dvd getMidvd() {
		return midvd;
	}

	public void setMidvd(Dvd midvd) {
		this.midvd = midvd;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
}
