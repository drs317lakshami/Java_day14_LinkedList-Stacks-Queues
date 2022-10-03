package com.java.day14.llist;
import java.util.ArrayList;

public class LinkedLists<E> {

  Node<E> head;

  public void addFirst(E item) {
    Node<E> newNode = new Node<>(item);

    if (head == null) head = newNode;//list is empty condition
    else {
      newNode.next = head;
      head = newNode;
    }
  }

  public void addLast(E item) {
    Node<E> newNode = new Node<>(item);

    if (head == null) head = newNode;
    else if (head.next == null) head.next = newNode;  
    else {
      Node<E> temp = head;
      while (temp.next != null) temp = temp.next; 
      temp.next = newNode;
    }
  }
  public void insertAt(int index, E item) {
    int count = 0;
	if (index < 1 || index > count + 1) {
      System.out.println( ("invalid index" + ( count + 1)));
      return;
    } else if (index == 1) {
      if (head == null) System.out.println("list empty! adding " + item + " at index 1.");
      addFirst(item);
    } else if (index == count + 1) addLast(item);
    else {
      Node<E> newNode = new Node<>(item);
      Node<E> temp = head;

      for (int i = 1; i < index - 1; i++) temp = temp.next;
      newNode.next = temp.next;
      temp.next = newNode;
      count++;
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

    ArrayList<E> nodes = new ArrayList<>(); 
    Node<E> temp = head;
    
    while (temp.next != null) {
        nodes.add(temp.data); 
        temp = temp.next;
      }
    nodes.add(temp.data); 
    for (int i = nodes.size() - 1; i > 0; i--) {
      System.out.print(nodes.get(i) + " -> ");
    }
    System.out.println(nodes.get(0));
  }

  public void deleteFirst() {
    if (head == null) {
      System.out.println("list empty! nothing to delete");
      return;
    } else head = head.next;
  }

  private boolean isEmpty() {
    if (head == null) return true;
    else return false;
  }

}

class Node<E> {

  E data;
  Node<E> next;

  Node(E data) {
    this.data = data;
  }
}