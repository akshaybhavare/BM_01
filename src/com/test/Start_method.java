package com.test;

public class Start_method {

	public void m1() {
		System.out.println("m1");
	}
	public int m2() {
		return 0;	
	}
	public static void m3() {
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		Start_method method=new Start_method();
		method.m1();              // m1
	//	method.m2();              //
		int data=method.m2();     
		System.out.println(data); // 0
		Start_method.m3();        // m3
		
	}

}
