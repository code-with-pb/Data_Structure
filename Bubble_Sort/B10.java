import java.util.*;

public class B10 {
	void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.print("Enter Array: ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		B10 o = new B10();
		o.cal(a);
	}
}
