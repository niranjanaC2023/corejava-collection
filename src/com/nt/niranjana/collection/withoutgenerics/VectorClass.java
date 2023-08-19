package com.nt.niranjana.collection.withoutgenerics;

import java.util.ListIterator;
import java.util.Vector;

public class VectorClass 
{
	public static void main(String[] args) 
	{
		//In JDK 1.0v , java people provide some classes and interfaces to store the data/objects.
		//classes are: Vector, HashTable, Properties, Dictionary
			
		Vector v = new Vector();
		
		//insert data into Vector
		v.add("raja");
		v.add("rani");
		v.add("raja");
		v.add(12);
		v.add(10);
		v.add(12);
		v.add(12.5);
		v.add(12.5f);
		v.add(null);
		v.add(null);
		v.add(12);
		v.add(12L);
		System.out.println("Vector Data Display: "+v);
		System.out.println("Vector Size,How many elements are present: "+v.size());
		System.out.println("Vector Data through Index: "+v.get(5));
		System.out.println("Vector Capacity: "+v.capacity());
		System.out.println("Vector hashCode: "+v.hashCode());
		System.out.println("Vector Index will Get through Data: "+v.indexOf(12)); 
		System.out.println("Vector lastIndex will Get through Data: "+v.lastIndexOf(12));
		System.out.println("Check Given Value is Present or not in Vector: "+v.contains(12));
		System.out.println("Vector Data will get using Index: "+v.elementAt(3));
		System.out.println("Return First Element of Vector: "+v.firstElement());
		System.out.println("Check Vector is empty or not: "+v.isEmpty());
		System.out.println("Return Last Element of Vector: "+v.lastElement());
		
		//retrieve data from vector through index
		Object othElement = v.get(0);
		Object OnethElement = v.get(1);
		System.out.println("retrieve data from vector through index Oth Element: "+othElement);
		System.out.println("retrieve data from vector through index Oneth Element: "+OnethElement);
		
		//retrieve data from vector using enhancedForLoop
		for(Object obj : v)
		{
			System.out.println("retrieve data from vector using enhancedForLoop "+obj);
		}
		System.out.println();
		
		//retrieve data from vector using ListIterator
		ListIterator listIterator = v.listIterator();
		System.out.println("listIterator: "+listIterator);
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		System.out.println();
		
		//retrieve data from vector using ListIterator
		ListIterator listIteratorWithIndex = v.listIterator(1);
		System.out.println("listIteratorWithIndex: "+listIteratorWithIndex);
		while(listIteratorWithIndex.hasNext())
		{
			System.out.println(listIteratorWithIndex.next());
		}
	}
}
