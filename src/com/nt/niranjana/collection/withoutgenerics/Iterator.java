package com.nt.niranjana.collection.withoutgenerics;

import java.util.ArrayList;
public class Iterator 
{
	public static void main(String[] args) 
	{
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
		
		
		//retrieve the using iterator(forward value can be retrieved)
		java.util.Iterator iterator = arrayList.iterator();
		System.out.println("iterator: "+iterator);
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();
		
	}

}
