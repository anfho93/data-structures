package semana12.arboles.avl;

public class NodoAVL<T extends Comparable<T>> implements Comparable<NodoAVL<T>>{

	private T dato;
	private NodoAVL<T> izq;
	private NodoAVL<T> der;
	private int altura;
	
	
	
	public NodoAVL(T dato) {
		this.dato =  dato;
	}
	

	@Override
	public int compareTo(NodoAVL<T> arg0) {
		// 
		return dato.compareTo(arg0.getDato());
	}
	
	

	public T getDato() {
		return dato;
	}


	public void setDato(T dato) {
		this.dato = dato;
	}


	public NodoAVL<T> getIzq() {
		return izq;
	}


	public void setIzq(NodoAVL<T> izq) {
		this.izq = izq;
	}


	public NodoAVL<T> getDer() {
		return der;
	}


	public void setDer(NodoAVL<T> der) {
		this.der = der;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


}
