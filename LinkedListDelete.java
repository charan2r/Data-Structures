package dataStructures;


public class LinkedListDelete {
	Node head;
	class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	
	void deleteNode(int key) {
		Node temp = head, prev = null;
		if(temp!=null && temp.data==key) {
			head  = temp.next;
			return;
		}
		while(temp!=null && temp.data!=key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			return;
		prev.next = temp.next;
		
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;		
	}
	
	public void print() {
		Node t = head;
		while(t!=null) {
			System.out.println(t.data + "");
			t = t.next;
		}
	}
		
	public static void main(String[] args) {
		LinkedListDelete list = new LinkedListDelete();
		list.push(2);
		list.push(3);
		list.push(5);
		list.push(8);
		list.print();
		list.deleteNode(3);
		list.print();
		
	}


}
