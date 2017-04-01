package semana4.notaciones;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Notaciones {	
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int casos  = lector.nextInt();
		lector.nextLine();
		while(casos-- >0 ){
			
			String expresion = lector.nextLine();
			long min = resultadoExpresion(expresion, 0);
			long max = resultadoExpresion(expresion, 1);
			
			System.out.println("The maximum and minimum are "+max+" and "+ min+".");
			
		}
		
			
	}
	
	public static Long resultadoExpresion(String expresionInfija, int prioridad)
	{
		Stack<String > pila = new Stack<String>();		
		Queue<String> cola = new ArrayDeque<>();
		pila.push("(");
		expresionInfija+=")";		
		while(expresionInfija.length() > 0)
		{
			String elemento = expresionInfija.charAt(0)+"";
			if(expresionInfija.length() > 1 && expresionInfija.charAt(1)>='0' && expresionInfija.charAt(1)<='9' && expresionInfija.charAt(0)>='0' && expresionInfija.charAt(0)<='9')
			{
				elemento+=expresionInfija.charAt(1);
				expresionInfija = expresionInfija.substring(2,expresionInfija.length());
			}	
			else
				expresionInfija = expresionInfija.substring(1,expresionInfija.length());
			//System.out.println(expresionInfija);
			if(elemento.equals("("))
			{
				pila.push(elemento);
			}else if(elemento.equals(")"))
			{
				while(!pila.peek().equals("(")){
					cola.add(pila.pop());
				}
				pila.pop();//se quita el parentesis izquierdo 
				
			}else if(isOperador(elemento))
			{
				if(prioridad==0){
					if(elemento.equals("+") || elemento.equals("-"))
					{
						while(pila.peek().equals("*") || pila.peek().equals("/") ||  pila.peek().equals("^")){
							cola.add(pila.pop());
						}
					}	
				}else{
					if(elemento.equals("*") || elemento.equals("-"))
					{
						while(pila.peek().equals("+") || pila.peek().equals("/") ||  pila.peek().equals("*")){
							cola.add(pila.pop());
						}
					}	
				}
							
				pila.push( elemento);
				
			}else{
				cola.add(elemento);
			}
			
		}
		
		while(!pila.isEmpty())
		{
			cola.add(pila.pop());
		}
		
		//System.out.println(cola.toString());
		return resultado(cola);
	
	}
	
	public static long resultado(Queue<String> cola)
	{
		Stack<Long> pila = new Stack<>();
		while(!cola.isEmpty())
		{
			if(isNumero(cola.peek())){
				pila.push(Long.parseLong(cola.poll()+""));
			}else{
				Long a = pila.pop();
				Long b = pila.pop();
				switch (cola.peek()) {
				case "+":
					pila.push(a+b);
					break;
				case "-":
					pila.push(a-b);
					break;
				case "*":
					pila.push(a*b);
					break;
				case "/":
					pila.push(a/b);
					break;					
				}
				cola.poll();
				
			}
		}
		return pila.peek();
	}
	
	public static boolean isNumero(String n){
		try {
			Integer.parseInt(n);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private static boolean isOperador(String elemento) {
		
		return elemento.equals("+") || elemento.equals("-") || elemento.equals("/") || elemento.equals("*");
	}
}
