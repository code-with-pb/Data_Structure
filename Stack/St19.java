import java.util.*;

public class St19 {
	static void cal(int data,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		cal(data, s);
		s.push(top);
	}
	
	static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverse(s);
		cal(top, s);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(101);
		s.push(45);
		
		cal(70, s);
		
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
		
	}

}
