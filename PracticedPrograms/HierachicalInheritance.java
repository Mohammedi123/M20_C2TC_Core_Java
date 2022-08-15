package com.tns.inheritance;
class Vehicle
{
	void print()
	
	{
		System.out.println("vehicle name");
	}
}

class Car extends Vehicle
{
	void display()
	
	{
		System.out.println("Mercedes-Banz");
	}
}

class Bike extends Vehicle
{
	void display()
	
	{
		System.out.println("R15");
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		{
			Bike b=new Bike();
			Car c=new Car();
			b.display();
			c.display();
		}

	}

}
