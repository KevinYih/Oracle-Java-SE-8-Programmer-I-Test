package Oca808;

public class Ques223 {
	String myStr = "9009";
	int myNum =0;   ///////////
	public void doStuff (String str) {
			
		try {
			int myNum =0; ////////////
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch (NumberFormatException ne) {
			System.err.println("Error");
		}
		System.out.println("myStr: " + myStr + ", myNum: " + myNum);
	}
	
	public static void main (String[] args) {
		Ques223 obj = new Ques223();
		obj.doStuff("7007");
	}

}
