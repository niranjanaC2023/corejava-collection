package com.nt.niranjana.collection.withoutgenerics;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass 
{

	public static void main(String[] args) 
	{
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		//insert data into LinkedHashSet
		linkedHashSet.add("raja");
		linkedHashSet.add("rani");
		linkedHashSet.add(12);
		linkedHashSet.add(10);
		linkedHashSet.add(12);
		linkedHashSet.add(12.5);
		linkedHashSet.add(12.5f);
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		linkedHashSet.add(12);
		linkedHashSet.add(12L);
		System.out.println("LinkedHashSet Data Display: "+linkedHashSet);
		System.out.println("LinkedHashSet Size: "+linkedHashSet.size());
		System.out.println("LinkedHashSet hashCode: "+linkedHashSet.hashCode());
		System.out.println("Check Given Value is Present or not in LinkedHashSet: "+linkedHashSet.contains(12));
		System.out.println("Check LinkedHashSet is empty or not: "+linkedHashSet.isEmpty());
		
		//retrieve data from LinkedHashSet using enhancedForLoop in jdk 5.0 version
		for(Object obj : linkedHashSet)
		{
			System.out.println("retrieve data from linkedHashSet class using enhancedForLoop "+obj);
		}
		System.out.println();		
		
		//retrieve data from LinkedHashSet using Iterator
		Iterator listIterator = linkedHashSet.iterator();
		System.out.println("Iterator: "+listIterator);
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		System.out.println();
	}
}
