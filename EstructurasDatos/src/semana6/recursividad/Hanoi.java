package semana6.recursividad;

public class Hanoi {

	 
	
	static	void hanoi(char origen, char auxiliar, char destino, int n)
	{
		 if ( n == 1)
			 System.out.println("Mover disco " + n + " desde varilla " + origen + " a varilla " + destino);
		 else
		 {
			 hanoi(origen, destino, auxiliar, n-1);
			 System.out.println("Mover disco " + n + " desde varilla " +
											 origen + " a varilla " + destino);
			 hanoi(auxiliar, origen, destino, n - 1);
		 }
	}
	
	int f(int n)	
	{
		 if (n == 0)
			 return 1;
		 else if (n == 1)
			 return 2;
		 else
			 return 2*f(n - 2) + f(n - 1);
	}
}
