package recorridos;

import java.util.ArrayList;

import usuarios.Persona;

public class InformePersona implements Informe {
	/**
	 * Paquete recorridos: Clase InformePersona
	 * 
	 * @author Robert G
	 */
	public ArrayList<Persona> personas = new ArrayList<Persona>();

	public InformePersona(ArrayList<Persona> personas) {
		super();
		this.personas = personas;
	}

	public InformePersona() {
		super();
		this.personas = null;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	@Override
	public void mostrarInforme() {
		for(Persona persona : personas) {
			System.out.println(persona.mostrarPersona());
			System.out.println();
		}
	}
}
