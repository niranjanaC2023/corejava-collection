package com.nt.niranjana.collection.withoutgenerics;

public class ArrayConcept
{

	public static void main(String[] args) 
	{
//		ArrayConcept[] t = {};
		//allows only homogenous objects
		 String [] string = new String[3];
		 string[0] = "raja";
		 string[1] = "rani";
		 string[2] = "proja";
		 //string[2] = 3;			//it allows only String type 
		 System.out.println(string[2]);
		 
		 int[] intData = {10,20,30};
		 System.out.println(intData[1]);
		
		//size cannot be increased 
		int[] number = new int[3];
		number[0] = 2;
		number[1] = 5;
		number[2] = 7;
      //number[3] = 5;   //size can not be increased
		System.out.println(number[1]);
		
		
		
		
		
	}
}
