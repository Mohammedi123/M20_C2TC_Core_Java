package com.tns.core;

public class Example1 {

	public static void main(String[] args) 
	{
		
		String str="Mohammedi";
		System.out.println(str);
		
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.length());
		
		System.out.println(str.trim());
		
		System.out.println(str.equalsIgnoreCase("MOHAMMEDI"));
        System.out.println(str.equals("MOHAMMEDI"));
        

		System.out.println(str.replace('e','a'));
		
		System.out.println(str.substring(2));        //substring method1
		System.out.println(str.substring(2,7));      //          method2
		
		
		

	}

}
