package com.DataStructure;

//import org.w3c.dom.Node;
public class NodeOnePractice{
	
	Node head;
	
// creating new node
public class Node {
	
   String data;
	Node next;
	
	Node(String data){
		this.data=data;
		this.next=null;
		
	}
}
	// add data in first node
	public void addFirst(String data) {
		Node newNode=new Node(data);
		//Object head = null;
		if(head==null){
			head=newNode;
			return;
		}
		
		newNode.next= head;
		head=newNode;
		
	}
	
	
	//add data in last node
	public void addLast(String data) {
		Node newNode=new Node(data);
		
		//Object head = null;
		if(head==null){
			head=newNode;
			return;
		}
		
	Node currNode=head;
	 while(currNode.next!=null) {
		 currNode=currNode.next;
	 }
	 
	 currNode.next=newNode;
		
	}
	
	
	public void print() {
		
		//Object head = null;
		
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode= head;
		 while(currNode!=null) {
			 System.out.print(currNode.data+"->");
			 currNode=currNode.next;
		 }
		 
		 System.out.println("NULL");
		 
		 
	}
	
	
	

	
	public static void main(String[] args) {
		NodeOnePractice n=new NodeOnePractice();
		
		n.addFirst("sandhya");
		n.addLast("jagtap");
		
		n.addFirst("java");	
		n.print();
	
	}
	

}
