

public class SN3 {
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
	/*static class Tree{
	 * 	int i=-1;
	 * 	public static Node Bt(int a[]){
	 * 		i++;
	 * 		if(a[i] == -1){
	 * 			return null;
	 * 		}
	 * 		Node nd = new Node(a[i]);
	 * 		nd.l = Bt(a);
	 * 		nd.r = Bt(a);
	 * 		return nd;
	 * 	}
	 * }*/
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data > val) {
			root.l = insert(root.l,val);
		}
		else {
			root.r = insert(root.r,val);
		}
		return root;
	}
	public static int Sn(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = Sn(root.l);
		int rn = Sn(root.r);
		
		return ln + rn + root.data;
	}
	public static void main(String args[]) {
		int a[] = {9,8,7,3,2,1,4,5,6};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		System.out.print(Sn(root));
	}
}