
public class BST2 {
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
		static int idx = -1;
		public static Node BT(int nodes[]) {
			idx++;
			
			if(nodes[idx] == -1) {
				return null;
			}
			Node nd = new Node(nodes[idx]);
			nd.left = BT(nodes);
			nd.right = BT(nodes);
			
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
	public static void indore(Node root) {
		if(root == null) {
			return;
		}
		indore(root.left);
		System.out.print(root.data+" ");
		indore(root.right);
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
		int nodes[] = {7,8,5,6,2,3,1,4,10};
		Node root = null;
		
		for(int i=0;i<nodes.length;i++) {
			root = insert(root, nodes[i]);
		}
		indore(root);
		System.out.println();
		
		if(Search(root, 4)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
