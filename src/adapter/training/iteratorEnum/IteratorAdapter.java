package adapter.training.iteratorEnum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<T> implements Iterator<T> {

	Enumeration<T> enum_;
	
	
	
	public IteratorAdapter(Enumeration<T> enum_) {
		super();
		this.enum_ = enum_;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enum_.hasMoreElements();
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return enum_.nextElement();
	}

}
