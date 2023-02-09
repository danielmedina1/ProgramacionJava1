package edd;

import java.util.Stack;

public class EjemploClaseExpression {

	public static void main(String[] args) {
		String expresion="((3+5)(8/4))*(-2)";
		Stack<String> p=new Stack<>();
		boolean mal=false;
		
		for (int i = 0; i < expresion.length(); i++) {
			if (expresion.charAt(i)=='(') {
				p.push("(");
			}
			if (expresion.charAt(i)==')') {
				if (!p.isEmpty()) {
					p.pop();
				}
				else {
					mal=true;
				}
				
			}
			
			
		}
		if (p.isEmpty()) {
				System.out.println("La expresion "+expresion+ " es correcta");
			} else {
				System.out.println("La expresion "+expresion+ " es incorrecta");

			}
	}

}
