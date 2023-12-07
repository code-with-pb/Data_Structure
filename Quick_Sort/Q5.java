import java.util.*;

public class Q5 {
	static void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static int partition(int a[],int l,int h) {
		int ar,i;
		ar = a[h];
		i = (l-1);
		
		for(int j = l;j<h;j++) {
			if(a[j] <= ar) {
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
			
			int k = partition(a,l,h);
			pivot(a,l,k-1);
			pivot(a,k+1,h);
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
		System.out.print("Enter Length: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		get(a);
		pivot(a,0,a.length-1);
		show(a);
	}

}
