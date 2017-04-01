package semana1.iteradores;

import java.util.ArrayList;

public class Ejemplo1 {

	private MiArrayList<String> variable1;
	
	public Ejemplo1(){
		variable1 = new MiArrayList<String>();
		variable1.add("uno");
		variable1.add("dos");
		variable1.add("tres");
		variable1.add("cuatro");		
		for (String cadena : variable1) {
			System.out.println(cadena);
		}
	}
	
	
	public boolean buscar(String elemento){
		for (String string : variable1) {
			if(variable1.equals(elemento))
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Ejemplo1 miEjemplo = new Ejemplo1();
		System.out.println(miEjemplo.buscar("elemento"));
	}
	
}
