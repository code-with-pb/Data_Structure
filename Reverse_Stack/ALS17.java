import java.util.*;

public class ALS17 {
	static void pd(int d,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(d);
			return;
		}
		int t = s.pop();
		pd(d, s);
		s.push(t);
	}
	static void re(Stack<Integer> s) {
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
		pd(40, s);
		re(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
