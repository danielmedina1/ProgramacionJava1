package VideoClub;

import java.io.FileNotFoundException;

public class AppVideoClub {
	
	public static void main(String[] args) throws FileNotFoundException {
		DVD dvd1=new DVD("Mulan", DVD.NORMAL);
		DVD dvd2=new DVD("Avatar", DVD.NOVEDAD);
		DVD dvd3=new DVD("Mulan", DVD.INFANTIL);
		Alquiler a1=new Alquiler(2, dvd1);
		Alquiler a2=new Alquiler(4, dvd2);
		Clientre c=new Clientre("Maria");
		c.nuevoAlquiler(a1);
		c.nuevoAlquiler(a2);
		c.Informe();
		System.out.println("*************************************************");
		Clientre c2=new Clientre("Marta");
		Alquiler a3=new Alquiler(2, dvd2);
		c2.nuevoAlquiler(a3);
		c2.Informe();
		
	}

}
