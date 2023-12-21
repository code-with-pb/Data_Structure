// Question Height of Tree				output

//       1
//      / \
//     2   3						  	  3
//    / \   \
//   4   5   6

//  solve using recursion 

//  fist we calculate for left-subtree height i.e 11 (i.e 2 --> 4 && 2 --> 5 = 2) i.e 2
// for right-subtree height i.e 9 (i.e 3 --> 6 = 2) i.e y + r
// last we add those subtree with 1 for root and we will get total height of tree i.e z =  (i.e 2 + 1 = 3)



public class HT1 {
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
		
		int myheight = Math.max(leftheight, rightheight) +1;
		
		return myheight;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		
		System.out.println(height(root));
	}

}
