import java.util.*;

public class ALS16 {
	static void pd(int d, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(d);
			return;
		}
		int t = s.peek();
		s.pop();
		pd(d, s);
		s.push(t);
	}
	static void re(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int t = s.peek();
		s.pop();
		re(s);
		pd(t, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(10);
		s.pop();
		pd(30, s);
		s.push(20);
		s.push(40);
		
		re(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
