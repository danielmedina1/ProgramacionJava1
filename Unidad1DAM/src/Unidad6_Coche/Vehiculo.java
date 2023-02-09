package Unidad6_Coche;

public abstract class Vehiculo {
	public String matricula;
	public String marca;
	public String carburante;
	public String enumCarburante[] ={"DIESEL","GASOLINA","ELECTRICO"};
	
	public Vehiculo() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCarburante() {
		return carburante;
	}

	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}

	public String[] getEnumCarburante() {
		return enumCarburante;
	}

	public void setEnumCarburante(String[] enumCarburante) {
		this.enumCarburante = enumCarburante;
	}

	public Vehiculo(String matricula, String marca, String carburante, String[] enumCarburante) {
		this.matricula = matricula;
		this.marca = marca;
		this.carburante = carburante;
		this.enumCarburante = enumCarburante;
	}
	
	public String getTipo() {
		return "";
	}
	
	

}
