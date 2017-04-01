package semana8.backtraking;

public class Reinas {

	final int N = 8;
	final int n = (N+1);
	int [] reinas = new int[n];
	boolean solucion =  false;
	public static void main(String[] args) {
		Reinas r =  new Reinas();
		System.out.println(r.solucionReinas());
		r.imprimir();
	}
	
	public void imprimir(){
		for (int i = 1; i < reinas.length; i++) {			
				System.out.println(reinas[i]);			
		}
	}
	
	public boolean solucionReinas()
	{
		 solucion = false;
		 ponerReina(1);
		 return solucion;
	}
	
	private void ponerReina(int i)
	{
		 int j;
		 j = 0; // inicializa posibles movimientos
		 do {
			 j++;
			 reinas[i] = j; // prueba a colocar reina i en fila j,								
			 // a la vez queda anotado el movimiento
			 if (valido(i))
			 {
				 if (i < N) // no completado el problemaAlgoritmos recursivos   
				 {
					 ponerReina(i+1);
					 // vuelta atrás
					 if (!solucion)
						 reinas[i] = 0;
				 }
				 else // todas las reinas colocadas
					 solucion = true;
			 }
		 } while(!solucion && (j < 8));
	} 	
	private boolean valido(int i)
	{
			 /* Inspecciona si la reina de la columna i es atacada por
				 alguna reina colocada anteriormente */
		 int r;
		 boolean libre;	
		 libre = true;
		 for (r = 1; r <= i-1; r++)
		 {
			 // no esté en la misma fila
		 	 libre = libre && (reinas[i] != reinas[r]);
			 // no esté en alguna de las dos diagonales
			 libre = libre && ((i + reinas[i]) != (r + reinas[r]));
			 libre = libre && ((i - reinas[i]) != (r - reinas[r]));
		 }
		 return libre;
	}
}
