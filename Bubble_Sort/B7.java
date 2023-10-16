import java.util.*;

public class B7 {
	public static void B(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int n = 5,i,j;
		int a[] = new int[n];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		for(i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		B(a);
 	}
}
