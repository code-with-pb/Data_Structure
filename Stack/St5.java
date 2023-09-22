import java.util.Stack;

public class St5 {
	public static void pushBottom(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushBottom(data, s);
		s.push(top);
	}
	
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverse(s);
		pushBottom(top, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(1);
		s.push(3);
		s.push(8);
		
		reverse(s); 
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}
}
