package Oca808;

public class Ques100 {

	static int count;
	int a = 3;
	public static void displayMessage() {
	count++;
	
	System.out.println("Welcome. Visit count: " + count);
	}
	
	
	public static void main(String[] args) {
	Ques100.displayMessage();
	Ques100.displayMessage();
	
	System.out.println(Ques100.count);
	System.out.println(new Ques100().a);
	}
		

	}


