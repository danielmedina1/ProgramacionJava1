package ClinicaVeterinaria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String DNI;
	private String direccion;
	private String correo;
	private ArrayList<Animal> mascotas;
	
	public Cliente(String nombre, String dNI, String direccion, String correo, ArrayList<Animal> mascotas) {
		this.nombre = nombre;
		DNI = dNI;
		this.direccion = direccion;
		this.correo = correo;
		this.mascotas = mascotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public ArrayList<Animal> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Animal> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Cliente: nombre=" + nombre + ", DNI=" + DNI + ", direccion=" + direccion + ", correo=" + correo
				+ ", mascotas=" + mascotas;
	}
	
	

	
	
}
