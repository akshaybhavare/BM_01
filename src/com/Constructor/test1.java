package com.Constructor;

public class test1 {
	
	test1 (){
		System.out.println("Hello");
	}
	
	String name;
	int id;
	
	public test1 (String City, int Pincode){
		this.name=City;
		this.id=Pincode;
	}
	
	public static void main(String[] args) {
		test1 t=new test1();  // Hello
		test1 t1=new test1();  // Hello
		
		test1 t3=new test1();  // Hello
		System.out.println(t3.name);  // null
		System.out.println(t3.id);    // 0
		
		test1 t4=new test1("ABC",1);  
		System.out.println(t4.name);  // ABC
		System.out.println(t4.id);    // 1
		
		
		
		
		
		
	}

}
