package Oca808;

public class Ques025 {
	
	String name;
	Boolean contract;
	double salary;
	Ques025(){
	// Line n1 - Option C
		name = "Joe";
		contract = true;   //在java中boolean值只能是true和false，而不能用0和1代替，并且一定要小写。
		salary = 100.0;		
		
	/* this.name = new String("Joe");
	this.contract = new Boolean(true);
	this.salary = new Double(100); */
	}
	public String toString() {
	return name + " : " + contract + " : " + salary;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques025 e = new Ques025();
		// Line n2 - Option A
		/* e.name = "Joe";
		e.contract = true;
		e.salary = 100; */
		// Line n2 - Option B
		/* this.name = "Joe";
		this.contract = true;
		this.salary = 100; */
		System.out.print(e);
		

	}

}
