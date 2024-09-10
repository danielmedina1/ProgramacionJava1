package examen_1ordinaria;

public class Cliente extends Persona {
	public String metodoPago;

	public Cliente(String dni, String nombre, String apellidos, String direccion, String metodoPago) {
		super(dni, nombre, apellidos, direccion);
		this.metodoPago = metodoPago;
	}

	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + "]";
	}
	
	

}
