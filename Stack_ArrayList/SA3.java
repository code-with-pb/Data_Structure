import java.util.*;

public class SA3 {
	static class Stack{
		static ArrayList<Integer> list = new ArrayList<>();
		
		public static boolean isEmpty() {
			return list.size() == 0;
		}
		public static void push(int data) {
			list.add(data);
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int t = list.get(list.size()-1);
			list.remove(list.size()-1);
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SA3.Stack s = new SA3.Stack();
		
		s.push(0);
		s.push(0);
		s.push(30);
		s.push(10);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
