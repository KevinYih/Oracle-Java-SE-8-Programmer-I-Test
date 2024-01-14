package Oca808;

public class Ques125a {

    private Long id;
    private String name;

    public Ques125a(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void test(){
        System.out.println("Outer "+this.id+"--"+this.name);
    }

    class Inner{
        private Long id;
        private String name;

        public Inner(Long id, String name) {
            this.id = id;
            this.name = name;
        }
        
//        public void test(){
//            System.out.println("Inner "+this.id+"--"+this.name);
//            System.out.println("my fater is");
//            //test(); // 会调用内部类的test()方法，无限循环报错
//            Outer.this.test();// 调用外部类方法
//        }
        
        public void test2(){
            System.out.println("Inner "+this.id+"--"+this.name);
            System.out.println("my fater is");
            Ques125a.this.test();
            //test(); // 两种方式皆可，调用外部类方法
        }
    }
    
    public static void main(String[] args) {
        Ques125a outer = new Ques125a(1L,"fater");
        Ques125a.Inner inner = outer.new Inner(2L,"son");
        inner.test2();
    }

}
