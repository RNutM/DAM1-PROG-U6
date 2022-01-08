package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {
	/**
	 * Practicando con Expresiones regulares
	 * 
	 * @author Robert G
	 */
	static Scanner sc = new Scanner(System.in);

	public void validaentero() {// Opción 1 del menú
		sc = new Scanner(System.in);
		String entero;
		System.out.print("Introduce número entero: ");
		entero = sc.next();
		Pattern pat = Pattern.compile("-?[0-9]*"); // * Indica 0 ó más veces. Equivale a {0,}
		Matcher mat = pat.matcher(entero);
		if (mat.matches()) {
			System.out.println("\n********************\nNúmero entero Válido\n********************");
		} else {
			System.out.println("\n***********************\nNúmero entero No Válido\n***********************");
		}
	}

	public void validaenteropositivo() {// Opción 2 del menú
		sc = new Scanner(System.in);
		String enteropos;
		System.out.print("Introduce número entero positivo: ");
		enteropos = sc.next();
		Pattern pat = Pattern.compile("[0-9]*"); // * Indica 0 ó más veces. Equivale a {0,}
		Matcher mat = pat.matcher(enteropos);
		if (mat.matches()) {
			System.out.println(
					"\n****************************\nNúmero entero positivo Válido\n****************************");
		} else {
			System.out.println(
					"\n****************************\nNúmero entero positivo No Válido\n****************************\n");
		}
	}

	public void validadni() {// Opción 3 del menú
		sc = new Scanner(System.in);
		String dni;
		System.out.print("Introduce dni: \n Con 8 números y letra en mayuscula por favor");
		dni = sc.next();
		Pattern pat = Pattern.compile("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
		Matcher mat = pat.matcher(dni);
		if (mat.matches()) {
			System.out.println("DNI Válido");
		} else {
			System.out.println("DNI No Válido");
		}
	}

	public void validabinario() {// Opción 4 del menú
		sc = new Scanner(System.in);
		String binario;
		System.out.print("Introduce número binario: \n Recuerda que solo puede contener 0 o 1 la cantidad que sea: ");
		binario = sc.next();
		Pattern pat = Pattern.compile("^[0-1]+$"); // + Indica 1 ó más veces. Equivale a {1,}
		Matcher mat = pat.matcher(binario);
		if (mat.matches()) {
			System.out.println("Número binario Válido");
		} else {
			System.out.println("Número binario No Válido");
		}
	}

	public void validaoctal() {// Opción 5 del menú
		sc = new Scanner(System.in);
		String octal;
		System.out.print(
				"Introduce número octal: \n Recuerda que solo puede contener 0, 1, 2, 3, 4, 5, 6, 7 la cantidad que sea: ");
		octal = sc.next();
		Pattern pat = Pattern.compile("^[0-7]+$");
		Matcher mat = pat.matcher(octal);
		if (mat.matches()) {
			System.out.println("Número octal Válido");
		} else {
			System.out.println("Número octal No Válido");
		}
	}

	public void validaemail() {// Opción 6 del menú
		sc = new Scanner(System.in);
		String email;
		System.out.print("Introduce email: ");
		email = sc.nextLine();
		Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mat = pat.matcher(email);
		if (mat.find()) {
			System.out.println("Correo Válido");
		} else {
			System.out.println("Correo No Válido");
		}
	}

	public void validaisbn() {// Opción 7 del menú
		sc = new Scanner(System.in);
		String isbn;
		System.out.print(
				"Introduce ISBN de 13 dígitos, siempre empieza en 978 o 979 \n(978-3-16-148410-0) sin guiones: ");
		isbn = sc.nextLine();
		Pattern pat = Pattern.compile("^(978|979)[0-9]{10}$");
		Matcher mat = pat.matcher(isbn);
		if (mat.matches()) {
			System.out.println("ISBN Válido");
		} else {
			System.out.println("ISBN No Válido");
		}
	}

	public void validatwiter() {// Opción 8 del menú
		sc = new Scanner(System.in);
		String twiter;
		System.out.print("Introduce twiter: \nEmpieza por @ y puede contener letras mayúsculas y minúsculas,"
				+ "\n números, guiones y guiones bajos:\n ");
		twiter = sc.nextLine();
		Pattern pat = Pattern.compile("^@[\\w-]{0,}$");
		Matcher mat = pat.matcher(twiter);
		if (mat.find()) {
			System.out.println("twiter Válido");
		} else {
			System.out.println("twiter No Válido");
		}
	}

	public void validahexa() {// Opción 9 del menú
		sc = new Scanner(System.in);
		String hexa;
		System.out.print(
				"Introduce número hexadecimal: \n Recuerda que solo puede contener 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F la cantidad que sea: ");
		hexa = sc.nextLine();
		Pattern pat = Pattern.compile("^[0-9A-F]+$");
		Matcher mat = pat.matcher(hexa);
		if (mat.find()) {
			System.out.println("Número hexadecimal Válido");
		} else {
			System.out.println("Número hexadecimal No Válido");
		}
	}

	public static void main(String[] args) {

		Validar v = new Validar();

		boolean salir = true;
		sc = new Scanner(System.in);
		String opcion = "";
		do {
			System.out.println(
					"\nVarias validaciones con expresiones regulares:\n**********************************************");
			System.out.println("1. Validar número entero");
			System.out.println("2. Validar número entero positivo");
			System.out.println("3. Validar dni");
			System.out.println("4. Validar número binario");
			System.out.println("5. Validar número octal");
			System.out.println("6. Validar email");
			System.out.println("7. Validar ISBN");
			System.out.println("8. Validar Twiter");
			System.out.println("9. Validar número hexadecimal");
			System.out.println("10. Salir del programa");
			opcion = sc.next();

			switch (opcion) {

			case "1":
				v.validaentero();
				break;
			case "2":
				v.validaenteropositivo();
				break;
			case "3":
				v.validadni();
				break;
			case "4":
				v.validabinario();
				break;
			case "5":
				v.validaoctal();
				break;
			case "6":
				v.validaemail();
				break;
			case "7":
				v.validaisbn();
				break;
			case "8":
				v.validatwiter();
				break;
			case "9":
				v.validahexa();
				break;
			case "10":
				salir = false;
				System.out.println("Has salido del programa, hasta pronto.");
				break;
			default:
				System.out.println("\n*****************\nOpción incorrecta\n*****************");
				break;
			}
		} while (salir);
	}
}
