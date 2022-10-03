package com.test;

public class Statements {

	public int m1() {
		return 1;
	}
	
	public String m2() {
		return null;
	}
	
	public String m3() {
		return "Java";	
	}
	
	public static void m4() {
		System.out.println("return");
	}
	
	public static void main(String[] args) {
//		int a=10,b=20;
		
//	Control Statement	
		
//	if(a<b) {System.out.println("a is small");}
//	if(a<b) {System.out.println("a is small");}else {System.out.println("b is large");}
		
//	if(a<b && a>b) {
//		System.out.println("test 1");
//	}else if (a>b) {
//		System.out.println("tesr 2");
//	}else {
//		System.out.println("test 3");
//	}
	
//	if(a<b) {
//		System.out.println("11");
//		if (a==b) {
//			System.out.println("22");
//		}else {
//			System.out.println("33");
//		}
//	}else {
//		System.out.println("44");
//	}
	
//	Looping statement
		
//	for(int i=1;i<=5;i++) {
//		System.out.println(i);
//	}
		
//		int i=0;
//		while (i<5) {
//			System.out.println("akshay");
//			i++;
//		}
//		System.out.println("out of loop");
		
//		do {
//			System.out.println("bhavare");
//			i++;
//		}while (i<5);
//		System.out.println("out of loop");

//	jump Statement
		
//        for(int i=0;i<=5;i++) {
//        	System.out.println(i);
//        	if(i==3) {
//        		break;
//        	}
//        }
//        System.out.println("out of loop");
			
//		for(int i=0;i<5;i++) {
//			if(i==2) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		System.out.println("out of loop");
		
//		Statements s=new Statements();
//		s.m1();                     //    
//		System.out.println(s.m1()); // 1
//		int data=s.m1();
//		System.out.println(data);   // 1
//		System.out.println(s.m2()); // null
//		System.out.println(s.m3()); // Java 
//		Statements.m4();            // return

//		for(int i=0;i<5;i++) {
//			
//			if(i==3) {
//				return;
//			}
//			System.out.println(i);    //0,1,2
//		}
		
//		for(int i=0;i<5;i++) {
//			if(i==3) {
//				break;
//			}
//			System.out.println(i);   //0,1,2
//		}
		
		for(int i=0;i<5;i++) {
			if(i==3) {
				continue;				
			}
			System.out.println(i);   //0,1,2,4
		}
		
	}

}
