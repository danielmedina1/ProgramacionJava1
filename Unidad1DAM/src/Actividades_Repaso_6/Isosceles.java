package Actividades_Repaso_6;

public class Isosceles extends Figura {
	private double ladoIgual;
	private double ladoDesIgual;
	
	@Override
	public String toString() {
		return "Isosceles [ladoIgual=" + ladoIgual + ", ladoDesIgual=" + ladoDesIgual + "]";
	}

	public Isosceles(String color, double ladoIgual, double ladoDesIgual) {
		super(color);
		this.ladoIgual = ladoIgual;
		this.ladoDesIgual = ladoDesIgual;
	}

	public double getLadoIgual() {
		return ladoIgual;
	}

	public void setLadoIgual(double ladoIgual) {
		this.ladoIgual = ladoIgual;
	}

	public double getLadoDesIgual() {
		return ladoDesIgual;
	}

	public void setLadoDesIgual(double ladoDesIgual) {
		this.ladoDesIgual = ladoDesIgual;
	}
	public double area() {
		return (ladoIgual*(Math.pow(ladoDesIgual, 2)-(Math.pow(ladoIgual/2, 2))))/2;
	}
	
	

}
