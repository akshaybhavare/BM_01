package com.Constructor;
class PPP{
	final public void m1() {
		System.out.println("m11");
	}
	public void m2() {
		System.out.println("m22");
	}	
	protected void m3() {
		System.out.println("m33");
	}
	void m4() {
		System.out.println("m44");
	}
	private void m5() {
		System.out.println("m55");
	}
	
}
public class test_I_3 extends PPP{

	public static void main(String[] args) {
		test_I_3 T=new test_I_3();
		T.m1();
		T.m2();
		T.m3();
		T.m4();
//		t.m5
		
		
		
	}

}
