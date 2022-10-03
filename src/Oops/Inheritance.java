package Oops;
// Single level Inheritance	
// MultiLeval Inheritance
class parent1 {
	void m1() {
		System.out.println("m1 from parent1");
	}
}
class parent extends parent1{
	void m2() {
		System.out.println("m2 from parent");
	}
}
class child extends parent {
	void m3() {
		System.out.println("m3 from child");
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
//		parent p=new parent();
//		p.m1();
//		p.m2();
//		
//		parent1 p1=new parent1();
//		p1.m1();
////		p1.m2
		
		child c1=new child();
		c1.m1();
		c1.m2();
		c1.m3();
		
		parent p1=new parent();
		p1.m1();
		p1.m2();
//		p1.m3
		
		parent1 p11=new parent1();
		p11.m1();
//		p11.m2
//		p11.m3
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
