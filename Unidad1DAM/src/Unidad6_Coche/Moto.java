package Unidad6_Coche;

public class Moto extends Vehiculo {
	public double cilindrada;
	
	public Moto() {
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public Moto(String matricula, String marca, String carburante, String[] enumCarburante, double cilindrada) {
		super(matricula, marca, carburante, enumCarburante);
		this.cilindrada = cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}




	public String getTipo() {
		return "moto";
	}

}
