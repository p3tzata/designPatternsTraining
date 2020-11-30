package composite;

import java.util.Iterator;

public class SingleItem extends ItemComponent {
	
	String name;

	public SingleItem(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(getStringForPrint());
	}
	
	public String getStringForPrint() {
		return " " + getName();
	}
	
	
	public Iterator<?> createIterator(){
		
		return new NullIterator();
	}

	@Override
	public String toString() {
		
		return getStringForPrint();
	}
	
	
	
	
}
