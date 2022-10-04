package com.java.day14.stacks;

import java.util.ArrayList;

public class LinkedLists<E> {

  Node<E> head;

  public void addLast(E data) {
    Node<E> newNode = new Node<>(data);

    if (head == null) head = newNode; //list is empty

    else if (head.next == null) { //node being added is the second node.
        head.next = newNode;
    } else {
      Node<E> temp = head;
      while (temp.next != null) temp = temp.next; //traversing till the last node.
      temp.next = newNode;
    }
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("list empty! nothing to display");
      return;
    }

    Node<E> temp = head;
    while (temp.next != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println(temp.data);
  }

  public void displayFromEnd() {
    if (isEmpty()) {
      System.out.println("list empty! nothing to display");
      return;
    }

    ArrayList<E> nodes = new ArrayList<>(); //creating an empty ArrayList, to add the node elements.
    Node<E> temp = head;
    
    while (temp.next != null) {
      nodes.add(temp.data); //adding nodes to arraylist till current node's next points to null
      temp = temp.next;
    }
    nodes.add(temp.data); //adding last node to arraylist

    for (int i = nodes.size() - 1; i > 0; i--) {
      System.out.print(nodes.get(i) + " -> ");
    }
    System.out.println(nodes.get(0));
    
  }

  private boolean isEmpty() {
    if (head == null) return true;
    else return false;
  }
}

class Node<E> {

  E data;
  Node<E> next;

  public Node(E data) {
    this.data = data;
  }
}