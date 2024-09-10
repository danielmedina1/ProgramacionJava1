package examen;

public class Persona {
	public String dni;
	public String nombre;
	public String apellidos;
	public String direccion;
	public String correo;
	
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	public Persona(String dni, String nombre, String apellidos, String direccion, String correo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correo = correo;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", correo=" + correo + "]";
	}
	
	
	
	
	

}
