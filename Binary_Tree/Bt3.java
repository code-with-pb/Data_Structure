import java.util.*;

public class Bt3 {
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
		static int i = -1;
		public static Node BT(int nodes[]) {
			i++;
			
			if(nodes[i] == -1) {
				return null;
			}
			Node nd = new Node(nodes[i]);
			nd.l = BT(nodes);
			nd.r = BT(nodes);
			
			return nd;
		}
	}
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
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
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.l);
		preorder(root.r);
	}
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.l);
		System.out.print(root.data+" ");
		inorder(root.r);
	}
	public static void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.l);
		postorder(root.r);
		System.out.print(root.data+" ");
	}
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
				if(currNode.l != null) {
					q.add(currNode.l);
				}
				if(currNode.r != null) {
					q.add(currNode.r);
				}
			}
		}
	}
	public static void main(String args[]) {
		int nodes[]= {7,8,9,4,5,6,1,2,3};
		Node root = null;
		
		for(int i=0;i<nodes.length;i++) {
			root = insert(root, nodes[i]);
		}
		levelorder(root);
		//preorder(root);
	}
}
