
public class BTQ3 {
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
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.d > val) {
			root.l = insert(root.l, val);
		}
		else {
			root.r = insert(root.r, val);
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
	public static int HN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = HN(root.l);
		int rn = HN(root.r);
		
		return Math.max(ln, rn)+1;
	}
	public static int DM(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = DM(root.l);
		int rn = DM(root.r);
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
	public static TreeInfo DM1(Node root) {
		if(root == null) {
			return new TreeInfo(0,0);
		}
		TreeInfo lnh = DM1(root.l);
		TreeInfo rnh = DM1(root.r);
		
		int hn = Math.max(lnh.h, rnh.h) + 1;
		
		int d1 = lnh.d;
		int d2 = rnh.d;
		int d3 = lnh.h + rnh.h + 1;
		
		int dm = Math.max(d3, Math.max(d1, d2));
		
		TreeInfo i = new TreeInfo(hn, dm);
		
		return i;
	}
	public static void main(String args[]) {
		int a[] = {5,8,3,9,2,7,4};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		
		System.out.println(DM1(root).d);
	}
}
