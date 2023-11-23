import java.util.*;

public class Que7 {
	static class Queue{
		static int a[];
		static int size;
		static int r = -1;
		Queue(int n){
			a = new int[n];
			this.size = n;
		}
		public static boolean em() {
			return r == -1;
		}
		public static void enqueue(int data) {
			if(r == size-1) {
				System.out.println("Full Queue: ");
				return;
			}
			r++;
			a[r] = data;
		}
		public static int dequeue() {
			if(em()) {
				System.out.println("Empty Queue: ");
				return -1;
			}
			int f = a[0];
			for(int i=0;i<r;i++) {
				a[i] = a[i+1];
			}
			r--;
			return f;
		}
		public static int peek() {
			if(em()) {
				return -1;
			}
			return a[0];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que7.Queue q = new Que7.Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		while(!q.em()) {
			System.out.print(q.peek()+" ");
			q.dequeue();
		}
	}

}
