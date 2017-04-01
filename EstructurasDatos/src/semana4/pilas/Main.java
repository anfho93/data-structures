package semana4.pilas;

import java.util.Scanner;

public class Main {

	public Main() {
		/*Pila<Integer> pila = new Pila<Integer>();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		System.out.println(pila.toString());
		System.out.println(pila.top());
		System.out.println(pila.pop());
		System.out.println(pila.toString());
		this.palindrome("anaw");*/
		System.out.println(fibo(3));
	}
	
	public boolean palindrome(String palabra){
		Pila<Character> pila = new Pila<Character>();
		for (int i = 0; i < palabra.length(); i++) {
			pila.push(new Character(palabra.charAt(i)));				
		}
		boolean esPal = true;
		for (int j = 0; esPal && !pila.isEmpty();) {
			Character c;
			c = (Character) pila.pop();
			esPal = palabra.charAt(j++) == c.charValue();
		}
		pila.empty();
		if (esPal)
			System.out.println("La palabra " + palabra + " es un palíndromo \n");
		else
			System.out.println("La palabra " + palabra + " no es un palíndromo \n");
		return false;
	}
	
	
	//Infix to Postfix
	public String conversion1(String expresion){
		
		return "";
	}
	
	
	public static void main(String[] args) {
		Main m = new Main();
	}
	
	
	
	public int fibo(int n){
		int[] array = new int [n+1];
		array[0] = 0;
		array[1] = 1;
		int fibo = 0;
		for (int i = 2; i <= n; i++) {
			fibo = array[i-1]+array[i-2];
			array[i] = fibo;					
		}
		
		return array[n];
	}
	
	
}
