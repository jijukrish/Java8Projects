package com.bestonjava.examples;

/**
 * Approach used is 
 * 1.In this approach, we take 2 pointers, fastPointer and slowPointer and initialize both to list head.
 * 2.Iterate through list and move slowPointer 1 node at a time and fastPointer 2 nodes at a time.
3.When fastPointer reaches end of list, slowPointer will be pointing to middle element of list. 
 * @author jijukrishnan
 *
 */
public class GetMiddleOfLinkedList {
	public static void main(String[] args) {
		  new GetMiddleOfLinkedList();
		 }
		 
		 public GetMiddleOfLinkedList() {
		  Node startNode = new Node(10);
		  Node temp2 = new Node(20);
		  Node temp3 = new Node(30);
		  Node temp4 = new Node(40);
		  Node temp5 = new Node(50);
		  Node temp6 = new Node(60);
		  Node temp7 = new Node(70);
		  Node temp8 = new Node(80);
		 
		  startNode.setNext(temp2);
		  temp2.setNext(temp3);
		  temp3.setNext(temp4);
		  temp4.setNext(temp5);
		  temp5.setNext(temp6);
		  temp6.setNext(temp7);
		  temp7.setNext(temp8);
		 
		  Node temp = findMiddleNodeOfLinkedList(startNode);
		  System.out.println(temp.getData());
		 }
		 
		 private Node findMiddleNodeOfLinkedList(Node startNode) {
		  if(startNode==null){
		   return startNode;
		  }
		 
		  Node slowPointer = startNode;
		  Node fastPointer = startNode;
		  while(fastPointer!=null && fastPointer.getNext()!=null && fastPointer.getNext().getNext()!=null){
		   slowPointer = slowPointer.getNext();
		   fastPointer = fastPointer.getNext().getNext();
		 
		  }
		  return slowPointer;
		 }
}
