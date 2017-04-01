package semana8.backtraking;

import java.util.Scanner;

public class CaballoSaltador {
	static final int N = 8;
	static final int n = (N + 1);
	private int[][] tablero = new int[n][n];
	private boolean exito;
	private int[][] SALTO = { { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 },

			{ -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 } };
	private int x0, y0;

	// constructor
	public CaballoSaltador(int x, int y) throws Exception {
		
		if ((x < 1) || (x > N) || (y < 1) || (y > N))
			throw new Exception("Coordenadas fuera de rango");
		x0 = x;
		y0 = y;
		//marcamos todo el tablero con ceros
		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= N; j++)
				tablero[i][j] = 0;
		//marcamos la posicion inicial con 1, 
		tablero[x0][y0] = 1;
		//indicamos que aun no se ha resulto el problema.
		exito = false;
	}

	public boolean resolverProblema() {
		saltoCaballo(x0, y0, 2);
		return exito;
	}

	private void saltoCaballo(int x, int y, int i) {
		int nx, ny;
		int k;
		k = 0; // inicializa el conjunto de posibles movimientos
		do {
			k++;
			nx = x + SALTO[k - 1][0];
			ny = y + SALTO[k - 1][1];
			// determina si nuevas coordenadas son aceptables, es decir estan dentro del 
			// la matriz y no esta marcada
			if ((nx >= 1) && (nx <= N) && (ny >= 1) && (ny <= N) && (tablero[nx][ny] == 0)) {
				tablero[nx][ny] = i; // anota movimiento
			//	escribirTablero();
				//Scanner lector = new Scanner(System.in);
				//lector.nextLine();
				if (i < N * N) {
					saltoCaballo(nx, ny, i + 1);
					// se analiza si se ha completado la solución
					if (!exito) { // no se alcanzó la solución
						tablero[nx][ny] = 0; // se borra anotación
					}
				} else
					exito = true; // tablero cubierto
			}
		} while ((k < 8) && !exito);
	}

	// muestra por pantalla los pasos del caballo
	void escribirTablero() {
		for (int i = 1; i <= N; i++)
		{
			for (int j = 1; j <= N; j++)
				System.out.print(tablero[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		try {
			CaballoSaltador c = new  CaballoSaltador(4,3);
			boolean aux = c.resolverProblema();
			if(aux){
				c.escribirTablero();
			}else {
				System.out.println("No se pudo");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
