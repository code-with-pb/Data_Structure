import java.util.*;

public class M12 {
	static void get(int a[]) {
		System.out.print("Enter Element: ");
		int i;
		Scanner sc = new Scanner(System.in);
		for(i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static void partition(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		
		int i=l;int j = m+1;
		int  k=0;
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
			i++;k++;
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
			partition(a,l,m,h);
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
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		get(a);
		devide(a,0,a.length-1);
		show(a);
	}

}
