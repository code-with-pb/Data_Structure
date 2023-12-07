import java.util.*;
import java.util.Stack;

public class ALS6 {
	public static void pd(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int t = s.pop();
		pd(data, s);
		s.push(t);
	}
	public static void re(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int t = s.pop();
		re(s);
		pd(t, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		pd(50, s);
		
		re(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
