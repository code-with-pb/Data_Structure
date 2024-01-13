
public class QL11 {
	static class Node{
		int d;
		Node next;
		
		Node(int d){
			this.d = d;
			next = null;
		}
	}
	static class Queue{
		public static Node h = null;
		public static Node t = null;
		
		public static boolean isEmpty() {
			return h == null && t == null;
		}
		public static void add(int d) {
			Node nd = new Node(d);
			if(t == null) {
				t = h = nd;
				return;
			}
			t.next = nd;
			t = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int s = h.d;
			if(t == h) {
				t = null;
			}
			h = h.next;
			
			return s;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return h.d;
		}
	}
	public static void main(String args[]) {
		Queue q = new Queue();
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}
}
