package Oca808;

public class Ques134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques134Student[] students = new Ques134Student[3];
		
		students[0] = new Ques134Student("Tim");
		students[1] = new Ques134Student("Richard");
		//students[2] = new Ques134Student("Donald");
		
		
		System.out.println(students[2]);
		
		//Yes, printing null is OK, but calling null will result in NullPointerException. 
		//s.name is not just printing, it is calling it.
		
		for(Ques134Student s : students) {
			System.out.println(" " + s.name);
		}
	}
}



