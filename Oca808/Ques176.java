package Oca808;

public class Ques176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans=0;
		int[] arr = {1,2,3};
		
		try {
			int num = 10;
			int div = 0;
			ans = num / div;    //两个异常
			num = arr[3];
			} catch (ArithmeticException ae) {  //先符合这个，后面的cathc就不执行了
			ans = 3; // line n1
			System.out.println("Ex ae");
			} catch (Exception e) {
			System.out.println("Invalid calculation");
			System.out.println("Ex e");
			}
			System.out.println("Answer = " + ans); // line n2
			
			int idx = 0;
			
			
			while(idx<2) {
				idx ++;
			}
			
			System.out.println(idx);
			
			idx = 0;
			do {
				idx++;
			}while(idx<2);
			System.out.println(idx);
			
			
			switch(3) {
			
			case 1:
			case 2: System.out.println("优秀"); 
			case 3 : System.out.println("还行"); 
			
			}
			
			
	}
}
