package Oca808;

public class Ques206 {	
	
	String greet  = "Welcome";
	public Ques206() {
		this.greet = "Hello!";  ///this.greet != String greet
	}
	public void setGreet() {
		String greet = "Good Day!";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques206 t = new Ques206();
		String greet = "Good Luck!";
		System.out.println(t.greet);				

	}

}
