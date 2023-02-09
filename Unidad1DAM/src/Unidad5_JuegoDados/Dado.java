package Unidad5_JuegoDados;

public class Dado {
	private int valor;

	
	public int getValor() {
		return valor;
	}
	
	public void setValor() {
		this.valor = 0;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Dado() {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return ""+valor;
	}
	
	public void lanzarDado() {
		this.setValor((int)(1+Math.random()*6));
		
	}

	public Dado(int valor) {
		this.valor = valor;
	}
	
	
	
	
	
	

}
