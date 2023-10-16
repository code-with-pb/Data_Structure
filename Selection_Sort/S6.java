import java.util.*;

public class S6 {
	public static void S(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		n = sc.nextInt();
		int a[] = new int[n];
		
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			int s = i;
			for(j=i+1;j<n;j++) {
				if(a[s] >a[j]) {
					s = j;
				}
			}
			int t = a[s];
			a[s] = a[i];
			a[i] = t;
		}
		S(a);
	}
}
