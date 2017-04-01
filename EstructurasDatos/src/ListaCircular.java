import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListaCircular<T> {
	private NodoC<T> inicio;
	private int contador;
	private NodoC<T> ultimo;
	
	public  void add(T dato){
		if(inicio == null)
		{
			inicio = new NodoC<T>(dato);
			inicio.setAnterior(inicio);
			inicio.setSiguiente(inicio);
			ultimo = inicio;
			contador ++;
			
		}else{
			contador++;
			NodoC<T> fin = encontrarNodoFinal(inicio);
			NodoC<T> nuevo  =  new NodoC<T>(dato);
			nuevo.setAnterior(fin);
			nuevo.setSiguiente(inicio);
			fin.setSiguiente(nuevo);
			inicio.setAnterior(nuevo);			
		}
	}
	
	public int size(){
		return contador;
	}
	
	
	public void imprimir(){
		NodoC<T> aux = inicio;
		while(aux.getAnterior()!=inicio){		
			System.out.println(aux.getDato());
			aux = aux.getAnterior();
		}
		System.out.println(aux.getDato());
	}
	
	
	private NodoC<T> encontrarNodoFinal(NodoC<T> nodo){
		if(nodo.getSiguiente()==inicio){
			return nodo;
		}else{
			return encontrarNodoFinal(nodo.getSiguiente());
		}
	}
	
	
	public static void main(String[] args) {
		//En Java funciona como cola
		ListaCircular<Integer> aux = new ListaCircular<>();
		aux.add(1);
		aux.add(2);
		aux.add(3);		
		aux.add(6);
		
		aux.imprimir();
		
		
	}
}
