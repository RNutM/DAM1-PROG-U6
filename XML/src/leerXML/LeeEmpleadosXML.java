package leerXML;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeeEmpleadosXML {
	/**
	 * Clase LeeEmpleadosXML
	 * 
	 * @author Robert G
	 * @version 1.0
	 */
	public static void main(String[] args) {

		try {
			String ruta = ".\\ficheros\\miempresa.xml";
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(ruta);

			// Extraemos la etiqueta raiz
			Element raiz = doc.getDocumentElement();
			// Obtener la lista de nodos que tiene la etiqueta empleado
			// y que están dentro de la raíz

			NodeList listaEmpleados = raiz.getElementsByTagName("empleado");

			// Para cada etiqueta empleado dentro de raíz
			for (int i = 0; i < listaEmpleados.getLength(); i++) {
				// Recorremos la lista de empleados
				Node empleado = listaEmpleados.item(i);
				System.out.println("Empleado " + (i + 1));
				System.out.println("****************");

				NodeList datosEmpleado = empleado.getChildNodes();
				// Recorremos los datos de cada empleado
				for (int j = 0; j < datosEmpleado.getLength(); j++) {
					Node dato = datosEmpleado.item(j);
					if (dato.getNodeType() == Node.ELEMENT_NODE) {
						System.out.print(dato.getNodeName() + ":");
						// El valor del interior de la etiqueta esta contenido
						// en el primer hijo
						Node datoContenido = dato.getFirstChild();
						if (datoContenido != null && datoContenido.getNodeType() == Node.TEXT_NODE) {
							System.out.println(datoContenido.getNodeValue());
						}
					}
				}
				System.out.println();
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
