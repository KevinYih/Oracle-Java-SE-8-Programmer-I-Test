package Oca808;

public class Ques007Vehicle {
	String type = "433W";
	int maxSpeed = 1001;
	Ques007Vehicle(String type, int maxSpeed){ //Construtor da classe Pai
		System.out.printf("调用vehicle双参\n");
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
	Ques007Vehicle(){
		System.out.printf("调用vehicle无参\n");
	}
}
