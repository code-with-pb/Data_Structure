import java.util.*;

class Ge{
	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
}

class Pi extends Ge{
	int partition(int a[],int l,int h) {
		int i,p;
		p = a[h];
		i = (l-1);
		int j;
		for(j=l;j<h;j++) {
			if(a[j] <= p) {
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
	void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a, l, h);
			
			pivot(a,l,m-1);
			pivot(a, m+1, h);
		}
	}
}

class Dis extends Pi{
	void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
public class Q7 {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		Dis o = new Dis();
		
		o.get(a);
		o.pivot(a, 0, n-1);
		o.show(a);
	}
}
