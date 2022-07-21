package com.tns.core;

public class ExpCase2 {

	public static void main(String[] args) {
		
			
			try
			{
				System.out.println(1);
				System.out.println(2/0);
				System.out.println(3); //could not get executed goes directly to catch block
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				     //System.out.println("I M CATCH");
				
			}

			finally                //must execute          
			{
				System.out.println(5);
			}
			
			System.out.println(6);      //OUTSIDE BLOCKS
		}

	

	}


