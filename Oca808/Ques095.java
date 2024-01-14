package Oca808;

public class Ques095 {
		
		    class A {
			public void test () {
			System.out.println ("A");
			}
			}

			class B extends A {
			public void test () {
			System.out.println ("B");
			}
			}

			public class C extends A {

			public void test () {
			System.out.println ("C");
			}			
			public static void main(String[] args) {
				
				Ques095 x = new Ques095();
				A b1 = x.new A();
				A b2 = x.new C();

				b1 = (A) b2; //line n1
				A b3 = (B) b2; //line n2

				b1.test ();
				b3.test ();
				System.out.println("fsdf");
			}

			}
			

	

}
