package com.demo.lists;

public class SinglyList {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
		
	}
	Node head;
	public SinglyList() {
		head=null;
	}
	
	public void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		
		}
		else
		{
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	
	public void addPosition(int pos,int data) {
		Node newNode=new Node(data);
		if(pos==1) {
			newNode.next=head;
			head=newNode;
		}
		else {
				Node temp=head;
				for(int i=1;temp!=null && i<pos-1;i++) {
					temp=temp.next;
					
				}
				
				if(temp!=null) {
					newNode.next=temp.next;
					temp.next=newNode;
				}
				else {
					System.out.println("pos not found");
				}
				
			
		}
		
	}
	public void addValue(int val, int data) {
		Node newNode=new Node(data);
		Node temp=head;
		if(temp.data==val) {
			newNode.next=temp.next;
			temp.next=newNode;
		}
		else {
			while(temp.data!=val && temp!=null) {
				temp=temp.next;
			}

			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}
			else {
				System.out.println("value not found");
			}
			
		
		}
	}
	public void deleteByPos(int pos) {
		Node temp=head;
		if(pos==1) {
			head=temp.next;
			temp.next=null;
		}
		else 
		{   
			Node prev=null;
			for(int i=0;temp!=null && i<=pos;i++) {
				prev=temp;
				temp=temp.next;
			}
			if (temp != null) {
	            prev.next = temp.next;
	        } else {
	            System.out.println("Position not found");
	        }
		}
	}
	
	public void deleteByVal(int data,int val) {
		Node temp=head;
		if(temp.data==val) {
			head=temp.next;
			temp.next=null;
		}
		else
		{
			Node prev=null;
			for(int i=0;temp!=null && temp.data!=val;i++) {
				prev.next=temp;
				temp=temp.next;
				
			}
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
			}
			else {
				System.out.println(" val is not found ");
			}
		}
	}
	
 public void displayData() {
	 if(head==null) {
		 System.out.println("LIst is empty");
	 }
	 else {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.println(temp.data);
			 temp=temp.next;
		 }
	 }
	
}
	

}
