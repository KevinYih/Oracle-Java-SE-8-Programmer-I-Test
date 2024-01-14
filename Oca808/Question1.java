package Oca808;





public class Question1 {
	static int count = 0;
	int i = 0;	
	
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
			System.out.println("changeCount: " + i +", " + count);
		}		
	}
	
	public static void main(String[] args) {
		Question1 check1 = new Question1();
		Question1 check2 = new Question1();
		
		check1.changeCount();
		System.out.println(check1.i);
		check2.changeCount();
		System.out.println(check2.i);
		
		System.out.println(check1.count + " : " + check2.count);
		
		String a = "penbox";
		System.out.println(a.substring(4, 6));
		
	}	
}
