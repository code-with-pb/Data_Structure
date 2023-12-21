//Question Diameter of Tree

// Number of Nodes in longest
// path between any 2 nodes
									// output
//       1
//      / \
//     2   3						  	5
//    / \   \
//   4   5   6

// case 1) between  to   how much left_sub node we have to cover that length is left_sub diameter i.e ;
// case 2) between  to   how much right_sub node we have to cover that length is rigjht_sub diameter i.e ;
// case 3) between  to   how much throw root node we have to cover that length is whole diameter i.e ;


public class DT1 {
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
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		
		int myHeight =  Math.max(leftheight, rightheight) + 1;
		
		return myHeight;
	}
	public static int Diameter(Node root) {
		if(root == null) {
			return 0;
		}
		int diam1 = Diameter(root.left);
		int diam2 = Diameter(root.right);
		int diam3 = height(root.left) + height(root.right) + 1;
		
		return Math.max(diam3, Math.max(diam1, diam2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		
		System.out.println(Diameter(root));
	}

}
