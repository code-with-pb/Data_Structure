
public class CQ11 {
	static class Queue{
		static int a[],s,r = -1, f = -1;
		
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
				return;
			}
			if(f == -1) {
				f = 0;
			}
			r = (r+1)%s;
			a[r] = data;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = a[f];
			if(f == r) {
				f = r = -1;
			}
			else {
				f = (f+1)%s;
			}
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return a[f];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.add(0);
		q.add(10);
		q.add(15);
		q.add(20);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
