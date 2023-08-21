package com.nt.niranjana.collection.withoutgenerics;

import java.util.TreeSet;

public class TreeSetClass
{

	public static void main(String[] args) 
	{
		TreeSet treeSet = new TreeSet();
		treeSet.add(19);
		treeSet.add(10);
		treeSet.add(6);
		treeSet.add(45);
		//treeSet.add("ana");  //java.lang.ClassCastException: only allow homogenous
		System.out.println(treeSet);
		
		
		
	}
}
