import java.util.*;

public class Que20 {
	static class Queue{
		static int a[];
		static int s;
		static int h = -1;
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return h == -1;
		}
		public static void add(int d) {
			if(h == s-1) {
				return;
			}
			h++;
			a[h] = d;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = a[0];
			for(int i=0;i<h;i++) {
				a[i] = a[i+1];
			}
			h--;
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return a[0];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
