package Oca808;

import java.util.List;
import java.util.ArrayList;
public class Ques196 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Tech");
		arrayList.add("Expert");
		arrayList.set(0, "Java");		
		System.out.println(arrayList);	
		
		arrayList.forEach((a) -> a.concat("Forum"));		
		System.out.println(arrayList);		
		//arrayList.replaceAll(s -> s.concat("Group"));		
		//System.out.println(arrayList);	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");	
		
		ArrayList<Integer> numbers = new ArrayList<>();
        // 往数组中添加元素
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);
        // 所有元素乘以 10
        System.out.println("更新 ArrayList: ");       
        // 将 lambda 表达式传递给 forEach
        numbers.forEach((e) -> {  //forEach is akindof Enhanced for loop.
            e = e * 10;
            System.out.print(e + " ");
            System.out.println();
        });
        System.out.println("ArrayList: " + numbers);

	}

}
