package Oca808;

public class Ques054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Java SE8");
		StringBuilder s2 = new StringBuilder("Java SE8");
		StringBuffer s3 = new StringBuffer("Java SE8");
		String s4 = "Java SE8";		
		System.out.printf("%s\n%s\n%s\n%s\n",s1,s2,s3,s4);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");		
		
		System.out.println("hello" + new String("Java SE8"));
		System.out.println("hello" + new StringBuilder("Java SE8"));
		System.out.println("hello" + new StringBuffer("Java SE8"));
		System.out.println("hello" + "Java SE8");
		

	}

}
