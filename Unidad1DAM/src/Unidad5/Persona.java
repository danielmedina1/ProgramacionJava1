package Unidad5;

public class Persona {
	private String nombre;
	private String apellidos;
	private String DNI;
	private int edad;
	
	public Persona (String nombre, String apellidos, String DNI, int edad){
		this.DNI=DNI;
		this.apellidos=apellidos;
		this.nombre=nombre;
		this.edad=edad;
		
	}

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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", edad=" + edad + "]";
	}
	

}
