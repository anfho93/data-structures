package semana12.arboles;
/**
 *
 * La expresion regular debe ser correcta, 
 * la expresion regular para el caso de las prioridades se debe tener con parentesis.
 * */

public class ArbolExpresiones {
	
	
	
	String operandos ="+-*/";
	
	
	 public static void main(String[] args) {
		   Nodo<Character> raiz =  new Nodo<Character>();
		   //String expresion = "(a + b) + (d * b) - ( q + (w*f))";
		   String expresion = "2 * 3 + 9/3";
		   ArbolExpresiones  miGenerador =  new ArbolExpresiones();
		   raiz = miGenerador.generarArbol(expresion, raiz);
		   ArbolBinario<Character> miArbol =  new ArbolBinario<>(raiz);
		   miArbol.recorrerInOrden(miArbol.getRaiz());
		   System.out.println();
		   miArbol.recorrerPreOrden(miArbol.getRaiz());
		   System.out.println();
		   miArbol.recorrenPostOrden(miArbol.getRaiz());
		   System.out.println();
	 }
	 
	/**
	 * La expresion
	 * @param expresion
	 * @param nodo
	 * @return
	 */
	public Nodo<Character> generarArbol(String expresion, Nodo<Character>nodo){
		expresion =  expresion.trim();
		int contadorParentesis = 0;
		String arbolIzq = "";
		if(expresion.length()==1){
			nodo.setDato(expresion.charAt(0));
			return nodo;
		}
		for (int i = 0; i < expresion.length(); i++) {
			char token = expresion.charAt(i);
			
			 if(token=='('){
				contadorParentesis++;
				continue;
			}else  if(token==')')
				{
					contadorParentesis--;
					
					continue;
				}else if(token==' ')
					continue;
			
			if(!operandos.contains(token+"")){
				if(token=='+' || token == '-')
				arbolIzq+=token;
			}else{
				if(contadorParentesis==0){
					Nodo<Character> izq =  new Nodo<>();
					Nodo<Character> der =  new Nodo<>();
					nodo.setDato(token);
					izq=generarArbol(arbolIzq, izq);
					der=generarArbol(expresion.substring(i+1), der);
					izq.setPadre(nodo);
					der.setPadre(nodo);
					nodo.setnIzquierda(izq);
					nodo.setnDerecha(der);
					arbolIzq="";
					break;
				}else{
					arbolIzq+=token;
					continue;
				}
			}
		}
		if(!arbolIzq.equals(""))
			nodo = generarArbol(arbolIzq, nodo);
		return nodo;
	}
	
	

  
}