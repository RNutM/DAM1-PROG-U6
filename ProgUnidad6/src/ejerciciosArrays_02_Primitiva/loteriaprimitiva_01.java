package ejerciciosArrays_02_Primitiva;

public class loteriaprimitiva_01 {
    /**
     * Practicando con Arrays Primitiva una combinación
     * 
     * @author Robert G
     */
    private static int arrayboleto[] = new int[6];
    private static int R;

    public static void burbuja(int lista[]) {
        int cuentaintercambios = 0;
        // Usamos un bucle anidado, saldrá cuando esté ordenado el array
        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < lista.length - 1; i++) {
                if (lista[i] > lista[i + 1]) {
                    // Intercambiamos valores
                    int variableauxiliar = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = variableauxiliar;
                    // Indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            // Si no hay intercambios, es que está ordenado.
            if (cuentaintercambios == 0) {
                ordenado = true;
            }
            // Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios = 0;
        }
    }

    private static int numeroAleatorio() {
        return ((int) Math.floor(Math.random() * 49) + 1);
    }

    // Método para generar un número aleatorio del 0 al 9
    private static int generarNumeroR() {
        return ((int) Math.floor(Math.random() * 10)); // Genera un número entre 0 y 9
    }

    public static void rellenarArray(int lista[]) {
        for (int i = 0; i < arrayboleto.length; i++) {
            int numAleatorio;
            boolean repetido;
            do {
                numAleatorio = numeroAleatorio();
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (arrayboleto[j] == numAleatorio) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            arrayboleto[i] = numAleatorio;
        }
    }

    public static void imprimirArray(int lista[]) {
        System.out.println("\t!!!!Esta es la combinación ganadora!!!!\n");
        for (int i = 0; i < arrayboleto.length; i++) {
            System.out.print("\t" + arrayboleto[i]);
        }
        System.out.println("   -   Reintegro: " + R); // Imprime el número R en la misma línea
    }

    public static void main(String[] args) {
        R = generarNumeroR(); // Genera el número R
        rellenarArray(arrayboleto);
        burbuja(arrayboleto);
        imprimirArray(arrayboleto);
    }
}
