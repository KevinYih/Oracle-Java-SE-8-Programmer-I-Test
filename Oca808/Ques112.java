package Oca808;



public class Ques112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data [] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;

		for (int e: data) {
			if (e != key) {
				continue;
				//count ++;     //compliation fails, unreachable.
			}
			count ++;
		}
		System.out.print(count + " Found");
		


	}

}
