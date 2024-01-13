import java.util.ArrayList;

public class BSTQ1 {
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
	
	// Question Print in Range
	
	// values given x = 4 & y = 10
	
	//			  		8					 	8
    //				   / \					   / \
    //				  5   10   -->			  5	  10
    //			     / \   \				 / \	\			
    //				3   4   11				3	4	 11
    
	// o/p   4 5 8 10 
	
	public static void printInRange(Node root, int x,int y) {
		if(root == null) {
			return;
		}
		if(root.data >= x && y >= root.data) {
			printInRange(root.left, x, y);
			System.out.print(root.data+" ");
			printInRange(root.right, x, y);
		}
		else if(root.data >= y) {
			printInRange(root.left,x,y);
		}
		else {
			printInRange(root.right,x,y);
		}
	}
	
	// Question Root to Leaf Paths
	
	//			  		8		 
    //				   / \					  					Methods: 
    //				  5   10   -->	o/p  	8 5 3		 				Preorder
    //			     / \   \				8 5 4						1) Root (add)
    //				3   4   11				8 10 11 14					2) left subtree
	//						 \											3) right subtree
	//						  14										Remove
    
	
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
		if(root == null) {
			return;
		}
		path.add(root.data);
		
		// leaf
		if(root.left == null && root.right == null) {
			printPath(path);
		}
		// non-leaf
		else {
			printRoot2Leaf(root.left, path);
			printRoot2Leaf(root.right, path);
		}
		path.remove(path.size()-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root, a[i]);
		}
		
		inorder(root);
		System.out.println();
		System.out.println();
		
		printInRange(root, 6, 10);
		
		//printRoot2Leaf(root, new ArrayList<>());
	}

}
