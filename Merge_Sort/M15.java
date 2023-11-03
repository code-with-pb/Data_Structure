import java.util.*;

class gt{
	void get(int a[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
}
class cncr extends gt{
	
}
class dvd extends gt{
	static void conquer(int a[],int l,int m, int h) {
		int s []= new int[(h-l+1)];
		int i=l;
		int  j = m+1;
		int k=0;
		
		while(i<=m && j<=h) {
			if(a[i] <a[j]) {
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
			int k = (l+h)/2;
			
			devide(a,l,k);
			devide(a,k+1,h);
			conquer(a,l,k,h);
		}
	}
}
public class M15 {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int [n];
		
		dvd o = new dvd();
		o.get(a);
		
		o.devide(a,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
}
