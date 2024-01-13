

public class CN2 {
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
		public static Node buildTree(int nodes[]) {
			idx++;
			
			if(nodes[idx] == -1) {
				return null;
			}
			Node nd = new Node(nodes[idx]);
			nd.left = buildTree(nodes);
			nd.right = buildTree(nodes);
			
			return nd;
			
		}
	}
	public static int CN(Node root) {
		if(root == null) {
			return 0;
		}
		int leftNode = CN(root.left);
		int rightNode = CN(root.right);
		
		return leftNode + rightNode + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {7,2,1,-1,-1,3,-1,-1,4,5,-1,-1,6,-1,-1};
		Tree t = new Tree();
		Node root = t.buildTree(nodes);
		
		
		System.out.println(CN(root));
	}

}
