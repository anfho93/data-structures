package semana6.recursividad;

import java.util.ArrayList;

public class Ejemplos {

	public static void main(String[] args) {
		
		/*System.out.println(sumatoria(100));
		imprimirCaracter('Z');
		System.out.println();
		System.out.println(factorial(5));
		System.out.println(finonacci(5));
		System.out.println(mcdEuclides(412, 184));
		
		*/
		/*System.out.println(changePI("PIxPI"));
		System.out.println(binario(5));
		System.out.println(binario2(5));
		*/
		ArrayList<Object> ejemplo = new ArrayList<Object>();
		ArrayList<Object> ejemplo2 = new ArrayList<Object>();
		ejemplo2.add(11);
		ejemplo2.add(13);
		ejemplo.add(1);
		ejemplo.add(2);
		ejemplo.add(ejemplo2);
		ejemplo.add(8);
		System.out.println(sumaLista(ejemplo, 0));
		
		
	}
	
	

	
	
	public static int sumatoria(int n ){
		if(n==1)
		{
			return n;
		}else{
			return n + sumatoria(n-1);
		}		
	}
	
	public static void imprimirCaracter(char caracter){
		if(caracter >='A'){
			siguiente(caracter);
			System.out.print(caracter);
		}else{
			return;
		}
	}
	
	
	public static void siguiente(char c){
		imprimirCaracter(--c);
	}
	
	public static long factorial(long n){
		if(n == 1)
		{
			return n;
		}else{
			return n*factorial(n-1);
		}
	}
	
	
	public static long finonacci(int n){
		if(n==1 || n==0)
			return 1;
		else{
			
			return finonacci(n-1)+finonacci(n-2);
		}
		
	}
	
	public static int mcdEuclides(int x, int y){
		if(x==y)
			return x;
		else{
			if(x>y)
				return mcdEuclides(x-y, y);
			else
				return mcdEuclides(x, y-x);
		}
	}
	
	/**
	 * Metodo que busca todos los PI y los cmabia a 3.14
	 * @param texto
	 * @return
	 */
	public static String changePI(String texto){
		
		if(texto.length()<2)
			return texto;
		else{
			if(texto.charAt(0) == 'P' && texto.charAt(1)=='I')
			{
				return "3.14"+changePI(texto.substring(2));
			}else{
				return texto.charAt(0)+changePI(texto.substring(1));
			}
		}
		
	}
	
	
	public static String binario(int numero)
	{
		if(numero==0)
			return "0";
		if(numero<2){
			return "1"; 
		}else{
			int residuo = numero%2;
			int cosiente = numero/2;
			return binario(cosiente)+residuo;
		}
	
	}
	
	public static String binario2(int numero)
	{
		String cadena = "";
		if(numero ==0)
			return "0";
		if(numero ==1)
			return "1";
		
		while (numero>1) {
			int residuo = numero%2;			
			cadena = residuo + cadena;
			numero = numero /2;
		}
		return numero+cadena;
	}
	
	public static int sumaLista(ArrayList<Object> lista, int i ){
		if(lista.isEmpty() || i>=lista.size())
			return 0;
		else{
			if(lista.get(i) instanceof Integer)
				return ((Integer)lista.get(i)) + sumaLista(lista, i+1);
			else
				return sumaLista((ArrayList<Object>)lista.get(i), 0) + sumaLista(lista, i+1);
		}
	}
	
	
	
	

		
}
