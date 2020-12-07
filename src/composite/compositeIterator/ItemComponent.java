package composite.compositeIterator;

import java.util.Iterator;

public abstract class ItemComponent {
	
	public ItemComponent add(ItemComponent itemComponent) {
		throw new UnsupportedOperationException();
		}
	
		public void remove(ItemComponent itemComponent) {
		throw new UnsupportedOperationException();
		}
		
		public ItemComponent getChild(int i) {
		throw new UnsupportedOperationException();
		}
		
		public String getName() {
		throw new UnsupportedOperationException();
		}
				
		public void print() {
		throw new UnsupportedOperationException();
		}
		
		public Iterator<?> createIterator() {
			throw new UnsupportedOperationException();	
		}

		public Iterator<?> getPlainIterator() {
			throw new UnsupportedOperationException();	
		}
}
