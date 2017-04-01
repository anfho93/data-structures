package semana3.colas;

import java.util.PriorityQueue;

public class Cola<T> {

	private Nodo<T> nodoCabeza;
	private Nodo<T> nodoCola;
	private int longitud;
	
	public Cola() {
		this.nodoCabeza = null;
		longitud=0;
	}
	
	public void encolar(T dato){
		Nodo<T> n = new Nodo<T>(dato);
		if(longitud==0){			
			this.nodoCabeza = n;
			this.nodoCabeza.setSiguiente(null);			
		}else{
			nodoCola.setSiguiente(n);				
		}
		nodoCola = n;
		longitud++;		
	}
	
	public T quitar(){
		T aux =null;
		if(!vacia()){
			aux = nodoCabeza.getDato();
			nodoCabeza = nodoCabeza.getSiguiente();
		}
		return aux;
	}
	
	public boolean vacia(){
		return longitud==0;
	}
	
	public String toString(){
		String elem = "[";
		String coma = "";
		Nodo<T> aux=nodoCabeza;
		while(aux!=null)
		{
			elem+=coma+aux.getDato().toString();			
			aux = aux.getSiguiente();
			coma=" , ";
			
		}
		return elem+"]";
	}
	public void vaciar(){
		for (; nodoCabeza != null;)
		{
			nodoCabeza = nodoCabeza.getSiguiente();
		}		
	}
	
	public T peek(){
		if(!vacia())
		{
			return nodoCabeza.getDato();
		}else return null;
		
	}
	
	public boolean contains(T dato) throws Exception{
			PriorityQueue<T> x = new PriorityQueue<>();
			
		return true;
	}


}
