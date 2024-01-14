package Oca808;

public class Ques219 {
	
	public static void doSum(double x, double y) {
		System.out.println("double sum is: " +(x + y));
	}
	public static void doSum(float x, float y) {
		System.out.println("float sum is: " +(x + y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSum(10 , 20);
		doSum(10. , 20.);
		doSum(10f , 20f);
		doSum(10. , 20f);
		
		

	}

}
