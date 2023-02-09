package Actividades_Repaso_6;

public class Gato extends Animal{
	private String raza;
	private String color;
	private int nvidas;
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNvidas() {
		return nvidas;
	}
	public void setNvidas(int nvidas) {
		this.nvidas = nvidas;
	}
	public Gato(double peso, int edad, String alimentacion, String nombre, String raza, String color, int nvidas) {
		super(peso, edad, alimentacion, nombre);
		this.raza = raza;
		this.color = color;
		this.nvidas = nvidas;
	}
	
	public Gato() {
		super();
		this.raza = "";
		this.color = "";
		this.nvidas = 0;
	}

	
	
	
	@Override
	public String toString() {
		return "Gato [raza=" + raza + ", color=" + color + ", nvidas=" + nvidas + "]";
	}
	public String maulla() {
		return "MIAUUUUUUUUUU";
	}

}
