
public class CQ5 {
	static class Queue{
		static int a[],s,r=-1,f=-1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		
		public static boolean em() {
			return f == -1 && r == -1;
		}
		public static boolean fl() {
			return (r+1)%s == f;
		}
		public static void add(int data) {
			if(fl()) {
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
				return -1;
			}
			int res = a[f];
			if(r == f) {
				r = f = -1;
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
		Queue q = new Queue(5);
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		q.add(40);
		q.add(50);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		q.add(60);
		q.add(70);
		
		while(!q.em()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
