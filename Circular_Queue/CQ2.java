
public class CQ2 {
	static class Queue{
		static int a[];
		static int s;
		static int r = -1;
		static int f = -1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return r == -1 && f == -1;
		}
		public static boolean isFull() {
			return (f+1)%s==r;
		}
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Queue is Full:");
				return;
			}
			if(f == -1) {
				f = 0;
			}
			r = (r+1)%s;
			a[r] =  data;
		}
		public static int rempove() {
			if(isEmpty()) {
				System.out.println("Queue is Empty:");
				return -1;
			}
			int res = a[f];
			if(r == f) {
				r = f= -1;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CQ2.Queue q = new CQ2.Queue(3);
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q.rempove());
		
		q.add(40);
		
		System.out.println(q.rempove());
		
		q.add(50);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.rempove();
		}
		
	}

}
