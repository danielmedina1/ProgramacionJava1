package Actividades_Repaso_6;

public abstract class Figura {
	private String color;
	private float area;
	private float perimetro;
	
	public Figura(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Figura [color=" + color + ", area=" + area + ", perimetro=" + perimetro + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	public Figura(String color, float area, float perimetro) {
		this.color = color;
		this.area = area;
		this.perimetro = perimetro;
	}
	public Figura() {
		this.color = "";
		this.area = 0;
		this.perimetro = 0;
	}
	private void datosCuadrado() {
		int lado=0;
		area=lado*lado;
		perimetro=lado*lado;
	}
	private void datosCirculo() {
		float radio=0, pi=(float) 3.14159265359;
		area=(float)(1*Math.pow(radio, 2));
		perimetro=pi*2*radio;
	}
}
