package Unidad5;

public class App {

	public static void main(String[] args) {
		Persona p=new Persona("Paco", "Fiestas", "11111111G", 25);
		System.out.println(p);
		
		Persona q=new Persona(null, null, null, 0);
		q.setApellidos("Francis");
		q.setDNI("12345678");
		q.setEdad(29);
		q.setNombre("Jose Maria");
		System.out.println(q);
		if(p.getEdad()==q.getEdad()) {
			System.out.println("Tienen la misma edad");
		}
		else{
			if(p.getEdad()>q.getEdad()) {System.out.println(p.getNombre()+" tiene mas edad que "+q.getNombre());}
			else {System.out.println(q.getNombre()+" tiene mas edad que "+p.getNombre());}
		}
	}

}
