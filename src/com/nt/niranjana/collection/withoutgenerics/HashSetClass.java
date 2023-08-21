package com.nt.niranjana.collection.withoutgenerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass 
{

	public static void main(String[] args) 
	{
		Set hashSet = new HashSet();
		//insert data into HashSet
		hashSet.add("raja");
		hashSet.add("rani");
		hashSet.add(12);
		hashSet.add(10);
		hashSet.add(12);
		hashSet.add(12.5);
		hashSet.add(12.5f);
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add(12);
		hashSet.add(12L);
		System.out.println("HashSet Data Display: "+hashSet);
		System.out.println("HashSet Size: "+hashSet.size());
		System.out.println("HashSet hashCode: "+hashSet.hashCode());
		System.out.println("Check Given Value is Present or not in HashSet: "+hashSet.contains(12));
		System.out.println("Check HashSet is empty or not: "+hashSet.isEmpty());
		
		//retrieve data from HashSet using enhancedForLoop in jdk 5.0 version
		for(Object obj : hashSet)
		{
			System.out.println("retrieve data from hashSet class using enhancedForLoop "+obj);
		}
		System.out.println();		
		
		//retrieve data from HashSet using Iterator
		Iterator iterator = hashSet.iterator();
		System.out.println("Iterator: "+iterator);
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();
	}
}
