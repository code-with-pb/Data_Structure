import java.util.*;

public class BSTQ5 {
	static class Node{
		int data;
		Node l;
		Node r;
		
		Node(int d){
			this.data = d;
			this.l = null;
			this.r = null;
		}
	}
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data > val) {
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
		System.out.print(root.data+" ");
		inorder(root.r);
	}
	public static void printInRange(Node root, int x,int y) {
		if(root == null) {
			return;
		}
		if(root.data >= x && root.data <= y) {
			printInRange(root.l, x,y);
			System.out.print(root.data+" ");
			printInRange(root.r, x,y);
		}
		else if(root.data >= y) {
			printInRange(root.l, x,y);
		}
		else {
			printInRange(root.r, x,y);
		}
	}
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+" ");
		}
		System.out.println();
	}
	public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
		if(root == null) {
			System.out.print(path);
			return;
		}
		path.add(root.data);
		
		//for(int i=0;i<path.size();i++) {
			if(root.l == null && root.r == null) {
				printPath(path);
			}
			else {
				printRoot2Leaf(root.l, path);
				printRoot2Leaf(root.r, path);
			}
			path.get(path.size()-1);
		//}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,3,6,8,1,2,4};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		
		inorder(root);
		
		System.out.println();
		
		printInRange(root, 1, 8);
		
		System.out.println();
		
		printRoot2Leaf(root, new ArrayList<>());
	}

}
