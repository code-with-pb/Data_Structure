import java.util.*;

public class St25 {
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
		public static boolean em() {
			return head == null;
		}
		public static void push(int data) {
			Node nd = new Node(data);
			if(em()) {
				head = nd;
				return;
			}
			nd.next = head;
			head = nd;
		}
		public static int pop() {
			if(em()) {
				return -1;
			}
			int t = head.data;
			head = head.next;
			return t;
		}
		public static int peek() {
			if(em()) {
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		St25.Stack s = new St25.Stack();
		
		s.push(10);
		s.push(20);
		s.push(0);
		
		while(!s.em()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
