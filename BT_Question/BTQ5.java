import java.util.*;

public class BTQ5 {
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
	static class Tree{
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
			return -1;
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
	public static int DM1(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = DM1(root.left);
		int rn = DM1(root.right);
		int hn = HN(root.left) + HN(root.right) + 1;
		
		return Math.max(hn, Math.max(ln, rn));
	}
	static class TreeInfo{
		int h;
		int d;
		
		TreeInfo(int h, int d){
			this.h = h;
			this.d = d;
		}
	}
	public static TreeInfo DM2(Node root) {
		if(root == null) {
			return new TreeInfo(0,0);
		}
		TreeInfo ln = DM2(root.left);
		TreeInfo rn = DM2(root.right);
		
		int hn = Math.max(ln.h, rn.h) + 1;
		
		int d1 = ln.d;
		int d2 = rn.d;
		int d3 = ln.h + rn.h + 1;
		
		int myInfo = Math.max(d3, Math.max(d1, d2));
		
		TreeInfo i = new TreeInfo(hn, myInfo);
		
		return i;
	}
	public static void main(String args[]) {
		int a[] = {5,3,7,6,8,4,2};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		
		System.out.print(CN(root)+" ");
		
		System.out.println();
		
		System.out.print(SN(root));
		
		System.out.println();
		
		System.out.print(HN(root));
		
		System.out.println();
		
		System.out.print(DM1(root));
		
		System.out.println();
		
		System.out.print(DM2(root).d);
	}
}
