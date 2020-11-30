package composite;

import java.util.Iterator;
import java.util.Stack;




public class CompositeIterator implements Iterator<ItemComponent> {

	private Stack<Iterator<ItemComponent>> stack;
	
	
	public CompositeIterator(Iterator<ItemComponent> iterator) {
		this.stack = new Stack<>();
		this.stack.add(iterator);
	}
	
	
	

	
	/* */
	
	@Override
	public boolean hasNext() {
			
		
		if(stack.isEmpty()) {
			return false;
		}
		
		Iterator<ItemComponent> peek = stack.peek();
		
		
		if(!peek.hasNext()) {
			
			stack.pop();
			
				return hasNext();
		}
		else {
			return true;
		}
			
			
		
		
		
		
	}
	
	



	

	@Override
	public ItemComponent next() {
		
		Iterator<ItemComponent> currIterator = stack.peek();
		
		ItemComponent next = currIterator.next();
		
		if (next instanceof MultipleItem) {
			
			@SuppressWarnings("unchecked")
			//Iterator<ItemComponent> createIterator = (Iterator<ItemComponent>) next.createIterator();
			Iterator<ItemComponent> createIterator = (Iterator<ItemComponent>) next.getPlainIterator();
			
			stack.push(createIterator);
			
		}
		
		
		
		return next;
		
		
		
	}
	
	
	
	public boolean hasNext99() {
		
		Iterator<ItemComponent> currentIterator;
		
		if (stack.isEmpty()) {
			return false;
		} else {
		
			currentIterator = stack.peek();
		
		}
		
		
		if (!currentIterator.hasNext()) {
			
			stack.pop();
			hasNext();
			
		} 
		
		
		return currentIterator.hasNext();
		
	}
	
	

}
