package dataStructures;

public class LinkedListInsert {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int first_data) {
		Node first_node = new Node(first_data);
		first_node.next = head;
		head = first_node;		
	}
	
	public void insertAfter(Node prev_node,int first_data) {
		Node first_node = new Node(first_data);
		first_node.next = prev_node.next;
		prev_node.next = first_node;
	}
	
	public void append(int first_data) {
		Node first_node = new Node(first_data);
		if(head==null) {
			head = new Node(first_data);
			return;
		}
		first_node.next = null;
		Node last = head;
		while(last.next!=null)
			last = last.next;
		last.next = first_node;
		return;
	}
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data + "");
		    n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListInsert list = new LinkedListInsert();
		list.push(5);
		list.push(4);
		list.insertAfter(list.head.next, 7);
		list.insertAfter(list.head.next, 2);
		list.append(6);
		list.append(3);
		list.printList();
				
	}

}
