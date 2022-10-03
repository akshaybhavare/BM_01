package Oops;
// method R_T Covariant must 
public class Poly_Parent1 {
	protected Object mm01() {
		System.out.println("i Am mm01 from parent1");
		return null;
	}
}
class Child1 extends Poly_Parent1 {
	public String mm01() {
		super.mm01();
		System.out.println("i Am mm01 from Child");
		return null;
	}
}