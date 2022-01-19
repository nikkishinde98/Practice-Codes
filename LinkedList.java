package oop;

import java.io.*; 
public class LinkedList 
{ 
Node head; // head of list 
	static class Node 
{ 
		int data; 
		Node next; 
		Node(int a) 
		{ 
			data = a; 
			next = null; 
		} 
	} 
// Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		// Create a new node with given data 
		Node new_node = new Node(data); 
		new_node.next = null; 
		// If the Linked List is empty, then make the new node as head 
		if (list.head == null) 
{ 
			list.head = new_node; 
		} 
		else 
{ 
			// Else traverse till the last node and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) 
{ 
			last = last.next; 
			} 
			// Insert the new_node at last node 
			last.next = new_node; 
		} 
		return list; 
	} 
	public static void printList(LinkedList list) 
	{	
		Node currentNode = list.head; 
		System.out.print("LinkedList: "); 
		// Traverse through the LinkedList 
		while (currentNode != null) 
{ 
			// Print the data at current node 
			System.out.print(currentNode.data + " "); 
			// Go to next node 
			currentNode = currentNode.next; 
		} 
		System.out.println(); 
	} 
	// Method to delete a node in the LinkedList by KEY 
	public static LinkedList deleteByKey(LinkedList list, int key) 
	{ 
		// Store head node 
		Node currentNode = list.head, prev = null; 
		if (currentNode != null && currentNode.data == key) 
{ 
			list.head = currentNode.next; // Changed head 
			System.out.println(key + " found and deleted"); 
			return list; 
		} 
		while (currentNode != null && currentNode.data != key) 
{ 
			prev = currentNode; 
			currentNode = currentNode.next; 
		} 
		if (currentNode != null) 
{ 
			prev.next = currentNode.next; 
			System.out.println(key + " found and deleted"); 
		} 
		if (currentNode == null) 
{ 
			System.out.println(key + " not found"); 
		} 
		return list; 
	} 
	// method to create a Singly linked list with n nodes 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 
		// Insert the values 
		list = insert(list, 11); 
		list = insert(list, 23); 
		list = insert(list, 38); 
		list = insert(list, 45); 
		list = insert(list, 57); 
		list = insert(list, 69); 
		list = insert(list, 77); 
		list = insert(list, 89); 
		// Print the LinkedList 
		printList(list); 
		// Delete node with value 1 
		deleteByKey(list, 11); 
		// Print the LinkedList 
		printList(list); 
		// Delete node with value 4 
		deleteByKey(list, 45); 
		// Print the LinkedList 
		printList(list); 
		// Delete node with value 10 
		deleteByKey(list, 89); 
		// Print the LinkedList 
		printList(list); 
	} 
} 
