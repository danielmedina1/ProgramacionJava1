package ClinicaVeterinaria;

import java.util.ArrayList;

public class Perro extends Animal {
	private String chip;
	private boolean seguroobligatorio;
	public Perro(String nombre, String raza, String sexo, int edad, double peso, ArrayList<Vacuna> libroVacunacion,
			String chip, boolean seguroobligatorio) {
		super(nombre, raza, sexo, edad, peso, libroVacunacion);
		this.chip = chip;
		this.seguroobligatorio = seguroobligatorio;
	}
	public Perro(String nombre, String raza, String sexo, int edad, double peso, String chip,
			boolean seguroobligatorio) {
		super(nombre, raza, sexo, edad, peso);
		this.chip = chip;
		this.seguroobligatorio = seguroobligatorio;
	}

	public String getChip() {
		return chip;
	}
	public void setChip(String chip) {
		this.chip = chip;
	}
	public boolean isSeguroobligatorio() {
		return seguroobligatorio;
	}
	public void setSeguroobligatorio(boolean seguroobligatorio) {
		this.seguroobligatorio = seguroobligatorio;
	}
	@Override
	public String toString() {
		return "Perro: chip=" + chip + ", seguroobligatorio=" + seguroobligatorio + ", getNombre()=" + getNombre()
				+ ", getRaza()=" + getRaza() + ", getLibroVacunacion()=" + getLibroVacunacion();
	}
	
	
	
	
	

}
