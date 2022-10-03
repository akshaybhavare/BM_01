package com.test;

public class STRING_1 {

	public static void main(String[] args) {
		String s="Core CJava";
		System.out.println(s.length());       // 10
		System.out.println(s.charAt(0));      // C
		System.out.println(s.toLowerCase());  // core cjava
		System.out.println(s.toUpperCase());  // CORE CJAVA
		System.out.println(s.contains("J"));  // true
		System.out.println(s.contains("3"));  // false
		System.out.println(s.equalsIgnoreCase("core Cjava")); // true
		System.out.println(s.equals("Core CJava"));  // true
		System.out.println(s.equals("core CJava"));  // false
		System.out.println(s.replace('v', 'V'));     // Core CJaVa
		System.out.println(s=s.concat("class"));     //Core CJavaclass
		System.out.println(s.indent(4));       // starting la Space det jail //____Core Java
		System.out.println(s.indexOf('C'));    //  0
		System.out.println(s.indexOf('c'));    // -1
		System.out.println(s.indexOf('C',1));  // 5   (1 min's 1 sodun det)
		System.out.println(s.indexOf('e',1));  //  3
		System.out.println(s.indexOf('C',s.indexOf('C')+1));  //5
		
//		String s1="  java  ";
//		System.out.println(s1.trim());  // java
		
//		String browser="chrome";
//		if (browser.equalsIgnoreCase("Chrome")) {
//			System.out.println("Execute scrit on Chrome");   // Execute scrit on Chrome
//		}else if(browser.equalsIgnoreCase("Firefox")) {
//			System.out.println("Execute scrit on Firefox");
//		}
		
//		String emailPassword= "abc@gmail.com#123456";
//		String a[]=emailPassword.split("#");
//		System.out.println(a[0]);      // abc@gmail.com
//		System.out.println(a[1]);      // 123456
		
//		String x="Hello";
//		String y="Akshay";
//		int p=100;
//		int q=200;
//		System.out.println(x+y);       // HelloAkshay
//		System.out.println(p+q);       // 300
//		System.out.println(x+y+p+q);   // HelloAkshay100200
//		System.out.println(x+y+(p+q)); // HelloAkshay300
//		System.out.println(p+q+x+y);   // 300HelloAkshay
//		System.out.println((p+q)+x+y); // 300HelloAkshay
//		System.out.println(x+p+y+q);   // Hello100Akshay200
//		System.out.println(x+(p+q)+y); // Hello300Akshay
//		System.out.println(p+x+q+y);   // 100Hello200Akshay
//		System.out.println(p+x+y+q);   // 100HelloAkshay200
		
//		String S="Bhavare";
//		String reverse="";
//		for(int i=S.length()-1;i>=0;i--) {
//			reverse = reverse+ S.charAt(i);
//		}
//		System.out.println(reverse);    // eravahB
			
//		StringBuffer sb=new StringBuffer("Akshay");
//		System.out.println(sb.reverse());
		
	}

}
