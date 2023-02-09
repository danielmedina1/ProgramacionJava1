package actividades;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int eleccion, ganadas=0, perdidas=0, empates=0, partida=0;
		
		System.out.println("Vamos a jugar a piedra papel o tijeras. Elige que quieres sacar:");
		System.out.println("1-Piedra");
		System.out.println("2-Papel");
		System.out.println("3-Tijeras");
		System.out.println("4-Salir");
		do {
		
		System.out.println("¿Cual es tu eleción?");
		eleccion=teclado.nextInt();
		int eleccion2=(int)(1+Math.random()*3);
		if(eleccion==1) {System.out.println("Tu: Piedra");}
		if(eleccion==2) {System.out.println("Tu: Papel");}
		if(eleccion==3) {System.out.println("Tu: Tijeras");}
		
		if(eleccion==1 || eleccion==2 || eleccion==3) {
		partida++;
			switch(eleccion2) {
			case 1: System.out.println("Sistema: Piedra");
			if(eleccion==1) {System.out.println("Empate"); empates++;}
			if(eleccion==2) {System.out.println("Ganaste"); ganadas++;}
			if(eleccion==3) {System.out.println("Perdiste"); perdidas++;} break;
			case 2: System.out.println("Sistema: Papel");
			if(eleccion==1) {System.out.println("Perdiste"); perdidas++;}
			if(eleccion==2) {System.out.println("Empate"); empates++;}
			if(eleccion==3) {System.out.println("Ganaste"); ganadas++;} break;
			case 3: System.out.println("Sistema: Tijeras");
			if(eleccion==1) {System.out.println("Ganaste"); ganadas++;}
			if(eleccion==2) {System.out.println("Perdiste"); perdidas++;}
			if(eleccion==3) {System.out.println("Empate"); empates++;} break;
			}}
			else {
			if(eleccion==4) {System.out.print("");}
			else {System.out.println(" ");
				System.out.println("Opcion Incorrecta, pruebe otra vez");}}
		}while(eleccion!=4);
		System.out.println(" ");
		System.out.println("Partidas jugadas: "+partida);
		System.out.println("Veces que has ganado: "+ganadas);
		System.out.println("Veces que has empatado: "+empates);
		System.out.println("Veces que has perdido: "+perdidas);
		System.out.println("Hasta la proxima");
	}

}
