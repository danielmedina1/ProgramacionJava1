package Unidad6;

public class CalculaNominas {

	public static void main(String[] args) {
		Empleado e=new Empleado("11111111H", "Patricia", "Perez", "12345", 1000);
		Empleado e2=new Empleado("11111111H", "Juan", "Perez", "12345", 1000);
		Consultor c=new Consultor("11111111H", "Jesus", "Perez", "12345", 30, 10);
		
		
		Trabajador misEmpleados[]=new Trabajador[3];
		misEmpleados[0]=e;
		misEmpleados[1]=e2;
		misEmpleados[2]=c;
		
		for (int i = 0; i < misEmpleados.length; i++) {
			if(misEmpleados[i] instanceof Empleado) {
				System.out.println("Empleado: "+misEmpleados[i]+" "+misEmpleados[i].calcularPaga());
			}
			else {System.out.println(misEmpleados[i]+" "+misEmpleados[i].calcularPaga());}
			
			 
		}

	}

}
