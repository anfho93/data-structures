package semana12.arboles;

public class Nodo <T extends Comparable<T>> implements Comparable<T>{
	

	private  T dato;
	private Nodo<T> padre;
	private Nodo<T> nDerecha;
	private Nodo<T> nIzquierda;
	
	/**
	 * Constructor de la clase nodo.
	 */
	public Nodo(){
		dato = null;
		padre = null;
		nDerecha =  null;
		nIzquierda =  null;				
	}
	
	
	
	/**
	 * @return the dato
	 */
	public T getDato() {
		return dato;
	}
	/**
	 * @param dato the dato to set
	 */
	public void setDato(T dato) {
		this.dato = dato;
	}
	/**
	 * @return the nIzquierda
	 */
	public Nodo<T> getnIzquierda() {
		return nIzquierda;
	}
	/**
	 * @param nIzquierda the nIzquierda to set
	 */
	public void setnIzquierda(Nodo<T> nIzquierda) {
		this.nIzquierda = nIzquierda;
	}
	/**
	 * @return the nDerecha
	 */
	public Nodo<T> getnDerecha() {
		return nDerecha;
	}
	/**
	 * @param nDerecha the nDerecha to set
	 */
	public void setnDerecha(Nodo<T> nDerecha) {
		this.nDerecha = nDerecha;
	}
	/**
	 * @return the padre
	 */
	public Nodo<T> getPadre() {
		return padre;
	}
	/**
	 * @param padre the padre to set
	 */
	public void setPadre(Nodo<T> padre) {
		this.padre = padre;
	}

	@Override
	public int compareTo(T o) {
		
		return o.compareTo(this.dato);
	}



	


	public boolean isHoja() {
		// TODO Auto-generated method stub
		return  nIzquierda == null && nDerecha == null;
	}

	
}
