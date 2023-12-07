
public class Que11 {
	static class Queue{
		static int a[],s,r=-1,f=-1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return r==-1;
		}
		public static void push(int data) {
			if(r == s-1) {
				System.out.println("Full");
				return;
			}
			r++;
			a[r] = data;
		}
		public static int pop() {
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
				System.out.println("Empty");
				return -1;
			}
			return a[0];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		
		System.out.println(q.pop());
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.pop();
		}
	}

}
