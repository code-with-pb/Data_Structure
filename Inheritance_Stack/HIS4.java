import java.util.*;

class Stacc4{
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next  = null;
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
}
/*class Reverse4 extends St4{
	public static void reverse(int data, Stack s) {
		if(s.em()) {
			s.push(data);
			return;
		}
		int t = s.pop();
		reverse(data, s);
		s.push(t);
	}
	public static void rd(Stack s) {
		if(s.em()) {
			return;
		}
		int t = s.pop();
		rd(s);
		reverse(t, s);
	}
}*/
public class HIS4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacc4.Stack s = new Stacc4.Stack();
		
		s.push(10);
		s.push(20);
		s.push(56);
		
		while(!s.em()) {
			
		}
		
	}


}
