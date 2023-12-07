
public class St27 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class Stack{
		public static Node h;
		public static boolean isEmpty() {
			return h == null;
		}
		public static void push(int data) {
			Node nd = new Node(data);
			if(isEmpty()) {
				h = nd;
				return;
			}
			nd.next = h;
			h = nd;
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int t = h.data;
			h = h.next;
			return t;
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
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
