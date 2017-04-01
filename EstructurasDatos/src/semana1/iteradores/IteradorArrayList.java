package semana1.iteradores;
import java.util.List;
import java.lang.reflect.Array;
import java.util.Iterator;

public class IteradorArrayList implements Iterator {

	private List lista;
	private int indice;
	
	public IteradorArrayList(List lista) {
		this.indice = 0;
		this.lista = lista;
	}
	@Override
	public boolean hasNext() {
		if(lista.size()<=indice)
			return false;		
		return true;
	}

	@Override
	public Object next() {
		if(this.hasNext()){			
			return lista.get(indice++);
		}
		return null;
	}

}
