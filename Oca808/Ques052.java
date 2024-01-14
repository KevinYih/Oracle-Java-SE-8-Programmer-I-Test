package Oca808;

import java.util.*;

public class Ques052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] str1 = new String[2];
		for(String e : str1) {
			System.out.println("str1: " + e);
		}
		
		
		System.out.println(str1[0]);
		
		String[] str6 = {"1","2","3","4"};		
		str6[2] = str6[1].concat("hello" + "hehe");
		for(String e : str6) {
			System.out.println("str6: " + e);
		}
		
		
		
		System.out.println("***************");
		
		
		StringBuilder str2 = new StringBuilder(10);
		
		str2.append("heeeeeo");
		
		StringBuilder str3 = new StringBuilder("hello java 8");
		
		System.out.println(str3);

	}

}
