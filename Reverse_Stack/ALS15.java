import java.util.Stack;
import java.util.*;

public class ALS15 {
	public static void pd(int d, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(d);
			return;
		}
		int t = s.pop();
		pd(d, s);
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
		
		s.push(20);
		s.pop();
		s.push(30);
		s.push(40);
		
		pd(20,s);
		pd(10,s);
		
		re(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
