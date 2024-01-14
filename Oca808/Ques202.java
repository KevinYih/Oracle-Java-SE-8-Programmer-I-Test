package Oca808;

public class Ques202 {
	public void display(int x, int y) {
		this.display(x);
		display(x);
		display(y);
		this.display(y);
		//super.display(y);
	}
	
	public void display(int x) {
		System.out.println("Child" + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques202 obj = new Ques202();
		
		obj.display(2,3);
		
		int a =5;
		int b =8;
		
		if((true)&&(a <= b)) {
			System.out.println("HAHA");
		}
		
		final int LONF_SDF =10;

	}

}
