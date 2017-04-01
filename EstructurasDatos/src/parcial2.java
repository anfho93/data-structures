import java.io.FileInputStream;
import java.util.Comparator;
import java.util.PriorityQueue;

public class parcial2 {

	static int posiblesPermutacion[] =  new  int[4];
	public static void main(String[] args) {
		String a[]  ={"1","2","3","4"};
		String aux[] = new String [4];
		parcial2.permutar(a,  new String[]{"","","",""}, 0);
		Integer.parseInt("aux");
		
		
		
		PriorityQueue<Integer>  c = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		
		
	}
	
	public static void permutacion(int[] arreglo,  int indice, int tamano, int[] auxiliar) {
		if(indice==tamano)
		{
			for (int i = 0; i < auxiliar.length; i++) {
				System.out.print(auxiliar[i]);
			}
			System.out.println();
		}else{
			for (int j = 0; j < auxiliar.length; j++) {
				if(!validar(arreglo[j], auxiliar))
				{
					auxiliar[indice] =  arreglo[j];
					permutacion(arreglo, indice+1, tamano, auxiliar);
				}
			}
			auxiliar[indice]=0;
		}
		
	}

	public static  void permutar(String[] a , String[] aux, int indice){
		if(aux[aux.length-1]=="")
		{
			for (int i = 0; i < aux.length; i++) {
				System.out.print(aux[i]);
			}
		}else{
			for (int i = 0; i < aux.length; i++) {
			if(!verificar(aux, a[i])){
				aux[indice] =a[i];
				permutar(a, aux, i+1);
			}	
			}			
			aux[indice] = "";
		}
	}
	
	private static boolean verificar(String[] aux, String string) {
		for (int i = 0; i < aux.length; i++) {
			if(aux[i].equalsIgnoreCase(string))
			{
				return true;
			}
		}
		return false;
	}

	private static boolean validar(int a, int[] auxiliar) {
		 for (int i = 0; i < auxiliar.length; i++) {
			 if(auxiliar[i] == a )
				 return true;
		}
		return false;
	}


}
