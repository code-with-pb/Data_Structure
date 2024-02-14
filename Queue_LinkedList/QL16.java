import java.util.*;

public class QL16 {
	static class Node{
		int d;
		Node next;
		
		Node(int d){
			this.d = d;
			next = null;
		}
	}
	static class Queue{
		public static Node r = null;
		public static Node f = null;
		
		public static boolean isEmpty() {
			return r == null && f == null;
		}
		
		public static void add(int d) {
			Node nd = new Node(d);
			if(r == null) {
				f = r = nd;
				return;
			}
			r.next = nd;
			r = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = f.d;
			
			if( f == r) {
				
				r = null;
			}
			f = f.next;
			
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return f.d;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		q.add(10);
		q.add(20);
		q.add(300);
		
		while(q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
