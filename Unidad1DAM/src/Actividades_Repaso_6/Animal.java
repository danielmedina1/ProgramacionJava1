package Actividades_Repaso_6;

public class Animal {
	private double peso;
	private int edad;
	private String alimentacion;
	private String nombre;
	//Constructors 
	public Animal(double peso, int edad, String alimentacion, String nombre) {
		this.peso = peso;
		this.edad = edad;
		this.alimentacion = alimentacion;
		this.nombre = nombre;
	}
	public Animal() {
		this.peso = 0;
		this.edad = 0;
		this.alimentacion = "";
		this.nombre = "";
	}
	 //Getters y Setters
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//To String
	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", edad=" + edad + ", alimentacion=" + alimentacion + ", nombre=" + nombre
				+ "]";
	}
	
	public static void main(String[] args){
		
	}
	
}
