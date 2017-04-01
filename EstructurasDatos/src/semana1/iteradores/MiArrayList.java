package semana1.iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class MiArrayList<T> extends ArrayList<T> implements Iterable<T>{	
	
	
	public MiArrayList() {
		super();
	}
	
	@Override
	public Iterator iterator() {		
		return new IteradorArrayList(this);
	}
}
