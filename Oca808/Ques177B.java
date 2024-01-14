package Oca808;

public class Ques177B extends Ques177A{
	
	public void test() {
		System.out.println("DerivedB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques177 b1 = new Ques177B();
		Ques177 b2 = new Ques177A();
		Ques177 b3 = new Ques177B();
		Ques177 b4 = b3;
		b1 = (Ques177)b2;
		b1.test();
		b4.test();

	}

}
