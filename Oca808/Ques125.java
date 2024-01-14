package Oca808;

public class Ques125 {
		
	interface Downloadable {
		public void download();
	}
	interface Readable extends Downloadable { // line n1
		
		public void readBook ();
	}
	abstract class Book implements Readable { // line n2
		public void readBook() {
			System.out.println("Read Book");
		}
	}
	class EBook extends Book { // line n3
				
		public void download() {
			System.out.println("download E-Book");			
		}		
		
		public void readBook() {
			System.out.println("Read E-Book");
		}
		//public void download() {} // It is necessary to implement the download() method in this class to compile.
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Ques125 aa = new Ques125();
		Ques125.Book book1 = aa.new EBook();
		book1.readBook();
		
		Ques125.Book book2 = new Ques125().new EBook();
		book2.download();
		
	}
}
