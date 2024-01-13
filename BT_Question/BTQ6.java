import java.util.*;

public class BTQ6 {
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
	public static int CN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = CN(root.left);
		int rn = CN(root.right);
		
		return ln + rn + 1;
	}
	public static int SN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = SN(root.left);
		int rn = SN(root.right);
		
		return ln + rn + root.data;
	}
	public static int HN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = HN(root.left);
		int rn = HN(root.right);
		
		return Math.max(ln, rn) + 1;
	}
	public static int DN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = DN(root.left);
		int rn = DN(root.right);
		int hn = Math.max(ln, rn) + 1;
		
		return Math.max(ln, Math.max(rn, hn));
	}
	static class TreeInfo{
		int h;
		int d;
		
		TreeInfo(int h, int d){
			this.h = h;
			this.d = d;
		}
	}
	public static TreeInfo DM(Node root) {
		if(root == null) {
			return new TreeInfo(0,0);
		}
		TreeInfo ln = DM(root.left);
		TreeInfo rn = DM(root.right);
		
		int hn = Math.max(ln.h, rn.h) + 1;
		
		int d1 = ln.d;
		int d2 = rn.d;
		int d3 = ln.h + rn.h + 1;
		
		int sum = Math.max(d3, Math.max(d1, d2));
		
		TreeInfo i = new TreeInfo(hn, sum);
		
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,3,6,8,4,2};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root =insert(root, a[i]);
		}
		System.out.print(DN(root)+" ");
	}
}
