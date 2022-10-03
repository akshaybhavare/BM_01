package com.test;

public class Starting {
	
	static int a=10;  // static variable
	       int b=20;  // non static variable, class variable, Instance variable
	
	
	public static void main(String[] args) {
		   int c=30;  // local variable
		   
		   System.out.println(c);          //30
		   System.out.println(Starting.a); //10
		   
		   Starting s=new Starting();
		   System.out.println(s.b);        //20    
		   
		   // Primitive D_T
		   boolean d = false;
		   System.out.println(d);   //false, not defines      
		   char e = 0;
		   System.out.println(e);   //      , 2 byte   
		   byte f = 0;
		   System.out.println(f);   // 0,     1 byte
		   short g = 0; 
		   System.out.println(g);   // 0,     2 byte
		   int h = 0;
		   System.out.println(h);   // 0,     4 byte
		   long i = 0;
		   System.out.println(i);   // 0,     8 byte
		   float j = 0;
		   System.out.println(j);   // 0.0,   4 byte
		   double k = 0;
		   System.out.println(k);   // 0.0,   8 byte
		   
		   // non primitive D_T
		   char l ='a';            //         2 byte    
		   System.out.println(l);		   
		   String m = "akshay";    //         12 byte
		   System.out.println(m);
		   String n="bhavare";     //         14 byte   
		   System.out.println(n);
		   
	}

}
