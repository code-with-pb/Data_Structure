
public class CQ9 {
	static class Queue{
		static int a[],s,r=-1,f=-1;
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return r == -1 && f == -1;
		}
		public static boolean isFull() {
			return (r+1)%s == f;
		}
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Full");
				return;
			}
			if(f == -1) {
				f = 0;
			}
			r = (r+1)%s;
			a[r] = data;
		}
		public static int pop() {
			if(isEmpty()) {
				System.out.println("Empty");
				return -1;
			}
			int res = a[f];
			if(r == f) {
				f = r = -1;
			}
			else {
				f = (f+1)%s;
			}
			return res;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return a[f];
		}
	}
	public static void main(String args[]) {
		Queue q = new Queue(5);
		
		System.out.println(q.pop());
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(90);
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		
		q.add(60);
		q.add(70);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.pop();
		}
	}
}
