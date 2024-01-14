package Oca808;

import java.util.ArrayList;

public class Question12 {
	
	public static void main(String[] args) {
		ArrayList<String> sites = new ArrayList<String>();  ////////////
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);
        System.out.println(sites.size());
        System.out.println(sites.get(2));
        
        //@SuppressWarnings("rawtypes")
		ArrayList<Patient> ps = new ArrayList<Patient>();   ////////////
		
		Question12 q12 = new Question12();
		
        Question12.Patient p2 = q12.new Patient("Mike");
        Question12.Patient p3 = q12.new Patient("Jake");
        ps.add(p2);
        ps.add(p3);
        int f = ps.indexOf(p3);
        System.out.println("......................");
        System.out.println(ps.size());
        System.out.println(f);
        System.out.println(ps);
        System.out.println(ps.get(1).name);
        //insert code here
        if(f >= 0){
            System.out.println("Mike Found");
        }        
	}
	
	class Patient{
	    String name;
	    public Patient(String name){
	        this.name=name;
	    }
	}
	
	
	
	
	/*
	 * import java.util.ArrayList; // 引入 ArrayList 类

ArrayList<E> objectName =new ArrayList<>();　 // 初始化
E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型。
objectName: 对象名。
ArrayList 是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。
	 */
	

}
