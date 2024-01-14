package Oca808;

import java.util.List;
import java.util.ArrayList;
public class Ques127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> colors = new ArrayList<String>();
		colors.add("Green");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yelow");
		colors.remove(2);
		System.out.println(colors);
		
		colors.add(3,"Cyan");
		
		
		System.out.println(colors);
		
		colors.add(4,"AAA");
		System.out.println(colors);

	}
	
	public abstract class QQQ{
		
		public void haha() {};
		public abstract void hehe();
	}

}
