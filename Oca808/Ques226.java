package Oca808;

public class Ques226 {	

	static private int stock = 10; // declare as static
	static private int qty; // declare as static
	public void purchase(int q) {stock += q; this.qty = q;}
	public void sell(int q) {stock -= q; this.qty = q;}
	public static void printStock(String action ) { //declare as static
		System.out.println(action + ":" + qty + " items. Stock in Hand: " + stock);
	}
	public static void main (String[] args) {
		Ques226 k1 = new Ques226();
		k1.sell(5);
		Ques226.printStock("Sold");
		Ques226 k2 = new Ques226();
		k2.purchase(5);
		Ques226.printStock("Purchased");
	}

}
