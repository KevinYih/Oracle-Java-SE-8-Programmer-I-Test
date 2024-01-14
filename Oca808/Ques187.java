package Oca808;
import java.lang.*;
import java.util.*;
public class Ques187 {
	
	public static void main(String[] args) {
		Ques187 obj = new Ques187();
		try {
			obj.open();
		//	obj.process();
		//	throw new LogFileException();
		}
		catch (Exception e) {
		// TODO: handle exception
			System.out.println("Completed.");
		}
	}
	/*public void process() throws LogFileException{
		System.out.println("Processed");
		throw new LogFileException();
		}
		*/
	public void open() {
		System.out.println("Opened");
		//throw new AccessViolationException();
		}
	}
		//class LogFileException extends Exception {}
		//class AccessViolationException extends RuntimeException {}

