import java.util.*;

public class DT4 {
	static class Node{
		int d;
		Node l;
		Node r;
		
		Node(int d){
			this.d = d;
			this.l = null;
			this.r = null;
		}
	}
	static Node insert(Node root,int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.d > val) {
			root.l = insert(root.l,val);
		}
		else {
			root.r = insert(root.r,val);
		}
		return root;
	}
	static int ht(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = ht(root.l);
		int rn = ht(root.r);
		
		return Math.max(ln, rn) + 1;
	}
	static int dt(Node root) {
		if(root == null) {
			return 0;
		}
		int ln = dt(root.l);
		int rn = dt(root.r);
		
		int d = ht(root.l) + ht(root.r) + 1;
		
		return Math.max(d, Math.max(ln, rn));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,3,9,1,2,8,4,6};
		
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		System.out.print(dt(root));
	}

}
