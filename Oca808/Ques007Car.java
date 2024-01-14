package Oca808;

public class Ques007Car extends Ques007Vehicle{
	
	
	String trans;
	Ques007Car(String trans){ //line n1
		super();
		this.trans = trans;
	}
	Ques007Car(String type, int maxSpeed, String trans){
		super(type, maxSpeed); //line n2
		this.trans = trans;
	}
	public static void main(String[] args) {
		Ques007Car c1=new Ques007Car("Auto");
		Ques007Car c2=new Ques007Car("4W", 150, "Manual");
		System.out.println(c1.type + " " +c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " +c2.maxSpeed + " " + c2.trans);

	}

}
