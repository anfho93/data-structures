package semana2.collectionslistas.dobleenlazada;

import java.util.Collection;
import java.util.Iterator;

import semana3.colas.Nodo;

public class ListaDoblementeEnlazada<T> implements Collection<T>{

	private NodoDE<T> primero;
	private NodoDE<T> ultimo;
	private  int longitud;
	
	public ListaDoblementeEnlazada() {
		this.primero=null;
		this.ultimo=null;
		this.longitud=0;
	}
	
	@Override
	public boolean add(T dato) {
		NodoDE<T> n = new NodoDE<T>(dato);
		if(isEmpty()){			
			this.primero = n;
			this.primero.setAnterior(null);
			this.primero.setSiguiente(null);			
		}else{
			n.setAnterior(ultimo);
			ultimo.setSiguiente(n);				
		}
		ultimo = n;
		longitud++;
		return true;		
	}
	
	
	@Override
	public boolean isEmpty() {
		return longitud==0;
	}
	
	@Override
	public int size() {
		return longitud;
	}
	
	@Override
	public void clear() {		
		longitud=0;
		primero = null;
		ultimo = null;
	}
	
	public String toString(){
		String elem = "[";
		String coma = "";
		NodoDE<T> aux=primero;
		while(aux!=null)
		{
			elem+=coma+aux.getDato();
			aux = (NodoDE<T>) aux.getSiguiente();
			coma=" , ";			
		}
		return elem+"]";
	}
	
	public String reverse(){
		String elem = "[";
		String coma = "";
		NodoDE<T> aux=ultimo;
		while(aux!=null)
		{
			elem+=coma+aux.getDato();
			aux = (NodoDE<T>) aux.getAnterior();
			coma=" , ";			
		}
		return elem+"]";
	}
	
	@Override
	public boolean contains(Object o) {
		NodoDE<T> aux=primero;
		while(aux!=null)
		{			
			if(aux.getDato().equals(o)){
				return true;
			}else{
				aux = (NodoDE<T>) aux.getSiguiente();
			}
		}		
		return false;
	}
	
	@Override
	public boolean remove(Object o) {
		NodoDE<T> aux=primero;
		NodoDE<T> anterior = null;
		while(aux!=null)
		{			
			if(aux.getDato().equals(o)){
				if(anterior==null){//primero
					aux = (NodoDE<T>) aux.getSiguiente();
					primero = aux;
					primero.setAnterior(null);
					
				}else{

					anterior.setSiguiente(aux.getSiguiente());				
					((NodoDE<T>) aux.getSiguiente()).setAnterior(anterior);					
					aux=null;						
				}
				longitud--;
				
			}else{
				anterior = aux;
				aux = (NodoDE<T>) aux.getSiguiente();
			}
		}	
		return false;
	}
	
	public NodoDE<T> getPrimero() {
		return primero;
	}

	public void setPrimero(NodoDE<T> primero) {
		this.primero = primero;
	}

	public NodoDE<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(NodoDE<T> ultimo) {
		this.ultimo = ultimo;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
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
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
 
	public int contar(Collection<T>lista){
		return 0;
	}
}
