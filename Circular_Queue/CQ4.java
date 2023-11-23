
public class CQ4 {
	static class Queue{
		static int a[];
		static int s;
		static int r = -1;
		static int f = -1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean em() {
			return r == -1 && f == -1;
		}
		public static boolean fl() {
			return (r+1)%s == f;
		}
		public static void add(int data) {
			if(fl()) {
				System.out.println("Full");
				return;
			}
			if(f == -1) {
				f = 0;
			}
			r = (r+1)%s;
			a[r] = data;
		}
		public static int remove() {
			if(em()) {
				System.out.println("Empty");
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
			if(em()) {
				return -1;
			}
			return a[f];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(3);
		
		q.remove();
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q.remove());
		
		q.add(50);
		q.add(60);
		
		while(!q.em()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
