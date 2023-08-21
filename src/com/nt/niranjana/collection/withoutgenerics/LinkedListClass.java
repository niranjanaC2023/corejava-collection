package com.nt.niranjana.collection.withoutgenerics;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass 
{
	public static void  main(String[] args) 
	{
		
		//***************LinkedList class with default Constructor******************
		LinkedList linkedList = new LinkedList();		
		//insert data into LinkedList
		linkedList.add("raja");
		linkedList.add("rani");
		linkedList.add("raja");
		linkedList.add(12);
		linkedList.add(10);
		linkedList.add(12);
		linkedList.add(12.5);
		linkedList.add(12.5f);
		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(12);
		linkedList.add(12L);
		System.out.println("LinkedList Data Display: "+linkedList);
		System.out.println("LinkedList Size: "+linkedList.size());
		System.out.println("LinkedList Data through Index: "+linkedList.get(5));
		System.out.println("LinkedList hashCode: "+linkedList.hashCode());
		System.out.println("LinkedList Index will Get through Data: "+linkedList.indexOf(12)); 
		System.out.println("LinkedList lastIndex will Get through Data: "+linkedList.lastIndexOf(12));
		System.out.println("Check Given Value is Present or not in LinkedList: "+linkedList.contains(12));
		System.out.println("Check LinkedList is empty or not: "+linkedList.isEmpty());
		
		//retrieve data from linkedList through index
		Object othElement = linkedList.get(0);
		Object OnethElement = linkedList.get(1);
		System.out.println("retrieve data from linkedList through index Oth Element: "+othElement);
		System.out.println("retrieve data from linkedList class through index Oneth Element: "+OnethElement);
		
		//retrieve data from LinkedList using enhancedForLoop in jdk 5.0 version
		for(Object obj : linkedList)
		{
			System.out.println("retrieve data from linkedList class using enhancedForLoop "+obj);
		}
		System.out.println();
		
		//retrieve data from LinkedList using iterator
		ListIterator iterator = linkedList.listIterator();
		System.out.println("Iterator: "+iterator);
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();
		
		//retrieve data from LinkedList using ListIterator 
		ListIterator listIterator = linkedList.listIterator(1);
		System.out.println("listIterator: "+listIterator);
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		System.out.println();
		
		//retrieve data from LinkedList using ListIterator With Index
		ListIterator listIteratorWithIndex = linkedList.listIterator(1);
		System.out.println("listIteratorWithIndex: "+listIteratorWithIndex);
		while(listIteratorWithIndex.hasNext())
		{
			System.out.println(listIteratorWithIndex.next());
		}
		
		//retrieve data from LinkedList using forEach method
		linkedList.forEach(i->System.out.println(i));
		System.out.println();
		
		
		
		//************LinkedList class with default Constructor which is taking collection object inside another object manually by programmer*******
		LinkedList linkedList3 = new LinkedList(linkedList);		
		System.out.println("List Od Data: "+linkedList3);
		//insert data into LinkedList
		linkedList3.add("mahesh");
		linkedList3.add("tina");
		linkedList3.add(false);
		linkedList3.add(19.9);
		linkedList3.add(19.5f);
		linkedList3.add(null);
		linkedList3.add(true);
		linkedList3.add(12L);
		System.out.println("LinkedList3 Data Display: "+linkedList3);
		System.out.println("LinkedList3 Size: "+linkedList3.size());
		System.out.println("LinkedList3 Data through Index: "+linkedList3.get(6));
		
		//use of addAll method
		LinkedList linkedList4 = new LinkedList();
		linkedList4.add("jugnu");
		linkedList4.add("majnu");
		linkedList4.add(true);
		linkedList4.add(19.9);
		
		LinkedList linkedList5 = new LinkedList();
		linkedList5.add("sisu");
		linkedList5.add("alina");
		linkedList5.add(false);
		linkedList5.add(1.0);
		
		linkedList5.addAll(linkedList4);
		System.out.println("linkedList5 and linkedList4 combined: "+linkedList5);
		
		
		//use of remove
		System.out.println(linkedList5.remove(0));
		System.out.println("linkedList5 after remove: "+linkedList5);
		//System.out.println(linkedList5.removeAll(linkedList5));
		//System.out.println("linkedList5 after removeAll: "+linkedList5);
		
		//use of set/replace
		System.out.println(linkedList5.set(2, true));
		System.out.println("linkedList5 after set/replace: "+linkedList5);
		
		//use of addFirst
		linkedList5.addFirst(190);
		System.out.println("linkedList5 after addFirst: "+linkedList5);
		
		//use of addLast
		linkedList5.addLast(1);
		System.out.println("linkedList5 after addLast: "+linkedList5);
		
		//use of removeFirst
		linkedList5.removeFirst();
		System.out.println("linkedList5 after removeFirst: "+linkedList5);
		
		//use of removeLast
		linkedList5.removeLast();
		System.out.println("linkedList5 after removeLast: "+linkedList5);
		
		//use of removeFirstOccurrence
		linkedList5.removeFirstOccurrence(true); //remove first occurence value if any duplicate will be there
		System.out.println("linkedList5 after removeFirstOccurrence: "+linkedList5);
		
		//use of getFirst
		linkedList5.getFirst();
		System.out.println("linkedList5 after getFirst: "+linkedList5);
		
		//use of getLast
		linkedList5.getLast();
		System.out.println("linkedList5 after getLast: "+linkedList5);
	}

}
