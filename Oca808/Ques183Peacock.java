package Oca808;

public class Ques183Peacock extends Ques183Bird{
	
	Ques183Peacock(){
		System.out.println("Constructor PEA");
	}
	
	public void dance() {
		System.out.println("Dance.");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ques183Bird b = new Ques183Peacock ();
		Ques183Peacock p = (Ques183Peacock)b;
		p.fly();
		p.dance();
		*/
		
		Ques183Bird b = new Ques183Peacock ();
		Ques183Peacock p = (Ques183Peacock)b;
		p.fly();
		p.dance();

	}

}
