package Oca808;

public class Ques010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String 用equals，可以直接取值。
		//StringBuilder和StringBuff，需要toString，再用equals取值比较。
		
		String sp = new String("Java");
		String sp1 = new String("Java");
		System.out.println(sp.equals(sp1.toString()));
		System.out.println(sp.equals(sp));
		System.out.println(sp.equals(sp1));
		
		System.out.println("-------------------");
		
		StringBuilder sb = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		String s = new String("Java") ;
				
		System.out.println(sp.equals(sb.toString()));
		System.out.println(sb.equals(s));
		System.out.println(sb.equals(sb2));
		System.out.println(sb);
		System.out.println(sb2);
		
		System.out.println("-------------------");
		
		System.out.println(sb.toString());
		System.out.println(s.toString());
		System.out.println(sb);
		System.out.println(s);
		
		System.out.println("-------------------");
		System.out.println(sb.equals(s.toString()));
		System.out.println(sb.equals(s));
		System.out.println(sb.equals(sb2));
		
		
		if(sb.toString().equals(s.toString())) 
			System.out.println("Match 1");
		else if (sb.equals(s)) 
			System.out.println("Match 2"); 
		else 
			System.out.println("No Match");
		

	}

}
