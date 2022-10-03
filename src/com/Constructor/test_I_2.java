package com.Constructor;
class PP{
	final public void m1() {
		System.out.println("m1");
	}	
}
class CC extends PP{
	public void m2() {
		System.out.println("m2");
	}	
}
	
public class test_I_2 {

	public static void main(String[] args) {
		CC c=new CC();
		c.m1();
		c.m2();
		

	}

}
