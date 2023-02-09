package edd;

import java.util.Iterator;
import java.util.Stack;

public class LIFO {
	private Stack<Proceso> pLifo;
	
	
	public Stack<Proceso> getpLifo() {
		return pLifo;
	}


	public void setpLifo(Stack<Proceso> pLifo) {
		this.pLifo = pLifo;
	}

	public LIFO() {
		this.pLifo = new Stack<>();
	}

	public String toString() {
		String cadena="";
		for (Proceso proceso : pLifo) {
			
		}
		
		return cadena;
		
		
	}
	public static void main(String[] args) {
		LIFO l=new LIFO();
		Proceso p1=new Proceso("pro1", 12, "proceso1", 1, 12500);
		Proceso p2=new Proceso("pro2", 14, "proceso2", 1, 2550);
		Proceso p3=new Proceso("pro3", 16, "proceso3", 0, 500);
		l.getpLifo().push(p1);
		l.getpLifo().push(p2);
		l.getpLifo().push(p3);
		//Peek = Tope de la pila
		
		for (int i = 0; i <2 ; i++) {
			System.out.println("Tope de la pila: "+l.getpLifo().peek().getNombre());
			System.out.println(l);
			//Sacamos de la pila
			do {
				System.out.println("Sacamos el tope de la pila:");
			l.getpLifo().pop();
			System.out.println(l);
			} while (!l.getpLifo().isEmpty());
			
			if(l.getpLifo().isEmpty()) {
				System.out.println("La pila está vacia");
			}
		}
		
	}

}
