package examen;

public class Cliente extends Persona {
	public String metodoPago;
	public String cuota;
	
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public String getCuota() {
		return cuota;
	}
	public void setCuota(String cuota) {
		this.cuota = cuota;
	}
	public Cliente(String dni, String nombre, String apellidos, String direccion, String correo, String metodoPago,
			String cuota) {
		super(dni, nombre, apellidos, direccion, correo);
		this.metodoPago = metodoPago;
		this.cuota = cuota;
	}
	
	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + ", cuota=" + cuota + "]";
	}
	
	
	
	

}
