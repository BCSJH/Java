package ocjp;
import java.util.*;
import java.lang.*;

public class h {
	interface Downloadable{
		public void download();
	}
	interface Readable extends Downloadable {
		public void readBook();
	}
	abstract class Book implements Readable{
		public void readBook() {
			System.out.println("Read Book");
		}
	}
	class Ebook extends Book{
		public void readBook() {
			System.out.println("Read E-Book");
			
		}
	}
	public static void main(String[] args) {
		Book book1 = new Ebook();
		book1.readBook();
	}
}
