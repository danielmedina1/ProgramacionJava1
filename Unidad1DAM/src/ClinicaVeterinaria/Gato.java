package ClinicaVeterinaria;

import java.util.ArrayList;

public class Gato extends Animal {
	private boolean obesidad;

	public Gato(String nombre, String raza, String sexo, int edad, double peso, ArrayList<Vacuna> libroVacunacion,
			boolean obesidad) {
		super(nombre, raza, sexo, edad, peso, libroVacunacion);
		this.obesidad = obesidad;
	}

	public Gato(String nombre, String raza, String sexo, int edad, double peso, boolean obesidad) {
		super(nombre, raza, sexo, edad, peso);
		this.obesidad = obesidad;
	}
	

}
