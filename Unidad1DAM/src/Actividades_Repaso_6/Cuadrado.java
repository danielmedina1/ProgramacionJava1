package Actividades_Repaso_6;

public class Cuadrado extends Figura {
	private double lado;

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
	
	public double area() {
		return lado*lado;
		}
	public double perimetro() {
		return lado*4;
	}	
	public boolean equals (Figura fig) {
		if(fig instanceof Cuadrado && this.getLado()==((Cuadrado)fig).getLado()&&this.getColor().equals(fig.getColor())) {
			return true;
		}
		else {
			return false;
			}
	}
	

}
