
public class QL12 {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class Queue{
		public static Node h;
		public static Node t;
		
		public static boolean isEmpty() {
			return h == null && t == null;
		}
		public static void add(int data) {
			Node nd = new Node(data);
			if(t == null) {
				h = t = nd;
				return;
			}
			t.next = nd;
			t = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int s = h.data;
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
			return h.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
