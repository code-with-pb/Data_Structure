
public class Que12 {
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
				System.out.println("Full");
				return;
			}
			r++;
			a[r] = data;
		}
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty");
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.add(10);
		q.add(35);
		q.add(55);
		q.add(25);
		q.add(65);
		q.remove();
		q.add(85);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
