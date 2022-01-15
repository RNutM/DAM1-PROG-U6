package crearXML;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CrearXMLScanner {
	/**
	 * Clase CrearXMLScanner
	 * 
	 * @author Robert G
	 * @version 1.0
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		try {

			// Crea el árbol que contendrá el XML
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			// Se crea el archivo que contendrá el árbol
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// Creo la raíz del XML
			Document doc = docBuilder.newDocument();
			Element root = doc.createElement("empresa");
			doc.appendChild(root);

			// Declarar las variables que vamos a usar
			Element empleado = null;
			Attr attr = null;
			Element nombre = null, apellidos = null, departamento = null, salario = null;

			System.out.println("Introduce el número de empleados:");
			int numero = sc.nextInt();
			for (int i = 1; i <= numero; i++) {

				// System.out.println("Id del empleado");
				String id = Integer.toString(i);

				// Empleado i
				empleado = doc.createElement("empleado");
				root.appendChild(empleado);
				// Atributo a empleado
				attr = doc.createAttribute("id");
				attr.setValue(id);
				empleado.setAttributeNode(attr);
				// empleado.setAttribute("id","1");

				System.out.println("\nNombre del empleado:");
				String n = sc.next();

				// nombre i
				nombre = doc.createElement("nombre");
				nombre.appendChild(doc.createTextNode(n));
				empleado.appendChild(nombre);

				System.out.println("Apellidos del empleado:");
				String ap = sc.next();

				// apellidos
				apellidos = doc.createElement("apellidos");
				apellidos.appendChild(doc.createTextNode(ap));
				empleado.appendChild(apellidos);

				System.out.println("Departamento del empleado:");
				String d = sc.next();

				// departamento i
				departamento = doc.createElement("seccion");
				departamento.appendChild(doc.createTextNode(d));
				empleado.appendChild(departamento);

				System.out.println("Salario del empleado:");
				String s = sc.next();

				// salario i
				salario = doc.createElement("salario");
				salario.appendChild(doc.createTextNode(s));
				empleado.appendChild(salario);

			} // Fin del for

			// Escribimos el contenido del XML en un fichero
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			String ruta = ".\\ficheros\\miempresa2.xml";
			StreamResult resultado = new StreamResult(new File(ruta));
			transformer.transform(source, resultado);
			System.out.println("Archivo creado!!" + " - Entra en la carpeta -> " + ruta + " y abre el archivo.");

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}
}
