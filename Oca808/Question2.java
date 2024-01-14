package Oca808;

public class Question2 {

	    public static void main(String[] args) {
	        String product = "Pen";
	        product.toLowerCase();//toLowerCase() 方法将字符串转换为小写。
	        
	        product = product.concat("Box".toLowerCase());   //concatt合并多个字符串
	        //product.concat("Box");   //concatt合并多个字符串
	        System.out.println(product);
	        System.out.println(product.substring(0,3));//substring(4,6)该子字符串始于指定索引处的字符，一直到此字符串索引末尾
	    }
}
