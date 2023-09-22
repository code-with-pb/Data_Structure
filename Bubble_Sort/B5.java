import java.util.*;

public class B5 {
	public static void Bubble(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.print("Enter Length Array: ");
		n = sc.nextInt();
		
		int x[] = new int[n];
		
		System.out.print("Enter Array: ");
		for(i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}
		
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if(x[j] > x[j+1]) {
					int t = x[j];
					x[j] = x[j+1];
					x[j+1] = t;
				}
			}
		}
		Bubble(x);
	}
}
