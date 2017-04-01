package semana12.arboles;


import java.util.Iterator;

public class ArbolNArio<T extends Comparable<T>>  {

	
	private NodoNArio<T> raiz;
	
	public ArbolNArio(T dato) {
		raiz =  new NodoNArio<T>(dato);
	}
	
	public ArbolNArio(NodoNArio<T> raiz) {
		this.raiz =  raiz;
	}
	
	public void recorrerInOrden(){
		inOrden(raiz);
	}
	public void recorrerPreOrden(){
		preOrden(raiz);
	}
	public void recorrerPostOrden(){
		postOrden(raiz);
	}
	
	
	private void inOrden(NodoNArio<T> nodo) {		
		
		for (int i = 0; i < nodo.getHijos().size(); i++) {
			inOrden(nodo.getHijos().get(i));
			System.out.println(nodo.getDato());
		}
	}
	
	private void preOrden(NodoNArio<T> nodo) {		
		
		for (int i = 0; i < nodo.getHijos().size(); i++) {
			System.out.println(nodo.getDato());
			preOrden(nodo.getHijos().get(i));
			
		}
	}
	
	private void postOrden(NodoNArio<T> nodo){
		for (int i = 0; i < nodo.getHijos().size(); i++) {			
			postOrden(nodo.getHijos().get(i));			
		}
		System.out.println(nodo.getDato());
	}



	/**
	 * @return the raiz
	 */
	public NodoNArio<T> getRaiz() {
		return raiz;
	}

	/**
	 * @param raiz the raiz to set
	 */
	public void setRaiz(NodoNArio<T> raiz) {
		this.raiz = raiz;
	}

}
