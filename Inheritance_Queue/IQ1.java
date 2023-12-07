import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

class qi{
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
class qii{
	static class Queue{
		static int a[],s,r=-1;
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
class qiii{
	static class Queue{
		static int a[];
		static int s;
		static int r = -1, f = -1;
		
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
public class IQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//qi.Queue q = new qi.Queue();
		//qii.Queue q = new qii.Queue(5);
		//qiii.Queue q = new qiii.Queue(5);
		//Queue<Integer> q = new LinkedList<>();
		//Queue<Integer> q = new PriorityQueue<>(5);
		Queue<Integer> q = new ArrayBlockingQueue<>(5);
		
		q.add(111);
		q.add(20);
		q.add(30);
		q.add(40);
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}

	}

}
