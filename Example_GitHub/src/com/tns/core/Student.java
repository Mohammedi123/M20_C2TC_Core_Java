package com.tns.core;

public class Student
{
	int roll;
	String name;
	String college;
	
	
	public Student(int roll, String name, String college) {
		super();
		this.roll = roll;
		this.name = name;
		this.college = college;
	}

	void display()
	{
		System.out.println(roll +" " + name+" "+college);
	}

	public static void main(String[] args)
	{
		Student s1=new Student(1,"riya","BBM");
		Student s2=new Student(2,"abc","KBNCE");
		s1.display();
		s2.display();
	}

}
