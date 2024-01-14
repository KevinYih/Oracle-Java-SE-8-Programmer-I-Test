package Oca808;
import java.util.*;

public class Question5 {
	
	public class Mid{
		public int findMid(int n1, int n2) {
			System.out.println("haha");
			return (n1+n2)/2;			
		}
	}
	
	public class Calc extends Mid{
		
		//int n3 = super.findMid(n1, n2);
		
		public static void main(String[] args) {
			int n1 = 22;
			int n2 = 2;
			System.out.println("haha");
			///
			Question5 q5 = new Question5();
			Question5.Calc c = q5.new Calc();
			
			int n3 = c.findMid(n1, n2);
			///
			System.out.println(n3);
			

			
			
		}
		
	}	
}
