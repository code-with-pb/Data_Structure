
public class QL9 {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class Queue{
		public static Node head = null;
		public static Node tail = null;
		public static boolean isEmpty() {
			return head == null && tail == null;
		}
		public static void add(int data) {
			Node nd = new Node(data);
			if(tail == null) {
				head = tail = nd;
				return;
			}
			tail.next = nd;
			tail = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = head.data;
			if(tail == head) {
				tail = null;
			}
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
