import java.util.*;

public class QL15 {
	static class Node{
		int d;
		Node next;
		
		Node(int d){
			this.d = d;
			next = null;
		}
	}
	static class Stack{
		public static Node f = null;
		public static Node r = null;
		
		public static boolean isEmpty() {
			return f == null && r == null;
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
			if(f == r) {
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
		Queue<Integer> q = new LinkedList<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
