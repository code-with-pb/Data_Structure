import java.util.*;

public class BTQ7 {
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
			root.r = insert(root.r,k);
		}
		return root;
	}
	public static int CN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = CN(root.l);
		int rn = CN(root.r);
		
		return ln + rn + 1;
	}
	public static int SN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = SN(root.l);
		int rn = SN(root.r);
		
		return ln + rn + root.d;
	}
	public static int HT(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = HT(root.l);
		int rn = HT(root.r);
		
		return Math.max(ln, rn) + 1;
	}
	public static int DM1(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = DM1(root.l);
		int rn = DM1(root.r);
		
		int ht = Math.max(ln, rn) + 1;
		
		return Math.max(ht,Math.max(ln, rn));
	}
	public static class TreeInfo{
		int h,d;
		
		TreeInfo(int h,int d){
			this.h = h;
			this.d = d;
		}
	}
	public static TreeInfo DM2(Node root) {
		if(root == null) {
			return new TreeInfo(0,0);
		}
		TreeInfo ln = DM2(root.l);
		TreeInfo rn = DM2(root.r);
		
		int hn = Math.max(ln.h, rn.h) + 1;
		
		int d1 = ln.d;
		int d2 = rn.d;
		int d3 = ln.h + rn.h + 1;
		
		int d = Math.max(d1, Math.max(d2, d3));
		
		TreeInfo i = new TreeInfo(hn,d);
		
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,7,3,9,1,6,4,2,8};
		Node root = null;
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		System.out.print(DM2(root).d);
	}

}
