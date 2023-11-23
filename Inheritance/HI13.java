import java.util.*;

class Get13{
	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Data: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
}
class Bb13 extends Get13{
	void cal(int a[]) {
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
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
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ss13 extends Get13{
	void cal(int a[]) {
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
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
	}
	void show(int a[]) {
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Is13 extends Get13{
	void cal(int a[]) {
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
	void show(int a[]) {
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ms13 extends Get13{
	void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i=l;int j=m+1;int k=0;
		while(i<=m && j<=h) {
			if(a[i]<a[j]) {
				s[k] = a[i];
				i++;k++;
			}
			else {
				s[k] = a[j];
				j++;k++;
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
		System.out.print("After Sort: ");
		devide(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Qs13 extends Get13{
	int partition(int a[],int l,int h) {
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
		System.out.print("After Sort: ");
		pivot(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ls13 extends Get13{
	int k;
	int cal(int a[]) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		k = sc.nextInt();
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	void show(int a[]) {
		this.k = k;
		int i = cal(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}
class Bs13 extends Get13{
	int k;
	int cal(int a[]) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		k = sc.nextInt();
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
				e =  m-1;
			}
		}
		return -1;
	}
	void show(int a[]) {
		this.k = k;
		int i = cal(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}
public class HI13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int [n];
		
		Get13 g = new Get13();
		
		int i=0;
		do {
			System.out.print("Choose No: 1,2,3,4,5: ");
			int k = sc.nextInt();
			
			switch(k) {
					case 1: Bb13 b = new Bb13();
							g.get(a);
							b.cal(a);
							b.show(a);
							int j = 0;
							do {
								System.out.print("Choose No: 1,2: ");
								int t = sc.nextInt();
								switch(t) {
									case 1: Ls13 l = new Ls13();
											l.show(a);
											break;
									case 2: Bs13 bs = new Bs13();
											bs.show(a);
											break;
									default: System.out.println("Invalid No:....... ");break;
								}
								j++;
							}while(j<2);
							break;
					case 2: Ss13 s = new Ss13();
							g.get(a);
							s.cal(a);
							s.show(a);
							int p = 0;
							do {
								System.out.print("Choose No: 1,2: ");
								int t = sc.nextInt();
								switch(t) {
									case 1: Ls13 l = new Ls13();
											l.show(a);
											break;
									case 2: Bs13 bs = new Bs13();
											bs.show(a);
											break;
									default: System.out.println("Invalid No:....... ");break;
								}
								p++;
							}while(p<2);
							break;
					case 3: Is13 I = new Is13();
							g.get(a);
							I.cal(a);
							I.show(a);
							int qw = 0;
							do {
								System.out.print("Choose No: 1,2: ");
								int t = sc.nextInt();
								switch(t) {
									case 1: Ls13 l = new Ls13();
											l.show(a);
											break;
									case 2: Bs13 bs = new Bs13();
											bs.show(a);
											break;
									default: System.out.println("Invalid No:....... ");break;
								}
								qw++;
							}while(qw<2);
							break;
					case 4: Ms13 m = new Ms13();
							g.get(a);
							m.show(a);
							int nb = 0;
							do {
								System.out.print("Choose No: 1,2: ");
								int t = sc.nextInt();
								switch(t) {
									case 1: Ls13 l = new Ls13();
											l.show(a);
											break;
									case 2: Bs13 bs = new Bs13();
											bs.show(a);
											break;
									default: System.out.println("Invalid No:....... ");break;
								}
								nb++;
							}while(nb<2);
							break;
					case 5: Qs13 q = new Qs13();
							g.get(a);
							q.show(a);
							int jk = 0;
							do {
								System.out.print("Choose No: 1,2: ");
								int t = sc.nextInt();
								switch(t) {
									case 1: Ls13 l = new Ls13();
											l.show(a);
											break;
									case 2: Bs13 bs = new Bs13();
											bs.show(a);
											break;
									default: System.out.println("Invalid No:....... ");break;
								}
								jk++;
							}while(jk<2);
							break;
				default: System.out.println("Invalid No:....... ");break;
			}
			i++;
		}while(i<5);
		
		
	}

}
