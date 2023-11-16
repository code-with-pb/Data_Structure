import java.util.ArrayList;
import java.util.Stack;

public class St15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>s = new Stack<>();
		
		s.push(5);
		s.push(6);
		s.push(8);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
	}

}
