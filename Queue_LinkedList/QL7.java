

public class QL7 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class Queue{
		public static Node front = null;
		public static Node rear = null;
		public static boolean isEmpty() {
			return front == null && rear == null;
		}
		public static void add(int data) {
			Node nd = new Node(data);
			if(rear == null) {
				front =  rear = nd;
				return;
			}
		//	if(front == -1) {
				//front = 0;
			//}
		rear.next = nd;
			rear = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = front.data;
			if(front == rear) {
				rear = null; 
			}
			
			front = front.next;
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return front.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		q.add(0);
		q.add(20);
		q.add(10);
		q.add(25);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
