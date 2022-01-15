package clinicaVeterinaria;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
	/**
	 * Clínica Veterinaria - Clase Main
	 * 
	 * @author Robert G
	 */
	private static Scanner sc = new Scanner(System.in);

	public static void writeFiles() throws IOException {
		String file = ".\\ficheros\\clientes.vet";
		FileOutputStream fileA = new FileOutputStream(file, false);
		ObjectOutputStream output = new ObjectOutputStream(fileA);
		if (output != null) {
			for (Cliente i : Cliente.clientesclinica) {
				output.writeObject(i);
			}
		}
		fileA.flush();// Fuerza la escritura de los datos
		fileA.close();
	}

	public static void main(String[] args) throws IOException {

		/*
		 * vacunas v1=new vacunas("rabia","01-01-2019","Laboratorio 1", 195.50); vacunas
		 * v2=new vacunas("moquillo","02-02-2019","Laboratorio 2", 189.55); vacunas v3=new
		 * vacunas("mixomatosis","03-03-2019","Laboratorio 3",168.35);
		 * 
		 * perro p=new perro(10,8.2,"Boxer",'M',"Ruddy",true,true); gato g=new
		 * gato(4,3.2,"Siames",'H',"Dana", false); conejo c=new
		 * conejo(2,2.5,"Comun",'M',"Pixi",10.32);
		 * 
		 * cliente cl=new cliente("Roberto Gutiérrez","04185272P","Avda, Fco. Aguirre",
		 * "roberto@gmail.com");
		 * 
		 * p.nuevasvacunas(v1); g.nuevasvacunas(v2); c.nuevasvacunas(v3);
		 * 
		 * cl.getMascotas().add(p); cl.getMascotas().add(g); cl.getMascotas().add(c);
		 * 
		 * clientesclinica.add(cl);
		 */

		// Comenzamos con el menu y submenus
		int opciones = 0;
		do {
			writeFiles();// Tenemos que añadir IOException dentro de este método
			System.out.println("\n///////////////////////////////////");
			System.out.println("Menu principal Clinica Veterinaria");
			System.out.println("Elija una de las siguientes opciones");
			System.out.println("*************************************");
			System.out.println("1. Dar alta cliente.");
			System.out.println("2. Atender cliente.");
			System.out.println("3. Modificar datos cliente.");
			System.out.println("4. Salir.");

			opciones = sc.nextInt();

			switch (opciones) {

			case 1:// Dar alta cliente
				Cliente.daraltacliente();// Llamo al método daraltacliente de la clase cliente
				/*
				 * 1.1. Pedir datos. 1.2. Dar de alta cliente.
				 */
				break;
			case 2:// Atender cliente
				Cliente.buscarCliente();// Llamo al método buscarCliente de la clase cliente
				/*
				 * 2.1. Pedir DNI cliente. 2.2. Ver mascotas del cliente. 2.3. Mostrar datos del
				 * libro de vacunación de la mascota, y los propios de ella.
				 */
				break;
			case 3:// Modificar datos cliente
				Animal.daraltaMascota();
				/*
				 * 3.1. Dar alta nueva mascota."); 3.2. Dar baja mascota.
				 */
				break;
			case 4:// Salir
				/* 4.1. Guardar datos en clientes.vet" */
				break;
			default:
				System.out.println("Pulsa un número del 1 al 4");
				break;
			}
		} while (opciones != 4);// Mientras no pulse 4 no salgo del bucle do while
		System.out.println("Has salido del programa, hasta pronto.");
	}
}
