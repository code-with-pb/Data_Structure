import java.util.*;

public class Q10 {
	static void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		System.out.print("Enter Element: ");
		for(i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static int partition(int a[],int l,int h) {
		int v = a[h];
		int i = (l-1);
		int j;
		for(j=l;j<h;j++) {
			if(a[j] <= v) {
				i++;
				
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i+1];
		a[i+1] = a[h];
		a[h] = t;
		
		return i+1;
	}
	static void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	static void show(int a[]) {
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		get(a);
		pivot(a,0,a.length-1);
		show(a);
	}

}
