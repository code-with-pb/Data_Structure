
public class St9 {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
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
			int top = head.data;
			head = head.next;
			return top;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack o = new Stack();
		
		o.push(1);
		o.push(2);
		o.push(3);
		o.push(4);
		
		while(!o.isEmpty()) {
			System.out.println(o.peek());
			o.pop();
		}
	}

}
