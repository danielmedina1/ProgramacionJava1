package examen2019;

public abstract class Persona {
	private String dni;
	private String nombre;
	private String direccion;
	private String usuario;
	private String clave;
	
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Persona(String dni, String nombre, String direccion, String usuario, String clave) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.usuario = usuario;
		this.clave = clave;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", usuario=" + usuario
				+ ", clave=" + clave + "]";
	}
	
	

}
