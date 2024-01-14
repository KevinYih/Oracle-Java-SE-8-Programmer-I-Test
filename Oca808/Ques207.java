package Oca808;

public class Ques207 {  ///要点：equals只用于String类比较内容

	String s;
	public boolean equals (Ques207 str) {
		return this.s.equalsIgnoreCase(str.toString());
	}
	Ques207(String s){
		this.s = s;
	}	
	
	public static void main(String[] args) {
		String s1 = "Moon";
		
		System.out.println(s1 == "Moon");
		System.out.println(s1.equals("Moon"));
		
		Ques207 s2 = new Ques207("Moon");
		Ques207 s3 = new Ques207("Moon");
		s2 = s3;
		System.out.println(s2.equals(s3));
		
		if((s1 == "Moon") && (s2.equals("Moon"))) {
			System.out.println("A");
		} else {
			System.out.println("B");
		} 
		
		if((s1 == "Moon") && (s2.equals(s3))) {
			System.out.println("A");
		} else {
			System.out.println("B");
		} 
		
		if (s1.equalsIgnoreCase(s2.s)) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}
