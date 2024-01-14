package Oca808;

public class Ques019 {
	
	void readCard (int cardNo) //throws Exception 
	{
		System.out.println("Reading Card");
	}
	
	void checkCard (int cardNo) throws RuntimeException 
	{
		int a=0;
		int b=3;
		int c =b/a;
		System.out.println("Checking Card");
	}
		

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Ques019 ex = new Ques019();
		int cardNo = 12344;
		
	
		ex. readCard (cardNo) ;
		ex. checkCard (cardNo);
		
		
		/*try {
		ex. readCard (cardNo) ;
		ex. checkCard (cardNo);
		}catch(Exception e) {
			System.out.println(e);
		}
		*/
		
		System.out.println("I'm running");

	}

}
