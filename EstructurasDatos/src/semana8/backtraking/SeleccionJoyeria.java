package semana8.backtraking;

public class SeleccionJoyeria {

	
	int objetivo = 5;
	int n = 10;// cantidad de objetos
	int objs[] = {1,2,3,4,5,6,2,1,3,9};//arreglo de pesos
	int objsPrecios[] = {10,200,343,421,556,631,240,100,350,99};
	int bolsa[] = new int [n+1];
	int k = 0;
	int preciofinal = 0;
	int[] bolsaFinal=new int [n+1];
	
	public static void main(String[] args) {
		SeleccionJoyeria  s =  new SeleccionJoyeria();
		s.seleccion(0, 0, 0);		
	}
	
	public void seleccion(int candidato, int peso, int precio){
		//se verifican que el cantidato actual este entre la cantidad de objetos
		//disponibles n
		 while (candidato < n){
			 candidato++;
			 //verifica si la suma de los costos de cada objeto candidato
			 //es menor o igual al peso objetivo
			 if ((peso + objs[candidato-1]) <= objetivo)
			 {
				 
				 k++; // es anotado
				 bolsa[k-1] = candidato - 1;//anota el candidato actual en la bolsa 
				 peso += objs[candidato-1];//suma el peso del objeto cantidato
				 precio+= objsPrecios[candidato-1];
				 if (peso < objetivo ) 
				 {// ensaya con siguiente objeto
					 seleccion(candidato, peso, precio);
				 }
				 else // objetos totalizan el objetivo
					 {
					 
				 		escribirSeleccion();

					 	/*if(preciofinal < precio)
					 	{
					 		preciofinal =  precio;
					 		escribirSeleccion();
					 	}else{
					 		//la opcion cumple con el peso pero no con el precioMaximo
					 	}*/
					  	//
					 }
				 // se borra la anotación				 
				 //al finalizar la combinacion con el primer candidato 
				 //se borra y se intenta con el segundo.
				 k--;
				 peso -= objs[candidato - 1];
				 precio-= objsPrecios[candidato - 1];
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
