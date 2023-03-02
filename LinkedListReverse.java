package dataStructures;

public class LinkedListReverse {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
    }
	
	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	void print(Node node) {
		while(node!=null) {
			System.out.println(node.data + "");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListReverse list = new LinkedListReverse();
		list.head = new Node(85);
		list.head.next = new Node(34);
		list.head.next.next = new Node(55);
		list.print(head);
		head = list.reverse(head);
		System.out.println("");
		list.print(head);
	}
}
