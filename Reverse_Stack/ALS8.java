import java.util.*;

public class ALS8 {
	static void pd(int data,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int t = s.pop();
		pd(data, s);
		s.push(t);
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
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(35);
		
		pd(55, s);
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
