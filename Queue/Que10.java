
public class Que10 {
	static class Queue{
		static int a[],s,r=-1;
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean em() {
			return r == -1;
		}
		public static void push(int data) {
			if(r == s-1) {
				return;
			}
			r++;
			a[r] = data;
		}
		public static int pop() {
			if(em()) {
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
			if(em()) {
				return -1;
			}
			return a[0];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(3);
		q.push(10);
		q.push(20);
		q.push(40);
		
		while(!q.em()){
			System.out.println(q.peek());
			q.pop();
		}
	}

}
