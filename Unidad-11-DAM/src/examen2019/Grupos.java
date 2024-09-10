package examen2019;

public class Grupos {
	private String codigo;
	private String nombre;
	private String añoCreacion;
	private String tipoMusica;
	//Getters y Setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAñoCreacion() {
		return añoCreacion;
	}
	public void setAñoCreacion(String añoCreacion) {
		this.añoCreacion = añoCreacion;
	}
	public String getTipoMusica() {
		return tipoMusica;
	}
	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}
	//Constructor
	public Grupos(String codigo, String nombre, String añoCreacion, String tipoMusica) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.añoCreacion = añoCreacion;
		this.tipoMusica = tipoMusica;
	}
	public Grupos() {
		this.codigo = "";
		this.nombre = "";
		this.añoCreacion = "";
		this.tipoMusica = "";
	}
	//To String
	@Override
	public String toString() {
		return "Grupos [codigo=" + codigo + ", nombre=" + nombre + ", añoCreacion=" + añoCreacion + ", tipoMusica="
				+ tipoMusica + "]";
	}
	

}
