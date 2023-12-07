import java.util.*;
class stt1{
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
}
class sttt1{
	static class Stack{
		static ArrayList<Integer> l = new ArrayList<>();
		
		public static boolean isEmpty() {
			return l.size() == 0;
		}
		public static void push(int data) {
			l.add(data);
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int t = l.get(l.size()-1);
			l.remove(l.size()-1);
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return l.get(l.size()-1);
		}
	}
}
class stttt1{
	public static void pf(int data,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
		}
		int t = s.pop();
		pf(data, s);
		s.push(t);
	}
	public static void re(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int t = s.pop();
		re(s);
		pf(t,s);
	}
}
public class HIS8 {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		stttt1.pf(10, s);
		
		stttt1.re(s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
