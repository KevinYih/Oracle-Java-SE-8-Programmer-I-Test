package Oca808;

public class Ques139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][4];
		arr[0] = new int[] { 1, 3, 5, 7 };
		arr[1] = new int[] { 1, 3 };
		
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		
		for (int[] a : arr) {
			for (int i=0; i < arr.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}		


	}

}
