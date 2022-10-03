package com.test;

public class STRING {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("java");
		
		String s3="java";
		String s4="java";
		
		System.out.println(s1==s2);        //false
		System.out.println(s1.equals(s2)); //true     content same
      
		System.out.println(s3==s4);        // true
		System.out.println(s3.equals(s4)); // true
		
		System.out.println(s2==s3);  // false
		System.out.println(s2==s4);  // false
		System.out.println(s2.equals(s3)); // true
		System.out.println(s2.equals(s4)); // true	
	}

}
