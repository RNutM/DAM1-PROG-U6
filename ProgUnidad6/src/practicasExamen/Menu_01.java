package practicasExamen;

import java.io.IOException;
import java.util.ArrayList;

public class Menu_01 {
	/**
	 * Practicando para exámen
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		ArrayList<Persona> listapersonas = new ArrayList<Persona>();
		listapersonas = Carga_01.CargaInicial();

		for (Persona i : listapersonas) {
			System.out.println(i);
		}
	}
}
