import java.util.*;

public class SA7 {
	static class Stack{
		static ArrayList<String> list = new ArrayList<>();
		
		static boolean isEmpty() {
			return list.size() == 0;
		}
		
		static void push(String data) {
			list.add(data);
		}
		static String pop() {
			if(isEmpty()) {
				return "0";
			}
			String t = list.get(list.size()-1);
			list.remove(list.size()-1);
			return t;
		}
		public static String peek() {
			if(isEmpty()) {
				return "0";
			}
			return list.get(list.size()-1);
		}
		static void reverse() {
			if(isEmpty()) {
				return;
			}
			String s = pop();
			reverse();
			push(s);
		}
	}
	public static void main(String args[]) {
		Stack s = new Stack();
		
		s.push("Hello");
		s.push("Pravin");
		
		//s.reverse();
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
		
	}
}
