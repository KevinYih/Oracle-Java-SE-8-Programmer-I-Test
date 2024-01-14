package Oca808;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Ques132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		
		//String s;
		if (arrList.removeIf( (String s) -> {return s.length() <= 2;})) {
		System.out.println(arrList); // [How, Are, You]
		//System.out.println(s+ "removed");
		}
	}
}
