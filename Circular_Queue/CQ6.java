
public class CQ6 {
	static class Queue{
		static int a[],s,r=-1,f=-1;
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
		public static void en(int data) {
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
		public static int de() {
			if(em()) {
				System.out.println("Empty");
				return -1;
			}
			int res = a[f];
			if(f == r) {
				f = r = -1;
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
		
		System.out.println(q.de());
		
		q.en(10);
		q.en(20);
		q.en(30);
		q.en(0);
		q.en(50);
		q.en(60);
		
		System.out.println(q.de());
		System.out.println(q.de());
		System.out.println(q.de());
		System.out.println(q.de());
		
		q.en(40);
		q.en(30);
		q.en(20);
		q.en(10);
		q.en(0);
		
		while(!q.em()) {
			System.out.println(q.peek());
			q.de();
		}
	}

}
