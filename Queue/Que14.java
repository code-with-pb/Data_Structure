class QD1{
	static class Queue{
		static int a[];
		static int s;
		static int r = -1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return r == -1;
		}
		public static void add(int data) {
			if(r == s-1) {
				return;
			}
			r++;
			a[r] = data;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = a[0];
			for(int i=0;i<r;i++) {
				a[i] = a[i+1];
			}
			r--;
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return a[0];
		}
	}
}
class Qd1{
	static class Queue{
		static int a[];
		static int s;
		static int r = -1, f = -1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return f == -1 && r == -1;
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
}
public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QD1.Queue q = new QD1.Queue(5);
		Qd1.Queue q1 = new Qd1.Queue(5);
		
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(20);
		q.add(10);
		
		q.remove();
		q.remove();
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
