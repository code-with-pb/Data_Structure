import java.util.*;

public class BST4 {
	static class Node{
		int d;
		Node l;
		Node r;
		
		Node(int d){
			this.d = d;
			this.l = null;
			this.r = null;
		}
	}
	static class Tree{
		static int i = -1;
		public static Node BT(int a[]) {
			i++;
			
			if(a[i] == -1) {
				return null;
			}
			Node nd = new Node(a[i]);
			nd.l = BT(a);
			nd.r = BT(a);
			
			return nd;
		}
	}
	/*public static void (Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(currNode.d+" ");
				if(currNode.l != null) {
					q.add(currNode.l);
				}
				if(currNode.r != null) {
					q.add(currNode.r);
				}
			}
		}
	}*/
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.d > val) {
			root.l = insert(root.l, val);
		}
		else {
			root.r = insert(root.r, val);
		}
		return root;
	}
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.l);
		System.out.print(root.d+" ");
		inorder(root.r);
	}
	public static boolean search(Node root, int k) {
		if(root == null) {
			return false;
		}
		if(root.d > k) {
			return search(root.l, k);
		}
		else if(root.d == k) {
			return true;
		}
		else {
			return search(root.r, k);
		}
	}
	public static void main(String args[]) {
		int a[]= {5,6,4,9,1,8,2,7,3};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root  = insert(root, a[i]);
		}
		
		inorder(root);
		
		if(search(root, 2)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
