package Oca808;

public class Ques160Director extends Ques160Manager{
	public int stockOptions;
	static int count;
	public void work() {
		System.out.println("I am  an Director");
	}
	public static void play() {
		System.out.println("I am  an player: " + count);
	}
	
	public void workD() {
		System.out.println("workD");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques160Employee employee = new Ques160Employee();
		Ques160Employee manager = new Ques160Manager();
		Ques160Employee director = new Ques160Director();
		employee.salary = 200;
		employee.budget = 500;
		
		employee.work();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		manager.salary = 22;		
		manager.budget = 33;		
		
		manager.work();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		
		director.salary = 200;
		director.work();
		
		Ques160Director.play();
		play();
		
		//employee.
		

	}

}
