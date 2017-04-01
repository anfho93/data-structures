package semana8.backtraking;

public class SeleccionOptima {
	
	int objetivo = 5;// peso maximo
	int n = 10;// cantidad de objetos
	int objs[] = {1,2,3,4,5,6,2,1,3,9};//arreglo de pesos 
	int bolsa[] = new int [n+1];
	int k = 0;
	
	
	public static void main(String[] args) {
		SeleccionOptima  s =  new SeleccionOptima();
		s.seleccion(0, 0);		
	}
	
	public void seleccion(int candidato, int suma)
	{
		//se verifican que el cantidato actual este entre la cantidad de objetos
		//disponibles n
		 while (candidato < n)
		 {
			 candidato++;
			 //verifica si la suma de los costos de cada objeto candidato
			 //es menor o igual al peso objetivo
			 if ((suma + objs[candidato-1]) <= objetivo)
			 {
				 
				 k++; // es anotado
				 bolsa[k-1] = candidato - 1;//anota el candidato actual en la bolsa 
				 suma += objs[candidato-1];//suma el peso del objeto cantidato
				 if (suma < objetivo) 
				 {// ensaya con siguiente objeto
					 seleccion(candidato, suma);
				 }
				 else // objetos totalizan el objetivo
					 escribirSeleccion();
				 // se borra la anotación
				 
				 //al finalizar la combinacion con el primer candidato 
				 //se borra y se intenta con el segundo.
				 k--;
				 suma -= objs[candidato - 1];
			 }
		 }
	}
	
	public void escribirSeleccion(){
		for (int i = 0; i < k; i++) {
			System.out.print(bolsa[i]+" ");
		}
		System.out.println();
	}
}
