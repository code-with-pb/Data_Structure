import java.util.*;

public class B9 {
	void cal(int a[]) {
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int i,j,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.print("Enter Value: ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		B9  o = new B9();
		o.cal(a);
	}
	
}
