package Oca808;

public class Ques160Manager extends Ques160Employee {
	//public int budget;
	public int salary;
	public void work() {
		//System.out.println("I am  an Manager, my budget is:" + this.budget);
		System.out.println("I am  an Manager, my salary is:" + this.salary);
		System.out.println("I am  an Manager, my employ's budget is:" + super.budget);
		System.out.println("I am  an Manager, my employ's salary is:" + super.salary);
	}	
}
