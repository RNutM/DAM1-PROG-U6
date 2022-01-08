package practicasExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Carga_02 {
	/**
	 * Practicando para exámen
	 * 
	 * @author Robert G
	 */
	public static ArrayList<Persona> CargaInicial() throws IOException {

		Alumno a1 = new Alumno("Pepe", "Sanchez", "La larga,9", "pepe@gmail.com", "Alumno", 6);
		Profesor pr1 = new Profesor("Pepa", "Santa", "La cortas,19", "pepa@hotmail.com", "Profesora", 9);

		ArrayList<Persona> a = new ArrayList<Persona>();
		a.add(a1);
		a.add(pr1);

		FileReader fr = new FileReader(".\\ficheros\\personas.csv");
		try (BufferedReader entrada = new BufferedReader(fr)) {
			String cadena = entrada.readLine();

			String[] linea;
			while (cadena != null) {
				cadena = entrada.readLine();
				if (cadena != null) {
					linea = cadena.split(";");// Cuando llega al ; es otra cadena
					System.out.println(cadena);
					if (linea[5].equals("Alumno")) {
						Alumno al = new Alumno(linea[0], linea[1], linea[2], linea[3], linea[4],
								Integer.parseInt(linea[6]));
						a.add(al);
					} else {
						Profesor pr = new Profesor(linea[0], linea[1], linea[2], linea[3], linea[4],
								Integer.parseInt(linea[7]));
						a.add(pr);
					}
				}
			} // while
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return a;
	}
}
