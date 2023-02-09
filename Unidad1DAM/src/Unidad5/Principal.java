package Unidad5;

public class Principal {

	public static void main(String[] args) {
		
		
		Perro p=new Perro("" ,"Manolin", "Beagle", 10, true);
		Perro q=new Perro("", "Lolete", "Labrador", 10, false);
		
		System.out.println(p);
		System.out.println(q);
		
		if(p.isSobrepeso()) {System.out.println(p.getNombre()+" tiene sobrepeso");}
		else {System.out.println(p.getNombre()+" no tiene sobrepeso");}
		if(q.isSobrepeso()) {System.out.println(q.getNombre()+" tiene sobrepeso");}
		else {System.out.println(q.getNombre()+" no tiene sobrepeso");}
		
		System.out.println(p.getNombre().length());
		System.out.println(q.getNombre().length());
		
		if(p.getEdad()==q.getEdad()) {System.out.println(p.getNombre()+" y "+q.getNombre()+" tienen la misma edad");}
		else {
			if(p.getEdad()>q.getEdad()) {System.out.println(p.getNombre()+" es mayor a "+q.getNombre());}
			else {System.out.println(q.getNombre()+" es mayor a "+p.getNombre());}
		}
	}

}
