import java.util.*;

public class St21 {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
		
	}

}
