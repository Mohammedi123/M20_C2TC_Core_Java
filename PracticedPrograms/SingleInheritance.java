package com.tns.inheritance;

	class Parent
	{
		void print()
		{
			System.out.println("Hellow,what's going on?");
		}
	}
	class Child extends Parent
	{
		void display()
		{
			System.out.println("Child class");
		}
	}
	
	public class SingleInheritance 
	{

	

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		c.print();
		

	}

}
