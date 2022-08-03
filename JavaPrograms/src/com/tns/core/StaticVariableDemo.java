package com.tns.core;

        //static variable concept

public class StaticVariableDemo 
{
	String name;    //object bound
	int roll;       //object bound
	static String coll="PDA College of Engg";    //class bound
		
     void display()
   {
	   System.out.println(name+" "+roll+" "+coll);
    }
     
     
	public StaticVariableDemo(String name,int roll) 
	{
		super();
	    this.name=name;
	    this.roll=roll;	
	}
	
	
	public static void main(String[] args)
	{
		StaticVariableDemo s1=new StaticVariableDemo("Riya",1);
		
		StaticVariableDemo s2=new StaticVariableDemo("Reeta",2);
		
		s1.display();
		s2.display();
		

	}
}
