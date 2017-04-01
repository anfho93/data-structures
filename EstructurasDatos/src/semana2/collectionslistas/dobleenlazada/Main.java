package semana2.collectionslistas.dobleenlazada;

import java.util.Collection;

import semana2.collectionslistas.enlazada.ListaCircular;
import semana2.collectionslistas.enlazada.ListaEnlazada;
import semana2.collectionslistas.enlazada.Nodo;

public class Main {

	public Main() {
		ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);		
		System.out.println(lista.toString());
		System.out.println(lista.reverse());
		lista.remove(2);
		System.out.println(lista.toString());
		System.out.println(lista.reverse());
		lista.remove(0);
		System.out.println(lista.toString());
		System.out.println(lista.reverse());
		
		contar(lista, 8);
		contar(lista, 2);
	}
	
	public static int contar(Collection<Integer> lista, Integer g){
		int cont=0;
		if(lista instanceof ListaDoblementeEnlazada){
			Nodo<Integer> aux = ((ListaDoblementeEnlazada<Integer>)lista).getPrimero();
			
		}
		if(lista instanceof ListaEnlazada){
			semana3.colas.Nodo<Integer> aux = ((ListaEnlazada<Integer>)lista).getPrimero();
			
		}
		if(lista instanceof ListaCircular){
			semana3.colas.Nodo aux = ((ListaCircular)lista).getPrimero();
			
		}
		
		return cont;
	}
	
	public static int contar(Object lista, Integer g){
		int cont=0;
		
		return cont;
	}

	public static void main(String[] args) {
		Main m = new Main();
	}

}
