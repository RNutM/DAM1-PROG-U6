package ejerciciosArrays_02_Primitiva;

public class loteriaprimitiva_02 {
	/**
	 * Practicando con Arrays Primitiva 8 apuestas de 6 números cada una. Con array
	 * desordenado
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int arrayboleto[][] = new int[8][6];
		int arrayaux[] = new int[49];
		int i, j, cont = 0;

		for (i = 0; i < 8; i++) {
			for (j = 0; j < 6; j++) {
				arrayboleto[i][j] = (int) Math.floor(Math.random() * 49 + 1);
				arrayaux[cont] = arrayboleto[i][j];
				cont++;
			}
		}
		System.out.println("////Array con elementos desordenados" + "\\\\\\\\" + "\n");
		System.out.println("\t**Boleto con 8 apuestas de 6 números cada una**\n");
		for (i = 0; i < 8; i++) {
			for (j = 0; j < 6; j++) {
				// System.out.print(" Fila " + (i + 1) + " Columna " + (j + 1 + "= "));
				System.out.print("\t" + arrayboleto[i][j]);
			}
			//System.out.println("\n");
			int reintegro = (int) Math.floor(Math.random() * 10); // Generar el número de reintegro
            System.out.println("   -   Reintegro: " + reintegro); // Imprimir el número de reintegro
		}
	}
}
