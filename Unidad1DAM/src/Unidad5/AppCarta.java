package Unidad5;

public class AppCarta {

	public static void main(String[] args) {
		
		JugadorCarta j=new JugadorCarta("Jeremías");
		j.extraerCarta();
		JugadorCarta j2=new JugadorCarta("Enrique");
		j2.extraerCarta();
		
		System.out.println("Jugador 1: "+j.getC().toString());
		System.out.println("Jugador 2: "+j2.getC().toString());
		Carta p=new Carta();
		
	}

}
