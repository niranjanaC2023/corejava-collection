package com.nt.niranjana.collection.withoutgenerics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Perfomance_Adding_ArrayList_Vector_LinkedList 
{
	public static void main(String[] args) 
	{
		
	//vector consume more time..becoz it background has synchronize..
	//So..ArrayList is fast ,Compared to vector because ArrayList is not synchronized....
	
	//ArrayList is fast, compared to LinkedList because Arraylist consume less memory
	//LinkedList consume more memory..
		
	long startTimeForVector = System.nanoTime();	
	System.out.println("Vector Time Start: "+startTimeForVector);
	Vector vector = new Vector();
	vector.add("raja");
	vector.add("rani");
	vector.add(18);
	System.out.println("Vector result: "+vector);
	long endTimeForVector = System.nanoTime();
	System.out.println("Vector Time End: "+endTimeForVector);
	System.out.println("Time Taking In Vector For Inserting: "+(endTimeForVector-startTimeForVector));
	System.out.println();
	
	long startTimeForArrayList = System.nanoTime();	
	System.out.println("ArrayList Time Start: "+startTimeForArrayList);
	ArrayList arrayList = new ArrayList();
	arrayList.add("raja");
	arrayList.add("rani");
	arrayList.add(18);
	System.out.println("ArrayList result: "+arrayList);
	long endTimeForArrayList = System.nanoTime();
	System.out.println("ArrayList Time End: "+endTimeForArrayList);
	System.out.println("Time Taking In ArrayList For Inserting: "+(endTimeForArrayList-startTimeForArrayList));
	System.out.println();
	
	long startTimeForLinkedList = System.nanoTime();	
	System.out.println("LinkedList Time Start: "+startTimeForLinkedList);
	LinkedList linkedList = new LinkedList();
	linkedList.add("raja");
	linkedList.add("rani");
	linkedList.add(18);
	System.out.println("LinkedList result: "+linkedList);
	long endTimeForLinkedList = System.nanoTime();
	System.out.println("LinkedList Time End: "+endTimeForLinkedList);
	System.out.println("Time Taking In LinkedList For Inserting: "+(endTimeForLinkedList-startTimeForLinkedList));
	
		

	}
}