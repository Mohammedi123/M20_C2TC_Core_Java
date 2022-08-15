package com.tns.staticblock;

public class Static3 {
	static int x;
	static String str;
	static      //static block
	{
		x=10;
		str="Capgemini";
		
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(str); //no need of creating obj because static
		

	}

}
