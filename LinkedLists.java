package com.java.day14.stacks;

import java.util.ArrayList;

public class LinkedLists<E> {

  Node<E> head;

  public void addLast(E data) {
    Node<E> newNode = new Node<>(data);

    if (head == null) head = newNode; //list is empty

    else if (head.next == null) head.next = newNode; //node being added is the second node.

    else {
      Node<E> lastNode = traverseTillLast(); //calling traverseTillLast to get the last node
      lastNode.next = newNode;
    }
  }

  public void peek() {
    if (isEmpty()) {
      System.out.println("list empty!");
      return;
    }
    Node<E> lastNode = traverseTillLast();
    System.out.println("element at top: " + lastNode.data);

  }

  public void removeFirst() {
    if (isEmpty()) {
        System.out.println("list empty! nothing to remove");
        return;
    }
    System.out.println("removed " + head.data);
    head = head.next;
  }

  public void removeLast() {
    if (isEmpty()) {
      System.out.println("list empty! nothing to remove");
      return;
    }
    if (head.next == null) {  //list has just one node
      System.out.println("removed " + head.data);
      head = null;
    } else {
      Node<E> temp = head;
        while (temp.next.next != null) temp = temp.next;  //traversing till the 2nd last node.
        System.out.println("removed " + temp.next.data);
        temp.next = null;
    }
  }

  private Node<E> traverseTillLast() {
    Node<E> temp = head;
    while (temp.next != null) temp = temp.next;  //traversing till the last node.
    return temp;
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

    ArrayList<E> nodes = new ArrayList<>(); //creating an empty ArrayList, to the node elements.
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