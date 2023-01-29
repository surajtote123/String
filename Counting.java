package com.string;

import java.util.Scanner;

public class Counting {
	
	String name;
	
	int alpha=0;
	
	int vowels=0;
	
	int num=0;
	
	int space=0;
	
	public void getCounting()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the sentense");
		name=sc.nextLine();
		
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			
			/*if((c=='a' || c=='e'  || c=='i' || c=='o' || c=='u') || (c=='A' || c=='E' || c=='I' || c=='O' || c=='U'))
			{
				vowels++;
				
			}*/
			
			
			
			
			
			 if(c>='0' && c<='9')
			{
				num++;
				
			}
			
			
			
			
			
			else if((c>='a') && (c<='z') || (c>='A') && (c<='Z'))
			{
				alpha++;
				
			}
			
			else
			{
				space++;
			}
			
			
		}
		
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			
			if((c=='a' || c=='e'  || c=='i' || c=='o' || c=='u') || (c=='A' || c=='E' || c=='I' || c=='O' || c=='U'))
			{
				vowels++;
				
			}
		}
		
		System.out.println("Total alphabets = " + alpha);
		System.out.println("Total number = " + num);
		System.out.println("Total vowels = " + vowels);
		System.out.println("Total space = " + space);
	}

	public static void main(String[] args) {
		
		Counting ct=new Counting();
		
		ct.getCounting();
	}
}
