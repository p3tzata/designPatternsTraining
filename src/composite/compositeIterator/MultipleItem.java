package composite.compositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultipleItem extends ItemComponent {
	
	List<ItemComponent> itemComponents = new ArrayList<>();
	String name;
	
	public MultipleItem(String name) {
		this.name = name;

	}	
	public ItemComponent add(ItemComponent menuComponent) {
		itemComponents.add(menuComponent);
		return this;
	}
	
	public void remove(ItemComponent menuComponent) {
		itemComponents.remove(menuComponent);
	}
	public ItemComponent getChild(int i) {
		return itemComponents.get(i);
	}
	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(getStringForPrint());
		
		/*
		for(ItemComponent item : itemComponents) {
			item.print();
		}
		*/
		
	}
	
	public String getStringForPrint() {
		return "->" + getName();
	}
	
	
	
	
	@Override
	public String toString() {
		return getStringForPrint();
	}
	
	@Override
	public Iterator<ItemComponent> createIterator() {
		
		return new CompositeIterator(itemComponents.iterator());
		
		
	}
	
	@Override
	public Iterator<ItemComponent> getPlainIterator() {
		
		return itemComponents.iterator();
		
		
	}
	
	
	
	
	
	
}
