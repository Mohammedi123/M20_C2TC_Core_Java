package com.tns.java;

class Parent
{
	int a;
	void print(int a)
	{
		this.a=a;  //this keyword
	}
	void display()
	{
		System.out.println("This value of a is:"+a);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.print(10);
		p.display();

	}

}
