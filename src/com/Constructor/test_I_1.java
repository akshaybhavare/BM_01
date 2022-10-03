package com.Constructor;
class P1{
	P1(){
		System.out.println("parent constructor");
	}
	P1(int x){
		System.out.println("parent overload constructor");
	}
}
class C1 extends P1{
	C1(){
		super(0);
		System.out.println("child constructor");
	}
	C1(int x,int y){
		super(x);
		System.out.println("child ovreload constructor");
	}
}
public class test_I_1 {

	public static void main(String[] args) {
		C1 c=new C1(10,20);
		

	}

}
