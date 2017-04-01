package semana12.arboles;

import java.util.Iterator;

public class IteradorInOrden <T extends Comparable<T>> implements Iterator<T> {

	Nodo<T> nodo;
	Nodo<T> raiz;
	boolean inicio=true;
	public IteradorInOrden(Nodo<T> raiz) {
		nodo  = null;
		this.raiz = raiz;
	}

	@Override
	public boolean hasNext() {
		if(inicio && nodo==null)
		{
			inicio = false;
			return true;
		}
		if(nodo.getnIzquierda()!=null || nodo.getnDerecha() !=null ||(sigHijoPadreDerecha(nodo)!=null))
			return true;
		return false;
	}

	@Override
	public T next() {
		if (nodo == null)
			{
				nodo = raiz;
				return nodo.getDato();
			}
		if (nodo.getnIzquierda() != null) {
			nodo = nodo.getnIzquierda();
			return nodo.getDato();
		} else if (nodo.getnDerecha() != null) {
			nodo = nodo.getnDerecha();
			return nodo.getDato();
		} else {
			if(nodo.getPadre()!=null)
				{
					
					nodo = sigHijoPadreDerecha(nodo.getPadre());
					return nodo.getDato();
				}else
					return nodo.getDato();
		}
		
	}
	
	public Nodo<T> sigHijoPadreDerecha(Nodo<T> nodo){
		if(nodo.getPadre()!=null)
		{
			if(nodo.getPadre().getnDerecha()==null || nodo.getPadre().getnDerecha() == nodo)
				return sigHijoPadreDerecha(nodo.getPadre());
			else
				return nodo.getPadre().getnDerecha();
		}
		if(nodo == raiz)
			return null;
		return nodo;
	}
	
	

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
