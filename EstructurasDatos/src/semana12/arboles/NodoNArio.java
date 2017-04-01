package semana12.arboles;

import java.util.ArrayList;
import java.util.Iterator;

public class NodoNArio <T extends Comparable <T>> {

	private T dato;
	private ArrayList<NodoNArio<T>> hijos;
	private NodoNArio<T> padre;
	
	public NodoNArio(T dato){
		this.setDato(dato);
		setHijos(new ArrayList<NodoNArio<T>>());
	}

	public NodoNArio(T dato, NodoNArio<T> padre){
		this.setDato(dato);
		this.padre =  padre;
		setHijos(new ArrayList<NodoNArio<T>>());
	}
	
	public void agregarHijo(NodoNArio<T> hijo){
		hijos.add(hijo);
	}
	/**
	 * @return the hijos
	 */
	public ArrayList<NodoNArio<T>> getHijos() {
		return hijos;
	}

	/**
	 * @param hijos the hijos to set
	 */
	public void setHijos(ArrayList<NodoNArio<T>> hijos) {
		this.hijos = hijos;
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
	 * @return the padre
	 */
	public NodoNArio<T> getPadre() {
		return padre;
	}

	/**
	 * @param padre the padre to set
	 */
	public void setPadre(NodoNArio<T> padre) {
		this.padre = padre;
	}
	
}
