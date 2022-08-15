package com.tns.inheritance;
          //assignment
class fruit
{
	void accept()
	{
		System.out.println("Apple");
	}
}
class fruit1 extends fruit
{
	void print()
	{
		System.out.println("mango");
	}
}

class fruit2 extends fruit1
{
	void display()
	{
		System.out.println("banana");
	}
}



public class MultilevelInheritance1 {


	public static void main(String[] args) {
		fruit2 obj=new fruit2();
		obj.display();
		obj.accept();
		obj.print();
		
	}

}
