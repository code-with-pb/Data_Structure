import java.util.*;

public class HI26 {
	static void Bb(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void Ss(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int t = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
  		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void Is(int a[]) {
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		
		int i = l;
		int j = m+1;
		int k = 0;
		
		while(i<=m && j<= h) {
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
	static void show1(int a[]) {
		devide(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int partition(int a[],int l,int h) {
		int v = a[h];
		int i = l-1;
		int j;
		for(j = l;j<h;j++) {
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
	static void show2(int a[]) {
		pivot(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int Ls(int a[],int k) {
		int i = 0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	static int Bs(int a[],int k) {
		int s = 0, e = a.length-1;
		
		while(s<=e) {
			int m = (s+e)/2;
			
			if(a[m] == k) {
				return m;
			}
			else if(a[m] > k) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
		return -1;
	}
	static void show3(int a[],int k) {
		int i = Ls(a,k);
		
		if(i == -1) {
			System.out.println("Not Found...");
		}
		else {
			System.out.println("FOund.."+ i);
		}
	}
	static void show4(int a[],int k) {
		int i = Bs(a,k);
		
		if(i == -1) {
			System.out.println("Not Found...");
		}
		else {
			System.out.println("FOund.."+ i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[]= {5,7,9,3,6,8,2,1};
		
		show3(a,5);
	}
}
