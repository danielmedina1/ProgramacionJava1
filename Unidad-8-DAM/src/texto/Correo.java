package texto;

public class Correo {
	private String Nombre;
	private String apellido1;
	private String curso;
	private String correo;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Correo(String nombre, String apellido1, String curso, String correo) {
		Nombre = nombre;
		this.apellido1 = apellido1;
		this.curso = curso;
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Correo [Nombre=" + Nombre + ", apellido1=" + apellido1 + ", curso=" + curso + ", correo=" + correo
				+ "]";
	}
	
	

}
