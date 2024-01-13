import java.util.ArrayList;

public class BSTQ2 {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
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
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void printInRange(Node root, int x, int y) {
		if(root == null) {
			return;
		}
		if(root.data >= x && y >= root.data) {
			printInRange(root.left, x, y);
			System.out.print(root.data+" ");
			printInRange(root.right,x, y);
		}
		else if(root.data >= y){
			printInRange(root.left, x, y);
		}
		else {
			printInRange(root.right, x, y);
		}
	}
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+" ");
		}
		System.out.println();
	}
	public static void printLeaf2Root(Node root, ArrayList<Integer> path) {
		if(root == null) {
			return;
		}
		path.add(root.data);
		
		if(root.left == null && root.right == null) {
			printPath(path);
		}
		else {
			printLeaf2Root(root.left, path);
			printLeaf2Root(root.right, path);
		}
		path.remove(path.size()-1);
	}
	public static void main(String args[]) {
		int a[] = {7,8,9,4,5,6,1,2,3,0};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		inorder(root);
		System.out.println();
		System.out.println();
		
		printInRange(root, 1, 6);
		
		System.out.println();
		
		printLeaf2Root(root, new ArrayList<>());
	}
}
