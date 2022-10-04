package com.java.day14.stacks;

public class Main {

	  public static void main(String[] args) {
	    System.out.println("-STACK OPERATIONS-");
	    Stacks<Integer> st = new Stacks<>();
	    st.push(70);
	    st.push(30);
	    st.push(56);

	    st.peek();

	    st.display();
	    st.pop();
	    st.peek();

	    st.display();
	    st.pop();

	    st.display();
	    st.pop();

	    st.display();
	    st.pop();

	    System.out.println("\n-QUEUE OPERATIONS-");
	    Queues<Integer> que = new Queues<>();
	    que.enqueue(56);
	    que.enqueue(30);
	    que.enqueue(70);

	    que.display();
	    que.dequeue();

	    que.display();
	    que.dequeue();

	    que.display();
	    que.dequeue();

	    que.display();
	    que.dequeue();

	  }
	}