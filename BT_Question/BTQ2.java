
public class BTQ2 {
	static int m;
	static class Node{
		int data;
		Node left;
		Node right;
		public BTQ2.Node leftNode;
		public BTQ2.Node rightNode;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	/*static class Tree{
		static int i = -1;
		public static Node BT(int a[]) {
			i++;
			
			if(a[i] == -1) {
				return null;
			}
			Node nd = new Node(a[i]);
			nd.leftNode = BT(a);
			nd.rightNode = BT(a);
			
			return nd;
		}
	}*/
	/*public static void ss(Node root) {
		if(root == null) {
			return;
		}
		
	}*/
	public static Node insert(Node root, int val) {
		if(root == null) {
			root  = new Node(val);
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
	public static void Is(int a[]) {
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
	public static int Ip(int a[]) {
		int s = 0, e = a.length-1;
		int n = a.length;
		while(s<=e) {
			int m = (s+e)/2;
			if(a[n] % 2 != 0) {
				return a[n];
 			}
			else {
				return a[n];
			}
		}
		return -1;
	}
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);

		inorder(root.right);

		System.out.print(root.data+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,8,9,4,5,6,1,2,3};
		
		Is(a);
		//System.out.print(Ip(a));
		
		
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/
		
		
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		//System.out.print(root.data);
		
		inorder(root);
	}

}
