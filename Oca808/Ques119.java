package Oca808;

public class Ques119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interface I {
			void displayI();   //public abstract 可不写，接口默认
		}
		
		class C2 implements I{
			public void displayI() {
				System.out.println("implement displayI");
			}
			
			
			public void displayC2(){
			System.out.println("C2");
			}
		}
			
		class C1 extends C2 implements I {
			public void displayI() {
			System.out.println("C1");
			}
		}
		
			C2 obj1 = new C1();
			I obj2 = new C1();
			C2 s = obj1;
			I t = obj1;
			t.displayI();
			s.displayC2();
			

	}

}
