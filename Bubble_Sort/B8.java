import java.util.*;

public class B8 {
	public static void sl(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Array: ");
		n = sc.nextInt();
		
		System.out.print("Enter "+n+" Value of Array: ");
		int a[] = new int[n];
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1]= t;
				}
			}
		}
		sl(a);
	}
}
