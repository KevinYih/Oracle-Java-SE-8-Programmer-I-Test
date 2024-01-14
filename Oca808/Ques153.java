package Oca808;

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Ques153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));  //普通数组转为动态数组
		if (arrList.removeIf(s -> { System.out.print(s); return s.length() <=1;})) {
		System.out.println(" removed");	
		}
		
		System.out.println("/////////////1/////////////");
		
		arrList.removeIf(s -> { System.out.print(s); return s.contains("Ho");});
		System.out.println("/////////////2/////////////");
		
		System.out.println(arrList);
		
		for(String e : arrList) {
			System.out.println(e);
		}
		
		System.out.println("/////////////3/////////////");
		
		if (arrList.removeIf(s -> { System.out.print(s); return s.contains("OO");})) {
			System.out.println(" removed");	
		
		}
	}
}
