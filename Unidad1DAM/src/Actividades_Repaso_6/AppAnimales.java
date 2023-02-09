package Actividades_Repaso_6;

public class AppAnimales {

	public static void main(String[] args) {
		Gato gardfield=new Gato(2, 3, "Omnivoro", "Gardfield", "Normal", "Naranja", 6);
		System.out.println("Nombre: "+gardfield.getNombre());
		System.out.println("Edad: "+gardfield.getEdad());
		gardfield.setNvidas(7);
		System.out.println("Vidas: "+gardfield.getNvidas());
		System.out.println(gardfield.maulla());
		System.out.println();
		Gato tom=new Gato(5, 9, "Piscivoro", "Tom", "Diferente", "Negro y blanco", 9);
		System.out.println("Nombre: "+tom.getNombre());
		System.out.println("Edad: "+tom.getEdad());
		tom.setNvidas(4);
		System.out.println("Vidas: "+tom.getNvidas());
		System.out.println(tom.maulla());
		System.out.println();
		Perro Snoppy=new Perro(8, 9, "Insectivoro", "Snoppy", "Beagle", "78226137768");
		System.out.println("Nombre: "+Snoppy.getNombre());
		System.out.println("Alimentacion: "+Snoppy.getAlimentacion());
		System.out.println("Chip: "+Snoppy.getChip());
		System.out.println(Snoppy.ladra());
	}

}
