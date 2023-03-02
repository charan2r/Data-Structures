package dataStructures;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
	   Queue<Integer> q = new LinkedList<>();
	   
	   for(int i=1; i<=5; i++)
		  q.add(i);
	   System.out.println(q);
	   
	   int r = q.remove();
	   System.out.println(r);
	   System.out.println(q);
	   
	   int h = q.peek();
	   System.out.println(h);
	   
	   int s =q.size();
	   System.out.println(s);
 
}
}
