
public class CQ1 {
	static class Queue{
		static int a[];
		static int size;
		static int r = -1;
		static int f = -1;
		
		Queue(int n){
			a = new int[n];
			this.size = n;
		}
		public static boolean em() {
			//System.out.println("Queue is Empty:");
			return r == -1 && f == -1;
		}
		public static boolean fl() {
			//System.out.println("Queue is Full:");
			return (r+1) % size == f;
		}
		public static void add(int data) {
			if(fl()) {
				return;
			}
			if(f == -1) {
				f = 0;
			}
			r = (r+1)%size;
			a[r] = data;
		}
		public static int remove() {
			if(em()) {
				return -1;
			}
			int res = a[f];
			if(f == r) {
				r = f = -1;
			}
			else {
				f = (f+1)%size;
			}
			return res;
		}
		public static int peek() {
			if(em()) {
				return -1;
			}
			return a[f];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CQ1.Queue q = new CQ1.Queue(2);
		
		q.add(10);
		q.add(20);
		
		System.out.println(q.remove());
		
		q.add(30);
		
		while(!q.em()) {
			System.out.println(q.peek()+" ");
			q.remove();
		};
	}

}
