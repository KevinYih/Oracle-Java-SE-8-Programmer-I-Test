package Oca808;

public class Ques106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte b = 8;
		short s = 9;
		char c =7;
		int i=5;
		long l = 10;
		float f = 11;
		double d = 12;
		
		s =(short)c;
		c =(char)s;  // char and short can't turn to each other.
		
		b =(byte)s;
		
		i = c;
		
		char cc;
		boolean bb;
		float ff=0.0f;
		System.out.println("cc= " + ff);

	}

}
