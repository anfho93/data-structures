package semana12.arboles;

import java.util.ArrayList;

public class DemoArbol {
 
	
		public static void main(String[] args) {
			ArbolBinario<Integer> miArbol =  new  ArbolBinario<Integer>();
			miArbol.add(0);
			miArbol.add(5);
			miArbol.add(6);
			miArbol.add(3);
			miArbol.add(2);
			miArbol.add(4);
			miArbol.add(-5);
			miArbol.add(-6);
			miArbol.add(-3);
			miArbol.add(-2);
			System.out.println("InOrden");
			miArbol.recorrerInOrden(miArbol.getRaiz());
			miArbol.remove(5);
			System.out.println("InOrden");
			miArbol.recorrerInOrden(miArbol.getRaiz());
			
			
			/*for (Integer dato : miArbol) {
				System.out.println(dato);
			}*/
			
			//testArbolNArio();
		}
		
		public static void testArbolNArio(){
			NodoNArio<Integer> raiz =  new NodoNArio<Integer>(0);
			
			NodoNArio<Integer> aux1 =   new NodoNArio<Integer>(1, raiz);
			NodoNArio<Integer> aux2 =   new NodoNArio<Integer>(2, raiz);
			NodoNArio<Integer> aux21 =   new NodoNArio<Integer>(4, aux2);
			NodoNArio<Integer> aux22 =   new NodoNArio<Integer>(6, aux2);
			NodoNArio<Integer> aux23 =   new NodoNArio<Integer>(8, aux2);
			NodoNArio<Integer> aux11 =   new NodoNArio<Integer>(3, aux1);
			NodoNArio<Integer> aux12 =   new NodoNArio<Integer>(5, aux1);
			aux1.agregarHijo(aux11);
			aux1.agregarHijo(aux12);
			aux2.agregarHijo(aux21);
			aux2.agregarHijo(aux22);
			aux2.agregarHijo(aux23);
			raiz.agregarHijo(aux1);
			raiz.agregarHijo(aux2);
			
			ArbolNArio<Integer> arbol =  new ArbolNArio<Integer>(raiz);
			arbol.recorrerInOrden();
		}
		
		
}
