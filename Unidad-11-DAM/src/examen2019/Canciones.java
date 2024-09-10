package examen2019;

public class Canciones {
	private String codGrupo;
	private String disco;
	private String nombreCancion;
	private String duracion;
	//Getters y Setetrs
	public String getCodGrupo() {
		return codGrupo;
	}
	public void setCodGrupo(String codGrupo) {
		this.codGrupo = codGrupo;
	}
	public String getDisco() {
		return disco;
	}
	public void setDisco(String disco) {
		this.disco = disco;
	}
	public String getNombreCancion() {
		return nombreCancion;
	}
	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	//Constructors
	public Canciones(String codGrupo, String disco, String nombreCancion, String duracion) {
		super();
		this.codGrupo = codGrupo;
		this.disco = disco;
		this.nombreCancion = nombreCancion;
		this.duracion = duracion;
	}
	//To String
	@Override
	public String toString() {
		return "Canciones [codGrupo=" + codGrupo + ", disco=" + disco + ", nombreCancion=" + nombreCancion
				+ ", duracion=" + duracion + "]";
	}
	

}
