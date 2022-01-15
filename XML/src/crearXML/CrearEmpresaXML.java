package crearXML;

import java.io.File;

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

public class CrearEmpresaXML {
	/**
	 * Clase CrearEmpresaXML
	 * 
	 * @author Robert G
	 * @version 1.0
	 */
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

			// Empleado 1
			empleado = doc.createElement("empleado");
			root.appendChild(empleado);
			// Atributo a empleado
			attr = doc.createAttribute("id");
			attr.setValue("1");
			empleado.setAttributeNode(attr);
			// empleado.setAttribute("id","1");

			// nombre
			nombre = doc.createElement("nombre");
			nombre.appendChild(doc.createTextNode("Robert"));
			empleado.appendChild(nombre);

			// apellidos
			apellidos = doc.createElement("apellidos");
			apellidos.appendChild(doc.createTextNode("Gutiérrez"));
			empleado.appendChild(apellidos);

			// departamento
			departamento = doc.createElement("seccion");
			departamento.appendChild(doc.createTextNode("desarrollo"));
			empleado.appendChild(departamento);

			// salario
			salario = doc.createElement("salario");
			salario.appendChild(doc.createTextNode("3900"));
			empleado.appendChild(salario);

			// Empleado 2
			empleado = doc.createElement("empleado");
			root.appendChild(empleado);
			// Atributo a empleado
			attr = doc.createAttribute("id");
			attr.setValue("2");
			empleado.setAttributeNode(attr);
			// empleado.setAttribute("id","2");

			// nombre
			nombre = doc.createElement("nombre");
			nombre.appendChild(doc.createTextNode("Susana"));
			empleado.appendChild(nombre);

			// apellidos
			apellidos = doc.createElement("apellidos");
			apellidos.appendChild(doc.createTextNode("Fernández"));
			empleado.appendChild(apellidos);

			// departamento
			departamento = doc.createElement("seccion");
			departamento.appendChild(doc.createTextNode("informática"));
			empleado.appendChild(departamento);

			// salario
			salario = doc.createElement("salario");
			salario.appendChild(doc.createTextNode("2500"));
			empleado.appendChild(salario);

			// Escribimos el contenido del XML en un fichero
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			String ruta = ".\\ficheros\\miempresa.xml";
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
