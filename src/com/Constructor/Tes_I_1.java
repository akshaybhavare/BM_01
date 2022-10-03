package com.Constructor;
class P{
	P(){
		System.out.println("Parent Constructor");
	}
	P(int X){
		System.out.println("Parent Overload Constructor");
	}
}
class C extends P{
	C(){
		
		System.out.println("Child Constructor");
		
	}
}
public class Tes_I_1 {

	public static void main(String[] args) {
		C c=new C();
		

	}

}
