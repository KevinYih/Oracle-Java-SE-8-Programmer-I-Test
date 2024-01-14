package Oca808;

public class Ques201 {
	
	static int qty=3;
	static private int stock = 10;	
	public void purchase(int qty) { 
		System.out.println("stock目前purchase是多少" + stock);
		System.out.println("qty目前purchase是多少" + qty);
		stock += qty; 
		System.out.println("stock目前purchase是多少" + stock);
		System.out.println("qty目前purchase是多少" + qty);
	}
	public void sell (int qty) { 
		System.out.println("stock目前sell是多少" + stock);
		System.out.println("qty目前sell是多少" + qty);
		stock -= qty; 
		System.out.println("stock目前sell是多少" + stock);
		System.out.println("qty目前sell是多少" + qty);
	}
	public void printStock (String action) {
	System.out.println( action + ":" + qty + " items. Stock in Hand: " + stock); 
	// qty needs to be static variable to compile.
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("qty目前是多少" + qty);
		Ques201 k1 = new Ques201();
		k1.sell(5);
		k1.printStock("Sold");
		Ques201 k2 = new Ques201();
		k2.purchase(5);
		k2.printStock("Purchased");

	}

}
