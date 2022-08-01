package com.tns.core;

public class AbstractDemo {

	public static void main(String[] args) 
	{
		Scooty Activa=new Scooty();
		Activa.noOfWheels();
		
	}

}

abstract class Vehicle            //no idea,partially implemented class//
{
	abstract void noOfWheels();          //abstract method
	
}

class Scooty extends Vehicle
{

	@Override
	void noOfWheels() {
		System.out.println(2);
		
	}
	
}