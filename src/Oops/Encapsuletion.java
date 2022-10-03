package Oops;

public class Encapsuletion {
//	1. declare variable as a private
	
	private double balance ; // 100.0
	
//	2. genrate public getter and setter method
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = this.balance+balance;
	}
	
	public static void main(String[] args) {
		Encapsuletion E=new Encapsuletion();
		E.setBalance(100);    
		E.setBalance(200);
		E.setBalance(-50);
		System.out.println(E.getBalance());  // 100.0,300.0,250.0
	}


	

}
