import java.util.*;

public class St7 {
	public static void PushBottom(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		PushBottom(data, s);
		s.push(top);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		PushBottom(4, s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
