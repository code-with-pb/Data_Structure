// Question Sum of Node				output

//       1
//      / \
//     2   3						  21
//    / \   \
//   4   5   6

//  solve using recursion 

//  counting fist we calculate for left-subtree how much value after sum in left i.e 11 (i.e 2 + 4 + 5 = 11) i.e x + y + r
// for right-subtree how much node is present in right i.e 9 (i.e 3 + 6 = 9) i.e y + r
// last we add those subtree with 1 for root and we will get count of nodes i.e z = x + y + r (i.e 11 + 9 + 1 = 21)



public class SN1 {
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
	
	public static int sumofNode(Node root) {
		if(root == null) {
			return 0;
		}
		int leftsum = sumofNode(root.left);
		int rightsum = sumofNode(root.right);
		
		return leftsum + rightsum + root.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		
		System.out.println(sumofNode(root));
	}

}
