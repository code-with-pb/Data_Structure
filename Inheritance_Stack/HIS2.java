import java.util.*;
import java.util.Stack;
import java.util.ArrayList;

class stack{
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
}
class Arrl2{
	static class Stackk{
		static ArrayList<Integer> list = new ArrayList<>();
		public static boolean isEmpty() {
			return list.size() == 0;
		}
		public static void push(int data) {
			list.add(data);
			return;
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}
}
public class HIS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter coice 1) 2) 3): "); 
			int n = sc.nextInt();
			
			switch(n) {
				case 1: Stack s = new Stack();
						s.push(1);
						s.push(2);
						s.push(3);
						s.push(4);
						
						while(!s.isEmpty()) {
							System.out.print(s.peek()+" ");
							s.pop();
						}
						break;
				case 2: Arrl2.Stackk o = new Arrl2.Stackk();
						o.push(5);
						o.push(6);
						o.push(7);
						o.push(8);
						
						while(!o.isEmpty()) {
							System.out.print(o.peek()+" ");
							o.pop();
						}
						break;
				case 3: Stack<Integer> st = new Stack<>();
						st.push(9);
						st.push(10);
						st.push(11);
						st.push(14);
						
						while(!st.isEmpty()) {
							System.out.print(st.peek()+" ");
							st.pop();
						}
						break;
				default: System.out.print("Invalid Input...");
				break;
			}
			i++;
		}while(i<3);
	}

}
