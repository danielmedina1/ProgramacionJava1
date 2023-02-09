import java.util.Arrays;

public class Worlde {

	public static void main(String[] args) {
		String pal[]=new String[20];
		String opcion="";
		String palabra="";
		int i=0, n=0;
		completar(pal);
		System.out.println(Arrays.toString(pal));
		
		n=(int)(Math.random()*20);
		System.out.println(n);
	}

	private static void completar(String[] pal) {
		int i=0;
		pal[i]="PLATO";
		i++;
		pal[i]="PISAR";
		i++;
		pal[i]="PLANO";
		i++;
		pal[i]="MAREO";
		i++;
		pal[i]="LISTA";
		i++;
		pal[i]="LISTO";
		i++;
		pal[i]="SUCIO";
		i++;
		pal[i]="PERRO";
		i++;
		pal[i]="MIXTO";
		i++;
		pal[i]="BULITO";
		i++;
		pal[i]="CASTO";
		i++;
		pal[i]="PRADO";
		i++;
		pal[i]="MOSCA";
		i++;
		pal[i]="PISTO";
		i++;
		pal[i]="TURCO";
		i++;
		pal[i]="BRAVO";
		i++;
		pal[i]="VISTO";
		i++;
		pal[i]="QUESO";
		i++;
		pal[i]="GUISO";
		i++;
		pal[i]="USADO";
		i++;
	}

}
