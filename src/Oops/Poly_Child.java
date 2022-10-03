package Oops;

public class Poly_Child extends Poly_Parent{

	public static void main(String[] args) {
		Poly_Parent P=new Poly_Parent();
		P.m0011();  // from parent m0011

		Poly_Parent P1=new Poly_Child ();       // Upcasting
		P1.m0011(); //  from child m0011
		
		Poly_Child C=new Poly_Child ();
		C.m0011();  // from child m0011
		
//		Poly_Child C1=new Poly_Parent();
//		C1.m0011();
			
	}  
	public void m0011() {
		System.out.println("from child m0011");
	}


}
