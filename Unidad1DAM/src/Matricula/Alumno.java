package Matricula;

public class Alumno {
	private String clave;
	private String dni;
	private String nombre;
	private String correo;
	
	
	@Override
	public String toString() {
		return "Alumno [clave=" + clave + ", dni=" + dni + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	public Alumno(String clave, String dni, String nombre, String correo) {
		super();
		this.clave = clave;
		this.dni = dni;
		this.nombre = nombre;
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
