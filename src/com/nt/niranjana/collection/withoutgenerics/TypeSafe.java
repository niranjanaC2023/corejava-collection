package com.nt.niranjana.collection.withoutgenerics;

import java.util.ArrayList;

public class TypeSafe 
{

	public static void main(String[] args) 
	{

		
		
		//Un-Type Safe
		ArrayList list2 =  new ArrayList();
		list2.add("abc");
		list2.add(1);
		list2.add(1.2);
		list2.add(2.5f);
		list2.add(7L);
		//System.out.println(list2);
		
		//Type Safe
		ArrayList<String> list = new ArrayList<>();
		list.add("aba");
		list.add("abc");
		list.add("mno");
		System.out.println("Total List: "+list);
		System.out.println("Total List Size: "+list.size());
		
		list.remove(1);
		System.out.println("Total List After Remove: "+list);
		System.out.println("Total List Size After Remove: "+list.size());
		
		 //boolean isRemoved = list.remove(list);
		 //System.out.println(isRemoved);
		
		System.out.println(list.contains("aba"));
		System.out.println(list.contains("sisu"));
		
		list.add(1, "raju");
		System.out.println("Total List After add: "+list);
		System.out.println("Total List Size After add: "+list.size());
		
		list.set(1, "klo");
		System.out.println("Total List After set: "+list);
		System.out.println("Total List Size After set: "+list.size());
		
		System.out.println(list);
		
	}
}
