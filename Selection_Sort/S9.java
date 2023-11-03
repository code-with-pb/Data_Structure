import java.util.*;

public class S9 {
	void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {8,1,5,3,7,9,10,2,11};
		int i,j;
		
		for(i=0;i<a.length-1;i++) {
			int s = i;
			for(j=i+1;j<a.length;j++) {
				if(a[s] > a[j]) {
					s = j;
				}
			}
			int t = a[s];
			a[s] = a[i];
			a[i] = t;
		}
		S9 o = new S9();
		o.cal(a);
	}
}
