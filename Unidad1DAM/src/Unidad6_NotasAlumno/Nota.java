package Unidad6_NotasAlumno;

public class Nota {
	public String modulo;
	public double nota;
	//Getters y Setters 
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	//Getters y Setters
	//Constructor
	public Nota(String modulo, int nota) {
		this.modulo = modulo;
		this.nota = nota;
	}
	public Nota() {
		this.modulo = "";
		this.nota = 0;
	}
	//Constructor
	//To String
	@Override
	public String toString() {
		return "Modulo: " + modulo + " = " + nota;
	}
	//To String
	
	public void asignarNota(String m, double n) {
		this.modulo=m;
		this.nota=n;
	}
	
	public void publicarNota() {
		System.out.println(this);
		
	}
//	public static void main(String[] args) {
//		Nota n=new Nota("Programacion", 10);
//		System.out.println(n);
//	
//	}
	
}
