import java.util.*;

public class Bt8 {
	static class Node{
		static int d;
		Node l;
		Node r;
		Node(int d){
			this.d = d;
			this.r = null;
			this.l = null;
		}
	}
	static class Tree{
		
	}
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.d > val) {
			root.l = insert(root.l , val);
		}
		else {
			root.r = insert(root.r, val);
		}
		return root;
	}
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.d+" ");
		preorder(root.l);
		preorder(root.r);
	}
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.l);
		System.out.print(root.d+" ");
		inorder(root.r);
	}
	public static void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.l);
		postorder(root.r);
		System.out.print(root.d+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,7,9,6,5,4,12,3,2};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		preorder(root);
	}

}
