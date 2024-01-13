
public class CQ17 {
	static class Queue{
		static int a[];
		static int s;
		static int t = -1, h = -1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return t == -1 && h == -1;
		}
		public static boolean isFull(){
			return (t+1)%s == h;
		}
		public static void add(int data) {
			if(isFull()) {
				return;
			}
			if(h == -1) {
				h = 0;
			}
			t = (t+1)%s;
			a[t] = data;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int r = a[h];
			if(h == t) {
				t = h = -1;
			}
			else {
				h = (h+1)%s;
			}
			return r;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return a[h];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
