package leerHTML;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase LeerURL
 * 
 * @author Robert G
 * @version 1.0
 */
public class LeerURL {

	static String pagina, cadena;
	static ArrayList<String> lineas;
	static URL url;
	static int cont_href, cont_img, cont_div, cont_header, cont_footer, cont_article, cont_section;

	// Método Main
	public static void main(String[] args) {
		testURL(); // Compruebo si la url esta bien hecha y si existe o no
		wellformed(cadena); // Compruebo si la página web tiene una estructura correcta
		analyzeURL(lineas); // Compruebo la cantidad de las diversas etiquetas
		writeFile(); // Escribo en un fichero los datos comprobados
	}

	// Método donde podemos elegir la web a testear
	private static void testURL() {

		lineas = new ArrayList<String>();
		url = null;
		String web;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la web a analizar a partir de https//www.");
		web = sc.nextLine();
		try {
			url = new URL("https://www." + web);
		} catch (MalformedURLException e) {
			System.out.println("Url malformada--> " + e.getClass().getName());
		}
		sc.close();

		BufferedReader in;
		try {
			InputStream inputStream = url.openStream();
			in = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;
			inputLine = in.readLine();
			while (inputLine != null) {

				cadena += inputLine;// Almaceno cada linea concatenada
				lineas.add(inputLine);// Añado al ArrayList

				System.out.println(inputLine);
				inputLine = in.readLine();
			}
			in.close();
		} catch (IOException e) {
			System.out.println("Url no encontrada!! --> " + e.getClass().getName());
		}
	}

	// Método validar estructura del archivo
	private static boolean wellformed(String cadena) {
		boolean correcto = false;
		// Compruebo con expresiones
		Pattern pat = Pattern.compile(".*<html.*>.*<head>.*<title>.*</title>.*</head>.*<body.*>.*</body>.*</html>.*");
		try {
			// En las etiquetas html y body pongo .*> porque pueden contener atributos
			Matcher mat = pat.matcher(cadena);
			if (mat.matches()) {
				correcto = true;
			}
		} catch (NullPointerException e) {
			System.out.println("Url Malformada!! Fichero no generado!! --> " + e.getClass().getName());
		}
		return correcto;
	}

	// Método para analizar la url y contar las diversas etiquetas
	private static void analyzeURL(ArrayList<String> lineas) {

		for (int i = 0; i < lineas.size(); i++) {
			// Cuento etiquetas en los siguientes if aumentando con los contadores
			if (lineas.get(i).contains("<a href"))
				cont_href++;
			if (lineas.get(i).contains("<img"))
				cont_img++;
			if (lineas.get(i).contains("</div>"))
				cont_div++;
			if (lineas.get(i).contains("</header>"))
				cont_header++;
			if (lineas.get(i).contains("</section>"))
				cont_section++;
		} // Fin bucle for
	}

	// Método escribir archivo
	private static void writeFile() {

		FileWriter fw = null;
		try {
			fw = new FileWriter("./ficheros/pagecheckfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} // Genero un fichero de comprobación de pagina
			// con datos
		PrintWriter salida = new PrintWriter(fw);

		if (wellformed(cadena)) {// Si wellformed me da true al boolean correcto de la cadena que compruebo...
			salida.println("***********************************************");
			salida.println("La estructura del archivo es correcta");// Muestro estructura correcto
			salida.println("La web analizada fue " + url);
		} else {// en caso contrario no es correcta
			salida.println("***********************************************");
			salida.println("La estructura del archivo no es correcta");
			salida.println("La web analizada fue " + url);
		}
		// Dibujo el formato de salida que en este caso ira a un fichero txt
		salida.println("***********************************************");
		salida.println("He contado " + cont_href + " veces esta etiqueta --> (a href).");
		salida.println("\nHe contado " + cont_img + " veces esta etiqueta --> (img).");
		salida.println("\nHe contado " + cont_header + " veces esta etiqueta --> (header).");
		salida.println("\nHe contado " + cont_footer + " veces esta etiqueta --> (footer).");
		salida.println("\nHe contado " + cont_article + " veces esta etiqueta --> (article).");
		salida.println("\nHe contado " + cont_section + " veces esta etiqueta --> (section).");
		salida.println("\nHe contado " + cont_div + " veces esta etiqueta --> (div).");
		salida.println("***********************************************");
		salida.flush();
		salida.close();
	}
}// Fin de clase
