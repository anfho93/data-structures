package semana12.arboles;

import java.util.Iterator;

public class ArbolBinario <T extends Comparable<T>>  implements   Iterable<T>{

	private Nodo<T> raiz;
	
	public ArbolBinario (){
		raiz = null;
	}
	
	public boolean add(T dato){
		Nodo<T> aux =  new Nodo<T>();
		aux.setDato(dato);
		raiz = agregarElemento(raiz, aux); 
		//temp = raiz;
		return true;
	}	
		
	private Nodo<T> agregarElemento(Nodo<T> nodopivote, Nodo<T> nodo){
		if(nodopivote == null)
		{
			nodopivote = nodo;
			nodopivote.setPadre(null);
			return nodopivote;
		}
		else
		if(nodopivote.getDato().compareTo(nodo.getDato())<0)
		{
			Nodo<T> aux =  agregarElemento(nodopivote.getnDerecha(), nodo);
			aux.setPadre(nodopivote);
			nodopivote.setnDerecha(aux);
			return nodopivote;
			
		}else {
			Nodo<T> aux =  agregarElemento(nodopivote.getnIzquierda(), nodo);
			aux.setPadre(nodopivote);
			nodopivote.setnIzquierda(aux);
			return nodopivote;
		}		
	}
	

	public void recorrerPreOrden(Nodo<T> nodo){
		if(nodo != null){
			System.out.print(nodo.getDato()+" ");
			recorrerPreOrden(nodo.getnIzquierda());
			recorrerPreOrden(nodo.getnDerecha());
			
		}	
	}
	
	public void recorrerInOrden(Nodo<T> nodo){
		if(nodo!=null)
		{
			recorrerInOrden(nodo.getnIzquierda());
			System.out.print (nodo.getDato()+" ");
			recorrerInOrden(nodo.getnDerecha());
		}
	}
	
	public void recorrenPostOrden(Nodo<T> nodo){
		if(nodo!=null){
			recorrenPostOrden(nodo.getnIzquierda());
			recorrenPostOrden(nodo.getnDerecha());
			System.out.print(nodo.getDato()+" " );
		}
	}
	
	
	
	public void remove(T dato){
		
		eliminarNodo( dato, raiz);
				
	}
	
	private void eliminarNodo(T dato, Nodo<T> nodo) {

		if(nodo.compareTo(dato)==0){
			//elimino el nodo
			if(nodo.isHoja()){
				
				if(nodo.getDato().compareTo(nodo.getPadre().getDato())<0){
					//es iz 
					nodo.getPadre().setnIzquierda(null);
				}else{
					nodo.getPadre().setnDerecha(null);
				}
				nodo = null;
			}else if(nodo.getnDerecha()!=null  && nodo.getnIzquierda()!=null){
				//tiene dos hijos, hay dos opciones, reemplazarlo por el mayor 
				//del subarbol izquierdo, o el menos del subarbol derecho
				T mayorIzquierdo = getMayor(nodo.getnIzquierda());
				nodo.setDato(mayorIzquierdo);
			}else{
				 if(nodo.getnIzquierda()==null )
				 {
					 if(nodo.getDato().compareTo(nodo.getPadre().getDato())<0){
						 //nodo es hijo izq
						 nodo.getPadre().setnIzquierda(nodo.getnDerecha());
						 nodo.getnDerecha().setPadre(nodo.getPadre());
						 nodo = null;
					 }else{
						 //nodo es hijo der
						 nodo.getPadre().setnDerecha(nodo.getnDerecha());
						 nodo.getnDerecha().setPadre(nodo.getPadre());
						 nodo = null;
					 }
				 }else if(nodo.getnDerecha()==null)
				 {
					 if(nodo.getDato().compareTo(nodo.getPadre().getDato())<0){
						 //nodo es hijo izq
						 nodo.getPadre().setnIzquierda(nodo.getnIzquierda());
						 nodo.getnIzquierda().setPadre(nodo.getPadre());
						 nodo = null;
					 }else{
						 //nodo es hijo der
						 nodo.getPadre().setnDerecha(nodo.getnIzquierda());
						 nodo.getnIzquierda().setPadre(nodo.getPadre());
						 nodo = null;
					 }
					 
				 }				
			}
			
		}else if(nodo.compareTo(dato) > 0){
			//busco en la izquierda para eliminar
			eliminarNodo(dato, nodo.getnDerecha());
					
			
		}else if(nodo.compareTo(dato) < 0){
			//busco a la derecha para eliminar
			eliminarNodo(dato, nodo.getnIzquierda());
		
		}
	}

	private T getMayor(Nodo<T> nodo) {
		if(nodo.getnDerecha()==null){
			T dato =nodo.getDato();
			eliminarNodo(dato, nodo);
			
			return dato;
		}
		else{
			
			return getMayor(nodo.getnDerecha());
		}
	}

	/**
	 * @return the raiz
	 */
	public Nodo<T> getRaiz() {
		return raiz;
	}

	/**
	 * @param raiz the raiz to set
	 */
	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}
	
	

	@Override
	public Iterator<T> iterator() {
		
		return new IteradorInOrden<T>(raiz);
	}

	
	public ArbolBinario (Nodo<T> n){
		this.raiz =  n;
	}
	
	public boolean isEmpty(){		
			return raiz == null;
	}
	
	public Nodo<T> getDerecha() throws Exception{
		if(raiz ==  null)
			throw new Exception("No hay raiz");
		return raiz.getnDerecha();
	}
	
	public Nodo<T> getIzquierda() throws Exception{
		if(raiz ==  null)
			throw new Exception("No hay raiz");
		return raiz.getnDerecha();
	}	
	
	
}
