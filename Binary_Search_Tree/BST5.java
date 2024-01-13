
public class BST5 {
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
	/* static class Tree{
	 * static int i = -1;
	 * public static Node BT(int a[]){
	 * 		i++;
	 * 		if(a[i] == -1){
	 * 			return null;
	 * 		}
	 * 		Node nd = new Node(a[i]);
	 * 		nd.left = BT(a);
	 * 		nd.right = BT(a);
	 * 
	 * 		return nd;
	 *  }*/
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
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static boolean Search(Node root, int k) {
		if(root == null) {
			return false;
		}
		if(root.data > k) {
			return Search(root.left, k);
		}
		else if(root.data == k) {
			return true;
		}
		else {
			return Search(root.right, k);
		}
	}
	public static void main(String args[]) {
		int a[] = {7,8,9,4,5,6,1,2,3,0};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		
		inorder(root);
		System.out.println();
		
		if(Search(root, 4)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
