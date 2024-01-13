import java.util.*;

public class CQ16 {
	static class Queue{
		static String a[];
		static int s;
		static int r = -1 , f = -1;
		
		Queue(int n){
			a = new String[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return r == -1 && f == -1;
		}
		public static boolean isFull() {
			return (r+1)%s == f;
		}
		public static void add(String data) {
			if(isFull()) {
				return;
			}
			if(f == -1) {
				f = 0;
			}
			r = (r+1)%s;
			a[r] = data;
		}
		public static String remove() {
			if(isEmpty()) {
				return "0";
			}
			String t = a[f];
			if(f == r) {
				r = f = -1;
			}
			else {
				f = (f+1)%s;
			}
			return t;
		}
		static String peek() {
			if(isEmpty()) {
				return "0";
			}
			return a[f];
		}
	}
	public static void main(String args[]) {
		Queue q = new Queue(5);
		
		q.add("Hello");
		q.add("Pravin");
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}
}
