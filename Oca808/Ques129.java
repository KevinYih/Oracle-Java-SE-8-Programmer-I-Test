package Oca808;

public class Ques129 {
	int x;
	private int y;
	public Ques129 (int x, int y) {
		initialize(x, y);
		}
	public void initialize (int x, int y) {
		this.x = x * x;
		this.y = y * y;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 5;
		Ques129 obj = new Ques129(x, y);
		System.out.println(x + " " + y);
		System.out.println(obj.x + " " + obj.y);
		
		String[] arr = {"abc", "123"};
		
		

	}

}
