
public class Que8 {
	static class Queue{
		static int a[];
		static int s;
		static int r = -1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean em() {
			return r == -1;
		}
		public static void push(int d) {
			if(r == s-1) {
				return;
			}
			r++;
			a[r] = d;
		}
		public static int pop() {
			if(em()) {
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
		Queue q = new Queue(50);
		
		q.push(10);
		q.push(0);
		q.push(11);
		
		while(!q.em()) {
			System.out.println(q.peek());
			q.pop();
		}
	}

}
