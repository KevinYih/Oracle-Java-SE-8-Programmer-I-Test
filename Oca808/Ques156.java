package Oca808;

import java.io.IOException;

public class Ques156 {

	public static void main(String[] args) throws Exception {
		method1();
		System.out.println("Baaa") ;
		
		
	}
	public static void method1() { // line n1
		try {
			throw 10 > 3 ? new MyException() : new IOException();
		}
		catch(IOException ie) {
			System.out.println("I") ;
		}
		catch (Exception re) {
			System.out.println("B") ;
		}
		System.out.println("Bccc") ;
	}
	public final static  void method2() { // line n1
		
	}
	
}
