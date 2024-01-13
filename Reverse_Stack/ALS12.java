import java.util.Stack;
import java.util.*;

public class ALS12 {
	static void pd(String d, Stack<String> s) {
		if(s.isEmpty()) {
			s.push(d);return;
		}
		String t = s.pop();
		pd(d, s);
		s.push(t);
	}
	static void reverse(Stack<String>s) {
		if(s.isEmpty()) {
			return;
		}
		String t = s.pop();
		reverse(s);
		pd(t, s);
	}
	public static void main(String args[]) {
		Stack s = new Stack();
		
		s.push("Hello");
		
		pd("Pravin", s);
		
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}
}
