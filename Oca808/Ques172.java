package Oca808;

public class Ques172 {
	
	
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is " + (x + y));
	}
		public static void doSum(double x, double y) {
		System.out.println("double sum is " + (x + y));
	}
		public static void doSum(float x, float y) {
		System.out.println("float sum is " + (x + y));
	}
		public void doSum2(float x, float y) {
		System.out.println("float sum is " + (x + y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		Integer b = 20;		
		doSum(10,20);
		doSum(10.0, 20.0);
		
		new Ques172().doSum2(5, 3);  //int可以向float转，但是double不能转为float。
		//所以不能写成doSum2(5.0, 3.0)

	}

}
