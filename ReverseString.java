package com.string;

import java.util.Scanner;

public class ReverseString {
	
	String name;
	
	String name1="";
	
	public void getString()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		name=sc.next();
		
		for(int i=name.length()-1;i>=0;i--)
		{
			name1=name1+name.charAt(i);
		}
		
		System.out.println(name1);
	}
	
	public static void main(String[] args) {
		
		ReverseString rs=new ReverseString();
		
		rs.getString();
		
		System.out.println("Reverse sucessfully");
	}

}
