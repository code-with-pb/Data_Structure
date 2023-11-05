import java.util.*;

class gf{
	void get(int a[]) {
		int i,n=a.length;
		System.out.print("Enter Element: ");
		Scanner sc = new Scanner(System.in);
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
	}
	void show(int a[]) {
		System.out.println("Before sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ms extends gf{
	static void conquer(int a[],int l,int m,int h) {
		int[] s = new int[(h-l+1)];
		int i,j,k;
		i=l;
		j=m+1;
		k=0;
		while(i<=m && j<=h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				k++;i++;
			}
			else {
				s[k] = a[j];
				k++;j++;
			}
		}
		while(i<=m) {
			s[k] = a[i];
			k++;i++;
		}
		while(j<=h) {
			s[k] = a[j];
			k++;j++;
		}
		i = l;
		j = 0;
		while(i<=h) {
			a[i] = s[j];
			i++;j++;
		}
	}
	static void devide(int a[],int l,int h) {
		if(l<h) {
			int m = (l+h)/2;
			devide(a,l,m);
			devide(a,m+1,h);
			conquer(a,l,m,h);
		}
	}
	void show(int a[]) {
		System.out.println("After Merge sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

class Qs extends gf{
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
	static void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	void show(int a[]) {
		System.out.println("After Quick sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
public class HI2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		j = sc.nextInt();
		
		int a[] = new int[j];
		
		gf o = new gf();
		o.get(a);
		o.show(a);
		
		Ms o1 = new Ms();
		Qs o2 = new Qs();
		
		System.out.println("Enter No: 1)Merge Sort");
		System.out.println("Enter No: 2)Quick Sort");
		
		i=0;
		
		do {
			System.out.print("Enter No for Sorting: ");
			n = sc.nextInt();
			switch(n) {
				case 1 :
						o1.devide(a,0,j-1);
						o1.show(a);
						break;
				case 2 :
						o2.pivot(a, 0, j-1);
						o2.show(a);
						break;
				default :
						System.out.println("Invalid input.....");
						break;
			}
			i++;
		}while(i<2);
	}

}
