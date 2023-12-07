import java.util.*;
class qi1{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class Queue{
		public static Node head;
		
		public static boolean isEmpty() {
			return head == null;
		}
		public static void add(int data) {
			Node nd = new Node(data);
			if(isEmpty()) {
				head = nd;
				return;
			}
			nd.next = head;
			head = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = head.data;
			head = head.next;
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
}
class qii1{
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
				return;
			}
			r++;        
			a[r] = data;
		}
		public static int remove() {
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
				return -1;
			}
			return a[0];
		}
	}
}
class qiii1{
	static class Queue{
		static int a[];
		static int s;
		static int r = -1 , f = -1;
		
		Queue(int n){
			a = new int[n];
			this.s = n;
		}
		public static boolean isEmpty() {
			return r == -1 && f == -1;
		}
		public static boolean isFull() {
			return (r+1)%s == f;
		}
		public static void add(int data) {
			if(isFull()) {
				return;
			}
			if(f == -1) {
				f = 0;
			}
			r = (r+1)%s;
			a[r] = data;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = a[f];
			if(f == r) {
				f = r = -1;
			}
			else {
				f = (f+1)%s;
			}
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return a[f];
		}
	}
}
class qiiii1{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	static class Queue{
		public static Node head = null;
		public static Node tail = null;
		
		public static boolean isEmpty() {
			return head == null && tail == null;
		}
		public static void add(int data) {
			Node nd = new Node(data);
			if(tail == null) {
				head = tail = nd;
				return;
			}
			tail.next = nd;
			tail = nd;
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			int t = head.data;
			if(head == tail) {
				tail = null;
			}
			head = head.next;
			
			return t;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
}
public class IQ2 {
	public static void main(String args[]) {
		//qi1.Queue q = new qi1.Queue();
		//qii1.Queue q = new qii1.Queue(5);
		//qiii1.Queue q = new qiii1.Queue(5);
		qiiii1.Queue q = new qiiii1.Queue();
		
		q.add(10);
		q.add(20);
		q.add(0);
		q.add(12);
		q.add(30);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}
}
