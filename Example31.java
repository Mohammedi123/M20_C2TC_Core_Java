package com.tns.intro;

import java.util.Scanner;

public class Example31 {

	public static void main(String[] args) {
		{
			
			Scanner scan=new  Scanner(System.in);
			System.out.println("Enter a Character:");
			char c=scan.next().charAt(0);
			System.out.println("Entered Character is :"+c);
			scan.close();
		}
		

	}

}
