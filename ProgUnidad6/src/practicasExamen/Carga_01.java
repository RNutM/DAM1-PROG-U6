package practicasExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Carga_01 {
	/**
	 * Practicando para exámen
	 * 
	 * @author Robert G
	 */
	public static ArrayList<Persona> CargaInicial() throws IOException {

		Alumno a1 = new Alumno("11111111A", "Juan", "Ramirez", "Calle Nueva", "juan@gmail.com", 6);
		Profesor pr1 = new Profesor("22222222B", "Jose", "Rodriguez", "Calle Vieja", "jose@hotmail.com", 5);

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
