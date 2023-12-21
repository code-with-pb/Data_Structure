import java.util.*; // for level order we need queue to do procees

public class Bt1 {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data  = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinaryTree{
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
	}
	
	//Pre-order Traversal means 
	//  1) root
	//  2)left subtree
	//  3)right subTree
	public static void preorder(Node root) {
		if(root == null) {
			return; // return -1; instead of null
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	//In-order Traversal means
	// 1) left subtree;
	// 2) root;
	// 3) right subtree;
	public static void inorder(Node root) {
		if(root == null) {
			return; // return -1 instead of null
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	//Post-order Traversal means
	// 1) left subtree;
	// 2) right subtree;
	// 3) root;
	public static void postorder(Node root){
		if(root == null) {
			return; // return -1 instead of null
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	//Level-order Traversal
	
		//input			output
	//       1   ----->  1  ---> level 1
	//      / \
	//     2   3 ----->  23 ---> level 2
	//    / \   \
	//   4   5   6 --->  456  -> level 3
	public static void levelorder(Node root) {
		if(root == null) {
			return; 
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(currNode.data+" ");
				if(currNode.left != null) {
					q.add(currNode.left);
				}
				if(currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		//System.out.println(root.data);
		//preorder(root);
		//inorder(root);
		//postorder(root);
		levelorder(root);
		
		}

}
