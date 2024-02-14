import java.util.*;

public class BTQ8 {
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
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.l);
		System.out.print(root.d+" ");
		inorder(root.r);
	}
	static int CN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = CN(root.l);
		int rn = CN(root.r);
		
		return ln + rn + 1;
	}
	static int SN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = SN(root.l);
		int rn = SN(root.r);
		
		return ln + rn + root.d;
	}
	static int Ht(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = Ht(root.l);
		int rn = Ht(root.r);
		
		return Math.max(ln, rn) + 1;
	}
	static int DM(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = DM(root.l);
		int rn = DM(root.r);
		int ht = Math.max(ln, rn) + 1;
		
		return Math.max(ht, Math.max(ln, rn));
	}
	static class dd{
		int h,d;
		
		dd(int h,int d){
			this.h = h;
			this.d = d;
		}
	}
	static dd dm(Node root) {
		if(root == null) {
			return new dd(0,0);
		}
		dd ln = dm(root.l);
		dd rn = dm(root.r);
		int ht = Math.max(ln.h, rn.h) + 1;
		
		int d1 = ln.d;
		int d2 = rn.d;
		int d3 = ln.h + rn.h + 1;
		
		int dmm = Math.max(d3, Math.max(d1, d2));
		
		dd d = new dd(ht,dmm);
		
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,3,6,2,1,4,8,9,10};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		inorder(root);
		System.out.println();
		System.out.println(dm(root).d);
	}

}
