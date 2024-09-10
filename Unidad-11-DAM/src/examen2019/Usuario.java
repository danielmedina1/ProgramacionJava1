package examen2019;

public class Usuario extends Persona{
	private String tipoMusica;

	public String getTipoMusica() {
		return tipoMusica;
	}

	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	public Usuario(String dni, String nombre, String direccion, String usuario, String clave, String tipoMusica) {
		super(dni, nombre, direccion, usuario, clave);
		this.tipoMusica = tipoMusica;
	}
	
	
	
	
}
