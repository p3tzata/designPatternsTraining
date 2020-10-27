package decorator.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class Main {

	public static void main(String[] args) throws IOException {
		FileInputStream  is= new DecoratorFileInputStream ("test.txt");
		int c;
		while ((c = is.read()) != -1) {
          System.out.print((char)c);
         }
	}

}
