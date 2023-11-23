import java.util.*;

class Arrr1{
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
}
class Arrr2{
	static class Stack{
		static ArrayList<Integer> l = new ArrayList<>();
		
		public static boolean em() {
			return l.size() == 0;
		}
		public static void push(int data) {
			l.add(data);
		}
		public static int pop() {
			if(em()) {
				return -1;
			}
			int t = l.get(l.size()-1);
			l.remove(l.size()-1);
			return t;
		}
		public static int peek() {
			if(em()) {
				return -1;
			}
			return l.get(l.size()-1);
		}
	}
}
public class HIS6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Arrr1.Stack s = new Arrr1.Stack();
		s.push(10);
		s.push(20);
		s.push(30);*/
		
		Arrr2.Stack s1 = new Arrr2.Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		while(!s1.em()) {
			System.out.println(s1.peek());
			s1.pop();
		}
	}

}
