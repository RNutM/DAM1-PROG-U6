package videoClub;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Cliente {
	/**
	 * VideoClub - Clase Cliente
	 * 
	 * @author Robert G
	 */
	private String nombre;
	private ArrayList<Alquiler> alquiladas;

	Cliente(String nombre) {
		this.nombre = nombre;
		alquiladas = new ArrayList<Alquiler>();
	}

	public void nuevoAlquiler(Alquiler a) {
		alquiladas.add(a);
	}

	public void informe() throws FileNotFoundException {

		double pago = 0.0;
		double importe = 0.0;
		int puntos = 0;

		PrintWriter salida = new PrintWriter(".\\ficheros\\Ticket" + nombre.replace(" ", "") + ".txt");

		System.out.println("Ticket para " + this.nombre);// En consola

		salida.println("Ticket para " + this.nombre);// En archivo

		System.out.println("Ha alquilado: ");// En consola

		for (Alquiler i : alquiladas) {

			puntos++;

			switch (i.getMidvd().getTipo()) {

			case Dvd.NORMAL:
				pago = 2 * i.getTiempo();
				break;
			case Dvd.NOVEDAD:
				pago = 3 * i.getTiempo();
				if (i.getTiempo() > 1)
					puntos++;
				break;
			case Dvd.INFANTIL:
				pago = 1.5 * i.getTiempo();
				break;
			}
			importe += pago;// importe=importe+pago

			System.out.println("\t" + i.getMidvd().getTitulo() + " " + pago + "€");// En consola
			salida.println("\t" + i.getMidvd().getTitulo() + " " + pago + "€");// En archivo

		} // for
		System.out.println("IMPORTE TOTAL: " + importe + "€");// En consola
		System.out.println("Tiene " + puntos + " puntos");// En consola
		salida.println("IMPORTE TOTAL: " + importe + "€");// En archivo
		salida.println("Tiene " + puntos + " puntos");// En archivo
		salida.flush();
		salida.close();
	}
}
