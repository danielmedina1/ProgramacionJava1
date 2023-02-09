package Unidad4Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Acticvidad3Temperatura {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String []diasSemana= {"Lunes","Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		float []temp=new float[7];
		float media=0;
		for (int i = 0; i < diasSemana.length; i++) {
			System.out.println("Introduce la temperatura del "+diasSemana[i]+": ");
			temp[i]=teclado.nextFloat();
			media=media+temp[i];
		}
		System.out.println(Arrays.toString(temp));
		
		System.out.println(media);
		media=media/7;
		System.out.println(media);

	}

}
