package Unidad6_Coche;

public class AppCoches {

	public static void main(String[] args) {
		NIF nif=new NIF ("11111111H");
		Coche c=new Coche("1234FFF", "Seat", "Ibiza", args, "Blanco", null, 3);
		Moto m=new Moto("123GGG", "Ducati", "hola", args, 300);
		
		Vehiculo v[]=new Vehiculo[2];
			v[0]=c;
			v[1]=m;
		Cliente cliente1=new Cliente(nif, "Marta", "Lopez", "C/Mayo", 200, v);
		
		Vehiculo v2[]=new Vehiculo[2];
		v2[0]=c;
		v2[1]=m;
		Cliente cliente2=new Cliente(nif, "Marcos", "Lopez", "C/Mayor", 220, v2);
		Cliente cliente3=new Cliente();
		
		Cliente misclientes[]=new Cliente[3];
		misclientes[0]=cliente1;
		misclientes[1]=cliente2;
		misclientes[2]=cliente3;
		int contcoches=0;
		System.out.println("Coches de los clientes");
		for (int i = 0; i < misclientes.length; i++) {
			System.out.println("*****************************************");
			System.out.println(misclientes[i].getNombre()+" "+misclientes[i].getApellido());
			for (int j = 0; j < misclientes[i].getVehiculo().length; j++) {
				if(misclientes[i].getVehiculo()[j] instanceof Coche) {
					contcoches++;
				}
				
			}
			
		}
		


}
	}
