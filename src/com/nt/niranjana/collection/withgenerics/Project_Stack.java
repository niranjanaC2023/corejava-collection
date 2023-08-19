package com.nt.niranjana.collection.withgenerics;

import java.util.Stack;

public class Project_Stack 
{
		public static void main(String[] args) 
		{
				Stack<String> s = new Stack<>();
				System.out.println(s);
				s.push("a");
				s.push("b");
				s.push("c");
				s.push("d");
				s.push("e");
				System.out.println(s);
				System.out.println(s.pop()); //retrieve, remove,return...So here different object came..So we can't use for infinite loop
				System.out.println(s);
				System.out.println();
				
				System.out.println(s);
				System.out.println(s.peek()); //retrieve, return...no remove...So Same object will be came..So we use for infinite loop
				System.out.println(s);
				System.out.println();
				
				System.out.println(s);
				System.out.println(s.peek()); //retrieve, return...no remove...So Same object will be came..
				System.out.println(s);
				System.out.println();
				
				//searching element
				System.out.println(s.search("a")); //search method , serach the element from the top of the stack with starting index 1
				System.out.println();
				
				//we can't call pop and peek, if stack is empty..else RE:- EmptyStackException
				//proof:- Empty the stack then check
				System.out.println(s.pop());
				System.out.println(s.pop());
				System.out.println(s.pop());
				System.out.println(s.pop());
				//System.out.println(s.pop()); //RE:-ESE
				//System.out.println(s.peek());  //RE:- ESE
				System.out.println();
				
				// check stack is empty or not
				Stack<Object> s1 = new Stack<>();
				s1.add(10);
				s1.add(20);
				s1.add(30);
				s1.add(40);
				System.out.println(s1);
				System.out.println();
				//retrieve object randomly
				System.out.println(s1.get(3));
				System.out.println(s1);
				
		}
}
