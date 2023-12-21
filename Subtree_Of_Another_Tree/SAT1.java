// LEETCODE SOLUTION




// Question Subtree of another tree

// in this they will give you one tree 
//and there is another tree witch is big tree
//we just have to find out given subtree is part of that full tree or not

import javax.swing.tree.TreeNode;
/* 
 * Defination for a binary tree node.
 * public class TreeNode{
 * 		int val;
 * 		TreeNode left;
 * 		TreeNode right;
 * 		TreeNode(){}
 * 		TreeNode(int val){this.val = val; }
 * 		TreeNode(int val,TreeNode left, TreeNode right){
 * 			this.val = val;
 * 			this.left = left;
 * 			this.right = right;
 * 		}
 * }
 * */
public class SAT1 {
	public boolean isIdentical(TreeNode root, TreeNode subRoot) {
		if(root == null && subRoot == null) {
			return true;
		}
		if(root == null || subRoot == null) {
			return false;
		}
		if(root.val == subRoot.val) {
			return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
		}
		return false;
	}
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if(subRoot == null) {
			return true;
		}
		if(root == null) {
			return false;
		}
		if(root.val == subRoot.val) {
			if(isIdentical(root, subRoot)) {
				return true;
			}
		}
		return isSubtree(root,left,subRoot) || isSubtree(root,right,subRoot);
	}
}
