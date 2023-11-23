import java.util.*;
import java.util.Stack;

class sta {
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
class ArrayL5{
	static class Arr{
		static ArrayList<Integer> list = new ArrayList<>();
		public static boolean em() {
			return list.size() == -1;
		}
		public static void push(int data) {
			list.add(data);
		}
		public static int pop() {
			if(em()) {
				return -1;
			}
			int t = list.get(list.size()-1);
			list.remove(list.size()-1);
			return t;
		}
		public static int peek() {
			if(em()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}
}
public class HIS5 {
	public static void pd(int data,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int t = s.pop();
		pd(data, s);
		s.push(t);
	}
	public static void rever(Stack<Integer>s) {
		if(s.isEmpty()) {
			return;
		}
		int t = s.pop();
		rever(s);
		pd(t, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sta.Stack s = new sta.Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		while(!s.em()) {
			System.out.print(s.peek()+" ");
			s.pop();
			
		}
		
		ArrayL5.Arr a = new ArrayL5.Arr();
		
		a.push(10);
		s.push(20);
		a.push(30);
		
		while(!a.em()) {
			System.out.print(a.peek()+" ");
			a.pop();
		}
		
		Stack sc = new Stack();
		
		sc.push(10);
		sc.push(20);
		sc.push(30);
		
		pd(10, s);
		rever(s);
		
		while(!sc.isEmpty()) {
			System.out.print(sc.peek()+" ");
			s.pop();
		}
	}

}
