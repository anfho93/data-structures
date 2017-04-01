package semana8.backtraking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlgoritmoLaberinto{

	int n = 10;
	public int[][] laberinto = new int[n][n];
	int pasos =1;
	
	
	public static void main(String[] args) throws FileNotFoundException {
		AlgoritmoLaberinto lab =  new AlgoritmoLaberinto();
		lab.cargarLaberinto();
		lab.solucionarLaberinto(0, 0, 9, 4);
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(lab.laberinto[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void cargarLaberinto() throws FileNotFoundException{
		Scanner lector =  new Scanner(new File("laberinto.txt"));
		
		for (int i = 0; i < laberinto.length; i++) {
			for (int j = 0; j < laberinto.length; j++) {
				laberinto [i][j] = lector.nextInt();
			}
		}
	}
	
	
	public boolean solucionarLaberinto(int i, int j, int x, int y){
		 boolean a =  false;
		if(laberinto[i][j] != 0 )
			return false;
		
		laberinto[i][j] = 1;
		
		if(i==x && j == y)
			return true ;
		
		if(j+1<n && !a){
			  a = solucionarLaberinto(i, j+1, x, y);
			
		}
		if(i+1<n && !a){
			  a=solucionarLaberinto(i+1, j, x, y);
			  
		}
		if(i-1>0&& !a){
			
			   a = solucionarLaberinto(i-1, j, x, y);
			   
		}
		if(j-1>0&& !a){
			
			   a = solucionarLaberinto(i, j-1, x, y);
			   
		}
		if(!a)
		laberinto[i][j] = 0;
		
		return a;
		
		
		
	}
	
}
