package Unidad5;
	
public class Carta {
	
	private int numero;
	private String palo;
	
	public Carta(int numero, String palo) {
		this.numero=numero;
		this.palo=palo;
	}
	public Carta() {
		this.numero=0;
		this.palo="";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	@Override
	public String toString() {
		return this.numero+" de "+this.palo;
	}
	
	
	
	
	
	
}	
	