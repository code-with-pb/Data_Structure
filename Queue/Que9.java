
public class Que9 {
	static class Queue{
		static int a[],s,r = -1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean em() {
			return r == -1;
		}
		public static void en(int data) {
			if(r == s-1) {
				return;
			}
			r++;
			a[r] = data;
		}
		public static int de() {
			if(em()) {
				return -1;
			}
			int t = a[0];
			for(int i=0;i<r;i++) {
				a[i] = a[i+1];
			}
			r--;
			return a[0];
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
		Queue q = new Queue(5);
		
		q.en(10);
		q.en(20);
		q.en(30);
		q.en(40);
		
		while(!q.em()) {
			System.out.println(q.peek());
			q.de();
		}
	}

}
