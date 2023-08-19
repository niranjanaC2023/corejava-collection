package com.nt.niranjana.collection.withoutgenerics;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListClass 
{
	public static void  main(String[] args) 
	{
		/*
		->ArrayList introduced in jdk 1.2 version
		->ArrayList is Not-legacy class.
		->ArrayList are Non-synchronized collection.
		->So ArrayList is non-thread safe(At a time multiple thread can access the object. In ArrayList Locking system not there.
		->So that vector class performance is high.
		->ArrayList does not provide guaranty for data consistency because At a time multiple thread can access the object.
		(Data consistency means data might be loss, data udhor-idhor)
		->ArrayList By default capacity is 10.
		->ArrayList New capacity is (oldCapacity*3)/2 + 1
		->ArrayList has no default method to find capacity of ArrayList.
		->In ArrayList data insertion and data fetch both are same direction in which way data inserted.
		
		*/
		
		//***************ArrayList class with default Constructor which is having default capacity i.e 10******************
		ArrayList arrayList = new ArrayList();		
		//insert data into ArrayList
		arrayList.add("raja");
		arrayList.add("rani");
		arrayList.add("raja");
		arrayList.add(12);
		arrayList.add(10);
		arrayList.add(12);
		arrayList.add(12.5);
		arrayList.add(12.5f);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(12);
		arrayList.add(12L);
		System.out.println("ArrayList Data Display: "+arrayList);
		System.out.println("ArrayList Size: "+arrayList.size());
		System.out.println("ArrayList Data through Index: "+arrayList.get(5));
		System.out.println("ArrayList hashCode: "+arrayList.hashCode());
		System.out.println("ArrayList Index will Get through Data: "+arrayList.indexOf(12)); 
		System.out.println("ArrayList lastIndex will Get through Data: "+arrayList.lastIndexOf(12));
		System.out.println("Check Given Value is Present or not in ArrayList: "+arrayList.contains(12));
		System.out.println("Check ArrayList is empty or not: "+arrayList.isEmpty());
		
		//retrieve data from arrayList through index
		Object othElement = arrayList.get(0);
		Object OnethElement = arrayList.get(1);
		System.out.println("retrieve data from arrayList through index Oth Element: "+othElement);
		System.out.println("retrieve data from arrayList class through index Oneth Element: "+OnethElement);
		
		//retrieve data from ArrayList using enhancedForLoop in jdk 5.0 version
		for(Object obj : arrayList)
		{
			System.out.println("retrieve data from arrayList class using enhancedForLoop "+obj);
		}
		System.out.println();
		
		//retrieve data from ArrayList using ListIterator
		ListIterator listIterator = arrayList.listIterator();
		System.out.println("listIterator: "+listIterator);
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		System.out.println();
		
		//retrieve data from ArrayList using ListIterator
		ListIterator listIteratorWithIndex = arrayList.listIterator(1);
		System.out.println("listIteratorWithIndex: "+listIteratorWithIndex);
		while(listIteratorWithIndex.hasNext())
		{
			System.out.println(listIteratorWithIndex.next());
		}
		
		//retrieve data from ArrayList using forEach method
		arrayList.forEach(i->System.out.println(i));
		System.out.println();
		
		
		//************ArrayList class with default Constructor which has assigned initial capacity manually by programmer*******
		ArrayList arrayList2 = new ArrayList(5);		
		//insert data into ArrayList
		arrayList2.add(0,"kalia");
		arrayList2.add(1,"kalia");
		arrayList2.add(2,10);
		arrayList2.add(3,10);
		arrayList2.add(4,19.5);
		arrayList2.add(5,19.5f);
		arrayList2.add(6,null);
		arrayList2.add(7,true);
		arrayList2.add(8,12L);
		System.out.println("ArrayList2 Data Display: "+arrayList2);
		System.out.println("ArrayList2 Size: "+arrayList2.size());
		System.out.println("ArrayList2 Data through Index: "+arrayList2.get(5));
		System.out.println();
		
		
		//************ArrayList class with default Constructor which is taking collection object inside another object manually by programmer*******
		ArrayList arrayList3 = new ArrayList(arrayList2);		
		System.out.println("List Od Data: "+arrayList3);
		//insert data into ArrayList
		arrayList3.add("mahesh");
		arrayList3.add("tina");
		arrayList3.add(false);
		arrayList3.add(19.9);
		arrayList3.add(19.5f);
		arrayList3.add(null);
		arrayList3.add(true);
		arrayList3.add(12L);
		System.out.println("ArrayList3 Data Display: "+arrayList3);
		System.out.println("ArrayList3 Size: "+arrayList3.size());
		System.out.println("ArrayList3 Data through Index: "+arrayList3.get(6));
		
		//use of addAll method
		ArrayList arrayList4 = new ArrayList();
		arrayList4.add("jugnu");
		arrayList4.add("majnu");
		arrayList4.add(true);
		arrayList4.add(19.9);
		
		ArrayList arrayList5 = new ArrayList();
		arrayList5.add("sisu");
		arrayList5.add("alina");
		arrayList5.add(false);
		arrayList5.add(1.0);
		
		arrayList5.addAll(arrayList4);
		System.out.println("arrayList5 and arrayList4 combined: "+arrayList5);
		
		
		//use of remove
		System.out.println(arrayList5.remove(0));
		System.out.println("arrayList5 after remove: "+arrayList5);
		//System.out.println(arrayList5.removeAll(arrayList5));
		//System.out.println("arrayList5 after removeAll: "+arrayList5);
		
		//use of set/replace
		System.out.println(arrayList5.set(2, true));
		System.out.println("arrayList5 after set/replace: "+arrayList5);
	}

}
