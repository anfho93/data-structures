package semana2.collectionslistas.enlazada;

import java.util.Collection;
import java.util.Iterator;

import semana3.colas.Nodo;

public class ListaEnlazada<T> implements  Collection<T>{

	protected Nodo<T> inicio;
	protected Nodo<T> fin;
	protected  int longitud;
	
	public ListaEnlazada() {
		longitud = 0;
	}

	@Override
	public boolean add(T dato) {
		Nodo<T> n = new Nodo<T>(dato);
		if(longitud==0){			
			this.inicio = n;
			this.inicio.setSiguiente(null);			
		}else{
			fin.setSiguiente(n);				
		}
		fin = n;
		longitud++;
		return true;
	}
	
	public String toString(){
		String elem = "[";
		String coma = "";
		Nodo<T> aux=inicio;
		while(aux!=null)
		{
			elem+=coma+aux.getDato().toString();
			
			aux = aux.getSiguiente();
			coma=" , ";
			
		}
		return elem+"]";
	}
	
	@Override
	public boolean remove(Object o) {
		Nodo<T> aux=inicio;
		Nodo<T> anterior = null;
		while(aux!=null)
		{
			
				if(aux.getDato().equals(o)){
					if(anterior==null){//primero
						aux = aux.getSiguiente();
						inicio = aux;						
					}else{
						anterior.setSiguiente(aux.getSiguiente());
						aux=null;						
					}
					longitud--;
					
				}else{
					anterior = aux;
					aux = aux.getSiguiente();
				}
				
			
		}
	
		return false;
	}

	@Override
	public boolean contains(Object o) {
		Nodo<T> aux=inicio;
		while(aux!=null)
		{			
			if(aux.getDato().equals(o)){
				return true;
			}else{
				aux = aux.getSiguiente();
			}
		}		
		return false;
	}
	
	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		longitud = 0 ;
		
	}

	

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		for (Object objeto : c) {
			if(contains(objeto)){
				continue;
			}
			return false; 
		}
		
		return true;
		
	}

	@Override
	public boolean isEmpty() {
		
		return longitud==0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return longitud;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public Nodo<T> getPrimero() {
		// TODO Auto-generated method stub
		return inicio;
	}

}
