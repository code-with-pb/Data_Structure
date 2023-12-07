import java.util.Stack;
import java.util.*;
import java.io.*;

public class ASL2 {
	static void add(int data, Stack<Integer>s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		add(data, s);
		s.push(top);
	}
	static void reverse(Stack<Integer>s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverse(s);
		add(top, s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(11);
		s.push(54);
		
		add(14, s);
		
		reverse(s);
		while(!s.isEmpty()) {
			System.out.print(s.peek()+" ");
			s.pop();
		}
	}

}
