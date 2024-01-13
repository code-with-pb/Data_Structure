
import java.util.*;

public class Bt5 {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d){
			this.data = d;
			this.left = null;
			this.right = null;
		}
	}
/*	static class Tree{
		static int i = -1;
		public static Node BT(int a[]) {
			i++;
			
			if(a[i] == -1) {
				return null;
			}
			Node nd = new Node(a[i]);
			nd.left = BT(a);
			nd.right = BT(a);
			
			return nd;
		}
	} */
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data > val) {
			root.left = insert(root.left, val);
		}
		else {
			root.right = insert(root.right, val);
		}
		return root;
	}
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void levelorder(Node root) {
		if(root == null) {
			return;
		}
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node curr = q.remove();
			if(curr == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(curr.data+" ");
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
		}
	}
	public static void main(String args[]) {
		int a[] = {7,8,9,4,5,6,1,2,3,0};
		
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		
		preorder(root);
		
		System.out.println();
		
		inorder(root);
		
		System.out.println();
		
		postorder(root);
		
		System.out.println();
		System.out.println();
		
		levelorder(root);
	}
}
