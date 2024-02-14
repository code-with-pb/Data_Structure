import java.util.*;

public class BSTQ6 {
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
	public static Node insert(Node root, int k) {
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
	static void printinrange(Node root,int x,int y) {
		if(root == null) {
			return;
		}
		if(x <= root.d && y >= root.d) {
			printinrange(root.l, x,y);
			System.out.print(root.d+" ");
			printinrange(root.r,x,y);
		}
		else if(root.d >= y) {
			printinrange(root.l,x,y);
		}
		else {
			printinrange(root.r,x,y);
		}
	}
	public static void PrintPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+" ");
		}
		System.out.println();
	}
	public static void PrintRoot2Leaf(Node root, ArrayList<Integer> path) {
		if(root == null) {
			System.out.print(path);
			return;
		}
		path.add(root.d);
		
		if(root.l == null && root.r == null) {
			PrintPath(path);
		}
		else {
			PrintRoot2Leaf(root.l,path);
			PrintRoot2Leaf(root.r,path);
		}
		path.get(path.size()-1);
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
		printinrange(root,1,7);
		System.out.println();
		PrintRoot2Leaf(root,new ArrayList<>());
	}

}
