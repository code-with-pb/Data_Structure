import java.util.*;

public class QL13 {
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	static class Queue{
		public static Node h = null;
		public static Node r = null;
		
		public static boolean isEmpty() {
			return h == null && r == null;
		}
		public static void add(int data) {
			Node nd = new Node(data);
			if(r == null) {
				r = h = nd;
				return;
			}
			r.next = nd;
			r = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int s = h.data;
			if(r == h) {
				r = null;
			}
			h = h.next;
			return s;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return h.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		q.add(10);
		q.add(30);
		q.add(20);
		q.add(10);
		
		q.remove();
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}
}
