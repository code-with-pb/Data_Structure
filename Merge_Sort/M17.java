import java.util.*;

public class M17 {
	void get(int a[]) {
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i=l;int j=m+1;int k=0;
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
	void cal(int a[],int l,int h) {
		if(l<h) {
			int m = (l+h)/2;
			cal(a,l,m);
			cal(a,m+1,h);
			conquer(a,l,m,h);
		}
	}
	void show(int a[]) {
		cal(a,0,a.length-1);
		System.out.print("Sorted Array: ");
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
		
		M17 m = new M17();
		m.get(a);
		m.show(a);
	}

}
