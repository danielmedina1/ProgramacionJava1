package Actividades_Repaso_6;

public class Circulo extends Figura{
	private float radio;

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public Circulo(String color, float radio ) {
		super(color);
		this.radio = radio;
	}
	
	public static void main(String[] args) {
		Circulo c=new Circulo("Verde", 3);
	}

}
