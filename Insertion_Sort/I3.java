import java.util.*;

public class I3 {
	public static void I(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Length of Array: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			int t = a[i];
			 j = i-1;
			 while(j>=0 && t < a[j]) {
				 a[j+1] = a[j];
				 j--;
			 }
			 a[j+1] = t;
		}
		I(a);
	}
}
