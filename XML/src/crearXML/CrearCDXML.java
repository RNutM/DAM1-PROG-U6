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

//import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CrearCDXML {
	/**
	 * Clase CrearCDXML
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
			Element root = doc.createElement("CD_OFERTA");
			doc.appendChild(root);

			// Declarar las variables que vamos a usar
			Element cd = null;
			// Attr attr = null;
			Element album = null, banda = null, pais = null, discografica = null, precio = null, anyo = null;

			// CD 1
			cd = doc.createElement("CD");
			root.appendChild(cd);

			// album
			album = doc.createElement("album");
			album.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(album);

			// banda
			banda = doc.createElement("banda");
			banda.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(banda);

			// pais
			pais = doc.createElement("pais");
			pais.appendChild(doc.createTextNode("UK"));
			cd.appendChild(pais);

			// discografica
			discografica = doc.createElement("discografica");
			discografica.appendChild(doc.createTextNode("EMI"));
			cd.appendChild(discografica);

			// precio
			precio = doc.createElement("precio");
			precio.appendChild(doc.createTextNode("11.95"));
			cd.appendChild(precio);

			// anyo
			anyo = doc.createElement("anyo");
			anyo.appendChild(doc.createTextNode("1980"));
			cd.appendChild(anyo);

			// CD 2
			cd = doc.createElement("CD");
			root.appendChild(cd);

			// album
			album = doc.createElement("album");
			album.appendChild(doc.createTextNode("Killers"));
			cd.appendChild(album);

			// banda
			banda = doc.createElement("banda");
			banda.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(banda);

			// pais
			pais = doc.createElement("pais");
			pais.appendChild(doc.createTextNode("UK"));
			cd.appendChild(pais);

			// discografica
			discografica = doc.createElement("discografica");
			discografica.appendChild(doc.createTextNode("EMI"));
			cd.appendChild(discografica);

			// precio
			precio = doc.createElement("precio");
			precio.appendChild(doc.createTextNode("11.95"));
			cd.appendChild(precio);

			// anyo
			anyo = doc.createElement("anyo");
			anyo.appendChild(doc.createTextNode("1981"));
			cd.appendChild(anyo);

			// CD 3
			cd = doc.createElement("CD");
			root.appendChild(cd);

			// album
			album = doc.createElement("album");
			album.appendChild(doc.createTextNode("The number of the beast"));
			cd.appendChild(album);

			// banda
			banda = doc.createElement("banda");
			banda.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(banda);

			// pais
			pais = doc.createElement("pais");
			pais.appendChild(doc.createTextNode("UK"));
			cd.appendChild(pais);

			// discografica
			discografica = doc.createElement("discografica");
			discografica.appendChild(doc.createTextNode("EMI"));
			cd.appendChild(discografica);

			// precio
			precio = doc.createElement("precio");
			precio.appendChild(doc.createTextNode("11.95"));
			cd.appendChild(precio);

			// anyo
			anyo = doc.createElement("anyo");
			anyo.appendChild(doc.createTextNode("1982"));
			cd.appendChild(anyo);

			// CD 4
			cd = doc.createElement("CD");
			root.appendChild(cd);

			// album
			album = doc.createElement("album");
			album.appendChild(doc.createTextNode("Piece of mind"));
			cd.appendChild(album);

			// banda
			banda = doc.createElement("banda");
			banda.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(banda);

			// pais
			pais = doc.createElement("pais");
			pais.appendChild(doc.createTextNode("UK"));
			cd.appendChild(pais);

			// discografica
			discografica = doc.createElement("discografica");
			discografica.appendChild(doc.createTextNode("EMI"));
			cd.appendChild(discografica);

			// precio
			precio = doc.createElement("precio");
			precio.appendChild(doc.createTextNode("11.95"));
			cd.appendChild(precio);

			// anyo
			anyo = doc.createElement("anyo");
			anyo.appendChild(doc.createTextNode("1983"));
			cd.appendChild(anyo);

			// CD 5
			cd = doc.createElement("CD");
			root.appendChild(cd);

			// album
			album = doc.createElement("album");
			album.appendChild(doc.createTextNode("Powerslave"));
			cd.appendChild(album);

			// banda
			banda = doc.createElement("banda");
			banda.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(banda);

			// pais
			pais = doc.createElement("pais");
			pais.appendChild(doc.createTextNode("UK"));
			cd.appendChild(pais);

			// discografica
			discografica = doc.createElement("discografica");
			discografica.appendChild(doc.createTextNode("EMI"));
			cd.appendChild(discografica);

			// precio
			precio = doc.createElement("precio");
			precio.appendChild(doc.createTextNode("11.95"));
			cd.appendChild(precio);

			// anyo
			anyo = doc.createElement("anyo");
			anyo.appendChild(doc.createTextNode("1984"));
			cd.appendChild(anyo);

			// CD 6
			cd = doc.createElement("CD");
			root.appendChild(cd);

			// album
			album = doc.createElement("album");
			album.appendChild(doc.createTextNode("Live after death"));
			cd.appendChild(album);

			// banda
			banda = doc.createElement("banda");
			banda.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(banda);

			// pais
			pais = doc.createElement("pais");
			pais.appendChild(doc.createTextNode("UK"));
			cd.appendChild(pais);

			// discografica
			discografica = doc.createElement("discografica");
			discografica.appendChild(doc.createTextNode("EMI"));
			cd.appendChild(discografica);

			// precio
			precio = doc.createElement("precio");
			precio.appendChild(doc.createTextNode("11.95"));
			cd.appendChild(precio);

			// anyo
			anyo = doc.createElement("anyo");
			anyo.appendChild(doc.createTextNode("1985"));
			cd.appendChild(anyo);

			// CD 7
			cd = doc.createElement("CD");
			root.appendChild(cd);

			// album
			album = doc.createElement("album");
			album.appendChild(doc.createTextNode("Somewhere in time"));
			cd.appendChild(album);

			// banda
			banda = doc.createElement("banda");
			banda.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(banda);

			// pais
			pais = doc.createElement("pais");
			pais.appendChild(doc.createTextNode("UK"));
			cd.appendChild(pais);

			// discografica
			discografica = doc.createElement("discografica");
			discografica.appendChild(doc.createTextNode("EMI"));
			cd.appendChild(discografica);

			// precio
			precio = doc.createElement("precio");
			precio.appendChild(doc.createTextNode("11.95"));
			cd.appendChild(precio);

			// anyo
			anyo = doc.createElement("anyo");
			anyo.appendChild(doc.createTextNode("1986"));
			cd.appendChild(anyo);

			// CD 8
			cd = doc.createElement("CD");
			root.appendChild(cd);

			// album
			album = doc.createElement("album");
			album.appendChild(doc.createTextNode("Seventh son of a seventh son"));
			cd.appendChild(album);

			// banda
			banda = doc.createElement("banda");
			banda.appendChild(doc.createTextNode("Iron Maiden"));
			cd.appendChild(banda);

			// pais
			pais = doc.createElement("pais");
			pais.appendChild(doc.createTextNode("UK"));
			cd.appendChild(pais);

			// discografica
			discografica = doc.createElement("discografica");
			discografica.appendChild(doc.createTextNode("EMI"));
			cd.appendChild(discografica);

			// precio
			precio = doc.createElement("precio");
			precio.appendChild(doc.createTextNode("11.95"));
			cd.appendChild(precio);

			// anyo
			anyo = doc.createElement("anyo");
			anyo.appendChild(doc.createTextNode("1988"));
			cd.appendChild(anyo);

			// Escribimos el contenido del XML en un fichero
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			String ruta = ".\\ficheros\\cd.xml";
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
