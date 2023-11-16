import java.util.*;

class Get7{
	void get(int a[]) {
		System.out.print("Enter Array: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
}
class Bb7 extends Get7{
	void cal(int a[]) {
		System.out.println();
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int n = a.length;
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		System.out.print("After Sort: ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
class Ss7 extends Get7{
	void cal(int a[]) {
		System.out.println();
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int n = a.length;
		int i,j;
		for(i=0;i<n-1;i++) {
			int t = i;
			for(j=i+1;j<n;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
				int s = a[t];
				a[t] = a[i];
				a[i] = s;
			}
		}
		System.out.print("After Sort: ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Is7 extends Get7{
	void cal(int a[]) {
		System.out.println();
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int n = a.length;
		int i,j;
		for(i=0;i<n;i++) {
			int t = a[i];
			j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		System.out.print("After Sort: ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ms7 extends Get7{
	static void conquer(int a[], int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i=l,j=m+1,k=0;
		while(i<=m && j<=h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				k++;i++;
			}
			else {
				s[k] = a[i];
				k++;i++;
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
	void cal(int a[]) {
		
		System.out.println();
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		devide(a,0,a.length-1);
		
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Qs7 extends Get7{
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
		
		return i;
	}
	static void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	void cal(int a[]) {
		System.out.println();
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		pivot(a,0,a.length-1);
		
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}
}
public class HI10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Get7 g = new Get7();
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		g.get(a);
		
		int i=0;
		
		do {
			System.out.print("Enter Choice 1) 2) 3) 4) 5): ");	
			int s = sc.nextInt();
			switch(s) {
				case 1: Bb7 b = new Bb7();
						b.cal(a);
						break;
				case 2: Ss7 ss = new Ss7();
						ss.cal(a);
						break;
				case 3: Is7 is = new Is7();
						is.cal(a);
						break;
				case 4: Ms7 m = new Ms7();
						m.cal(a);
						break;
				case 5: Qs7 q = new Qs7();
						q.cal(a);
						break;
				default:
					System.out.println("Invalid Input....");
					break;
			}
			i++;
		}while(i<5);
	}

}
