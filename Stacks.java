package com.java.day14.stacks;

public class Stacks<E> {

	  LinkedLists<E> linkedL = new LinkedLists<>();

	  public void push(E data) {
	    linkedL.addLast(data);
	  }

	  public void display() {
	    linkedL.displayFromEnd();
	  }
	  
	  public void peek() {
	    linkedL.peek();
	  }

	  public void pop() {
	    linkedL.removeLast();
	  }
	}