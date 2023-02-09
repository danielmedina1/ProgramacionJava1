package BingoClases;

public class BingoC {
	public int bolas[];
	public int posicion;
	
	public boolean repetido(int bola) {
		for (int i = 0; i < bolas.length; i++) {
			if(bola==bolas[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws InterruptedException {
		int bola=0;
		Jugador j1=new Jugador("Manuel");
		Jugador j2=new Jugador("Zacarías");
		j1.getBoleto();
		j2.getBoleto();
		System.out.println(j1);
		System.out.println(j2);
		System.out.println("-------------------");
		do {
			bola=(int)(1+Math.random()*20);
			System.out.println(bola);
			j1.buscarNumero(bola);
			j2.buscarNumero(bola);
			System.out.println(j1);
			System.out.println(j2);
			System.out.println("-------------------");
			Thread.sleep(1000);
		}while(!j1.gana() && !j2.gana());
		if(j1.gana()) {System.out.println("El Jugador 1 ha ganado");}
		if(j2.gana()) {System.out.println("El Jugador 2 ha ganado");}
		

	}

}
