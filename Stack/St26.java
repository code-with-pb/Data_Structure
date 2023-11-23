import java.util.*;

public class St26 {
	static class Stack{
		static ArrayList<Integer> list = new ArrayList<>();
		public static boolean em() {
			return list.size() == 0;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		St26.Stack s = new St26.Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		while(!s.em()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
