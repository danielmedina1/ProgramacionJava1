package Unidad6_Coche;

import java.util.Arrays;

public class NIF {
	private final static int DIMENSION_MAX=9; 
	private final static int DIVISOR=23; 
	public char Letras[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	public String numero;
	
	public char[] getLetras() {
		return Letras;
	}
	public void setLetras(char[] letras) {
		Letras = letras;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public static int getDimensionMax() {
		return DIMENSION_MAX;
	}
	public static int getDivisor() {
		return DIVISOR;
	}
	public NIF(String numero) {
		Letras = getLetras();
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "NIF [Letras=" + Arrays.toString(Letras) + ", numero=" + numero + "]";
	}
	
	
	public boolean escorrecto(String nif) {
		boolean correcto=true;
		
		if(nif.length()==9) {
			if(Character.isLetter(nif.charAt(nif.length()-1))) {
				//System.out.println("El ultimo es una letra");
				for(int i=0; i<nif.length()-2; i++) {
					if(!Character.isDigit(nif.charAt(i)))
						correcto=false;
				}
			}
			else
				correcto=false;
				
		}else
			correcto=false;
		
		int numero=Integer.parseInt(nif.substring(0,8));
		//System.out.println("El numero del nif es: "+numero);
		if(Letras[numero%23]==nif.charAt(nif.length()-1))
		{
			//System.out.println("La letra es correcta");
		}
		else {
				
			//System.out.println("La letra no es correcta");
			correcto=false;
		}
		
		
		/*if(correcto)
			System.out.println("El nif es correcto");
		else
			System.out.println("El nif no es correcto");*/
		
		return correcto;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NIF dni=new NIF("00000000T");
}}
