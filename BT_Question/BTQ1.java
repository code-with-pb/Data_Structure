
public class BTQ1 {
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
	static class Tree{
		static int i = -1;
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
		int ht;
		int diam;
		
		TreeInfo(int ht, int diam){
			this.ht = ht;
			this.diam = diam;
		}
	}
	public static TreeInfo DM2(Node root) {
		if(root == null) {
			return new TreeInfo(0,0);
		}
		TreeInfo ln = DM2(root.l);
		TreeInfo rn = DM2(root.r);
		
		int hn = Math.max(ln.ht, rn.ht) + 1;
		
		int d1 = ln.diam;
		int d2 = rn.diam;
		int d3 = ln.ht + rn.ht + 1;
		
		int Diam =  Math.max(d3, Math.max(d2, d1));
		
		TreeInfo i = new TreeInfo(hn, Diam);
		
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,3,9,2,7,4};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		
		System.out.println(DM2(root).diam);
	}

}
