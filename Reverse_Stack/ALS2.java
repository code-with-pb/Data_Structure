import java.util.Stack;

public class ALS2 {
	public static void pd(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pd(data, s);
		s.push(top);
	}
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverse(s);
		pd(top, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
		System.out.println();
		
		pd(40, s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
		System.out.println();
		
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
