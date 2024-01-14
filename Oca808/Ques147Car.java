package Oca808;

public class Ques147Car extends Ques147{
	int y;
	Ques147Car() {
	super(10); // line n2
	}
	Ques147Car(int y) {
	super(y);
	this.y = y;
	}
	public String toString() {
	return super.x + ":" + this.y;
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques147 y = new Ques147Car(20);
		System.out.println(y);

	}

}
