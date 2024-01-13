
public class DTA2 {
	static class Node{
		int data;
		Node l;
		Node r;
		
		Node(int data){
			this.data = data;
			this.l = null;
			this.r = null;
		}
	}
	static class Tree{
		static int  i = -1;
		public static Node BT(int a[]) {
			i++;
			
			if(a[i] == -1) {
				return null;
			}
			Node nd = new Node(a[i]);
			nd.l = BT(a);
			nd.r = BT(a);
			
			return nd;
		}
	}
	static class TreeInfo{
		int h;
		int d;
		
		TreeInfo(int h, int d){
			this.h = h;
			this.d = d;
		}
	}
	public static Node insert(Node root, int val) {
		if(root == null) {
			root  = new Node(val);
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
	public static TreeInfo DM(Node root) {
		if(root == null) {
			return new TreeInfo(0,0);
		}
		TreeInfo ln = DM(root.l);
		TreeInfo rn = DM(root.r);
		
		int hn = Math.max(ln.h, rn.h) + 1;
		
		int d1 = ln.d;
		int d2 = rn.d;
		int d3 = ln.h + rn.h + 1;
		
		int diam = Math.max(d2, Math.max(d1, d3));
		
		TreeInfo i = new TreeInfo(hn, diam);
		
		return i;
	}
	public static void main(String args[]) {
		int a[] = { 5,4,6,3,2,1,7,9,8};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		System.out.println(DM(root).d);
	}
}
