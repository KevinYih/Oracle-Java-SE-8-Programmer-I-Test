package Oca808;

public class Ques101 {
	
	String name;
	int age =25;
	
	Ques101(String name){
		setName(name);
	}
	
	public Ques101(String name, int age) {
		this(name);    //Ques101(name) ????
		setAge(age);
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public void setAge(int age) {
		this.age = age;
	}	

	
	public String show() {
		return name + " " + age;		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques101 q1 = new Ques101("Jesse");
		Ques101 q2 = new Ques101("Walter", 52);
		
		System.out.println(q1.show());
		System.out.println(q2.show());
		
		
		int numbers[];
		numbers = new int[4];
		numbers[2] = 10;
		numbers[3] = 20;
		
		for(int e : numbers) {
			System.out.println(e);
		}	

	}

}
