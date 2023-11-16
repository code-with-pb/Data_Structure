import java.util.*;
class Get6{
	void get(int a[], int n) {
		System.out.println();
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
	}
}
class Bb6 extends Get6{
	void cal(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
}
class Ss6 extends Get6{
	void cal(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			int t = i;
			for(int j=i+1;j<n;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s  = a[t];
			a[t] = a[i];
			a[i] = s;
		}
	}
}
class Is6 extends Get6{
	void cal(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j=i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
}
class Ms6 extends Get6{
	static void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i=l;int j=m+1;
		int k=0;
		
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
		for(i=l,j=0;i<=h;i++,j++) {
			a[i] = s[j];
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
}
class Qs6 extends Get6{
	static int partition(int a[],int l,int h) {
		int v = a[h];
		int i=(l-1);
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
}
public class HI8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		Get6 g = new Get6();
		g.get(a, n);
		
		int i=0;
		
		do {
			System.out.print("Enter No: 1) 2) 3) 4) 5: ");
			int k = sc.nextInt();
			
			switch(k) {
				case 1: 
					Bb6 b = new Bb6();
					b.cal(a, n);
					System.out.print("After Sort: ");
					for(int d=0;d<a.length;d++) {
						System.out.print(a[d]+" ");
					}
					System.out.println();
					break;
				case 2: 
					Ss6 s = new Ss6();
					s.cal(a, n);
					System.out.print("After Sort: ");
					for(int d=0;d<a.length;d++) {
						System.out.print(a[d]+" ");
					}
					System.out.println();
					break;
				case 3: 
					Is6 t = new Is6();
					t.cal(a, n);
					System.out.print("After Sort: ");
					for(int d=0;d<a.length;d++) {
						System.out.print(a[d]+" ");
					}
					System.out.println();
					break;
				case 4: 
					Ms6 m = new Ms6();
					m.devide(a, 0, n-1);
					System.out.print("After Sort: ");
					for(int d=0;d<a.length;d++) {
						System.out.print(a[d]+" ");
					}
					System.out.println();
					break;
				case 5: 
					Qs6 q = new Qs6();
					q.pivot(a, 0, n-1);
					System.out.print("After Sort: ");
					for(int d=0;d<a.length;d++) {
						System.out.print(a[d]+" ");
					}
					System.out.println();
					break;
				default:
					System.out.println("Invalid Input.....");
					break;
			}
			i++;
		}while(i<5);
		
	}

}
