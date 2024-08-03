package com.linkedList;

public class LinkedList {

	Node head;
	
	public void add(int data) {
		Node node=new Node();
		
		node.data=data;
		
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	
	
	public void display() {
		Node n=head;
		
		while(n.next!=null) {
			System.out.println(n.data);
			
			n=n.next;
			
		}
		System.out.println(n.data);
	}
	
	
	public void addStart(int data) {
		
		
		Node node=new Node();
		
		node.data=data;
		//node.next=null;
		node.next=head;
		
		head=node;
	
		
	}
	
	public void addAt(int index,int data) {
		Node node=new Node();
		
		node.data=data;
		
		node.next=null;
		
		Node n=head;
		
		
	}
}
