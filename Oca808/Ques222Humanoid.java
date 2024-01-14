package Oca808;

public class Ques222Humanoid extends Ques222Robot{
	public void speak(String s) {
		System.out.println(s);
	}
	public void process() {
		System.out.println("Helping...");
	}
	
	public static void main(String[] args) {
		Ques222Humanoid mm = new Ques222Humanoid();
		mm.process();
		mm.speak("Done");
		
	}

}
