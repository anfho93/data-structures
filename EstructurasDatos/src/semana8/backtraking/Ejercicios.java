package semana8.backtraking;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicios {

	public static void main(String[] args) {
		String conjunto = "ABCD";		
		permutaciones(conjunto, "");
	}
	
	public static void permutaciones(String conjunto,String cadena){
		//caso de parada de la recursi�n 
		if(conjunto.length() == 1){
			//el caso base de una permutaci�n o caso final.
			System.out.println(cadena+conjunto);			
		}else{
			//creamos una copia del conjunto
			String copy = new String(conjunto);
			for (int i = 0; i < conjunto.length(); i++) {		
				//se elimina el caracter escogido para inciar la permutacion.
				String eliminacion = copy.replace(conjunto.charAt(i)+"", "");
				//una cadena donde vamos creando la permutacion poco a poco
				String permutacion = cadena+conjunto.charAt(i);
				//recursividad
				permutaciones(eliminacion,permutacion);
				
			}
		}
	}	
}
