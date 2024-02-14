import java.util.*;

public class BST13 {
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
	static Node insert(Node root,int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.d > val) {
			root.l = insert(root.l,val);
		}
		else {
			root.r = insert(root.r,val);
		}
		return root;
	}
	static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.l);
		System.out.print(root.d+" ");
		inorder(root.r);
	}
	static boolean search(Node root,int k) {
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
	static Node inordersucc(Node root) {
		while(root.l != null) {
			root = root.l;
		}
		return root;
	}
	static Node delete(Node root,int k) {
		if(root.d > k) {
			root.l = delete(root.l,k);
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
			else if(root.r == null) {
				return root.l;
			}
			Node is = inordersucc(root.r);
			root.d = is.d;
			root.r = delete(root.r,is.d);
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,3,6,1,4,2,8,9};
		Node root = null;
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		inorder(root);
		if(search(root,6)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		System.out.println();
		delete(root,6);
		inorder(root);
	}

}
