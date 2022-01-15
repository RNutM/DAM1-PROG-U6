package leerXML;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeeAlumnosXML {
	/**
	 * Clase LeeAlumnosXML
	 * 
	 * @author Robert G
	 * @version 1.0
	 */
	public static void main(String[] args) {

		ArrayList<Alumno> listadoAlumnos = new ArrayList<Alumno>();

		String nombre = "";
		int edad = 0;
		String email = "";
		String genero = "";

		try {
			String ruta = ".\\ficheros\\alumnos.xml";
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(ruta);

			// Extraemos la etiqueta raiz
			Element raiz = doc.getDocumentElement();
			// Obtener la lista de nodos que tiene la etiqueta empleado
			// y que están dentro de la raíz

			NodeList listaAlumnos = raiz.getElementsByTagName("alumno");

			// Para cada etiqueta empleado dentro de raíz
			for (int i = 0; i < listaAlumnos.getLength(); i++) {
				// Recorremos la lista de empleados
				Node alumno = listaAlumnos.item(i);
				System.out.println("Alumno " + (i + 1));
				System.out.println("****************");

				NodeList datosAlumno = alumno.getChildNodes();
				// Recorremos los datos de cada empleado
				for (int j = 0; j < datosAlumno.getLength(); j++) {
					Node dato = datosAlumno.item(j);
					if (dato.getNodeType() == Node.ELEMENT_NODE) {
						System.out.print(dato.getNodeName() + ":");

						// El valor del interior de la etiqueta esta contenido
						// en el primer hijo
						Node datoContenido = dato.getFirstChild();
						if (datoContenido != null && datoContenido.getNodeType() == Node.TEXT_NODE) {
							System.out.println(datoContenido.getNodeValue());

							if (dato.getNodeName().equals("nombre")) {
								nombre = datoContenido.getNodeValue();
							} else if (dato.getNodeName().equals("edad")) {
								edad = Integer.parseInt(datoContenido.getNodeValue());
							} else if (dato.getNodeName().equals("email")) {
								email = datoContenido.getNodeValue();
							} else if (dato.getNodeName().equals("genero")) {
								genero = datoContenido.getNodeValue();
							}
						}
					}
				}
				listadoAlumnos.add(new Alumno(nombre, edad, email, genero));
				System.out.println();
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(listadoAlumnos);
	}
}
