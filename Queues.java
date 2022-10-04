package com.java.day14.stacks;

public class Queues<E> {

	  LinkedLists<E> linkedL = new LinkedLists<>();

	  public void enqueue(E item) {
	    linkedL.addLast(item);
	  }

	  public void display() {
	    linkedL.display();
	  }
	  
	  public void dequeue() {
	    linkedL.removeFirst();
	  }

	}