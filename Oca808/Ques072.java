package Oca808;

public class Ques072 {
	int a =2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques072 soo = new Ques072();
		soo.soStuff();
		
	}
	
	public void soStuff() {
		try {
			
			int a =3;
		}
		finally {
			
			{
				int a = 5;
			}
			
			System.out.println("finally a:" + a);
		}
		System.out.println("blockout a:" + a);
	}
}
