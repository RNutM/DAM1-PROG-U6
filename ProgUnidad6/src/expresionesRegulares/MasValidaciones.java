package expresionesRegulares;

public class MasValidaciones {

	/**
	 * Funciones para reutilizar en nuestros proyectos, podemos quitar static si lo
	 * ponemos en una clase por ejemplo.
	 */

	/**
	 * Valida si una cadena tiene el formato de fecha dd/mm/aaaa
	 *
	 * @param texto String que contiene el valor a validar
	 * @return True = es una fecha válida
	 */
	public static boolean validaNumeroFecha_Exp(String texto) {
		return texto.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$");
	}

	/**
	 * Valida si una cadena tiene el formato de nombre de persona, incluyendo nombres
	 * compuestos
	 *
	 * @param texto String que contiene el valor a validar
	 * @return True = es un nombre válido
	 */
	public static boolean validaNombre_Exp(String texto) {
		return texto.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
	}

	/**
	 * Valida si una cadena es un email
	 *
	 * @param email String que contiene el valor a validar
	 * @return True = es un email válido
	 */
	public static boolean validar_Mail_Exp(String email) {
		return email.matches("^([\\w-]+\\.)*?[\\w-]+@[\\w-]+\\.([\\w-]+\\.)*?[\\w]+$");
	}

	/**
	 * Valida si una cadena es un numero real (positivo o negativo) con un numero de
	 * decimales
	 *
	 * @param texto         String que contiene el valor a validar
	 * @param num_decimales numero de decimales maximo, no puede ser menor que cero
	 * @return True = es un numero real
	 */
	public static boolean validaNumeroRealNegativo_Exp(String texto, int num_decimales) {
		if (num_decimales > 0) {
			return texto.matches("^-[0-9]+([\\.,][0-9]{1," + num_decimales + "})?$");
			// Si quiero que valide positivo quito el - despues del ^ y
			// cambio el nombre al método por validaNumeroRealPositivo_Exp
		} else {
			return false;
		}
	}

	/**
	 * Valida si una cadena es un numero real (positivo o negativo) con un numero de
	 * decimales
	 * 
	 * @param texto         String que contiene el valor a validar
	 * @param num_decimales numero de decimales maximo, no puede ser menor que cero
	 * @return True = es un numero real
	 */
	public static boolean validaNumeroReal_Exp(String texto, int num_decimales) {
		if (num_decimales > 0) {
			return texto.matches("^-?[0-9]+([\\.,][0-9]{1," + num_decimales + "})?$");
		} else {
			return false;
		}
	}

	/**
	 * Valida si una cadena es una IP válida
	 * 
	 * @param ip String que contiene el valor a validar
	 * @return True = es una IP válida
	 */
	public static boolean validaIP_Exp(String ip) {

		return ip.matches(
				"^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
	}
}
