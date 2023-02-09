package Unidad6_Coche;

public class Cliente {
	private NIF dni;
	private String nombre;
	private String apellido;
	private String definicion;
	private double saldo;
	public Vehiculo Vehiculo[];
	
	public Cliente(NIF nif, String string, String string2, String string3, int i, Unidad6_Coche.Vehiculo[] v) {
	}
	
	public NIF getDni() {
		return dni;
	}



	public void setDni(NIF dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getDefinicion() {
		return definicion;
	}



	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public Vehiculo[] getVehiculo() {
		return Vehiculo;
	}



	public void setVehiculo(Vehiculo[] vehiculo) {
		Vehiculo = vehiculo;
	}



	public Cliente(NIF dni, String nombre, String apellido, String definicion, double saldo, Vehiculo[] vehiculo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.definicion = definicion;
		this.saldo = saldo;
		Vehiculo = vehiculo;
	}

	public Cliente() {
	}

	
	
	

}
