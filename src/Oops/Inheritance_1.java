package Oops;
// Hierarchical Inheritance
class parentbank{
	void m() {
		System.out.println("m");
	}
}
class C1 extends parentbank{
	void m1() {
		System.out.println("m1");
	}
}
class C2 extends parentbank{
	void m2() {
		System.out.println("m2");
	}
}
class C3 extends parentbank{
	void m3() {
		System.out.println("m3");
	}
}

public class Inheritance_1 {
	
	public static void main(String[] args) {
		parentbank pb=new parentbank();
		pb.m();
		
		C1 c1=new C1();
		c1.m();
		c1.m1();
		
		C2 c2=new C2();
		c2.m();
		c2.m2();
		
		C3 c3=new C3();
		c3.m();
		c3.m3();
		
//		Multiple Inheritance --> not possible
//		hybrid Inheritance --> not possible
		
		
	
	}

}
