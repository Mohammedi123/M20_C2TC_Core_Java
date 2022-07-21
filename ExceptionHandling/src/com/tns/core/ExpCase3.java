package com.tns.core;

public class ExpCase3 {

	public static void main(String[] args) {
		
			
			try
			{
				System.out.println(1);
				System.out.println(2/0);
				System.out.println(3);
				
			}
			            //NO catch block
			
			

			finally                //PRIVILEGED        
			{
				System.out.println(5);
			}
			
			System.out.println(6);      //OUTSIDE BLOCKS
		}

	

}
