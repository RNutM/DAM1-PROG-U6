package videoClub;

import java.io.FileNotFoundException;

public class Main {
	/**
	 * VideoClub - Clase Main
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// Creo los dvds
		Dvd dvd1 = new Dvd("Terminator", Dvd.NORMAL);
		Dvd dvd2 = new Dvd("Rocky", Dvd.INFANTIL);
		Dvd dvd3 = new Dvd("Venom", Dvd.NOVEDAD);

		// Creo los alquileres
		Alquiler alq1 = new Alquiler(dvd1, 1);
		Alquiler alq2 = new Alquiler(dvd2, 2);
		Alquiler alq3 = new Alquiler(dvd3, 3);

		// Creo el cliente
		Cliente c = new Cliente("Robert Gutiérrez");

		// Asigno los alquileres insertando un nuevo elemento al ArrayList<Alquiler>
		// alquiladas
		c.nuevoAlquiler(alq1);
		c.nuevoAlquiler(alq2);
		c.nuevoAlquiler(alq3);

		// Muestro el informe
		c.informe();
	}
}
