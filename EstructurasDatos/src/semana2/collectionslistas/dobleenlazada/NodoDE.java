package semana2.collectionslistas.dobleenlazada;

import semana2.collectionslistas.enlazada.Nodo;

public class NodoDE<T> extends Nodo<T> {

	private NodoDE<T> anterior;
	
	public NodoDE(T dato) {
		super(dato);		
	}

	public NodoDE<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDE<T> anterior) {
		this.anterior = anterior;
	}

}
