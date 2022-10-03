package Oops;

public class Polymorphism {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism P=new Polymorphism();
//		P.m01();
		System.out.println(P.m01());               // R_T --> int ,String 
		
		
	}
	public int m01() {
		System.out.println("Poly");
//		String s="JAVA";
		int a=10;
		return a;
	}
}
