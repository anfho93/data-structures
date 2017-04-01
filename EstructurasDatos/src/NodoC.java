
public class NodoC<T> {

	private  NodoC<T> siguiente;
	private NodoC<T> anterior;
	private T dato;
	
	public NodoC (T da){
		this.setDato(da);
	}
	
	public T getDato() {
		return dato;
	}
	
	public void setDato(T dato) {
		this.dato = dato;
	}

	public NodoC<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoC<T> siguiente) {
		this.siguiente = siguiente;
	}

	public NodoC<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoC<T> anterior) {
		this.anterior = anterior;
	}
}
