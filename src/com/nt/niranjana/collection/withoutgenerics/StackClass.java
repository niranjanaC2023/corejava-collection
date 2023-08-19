package com.nt.niranjana.collection.withoutgenerics;

import java.util.ListIterator;
import java.util.Stack;

public class StackClass 
{
	public static void main(String[] args) 
	{	
		Stack stack = new Stack();
		
		//insert data into Stack
		stack.push("Raja");
		stack.push("rani");
		stack.push("raja");
		stack.push(12);
		stack.push(10);
		stack.push(12);
		stack.push(12.5);
		stack.push(12.5f);
		stack.push(null);
		stack.push(null);
		stack.push(12);
		stack.push(11L);
		System.out.println("Stack Data Display: "+stack);
		System.out.println("Stack Size: "+stack.size());
		System.out.println("Stack Data through Position: "+stack.get(5));
		System.out.println("Stack Capacity: "+stack.capacity());
		System.out.println("Stack hashCode: "+stack.hashCode());
		System.out.println("Stack Index will Get through Data: "+stack.indexOf(12)); 
		System.out.println("Stack lastIndex will Get through Data: "+stack.lastIndexOf(12));
		System.out.println("Check Given Stack Value is Present or not in Stack: "+stack.contains(12));
		System.out.println("Stack Data will get using Index: "+stack.elementAt(3));
		System.out.println("Return First Element of Stack: "+stack.firstElement());
		System.out.println("Check Stack is empty or not: "+stack.isEmpty());
		System.out.println("Return Last Element of Stack: "+stack.lastElement());
		
		System.out.println("Search data from stack using position: "+stack.search("raja"));
		System.out.println("Stack Peek: "+stack.peek());
		
		Object dataRemovedFromStack = stack.pop();
		System.out.println("dataRemovedFromStack: "+dataRemovedFromStack);
		System.out.println("Stack Data Display After POP: "+stack);
		System.out.println();
				
		//retrieve data from Stack through index
		Object othElement = stack.get(0);
		Object OnethElement = stack.get(1);
		System.out.println("retrieve data from Stack through index Oth Element: "+othElement);
		System.out.println("retrieve data from Stack through index Oneth Element: "+OnethElement);
		
		//retrieve data from Stack using enhancedForLoop
		for(Object obj : stack)
		{
			System.out.println("retrieve data from Stack using enhancedForLoop "+obj);
		}
		System.out.println();
		
		//retrieve data from Stack using ListIterator
		ListIterator listIterator = stack.listIterator();
		System.out.println("listIterator: "+listIterator);
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		System.out.println();
		
		//retrieve data from Stack using ListIterator
		ListIterator listIteratorWithIndex = stack.listIterator(1);
		System.out.println("listIteratorWithIndex: "+listIteratorWithIndex);
		while(listIteratorWithIndex.hasNext())
		{
			System.out.println(listIteratorWithIndex.next());
		}	
	}

}
