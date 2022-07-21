package com.tns.core;

public class Exp {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

		finally                //must execute          
		{
			System.out.println(5);
		}
		
		System.out.println(6);      //OUTSIDE BLOCKS
	}

}
