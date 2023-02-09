package Unidad6_NotasAlumno;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	private Nota notas[];
	
	//Constructors
	public Alumno() {
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.notas = new Nota[7];
		for (int i = 0; i < notas.length; i++) {
			this.notas[i]=new Nota();
		}
	}
	
	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notas = new Nota[7];
		for (int i = 0; i < notas.length; i++) {
			this.notas[i]=new Nota();
		}
	}
	//Constructors
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
	//Getters y Setters

	@Override
	public String toString() {
		return "Alumno/a" + nombre + apellidos + ", edad=" + edad + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	
	public void imprimirNotas() {
		System.out.println("El alumno/a "+this.getNombre()+" "+this.getApellidos()+", tiene las siguientes notas: ");
		for (int i = 0; i < this.getNotas().length; i++) {
			System.out.println(this.getNotas()[i]);
		}
	}
	
	public static void main(String[] args) {
		double media=0;
		Alumno a=new Alumno("Pedro", "Lopez", 18);
		Scanner teclado=new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			System.out.println("Dame el nombre del modulo");
			String modulo=teclado.next();
			System.out.println("Dame la  nota");
			double nota=teclado.nextDouble();
			media=media+nota;
			a.getNotas()[i].asignarNota(modulo, nota);
		}
		media=media/7;
		a.imprimirNotas();
		System.out.println("Nota media: "+media);
		
	}
	

}
