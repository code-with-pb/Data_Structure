
public class BST1 {
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
	        public static Node BuildTree(int nodes[]){
	            idx++;

	            if(nodes[idx] == -1){
	                return null;
	            }
	            Node nd = new Node(nodes[idx]);
	            nd.left = BuildTree(nodes);
	            nd.right = BuildTree(nodes);

	            return nd;
	        }
	    }
	    public static Node insert(Node root, int val){
	        if(root == null){
	            root = new Node(val);
	            return root;
	        }

	        if(root.data > val){
	            // left subtree
	            root.left = insert(root.left, val);
	        }
	        else{
	            root.right = insert(root.right, val);
	        }
	        return root;
	    }
	    public static void inorder(Node root){
	        if(root == null){
	            return;
	        }
	        inorder(root.left);
	        System.out.print(root.data+" ");
	        inorder(root.right);
	    }
	    public static boolean search(Node root, int k){
	        if(root == null){
	            return false;
	        }
	        if(root.data > k){
	            //left subtree
	            return search(root.left, k);
	        }
	        else if(root.data == k){
	            return true;
	        }
	        else{
	            return search(root.right, k);
	        }
	    }
	    
	    // For Delete Node 
	    
	    // case 1: No child (Leaf Node)
	    
	    //			  		8		for	Case 1  	8
	    //				   / \					   / \
	    //				  5   10   -->			  5	  10
	    //			     / \   \				 / 		\			
	    //				3   4   11				3		 11
	    //
	    // deleted node 4
	    
	    // case 2: One Child
	    
	    //			  		8		for	Case 2  	8
	    //				   / \					   / \
	    //				  5   10   -->			  5	  11
	    //			     / \   \				 / \				
	    //				3   4   11				3	4	 
	    //
	    // deleted node 10
	    
	    // case 3: Two child
	    
	    //			  		8		for	Case 1  	8       Methods:  
	    //				   / \					   / \				Replace value with inorder succcessor    * left most in right subtree * 
	    //				  5   10   -->			  5	  10			Delete the node for inorder successor
	    //			     / \   \				 / \	\			
	    //				3   6   11				3	4	 11
	    //			   / \
	    //			  1   4
	    //
	    // Note inorder successor always has 0 or 1 child
	    // deleted element 5
	    
	    public static Node delete(Node root, int val) {
	    	if(root.data > val) {
	    		root.left = delete(root.left, val);
	    	}
	    	else if(root.data < val) {
	    		root.right = delete(root.right, val);
	    	}
	    	else {
	    		
	    		//Case 1
	    		if(root.left == null && root.right == null) {
	    			return null;
	    		}
	    		
	    		//Case 2
	    		if(root.left == null) {
	    			return root.right;
	    		}
	    		else if(root.right == null) {
	    			return root.left;
	    		}
	    		
	    		//Case 3
	    		Node IS = inorderSuccessor(root.right);
	    		root.data = IS.data;
	    		root.right = delete(root.right,IS.data);
	    	}
	    	return root;
	    }
	    public static Node inorderSuccessor(Node root) {
	    	while(root.left != null) {
	    		root = root.left;
	    	}
	    	return root;
	    }
	    
	    public static void main(String args[]){
	        int values[] = {8,5,3,1,4,6,10,11,14};
	        Node root = null;

	        for(int i=0;i<values.length;i++){
	            root = insert(root, values[i]);
	        }

	        inorder(root);
	        System.out.println();

	       /* if(search(root, 1)){
	            System.out.println("Found");
	        }
	        else{
	            System.out.println("Not Found");
	        }*/
	        
	        delete(root, 5);
	        inorder(root);

	    }
	}