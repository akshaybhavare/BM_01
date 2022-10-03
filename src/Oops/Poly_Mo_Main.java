package Oops;

public class Poly_Mo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main_1");
		main("Java");                   // right (2)
		main(30);                       // right (2)
////		Poly_Mo_Main PM=new Poly_Mo_Main();   // no need to create object
//		Poly_Mo_Main.main("java");        // right   (1)
//		Poly_Mo_Main.main(20);            // right   (1)
////		PM.main("JAVA");                     // Wrong
////		PM.main(10);                         // Wrong
		
	}
	public static void main(String name) {
		// TODO Auto-generated method stub
		System.out.println("Main_2");
	}
	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("Main_3");
	}
}
