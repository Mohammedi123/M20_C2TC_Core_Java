package com.tns.operator;

public class Switch_case {

	public static void main(String[] args) 
	{
		
		String name = "mhmdi";

		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("Mhmdi");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("abc");
			break;
		default:
			System.out.println("Invalid entry");
			break;
	}
}
}


