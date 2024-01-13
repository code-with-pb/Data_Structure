import java.util.Stack;

public class ALS14 {
	static void pd(int d, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(d);
			return;
		}
		int t = s.pop();
		pd(t, s);
		s.push(d);
	}
	static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int t = s.pop();
		reverse(s);
		pd(t, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		pd(40, s);
		
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
