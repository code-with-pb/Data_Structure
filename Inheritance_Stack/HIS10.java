import java.util.ArrayList;

public class HIS10 {
	static class Stack{
		static ArrayList<Integer> list = new ArrayList<>();
		public static boolean isEmpty() {
			return list.size() == 0;
		}
		public static void push(int d) {
			list.add(d);
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
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
