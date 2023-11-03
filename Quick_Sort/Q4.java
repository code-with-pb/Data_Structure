import java.util.*;

public class Q4 {
	static void get(int a[]) {
		System.out.print("Enter Element: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static int partition(int a[],int l,int h) {
		int s = a[h];
		int i = (l-1);
		for(int j=l;j<h;j++) {
			if(a[j] <= s) {
				i++;
				
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i+1];
		a[i+1] = a[h];
		a[h] = t;
		
		return i;
	}
	static void pivot(int a[],int i,int j) {
		if(i<j) {
			
			int k = partition(a,i,j);
			pivot(a,i,k-1);
			pivot(a,k+1,j);
		}
	}
	static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		int a[] = new int[n];
		
		get(a);
		pivot(a,0,a.length-1);
		show(a);
	}
}
