import java.util.Stack;

public class ALS1 {
	static void addl(int data, Stack<Integer>s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int b = s.peek();  
		s.pop();
		addl(data, s);
		s.push(b);
	}
	static void reverse(Stack<Integer>s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.peek();
		s.pop();
		reverse(s);
		addl(top, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(5);
		
		addl(88, s);
		
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
		
	}

}
