package actividades;

import java.util.Scanner;

public class ActividadUsuario {

		public static void main(String[] args) {
	
			Scanner teclado=new Scanner(System.in);
			String nombre, contraseña;
			int i=0;
			 do{
			if(i>=1){System.out.println("El nombre de usuario o la contraseña son incorrectos. Pruebe otra vez");}
			System.out.print("Introduce el nombre de usuario: ");
			nombre=teclado.next();
			System.out.print("Introduce la contraseña: ");
			contraseña=teclado.next();
			i++;
			}while(i<3 && (!nombre.equals("root") || !contraseña.equals("1234")));
		if(nombre.equals("root") && contraseña.equals("1234")) {System.out.println("Bienvenido de nuevo");}
		else {System.out.println("Has gastado todos los intentos vuelva otro dia");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
