
public class St35 {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class Stack{
		public static Node head;
		public static boolean isEmpty() {
			return head == null;
		}
		public static void push(int data) {
			Node nd = new Node(data);
			if(isEmpty()) {
				head = nd;
				return;
			}
			nd.next = head;
			head = nd; 
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int t = head.data;
			head = head.next;
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String args[]) {
		Stack s = new Stack();
		
		s.push(30);
		s.push(20);
		s.push(10);
		s.push(40);
		
		s.pop();
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}
}
