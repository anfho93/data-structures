package semana4.pilas;

import semana2.collectionslistas.enlazada.Nodo;

public class Pila<T> {

	private Nodo<T> primero;
	private int length;

	public Pila() {
		length = 0;
		primero = null;
	}

	public void push(T dato) {
		Nodo<T> nuevo = new Nodo<T>(dato);
		nuevo.setSiguiente(primero);
		primero = nuevo;
		length++;
	}

	public T pop() {
		if (primero != null) {
			T dato = primero.getDato();
			primero = primero.getSiguiente();
			length--;
			return dato;
		} else {
			return null;
		}

	}

	public String toString() {
		String elem = "[";
		String coma = "";
		Nodo<T> aux = primero;
		while (aux != null) {
			elem += coma + aux.getDato().toString();
			aux = aux.getSiguiente();
			coma = " , ";
		}
		return elem + "]";
	}

	public T top() {
		if (primero != null)
			return primero.getDato();
		else
			return null;
	}

	public int size() {
		return length;
	}

	public void empty() {
		while (primero != null) {
			Nodo<T> aux = primero.getSiguiente();
			primero = null;
			primero = aux;
		}
	}
	public boolean isEmpty(){
		return length==0;
	}
	
	public boolean contains(T obj){
		Nodo<T> aux = primero;
		while (aux != null) {
			if(aux.getDato().equals(obj)){
				return true;
			}else
			aux = aux.getSiguiente();
			
		}
		return false;
	}

}
