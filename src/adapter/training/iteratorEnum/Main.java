package adapter.training.iteratorEnum;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> listOfSring= new ArrayList<>();
		listOfSring.add("test1");
		listOfSring.add("test2");
		
		EnumAdapter<String> enumAdapter = new EnumAdapter<>(listOfSring.iterator());
	
		
		olderCode(enumAdapter);
		someCode(listOfSring.iterator());
		
		

	}
	
	public static void olderCode(Enumeration<String> enum_) {
		
		while(enum_.hasMoreElements()) {
			
			System.out.println(enum_.nextElement());
			
		}
		
	}

	public static void someCode(Iterator<String> iterator) {
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
	}
	
	
	

}
