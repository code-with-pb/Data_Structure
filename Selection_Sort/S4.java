import java.util.*;

public class S4 {
	public static void P(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int i,j;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of Array: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.print("Enter Array: ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n-1;i++) {
			int s = i;
			for(j=i+1;j<n;j++) {
				if(a[s] > a[j]) {
					s = j;
				}
			}
			int t = a[s];
			a[s] = a[i];
			a[i] = t;
		}
		P(a);
	}
}
