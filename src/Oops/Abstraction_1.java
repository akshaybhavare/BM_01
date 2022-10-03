package Oops;

public class Abstraction_1 extends Abstraction {

	public static void main(String[] args) {
		Abstraction_1 A1=new Abstraction_1();
		A1.loan();
		A1.methodM1();
		A1.methodM2();
		
	}

	@Override
	void loan() {
		System.out.println("8.5");
		
	}

	@Override
	void methodM1() {
		System.out.println("test");
		
	}




	

}
