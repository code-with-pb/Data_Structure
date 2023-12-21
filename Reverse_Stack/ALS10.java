import java.util.Stack;

public class ALS10 {
	public static void pd(int d,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(d);
		}
		int t = s.pop();
		pd(d, s);
		s.push(t);
	}
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int t = s.pop();
		reverse(s);
		pd(t, s);
	}
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		s.pop();
		
		pd(32, s);
		
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
		
	}

}
