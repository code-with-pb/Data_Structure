import java.util.Stack;

public class St4 {
	public static void pushBottom(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushBottom(data, s);
		s.push(top);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(1);
		s.push(3);
		s.push(8);
		
		pushBottom(4, s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}
