import java.util.*;

public class ALS18 {
	static void pd(int d,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.add(d);
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
		pd(t,s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(40);
		s.push(30);
		s.push(50);
		
		s.pop();
		
		re(s);
		
		pd(20,s);
		pd(10,s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
		
	}

}
