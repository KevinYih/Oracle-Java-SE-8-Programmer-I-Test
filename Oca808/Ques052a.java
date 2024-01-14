package Oca808;

public class Ques052a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a method (concat()) can not be called on an object containing null.
		//The JVM throws a null pointer exception 
		//because a method (concat()) is called on an object containing null.
		
		String[] strings = new String[2];
		//strings[0]="hello";
		//strings[1]="java";
		int idx = 0;
		for(String s : strings){
			strings[idx] = strings[idx] + (" element " + idx);
			
			
			//strings[idx].concat(" element " + idx);  //null就是空指针，怎么调？
			idx++;
		}
		for (idx = 0; idx < strings.length; idx++){
			System.out.println(strings[idx]);
		}

	}

}
