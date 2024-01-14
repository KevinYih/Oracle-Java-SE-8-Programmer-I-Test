package Oca808;

public class Ques018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String shirts[][] =new String[2][2];
		shirts[0][0]="red";
		shirts[0][1]="blue";
		shirts[1][0]="small";
		shirts[1][1]="medium";
		
		for(String[] c : shirts) {
			System.out.println(c);
			for(String s :c) {
				System.out.println(s);
			}
		}
		
		String[] s1 = {"red", "blue"};
		for(String ss :s1) {
			System.out.println(ss);
		}

	}

}
