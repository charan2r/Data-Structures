package dataStructures;

public class LinkedListCount {
	Node head;
	class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;		
	}
	public int getCount() {
		Node t = head;
		int count = 0;
		while(t!=null) {
			count++;
			t = t.next;
		}
		return count;
	}
	public static void main(String[] args) {
		LinkedListCount list = new LinkedListCount();
		list.push(3);
		list.push(5);
		list.push(8);
		System.out.println(list.getCount());
	}

}
