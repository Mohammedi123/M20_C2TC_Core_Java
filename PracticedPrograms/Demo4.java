package com.tns.java;

public class Demo4 
{
	int a;
	int b;
	Demo4()
	{
		a=20;
		b=40;
	}
	Demo4 accept()
	{
		return this;
	}
	void print()
	{
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		
	}

	public static void main(String[] args) {
		Demo4 e=new Demo4();
		e.print();
		

	}

}
