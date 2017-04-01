package semana6.recursividad;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array =  new int []{10,20,32,33,45,46,48,50};
		System.out.println(binarySearch(0, array.length, 57, array));
	}
	
	
	public static boolean binarySearch(int inicio, int fin, int obj, int[]array){
		int medio = (fin-inicio)/2 + inicio;
		if(array[medio]==obj){
			System.out.println("Ubicado en "+medio);
			return true;
		}else if(array[medio]!=obj && (medio==inicio || medio==fin)){
			return false;
		}else if(array[medio] > obj ){
			return binarySearch(inicio, medio, obj, array);
		}else  if(array[medio] < obj ){
			return binarySearch(medio, fin, obj, array);
		}
		return false;
		
		
	}
}
