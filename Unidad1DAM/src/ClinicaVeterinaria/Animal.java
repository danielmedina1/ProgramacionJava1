package ClinicaVeterinaria;

import java.util.ArrayList;

public class Animal {
	private String nombre;
	private String raza;
	private String sexo;
	private int edad;
	private double peso;
	private ArrayList <Vacuna> libroVacunacion;
	
	public Animal(String nombre, String raza, String sexo, int edad, double peso, ArrayList<Vacuna> libroVacunacion) {
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.libroVacunacion = libroVacunacion;
	}

	public Animal(String nombre, String raza, String sexo, int edad, double peso) {
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.libroVacunacion = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public ArrayList<Vacuna> getLibroVacunacion() {
		return libroVacunacion;
	}

	public void setLibroVacunacion(ArrayList<Vacuna> libroVacunacion) {
		this.libroVacunacion = libroVacunacion;
	}

	@Override
	public String toString() {
		return "Animal: nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
				+ ", libroVacunacion=" + libroVacunacion;
	}
	
	
	
	
	
	

}
