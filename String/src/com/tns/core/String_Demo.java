package com.tns.core;

public class String_Demo {

	public static void main(String[] args) {
		String str=new String("Mohammedi");
		                         //string objects are immutable//
		
		str.concat("SK");
		System.out.println(str);
		
		                     //String s= str.concat("SK");//
		                     //System.out.println(s);//
		
		//StringBuffer str=new StringBuffer("Mohammedi");//
				                                    //StringBuffer class is mutable//
	    //str.append("SK");//
		
		
	}

}
