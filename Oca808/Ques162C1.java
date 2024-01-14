package Oca808;

public class Ques162C1 extends Ques162C2{
	
	char c;
	
	public void displayI() {
		System.out.println("C1");
	}
	//public void displayC2() {
	//	System.out.println("我是C1版的C2");
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques162C2 obj1 = new Ques162C1();
		Ques162I obj2 = new Ques162C1();
		
		Ques162C2 s = (Ques162C2) obj2;
		Ques162I t = obj1;
		
		t.displayI();
		s.displayC2();
		
		Ques162C1 objj = new Ques162C1();
		
		System.out.println(objj.c);
		

	}

}
