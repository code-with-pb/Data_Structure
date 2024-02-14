import java.util.*;

public class BST11 {
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
	/*static class Tree{
		static int i = -1;
		public static Node Bt(int a[]) {
			i++;
			
			if(a[i] == -1) {
				return null;
			}
			Node nd = new Node(a[i]);
			nd.l = Bt(a);
			nd.r = Bt(a);
			
			return nd;
		}
	}*/
	public static Node insert(Node root,int k) {
		if(root == null) {
			root = new Node(k);
			return root;
		}
		if(root.d > k) {
			root.l = insert(root.l,k);
		}
		else {
			root.r = insert(root.r, k);
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
	public static boolean search(Node root,int k) {
		if(root == null) {
			return false;
		}
		if(root.d > k) {
			return search(root.l,k);
		}
		else if(root.d == k) {
			return true;
		}
		else {
			return search(root.r,k);
		}
	}
	public static Node inorderSuccessor(Node root) {
		if(root.l != null) {
			root = root.l;
		}
		return root;
	}
	public static Node delete(Node root, int k) {
		if(root.d > k) {
			root.l =  delete(root.l,k);
		}
		else if(root.d < k) {
			root.r = delete(root.r,k);
		}
		else {
			if(root.l == null && root.r == null) {
				return null;
			}
			if(root.l == null) {
				return root.r;
			}
			else if(root.r == null){
				return root.l;
			}
			Node is = inorderSuccessor(root.r);
			root.d = is.d;
			root.r = delete(root.r,is.d);
		}
		return root;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,3,9,1,2,8,4,6};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		inorder(root);
		System.out.println();
		
		if(search(root,2)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		delete(root,8);
		inorder(root);
	}

}
