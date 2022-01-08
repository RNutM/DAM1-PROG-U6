package ejerciciosArrays4_matriculas;

import java.util.LinkedList;
import java.util.Scanner;

public class MatriculaAlumnos_02 {
	/**
	 * Practicando con Arrays Matrículas
	 * 
	 * @author Robert G
	 */
	static LinkedList<Alumno> AlumnosPreinscritos;
	static LinkedList<Alumno> AlumnosMatriculados;

	public MatriculaAlumnos_02() {
		AlumnosPreinscritos = new LinkedList<Alumno>();
		AlumnosMatriculados = new LinkedList<Alumno>();
	}

	public LinkedList<Alumno> getAlumnosPreinscritos() {
		return AlumnosPreinscritos;
	}

	public void setAlumnosPreinscritos(LinkedList<Alumno> alumnosPreinscritos) {
		AlumnosPreinscritos = alumnosPreinscritos;
	}

	public LinkedList<Alumno> getAlumnosMatriculados() {
		return AlumnosMatriculados;
	}

	public void setAlumnosMatriculados(LinkedList<Alumno> alumnosMatriculados) {
		AlumnosMatriculados = alumnosMatriculados;
	}

	static MatriculaAlumnos_02 m = new MatriculaAlumnos_02();

	public static void main(String[] args) {

		boolean salir = true;
		Scanner sc = new Scanner(System.in);
		String opcion = "";
		generarListas(m.getAlumnosPreinscritos());

		// Muestro en consola los alumnos preinscritos
		System.out.println("Listado de alumnos preinscritos:\n" + "********************************");
		for (Alumno a : AlumnosPreinscritos)
			System.out.println(a);
		do {
			System.out.println("\n1) Matricular alumno");
			System.out.println("2) Borrar alumno matriculado con dni");
			System.out.println("3) Mostrar ultimo alumno matriculado");
			System.out.println("4) Mostrar alumnos matriculados");
			System.out.println("5) Salir");
			System.out.println("Elige una opción");
			opcion = sc.next();

			switch (opcion) {

			case "1":
				if (m.getAlumnosPreinscritos().isEmpty()) {
					System.out.println("No hay alumnos preinscritos");
				} else {
					m.getAlumnosMatriculados().addLast(m.getAlumnosPreinscritos().getFirst());
					m.getAlumnosPreinscritos().removeFirst();
					System.out.println("////////////////////////////////");
					System.out.println("Alumno matriculado correctamente");
					System.out.println("////////////////////////////////");
				}
				break;
			case "2":
				borrarAlumno(m.getAlumnosMatriculados(), m.getAlumnosPreinscritos());
				System.out.println("////////////////////////////");
				System.out.println("Alumno borrado correctamente");
				System.out.println("////////////////////////////");
				break;
			case "3":
				if (!m.getAlumnosMatriculados().isEmpty())
					System.out.println("////////////////////////////");
				System.out.println("Últimos alumnos matriculados");
				System.out.println("////////////////////////////");
				System.out.println(m.getAlumnosMatriculados().getLast());
				break;
			case "4":
				System.out.println("/////////////////////////////");
				System.out.println("Lista de alumnos matriculados");
				System.out.println("/////////////////////////////");
				if (!m.getAlumnosMatriculados().isEmpty())
					for (Alumno a : m.getAlumnosMatriculados())
						System.out.println(a);
				break;
			case "5":
				salir = false;
				System.out.println("Ha salido del programa - Hasta pronto.");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (salir);
		sc.close();
	}// Fin main

	// Deberes: Cargar desde fichero....
	public static void generarListas(LinkedList<Alumno> lista) {

		Alumno a1 = new Alumno("juan123", "11111111H", "juan@gmail.com", "Juan");
		Alumno a2 = new Alumno("lucia123", "22222222G", "lucia@gmail.com", "Lucia");
		Alumno a3 = new Alumno("sara123", "33333333Z", "sara@gmail.com", "Sara");
		Alumno a4 = new Alumno("carlos123", "44444444W", "carlos@gmail.com", "Carlos");
		Alumno a5 = new Alumno("carmen123", "55555555", "carmen@gmail.com", "Carmen");
		Alumno a6 = new Alumno("antonio123", "66666666Y", "antonio@gmail.com", "Antonio");

		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		lista.add(a6);
	}

	@SuppressWarnings("resource")
	public static void borrarAlumno(LinkedList<Alumno> lista1, LinkedList<Alumno> lista2) {

		Scanner sc = new Scanner(System.in);
		String dni = "";
		System.out.println("Introduce dni del alumno a borrar");
		dni = sc.next();

		for (Alumno a : lista1) {// Bucle for each
			if (a.getDni().equalsIgnoreCase(dni)) {
				lista1.remove(a);
				if (lista2.isEmpty()) {
					lista1.addLast(lista2.getFirst());
					lista2.removeFirst();
				} // Fin segundo if
			} // Fin primer if
		} // Fin for each
	}// Fin Método borrarAlumno
}// Fin Clase
