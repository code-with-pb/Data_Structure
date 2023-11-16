

public class Que2 {
	static class Queue{
		static int a[];
		static int size;
		static int r = -1;
		
		Queue(int n){
			a = new int[n];
			this.size = n;	
		}
		public static boolean isEmpty() {
			return r == -1;
		}
		public static void Enqueue(int data) {
			if(r == size-1) {
				System.out.println("Full Queue: ");
				return;
			}
			r++;
			a[r] = data;
		}
		public static int Dequeue() {
			if(isEmpty()) {
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
			if(isEmpty()) {
				return -1;
			}
			return a[0];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.Dequeue();
		}
	}

}
