package adapter.training.iteratorEnum;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumAdapter<T> implements Enumeration<T> {

	Iterator<T> iterator;
	
	public EnumAdapter(Iterator<T> iterator) {
		super();
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
		
	}

	@Override
	public T nextElement() {
		return iterator.next();
	}

}
