package Unidad5_JuegoDados;

import java.util.Arrays;

public class JuegoDados {

	public static void main(String[] args) {
		int suma=0;
		Dado []misDados=new Dado[6];
		
		for (int i = 0; i < misDados.length; i++) {
			misDados[i]=new Dado();
			misDados[i].lanzarDado();
			suma+=misDados[i].getValor();
		}
		System.out.println(Arrays.toString(misDados));
		System.out.println("Suma="+suma);
		
		

	}

}
