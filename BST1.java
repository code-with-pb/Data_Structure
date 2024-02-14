//Binary Tree


//                  5
//                 / \
//                1   7             a) 1 < 5
//                 \               b) 7 > 5
//                  3              c) No same Value is considerderd
//                 / \
//                2   4

// a) Left SubTree Nodes < Root
// b) Right SubTree Nodes > root
// c) Left & Right SubTree are also BST with no duplicates


// Special Property

// Inorder Traversal of BST gives a Sorted Sequence

// BST Search

// Key = 3;

// Strategy

// Most problem will be solved using recursion i.e by
// devideing into subproblems & making recursive calls on subtree

// Build a BST

// values [] = {5,1,3,4,2,7}


class BST1{
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
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root, 1)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    }
}