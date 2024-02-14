

public class DT3 {
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
	public static int HT(Node root) {
		if(root == null) {
			return 0;
		}
		int leftNode = HT(root.left);
		int rightNode = HT(root.right);
		
		return Math.max(leftNode, rightNode) + 1;
	}
	public static int Diam(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = Diam(root.left);
		int rn = Diam(root.right);
		int d = HT(root.left) + HT(root.right) + 1;
		
		return Math.max(ln, Math.max(rn, d));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {7,2,1,-1,-1,3,-1,-1,4,5,-1,-1,6,-1,-1};
		Tree t = new Tree();
		Node root = t.buildTree(nodes);
		
		
		System.out.println(HT(root));
	}

}
