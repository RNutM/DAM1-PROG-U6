package EjerciciosArrays_02_Primitiva;

public class loteriaprimitiva_02 {
	/**
	 * Practicando con Arrays Primitiva
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int arrayboleto[][] = new int[6][8];
		int arrayaux[] = new int[49];
		int i, j, cont = 0;

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				arrayboleto[i][j] = (int) Math.floor(Math.random() * 49 + 1);
				arrayaux[cont] = arrayboleto[i][j];
				cont++;
			}
		}

		System.out.println("Array con elementos desordenados");
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				System.out.print(" Fila " + (i + 1) + " Columna " + (j + 1 + "= "));
				System.out.print(arrayboleto[i][j]);
			}
			System.out.println();
		}
	}
}
