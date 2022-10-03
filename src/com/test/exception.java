package com.test;

public class exception {

	public static void main(String[] args) {
		System.out.println("test1");
			
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
//		try {
//			int a=100/0;       // ArithmeticException
////			int a=100/2;       
//			System.out.println(a);  //50
//		}catch (Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("I am finally");
////			closing operations
//		}
		System.out.println("test2");

	}

}
