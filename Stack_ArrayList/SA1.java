import java.util.ArrayList;

public class SA1 {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(10);
		s.push(1);
		s.push(2);
		s.push(30);
		s.pop();
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
