
public class BTQ4 {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d){
			this.data = d;
			this.left = null;
			this.right = null;
		}
	}
/*	static class Tree{
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
		}	*/
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
		int leftnd = CN(root.left);
		int rightnd = CN(root.right);
		
		return leftnd + rightnd + 1;
	}
	public static int SM(Node root) {
		if(root == null) {
			return 0;
		}
		int lnd = SM(root.left);
		int rn = SM(root.right);
		
		return lnd + rn + root.data;
	}
	public static int HN(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = HN(root.left);
		int rn = HN(root.right);
		
		return Math.max(ln, rn) + 1;
	}
	
	static class Height{
		int d;
		int h;
		
		Height(int d,int h){
			this.d = d;
			this.h = h;
		}
	}
	public static Height DM2(Node root) {
		if(root == null) {
			return new Height(0,0);
		}
		Height ln = DM2(root.left);
		Height rn = DM2(root.right);
		
		int hn = Math.max(ln.h, rn.h) + 1;
		
		int d1 = ln.d;
		int d2 = rn.d;
		int d3 = ln.h + rn.h + 1;
		
		int dm = Math.max(d3, Math.max(d1, d2));
		
		Height i = new Height(hn, dm);
		
		return i;
	 
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
	public static void main(String args[]) {
		int a[] = {7,8,9,1,2,3,4,5,6};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		
		System.out.println(DM2(root).d+" ");
	}
}
