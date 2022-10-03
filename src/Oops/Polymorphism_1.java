package Oops;

public class Polymorphism_1 {
// method overloading
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_1 P1=new Polymorphism_1();
		System.out.println(P1.M01(10));
		System.out.println(P1.M01(20, 30));
		P1.M01(10, "akshay");
		P1.M01("Bhavare", 20);
		P1.M02(30);
		P1.M02("JAVA");
	}
//	no of arguments different
	public int M01(int x) {
		int a=x;
		return a;	
	}
	public int M01(int x,int y) {
		int a=x+y;
		return a;
	}
	
//	Sequence of arguments different
	public void M01(int x,String y) {
		System.out.println("test");	
	}
	public void M01(String x,int y) {
		System.out.println("tesr1");	
	}
	
//	Type of arguments Different
	
	public void M02(int x) {
		System.out.println("M01_i");	
	}
	public void M02(String x) {
		System.out.println("M02_S");	
	}
	
}
