import java.util.*;

public class DTA4 {
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
	public static Node insert(Node root, int val) {
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
	static class TreeInfo{
		int d,h;
		
		TreeInfo(int d,int h){
			this.d = d;
			this.h = h;
		}
	}
	public static TreeInfo Dm(Node root) {
		if(root == null) {
			return new TreeInfo(0,0);
		}
		TreeInfo ln = Dm(root.l);
		TreeInfo rn = Dm(root.r);
		
		int hn = Math.max(ln.h, rn.h) + 1;
		
		int d1 = ln.d;
		int d2 = rn.d;
		int d3 = Math.max(d1, d2);
		
		int dm = Math.max(d3, Math.max(d1, d2));
		
		TreeInfo i = new TreeInfo(hn,dm);
		
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,3,9,1,6,4,2,8,};
		
		Node root = null;
		
		for(int i=0;i<a.length;i++) {
			root = insert(root,a[i]);
		}
		System.out.print(Dm(root).d);
	}

}
