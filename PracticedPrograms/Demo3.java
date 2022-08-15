package com.tns.java;

public class Demo3
{
	void accept(Demo3 obj)
	{
		System.out.println("Welcome to C2TC Prgm");
	}
	void print()
	{
		accept(this);
	}

	public static void main(String[] args) {
		Demo3 e=new Demo3();
            e.print();
	}

}
