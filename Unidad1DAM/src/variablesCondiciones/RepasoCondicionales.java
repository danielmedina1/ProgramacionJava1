package variablesCondiciones;

import java.util.Scanner;

public class RepasoCondicionales {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int cargo=0, cargo2=0, estado=0, viajes=0, viajes2=0, sbruto=0;
		float IRPF=0.0f, sneto=0.0f, estado2=0;
		
		System.out.println("----------------------------------------------------");
		System.out.println("Cálculo de nómina:");
		System.out.println("----------------------------------------------------");
		System.out.println("Introduzca el cargo de empleado");
		System.out.println("1) Programador Junior");
		System.out.println("2) Programador Senior");
		System.out.println("3) Jefe de Proyecto");
		cargo=teclado.nextInt();
		if (cargo<1 || cargo>3) { System.out.println("El cargo es incorrecto");}
		else {
		switch(cargo) {
		case 1: cargo2=950; break;
		case 2: cargo2=1200; break;
		case 3: cargo2=1600; break;}}
		
		if (viajes<0) { System.out.println("Los viajes son incorrectos");}
		else {
		System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
		viajes=teclado.nextInt();
		viajes2=30*viajes;
		sbruto=viajes2+cargo2;}
		
		System.out.println("Introduzca su estado civil:");
		System.out.println("1) Casado");
		System.out.println("2) Soltero");
		estado=teclado.nextInt();
		
		if (estado<1 || estado>2) { System.out.println("El estado es incorrecto");}
		else {
		switch(estado){
		case 1: estado2=20;
		case 2: estado2=25;}
		IRPF=((estado2/100)*sbruto);
		sneto=sbruto-IRPF;
		System.out.println("--------------------------------------------");
		System.out.println("Sueldo base: "+cargo2+"€");
		System.out.println("Dietas("+viajes+" viaje/s): "+viajes2+"€");
		System.out.println("--------------------------------------------");
		System.out.println("Sueldo bruto: "+sbruto);
		System.out.println("Retención IRPF ("+estado2+"): "+IRPF);
		System.out.println("--------------------------------------------");
		System.out.println("Sueldo neto: "+sneto);
		System.out.println("--------------------------------------------");

	}
	

}}
