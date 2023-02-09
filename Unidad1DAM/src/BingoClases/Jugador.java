package BingoClases;

import java.util.Arrays;

public class Jugador {
	private String nombre;
	private String nick;
	private int[] boleto;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNick() {
		if(this.nombre.length()>=3) {
			return "J"+this.nombre.substring(0, 3)+(int)(1+Math.random()*100);
		}
		else {return "J"+(int)(1+Math.random()*100);}
		
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public int[] getBoleto() {
		for(int i = 0; i<this.boleto.length; i++) 
			this.boleto[i]=(int)(1+Math.random()*20);
		
		return boleto;
	}
	
	public void setBoleto(int[] boleto) {
		this.boleto = boleto;
	}
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.nick=this.getNick();
		this.boleto=new int [5];
	}
	
	public Jugador() {
		this.nombre = "";
		this.nick="";
	}
	
	@Override
	public String toString() {
		return "El jugador "+ nombre + ", con el nick " + nick + " y el boleto " + Arrays.toString(boleto);
	}
	
	public boolean gana() {
		for(int i=0; i< this.boleto.length; i++) {
			if(this.boleto[i]!=0) {
				return false;
			}
		}
		return true;
	}
	
	public void buscarNumero(int numero) {
		for(int i=0; i<this.boleto.length; i++) {
			if(numero==this.boleto[i]) {
				this.boleto[i]=0;
			}
		}
	}
	
	

}
