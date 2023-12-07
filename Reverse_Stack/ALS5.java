import java.util.Stack;

public class ALS5 {
	public static void pd(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pd(data, s);
		s.push(top);
	}
	public static void reverse(Stack<Integer>s) {
		if(s.isEmpty()) {
			return;
		}
		int tp = s.pop();
		reverse(s);
		pd(tp, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(21);
		s.push(55);
		
		pd(25,s);
		
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek());
			s.pop();
		}
	}

}
