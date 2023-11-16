import java.util.*;

class Bb12 extends HI12{
	void cal(int a[]) {
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	void show(int a[]) {
		int i;
		System.out.print("After Sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

class Ss12 extends HI12{
	void cal(int a[]) {
		int i,j;
		for(i=0;i<a.length-1;i++) {
			int t = i;
			for(j=i+1;j<a.length;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
	}
	void show(int a[]) {
		int i;
		System.out.print("After Sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

class Is12 extends HI12{
	void cal(int a[]) {
		int i,j;
		for(i=0;i<a.length;i++) {
			int t = a[i];
			j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			
			}
			a[j+1] = t;
		}
	}
	void show(int a[]) {
		int i;
		System.out.print("After Sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

class Ms12 extends HI12{
	void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		
		int i = l;
		int j =m+1;
		int k =0;
		
		while(i<=m && j<=h) {
			if(a[i] < a[j] ) {
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
	void devide(int a[],int l,int h) {
		if(l<h) {
			int m = (l+h)/2;
			devide(a,l,m);
			devide(a,m+1,h);
			conquer(a,l,m,h);
		}
	}
	void show(int a[]) {
		int i;
		devide(a,0,a.length-10);
		System.out.print("After Sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

class Qs12 extends HI12{
	int partition(int a[],int l, int h) {
		int v = a[h];
		int  i = (l-1);
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
	void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	void show(int a[]) {
		int i;
		pivot(a,0,a.length-1);
		System.out.print("After Sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

public class HI12 {
	void get(int a[]) {
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		System.out.print("Enter Length: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		HI12 h = new HI12();
		h.get(a);
		
		int i=0;
		do {
			System.out.print("Choose No: 1,2,3,4,5: ");
			int k = sc.nextInt();
			
			switch(k) {
					case 1: Bb12 b = new Bb12();
							b.cal(a);
							b.show(a);
							break;
					case 2: Ss12 s = new Ss12();
							s.cal(a);
							s.show(a);
							break;
					case 3: Is12 j = new Is12();
							j.cal(a);
							j.show(a);
							break;
					case 4: Ms12 m = new Ms12();
							m.show(a);
							break;
					case 5: Qs12 q = new Qs12();
							q.show(a);
							break;
				default: System.out.println("Invalid No:....... ");break;
			}
			i++;
		}while(i<5);
	}

}
