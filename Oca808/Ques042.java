package Oca808;

public class Ques042 {
	public static String maskCC(String creditCard){
		String x = "XXXX-XXXX-XXXX-";
		
		StringBuilder sb = new StringBuilder(creditCard);
		
		return x +sb.substring(15,19);
		
		
		
		//return x + creditCard.substring(15,19);    //B
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maskCC("1234-5678-9101-1121"));
		

	}

}
