package Actividades_Repaso_6;

public class Equilatero extends Figura {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Equilatero(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Equilatero lado=" + lado ;
	}
	public double area() {
		return (lado*(Math.pow(lado, 2)-(lado/2)))/2;
	}
	

}
