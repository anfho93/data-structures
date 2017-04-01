package semana2.collectionslistas.enlazada;

import java.util.Collection;
import java.util.Iterator;

import semana3.colas.Nodo;

public class ListaCircular<T> implements Collection<T> {

	private Nodo<T> primero;
	private Nodo<T> ultimo;
	private int longitud;

	public ListaCircular() {
		longitud = 0;
	}

	@Override
	public boolean add(T dato) {
		Nodo<T> n = new Nodo<T>(dato);
		if (longitud == 0) {
			this.primero = n;
			this.ultimo = primero;
			this.primero.setSiguiente(ultimo);
			
		} else {
			n.setSiguiente(primero);
			ultimo.setSiguiente(n);
		}
		ultimo = n;
		ultimo.setSiguiente(primero);
		longitud++;
		return true;
	}
	
	public String toString(){
		String elem = "[";
		String coma = "";
		Nodo<T> aux=primero;
		while(aux!=null)
		{
			elem+=coma+aux.getDato().toString();
			if(aux.equals(ultimo))
				break;
			aux = aux.getSiguiente();
			coma=" , ";			
		}
		return elem+"]";
	}

	@Override
	public boolean remove(Object o) {
		Nodo<T> aux = primero;
		Nodo<T> anterior = ultimo;
		boolean bandera = true;
		while (bandera) {
			if (aux.equals(ultimo)) {
				bandera = false;
			}

			if (aux.getDato().equals(o)) {
				if (aux.equals(primero)) {// primero
					aux = aux.getSiguiente();
					primero = aux;
					anterior.setSiguiente(aux);

				} else {					
					anterior.setSiguiente(aux.getSiguiente());					
					if(aux.equals(ultimo)){
						ultimo=anterior;
					}
					aux = null;
				}
				longitud--;
				return true;
			} else {
				anterior = aux;
				aux = aux.getSiguiente();
			}

		}
		return false;
	}

	@Override
	public void clear() {
		primero = null;
		ultimo = null;
		longitud = 0;
	}

	@Override
	public int size() {
		return longitud;
	}

	@Override
	public boolean contains(Object o) {
		Nodo<T> aux = primero;
		Nodo<T> anterior = ultimo;
		while (aux != ultimo) {
			if (aux.equals(o)) {
				return true;
			} else {
				anterior = aux;
				aux = aux.getSiguiente();
			}
		}
		if(aux.equals(o)){
			return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return primero == null;
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
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public Nodo<T> getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}

	public Nodo<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Nodo<T> ultimo) {
		this.ultimo = ultimo;
	}

}
