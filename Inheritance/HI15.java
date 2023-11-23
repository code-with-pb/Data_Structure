import java.util.*;

class Bb15{
	void cal(int a[]) {
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
	void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ss15{
	void cal(int a[]) {
		int i,j;
		for(i = 0; i<a.length-1;i++) {
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
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Is15{
	void cal(int a[]) {
		int i,j;
		for(i = 0;i<a.length;i++) {
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
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ms15{
	void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i=l,j=m+1;
		int k=0;
		while(i<=m && j <= h) {
			if(a[i] <= a[j]) {
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
		devide(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Qs15{
	int partition(int a[],int l,int h) {
		int v = a[h];
		int i=(l-1);
		for(int j=l;j<h;j++) {
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
		pivot(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ls15{
	int cal(int a[],int k) {
		int i=0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	void show(int a[],int k) {
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}
class Bs15{
	int cal(int a[],int k) {
		int s=0,e=a.length-1;
		
		while(s<=e) {
			int m = (s+e)/2;
			
			if(a[m] == k) {
				return m;
			}
			else if(a[m] < k) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
		
		return -1;
	}
	void show(int a[],int k) {
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}
public class HI15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bb15 b1 = new Bb15();
		Ss15 s = new Ss15();
		Is15 i = new Is15();
		Ms15 m = new Ms15();
		Qs15 q = new Qs15();
		Ls15 l = new Ls15();
		Bs15 b = new Bs15();
		int j = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Choose 1 - 7: ");
			int n = sc.nextInt();
			switch(n) {
				case 1: int a[] = {10,54,62,1,2,3,5,4,9,8};
						b1.cal(a);
						b1.show(a);
						break;
				case 2: int c []= {54,21,32,65,4,5,2,1,12,11};
							s.cal(c);
							s.show(c);
							break;
				case 3: int d[] = {98,57,63,25,48,68,98,1,2,3,4,5};
							i.cal(d);
							i.show(d);
							break;
				case 4: int e[] = {45,65,35,21,10,23,544,78,98,1,2,34};
							m.show(e);
							break;
				case 5: int f[] = {12,23,45,56,78,89,34,1,2,3,54,6,7};
							q.show(f);
							break;
				case 6: int g[] = {25,45,8,5,455,6,3,2,1,4,7,88,9,10};
							int k = 455;
							l.show(g, k);
							break;
				case 7: int h[] = {1,2,3,4,5,6,7,8,9,10,11,12,20,25,45,78,90,98};
							int kk = 25;
							b.show(h, kk);
							break;
			}
			j++;
		}while(j<7);
	}

}
