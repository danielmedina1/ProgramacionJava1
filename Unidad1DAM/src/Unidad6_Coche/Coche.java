package Unidad6_Coche;

public class Coche extends Vehiculo {
	public String modelo;
	public String color;
	public int numeroPuertas;
	
	public Coche() {
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	
	public Coche(String matricula, String marca, String carburante, String[] enumCarburante, String modelo,
			String color, int numeroPuertas) {
		super(matricula, marca, carburante, enumCarburante);
		this.modelo = modelo;
		this.color = color;
		this.numeroPuertas = numeroPuertas;
	}

	public String getTipo() {
		return "coche";
	}
	

}
