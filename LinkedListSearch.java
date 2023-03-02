package dataStructures;


public class LinkedListSearch {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
    }
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public boolean search(Node head, int x) {
		Node current = head;
		while(current!=null) {
			if(current.data==x) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinkedListSearch list = new LinkedListSearch();
		list.push(34);
		list.push(22);
		list.push(45);
		list.push(12);
		if(list.search(head, 62)) {
			System.out.println("Available");
		}else {
			System.out.println("Not Available");
		}
	}

}
